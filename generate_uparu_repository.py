import os
import re

# ------------------------------------------
# 1. 설정: 코틀린 파일들이 있는 폴더 경로
# ------------------------------------------
KT_DIR = r"./app/src/main/java/com/uparu/uparumaking"  # 여기를 네 프로젝트 구조에 맞게 수정
OUT_FILE = os.path.join(KT_DIR, "UparuRepository.kt")

# ------------------------------------------
# 2. 유틸 함수들
# ------------------------------------------
def read_all_kt_files():
    texts = []
    for root, dirs, files in os.walk(KT_DIR):
        for f in files:
            if f.endswith(".kt"):
                path = os.path.join(root, f)
                with open(path, encoding="utf-8") as fp:
                    texts.append((path, fp.read()))
    return texts

def extract_calls_exact(name, text):
    # name( ... ) 형태만 잡기 (TimeData2 안의 Data2 같은 건 제외)
    regex = re.compile(r'(?<![A-Za-z0-9_])' + re.escape(name) + r'\(([^)]*)\)')
    return [m.group(1).strip() for m in regex.finditer(text)]

def split_args(argstr):
    args = []
    cur = ''
    in_string = False
    prev = ''
    for ch in argstr:
        if ch == '"' and prev != '\\':
            in_string = not in_string
            cur += ch
        elif ch == ',' and not in_string:
            args.append(cur.strip())
            cur = ''
        else:
            cur += ch
        prev = ch
    if cur.strip():
        args.append(cur.strip())
    return args

def strip_quotes(s):
    s = s.strip()
    if s.startswith('"') and s.endswith('"'):
        return s[1:-1]
    return s

# ------------------------------------------
# 3. 데이터 수집
# ------------------------------------------
uparu = {}  # name -> dict

def ensure(name):
    if name not in uparu:
        uparu[name] = {
            "profile": None,
            "name": name,
            "gold": None,
            "typeDrawable": None,
            "egg": None,
            "typeText": None,
            "timeDisplay": None,
            "timeForSort": None,
        }
    return uparu[name]

texts = read_all_kt_files()

for path, text in texts:
    # Data2(profile, "이름", gold, typeDrawable, timeDouble)
    for argstr in extract_calls_exact("Data2", text):
        args = split_args(argstr)
        if len(args) != 5:
            continue
        profile, name_q, gold_s, typeDrawable, time_s = args
        name = strip_quotes(name_q)
        d = ensure(name)
        if d["profile"] is None:
            d["profile"] = profile
        if d["gold"] is None:
            d["gold"] = gold_s
        if d["typeDrawable"] is None:
            d["typeDrawable"] = typeDrawable
        if d["timeForSort"] is None:
            d["timeForSort"] = time_s

    # TimeData(profile, "이름", egg, "소환시간 :", "표시시간")
    for argstr in extract_calls_exact("TimeData", text):
        args = split_args(argstr)
        if len(args) != 5:
            continue
        profile, name_q, egg, _, timeDisplay = args
        name = strip_quotes(name_q)
        d = ensure(name)
        if d["profile"] is None:
            d["profile"] = profile
        if d["egg"] is None:
            d["egg"] = egg
        if d["timeDisplay"] is None:
            d["timeDisplay"] = strip_quotes(timeDisplay)

    # TimeData2(profile, "이름", egg, "타입문자열", "표시시간")
    for argstr in extract_calls_exact("TimeData2", text):
        args = split_args(argstr)
        if len(args) != 5:
            continue
        profile, name_q, egg, typeText, timeDisplay = args
        name = strip_quotes(name_q)
        d = ensure(name)
        if d["profile"] is None:
            d["profile"] = profile
        if d["egg"] is None:
            d["egg"] = egg
        if d["typeText"] is None:
            d["typeText"] = strip_quotes(typeText)
        if d["timeDisplay"] is None:
            d["timeDisplay"] = strip_quotes(timeDisplay)

# 잘못 잡힌 생성자 정의 같은 가짜 엔트리 제거
if "val name:String" in uparu:
    del uparu["val name:String"]

# S 버전(스파인S, 고대신룡S, 애플칙S) 는 원본 데이터 복사
for s_name in list(uparu.keys()):
    if s_name.endswith("S"):
        base = s_name[:-1]
        if base in uparu:
            for key in ("egg", "typeText", "timeDisplay", "timeForSort"):
                if uparu[s_name][key] is None:
                    uparu[s_name][key] = uparu[base][key]

# ------------------------------------------
# 4. Kotlin 코드로 출력
# ------------------------------------------
def k_string(s):
    return '"' + s.replace('"', '\\"') + '"'

sorted_names = sorted(uparu.keys())

with open(OUT_FILE, "w", encoding="utf-8") as out:
    out.write("package com.uparu.uparumaking\n\n")
    out.write("object UparuRepository {\n\n")
    out.write("    val all: List<UparuInfo> = listOf(\n")
    first = True
    for name in sorted_names:
        d = uparu[name]
        # timeForSort는 숫자 문자열 그대로 사용
        if not first:
            out.write(",\n")
        first = False
        out.write("        UparuInfo(\n")
        out.write(f"            profile = {d['profile']},\n")
        out.write(f"            name = {k_string(d['name'])},\n")
        out.write(f"            gold = {d['gold']},\n")
        out.write(f"            typeDrawable = {d['typeDrawable']},\n")
        out.write(f"            egg = {d['egg']},\n")
        out.write(f"            typeText = {k_string(d['typeText'])},\n")
        out.write(f"            timeDisplay = {k_string(d['timeDisplay'])},\n")
        out.write(f"            timeForSort = {d['timeForSort']}\n")
        out.write("        )")
    out.write("\n    )\n}\n")

print(f"생성 완료: {OUT_FILE}")
