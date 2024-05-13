
package com.uparu.uparumaking

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity6 : AppCompatActivity() {
    //조합으로 안나오는 우파루(뽑기, 이벤트)는 추가하지 말것
    var DataList = arrayListOf(
        TimeData2(R.drawable.pori, "포리", R.drawable.eggg, "숲", "7초"),
        TimeData2(R.drawable.dudeoru, "두더루", R.drawable.egggr, "땅", "3분"),
        TimeData2(R.drawable.bbururu, "뿌루루", R.drawable.eggf,  "불", "15분"),
        TimeData2(R.drawable.munguru, "뭉구루", R.drawable.egggrng,  "땅,숲", "20분"),
        TimeData2(R.drawable.beobi, "버비", R.drawable.egggrng,  "땅,숲", "20분"),
        TimeData2(R.drawable.ddoruru, "또루루", R.drawable.egggngr,  "숲,땅", "30분"),
        TimeData2(R.drawable.anti, "앤티", R.drawable.egganti,  "숲,땅", "35분"),
        TimeData2(R.drawable.dupa, "듀파", R.drawable.eggwa,  "물", "45분"),
        TimeData2(R.drawable.ururu, "우루루", R.drawable.eggl,  "천둥", "2시간"),
        TimeData2(R.drawable.pring, "프링", R.drawable.egggnf,  "숲,불", "2시간30분"),
        TimeData2(R.drawable.seed, "시드", R.drawable.egggnf,  "숲,불", "2시간30분"),
        TimeData2(R.drawable.hakuru, "하쿠루", R.drawable.eggfng,  "불,숲", "2시간30분"),
        TimeData2(R.drawable.raply, "라플리", R.drawable.eggfng,  "불,숲", "2시간30분"),
        TimeData2(R.drawable.panpan, "판판", R.drawable.egggrnf,  "땅,불", "3시간"),
        TimeData2(R.drawable.mumu, "무무", R.drawable.eggfngr,  "불,땅", "3시간"),
        TimeData2(R.drawable.donk, "동크", R.drawable.eggfngr,  "불,땅", "3시간"),
        TimeData2(R.drawable.pero, "페로", R.drawable.egggnl,  "숲,천둥", "3시간30분"),
        TimeData2(R.drawable.poter, "포터", R.drawable.egggnl,  "숲,천둥", "3시간30분"),
        TimeData2(R.drawable.samsam, "삼삼", R.drawable.egggnl,  "숲,천둥", "3시간30분"),
        TimeData2(R.drawable.dorong, "도롱", R.drawable.egglng,  "천둥,숲", "3시간30분"),
        TimeData2(R.drawable.roro, "로로", R.drawable.egggnl,  "숲,천둥", "3시간45분"),
        TimeData2(R.drawable.pepe, "페페", R.drawable.eggfnl,  "불,천둥", "4시간"),
        TimeData2(R.drawable.daram, "다람", R.drawable.eggfnl,  "불,천둥", "4시간"),
        TimeData2(R.drawable.meme, "메메", R.drawable.egglnf,  "천둥,불", "4시간"),
        TimeData2(R.drawable.puddeok, "푸드덕", R.drawable.egglnf,  "천둥,불", "4시간"),
        TimeData2(R.drawable.chupa, "츄파", R.drawable.eggi,  "얼음", "4시간"),
        TimeData2(R.drawable.ali, "알리", R.drawable.egglng,  "천둥,숲", "4시간15분"),
        TimeData2(R.drawable.haerong, "해롱", R.drawable.egggnwa,  "숲,물", "4시간30분"),
        TimeData2(R.drawable.pupu, "푸푸", R.drawable.eggwang,  "물,숲", "4시간30분"),
        TimeData2(R.drawable.bingo, "빙고", R.drawable.eggingr,  "얼음,땅", "4시간45분"),
        TimeData2(R.drawable.bibi, "비비", R.drawable.eggfnwa,  "불,물", "5시간"),
        TimeData2(R.drawable.toto, "토토", R.drawable.eggwanf,  "물,불", "5시간"),
        TimeData2(R.drawable.tod, "토드", R.drawable.eggwanf,  "물,불", "5시간"),
        TimeData2(R.drawable.rairu, "라이루", R.drawable.egglni,  "천둥,얼음", "5시간"),
        TimeData2(R.drawable.tamami, "타마미", R.drawable.eggtamami,  "얼음,천둥", "5시간15분"),
        TimeData2(R.drawable.ulami, "울라미", R.drawable.eggingr,  "얼음,땅", "5시간15분"),
        TimeData2(R.drawable.yongaru, "용가루", R.drawable.eggwi,  "바람", "5시간30분"),
        TimeData2(R.drawable.ogugu, "오구구", R.drawable.eggogugu,  "얼음,땅", "5시간45분"),
        TimeData2(R.drawable.yongyong, "용용", R.drawable.egggrnl,  "땅,천둥", "6시간"),
        TimeData2(R.drawable.butterfin, "버터핀", R.drawable.egggrnl,  "땅,천둥", "6시간"),
        TimeData2(R.drawable.dori, "도리", R.drawable.egggrni,  "땅,얼음", "6시간"),
        TimeData2(R.drawable.jjingyo, "찡요", R.drawable.eggwang,  "물,숲", "6시간"),
        TimeData2(R.drawable.chichi, "치치", R.drawable.eggingr,  "얼음,땅", "6시간"),
        TimeData2(R.drawable.banaduck, "바나덕", R.drawable.eggbanaduck,  "숲,천둥", "6시간"),
        TimeData2(R.drawable.ulfo, "울포", R.drawable.eggulfo,  "불,천둥", "6시간30분"),
        TimeData2(R.drawable.jello, "젤로", R.drawable.eggm,  "매직", "6시간30분"),
        TimeData2(R.drawable.uparupa, "우파루파", R.drawable.egggrnwa,  "땅,물", "7시간"),
        TimeData2(R.drawable.eli, "엘리", R.drawable.eggwangr,  "물,땅", "7시간"),
        TimeData2(R.drawable.wow, "와우", R.drawable.egginwi,  "얼음,바람", "7시간"),
        TimeData2(R.drawable.uli, "울리", R.drawable.egginwi,  "얼음,바람", "7시간"),
        TimeData2(R.drawable.skungki, "스컹키", R.drawable.eggwini,  "바람,얼음", "7시간"),
        TimeData2(R.drawable.koku, "코쿠", R.drawable.eggfnwa,  "불,물", "7시간30분"),
        TimeData2(R.drawable.betsi, "벳시", R.drawable.eggbetsi,  "물,불", "7시간30분"),
        TimeData2(R.drawable.hipopo, "히포포", R.drawable.eggwanf,  "물,불", "7시간30분"),
        TimeData2(R.drawable.beti, "베티", R.drawable.egginl,  "얼음,천둥", "7시간30분"),
        TimeData2(R.drawable.doli, "돌리", R.drawable.egginwi,  "얼음,바람", "7시간30분"),
        TimeData2(R.drawable.mongkiru, "몽키루", R.drawable.egglni,  "천둥,얼음", "7시간30분"),
        TimeData2(R.drawable.progu, "프로구", R.drawable.egggnwa,  "숲,물", "7시간45분"),
        TimeData2(R.drawable.ggulsori, "꿀소리", R.drawable.eggggulsori,  "바람,얼음", "7시간45분"),
        TimeData2(R.drawable.piguru, "피구루", R.drawable.egggnwi,  "숲,바람", "8시간"),
        TimeData2(R.drawable.crapi, "크래피", R.drawable.egggnwi,  "숲,바람", "8시간"),
        TimeData2(R.drawable.tutu, "투투", R.drawable.eggwing,  "바람,숲", "8시간"),
        TimeData2(R.drawable.ggobu, "꼬부", R.drawable.eggwing,  "바람,숲", "8시간"),
        TimeData2(R.drawable.rari, "래리", R.drawable.eggrari,  "물,땅", "8시간"),
        TimeData2(R.drawable.bobo, "보보", R.drawable.eggwinwa,  "바람,물", "8시간15분"),
        TimeData2(R.drawable.pumki2, "펌키", R.drawable.eggpumki,  "천둥,바람", "8시간30분"),
        TimeData2(R.drawable.giroro, "기로로", R.drawable.eggwinl,  "바람,천둥", "8시간30분"),
        TimeData2(R.drawable.gururu, "구루루", R.drawable.eggwinl,  "바람,천둥", "8시간30분"),
        TimeData2(R.drawable.kitz, "키츠", R.drawable.eggkitz,  "천둥,바람", "8시간40분"),
        TimeData2(R.drawable.raku, "라쿠", R.drawable.egglnwi,  "천둥,바람", "8시간45분"),
        TimeData2(R.drawable.nyao, "냐오", R.drawable.eggnyao,  "천둥,바람", "8시간45분"),
        TimeData2(R.drawable.dalguru, "달구루", R.drawable.egggnm,  "숲,매직", "8시간45분"),
        TimeData2(R.drawable.buffru, "버프루", R.drawable.egggrnwa,  "땅,물", "9시간"),
        TimeData2(R.drawable.copyru, "카피루", R.drawable.eggwangr,  "물,땅", "9시간"),
        TimeData2(R.drawable.tigo, "티고", R.drawable.egginwi,  "얼음,바람", "9시간"),
        TimeData2(R.drawable.miyo, "미요", R.drawable.eggmiyo,  "얼음,바람", "9시간"),
        TimeData2(R.drawable.dudu, "두두", R.drawable.eggwini,  "바람,얼음", "9시간"),
        TimeData2(R.drawable.neoguru, "너구루", R.drawable.egggrnm,  "땅,매직", "9시간"),
        TimeData2(R.drawable.tedi, "테디", R.drawable.eggmngr,  "매직,땅", "9시간"),
        TimeData2(R.drawable.bamkuri, "밤쿠리", R.drawable.egggrnm,  "땅,매직", "9시간"),
        TimeData2(R.drawable.firu, "파이루", R.drawable.eggfnwi,  "불,바람", "9시간30분"),
        TimeData2(R.drawable.kogi, "코기", R.drawable.eggfnwi,  "불,바람", "9시간30분"),
        TimeData2(R.drawable.gogo, "고고", R.drawable.eggwinf,  "바람,불", "9시간30분"),
        TimeData2(R.drawable.miko, "미코", R.drawable.eggmiko,  "바람,불", "9시간30분"),
        TimeData2(R.drawable.mendi, "맨디", R.drawable.eggwinf,  "바람,불", "9시간30분"),
        TimeData2(R.drawable.flameru, "플라메루", R.drawable.eggflameru,  "불,바람", "9시간30분"),
        TimeData2(R.drawable.metoru, "메토루", R.drawable.eggmng,  "매직,숲", "9시간30분"),
        TimeData2(R.drawable.armang, "아르망", R.drawable.egggrnf,  "땅,불", "9시간45분"),
        TimeData2(R.drawable.scoti, "스코티", R.drawable.eggscoti,  "땅,불", "9시간45분"),
        TimeData2(R.drawable.baretsa, "바렛사", R.drawable.eggbaretsa,  "불,땅", "9시간45분"),
        TimeData2(R.drawable.danbi, "단비", R.drawable.eggdanbi, "땅,불", "9시간45분"),
        TimeData2(R.drawable.applechick, "애플칙", R.drawable.eggapplechick,  "숲,땅", "9시간57분"),
        TimeData2(R.drawable.chomchom, "촘촘", R.drawable.egglngr,  "천둥,땅", "10시간"),
        TimeData2(R.drawable.koka, "코카", R.drawable.egglngr,  "천둥,땅", "10시간"),
        TimeData2(R.drawable.cropet, "크로펫", R.drawable.eggcropet,  "천둥,땅", "10시간15분"),
        TimeData2(R.drawable.pogisa, "포기사", R.drawable.eggpogisa,  "숲,불", "10시간15분"),
        TimeData2(R.drawable.dumurai, "두무라이", R.drawable.eggdumurai,  "땅,얼음", "10시간15분"),
        TimeData2(R.drawable.jelisia, "젤리시아", R.drawable.eggjelisia,  "매직,숲", "10시간15분"),
        TimeData2(R.drawable.dujangun, "듀장군", R.drawable.eggdujangun,  "물,매직", "10시간15분"),
        TimeData2(R.drawable.chocolove, "초코럽", R.drawable.egglove,  "천둥,숲", "10시간30분"),
        TimeData2(R.drawable.cocolove, "코코럽", R.drawable.egglove,  "천둥,숲", "10시간30분"),
        TimeData2(R.drawable.lovelove, "러브럽", R.drawable.egglove,  "", "10시간30분"),
        TimeData2(R.drawable.candylove, "캔디럽", R.drawable.eggcandylove,  "얼음,천둥", "10시간30분"),
        TimeData2(R.drawable.spain, "스파인", R.drawable.eggspain,  "바람,천둥", "10시간37분"),
        TimeData2(R.drawable.godium, "고디움", R.drawable.egggodium,  "불,바람", "10시간57분"),
        TimeData2(R.drawable.warru, "왈루", R.drawable.egginwa,  "얼음,물", "11시간"),
        TimeData2(R.drawable.kota2, "코타", R.drawable.egginf,  "얼음,불", "11시간15분"),
        TimeData2(R.drawable.suri, "수리", R.drawable.eggmnl,  "매직,천둥", "11시간15분"),
        TimeData2(R.drawable.pus, "푸스", R.drawable.egglnm,  "천둥,매직", "11시간15분"),
        TimeData2(R.drawable.cline, "클리네", R.drawable.eggcline,  "천둥,매직", "11시간15분"),
        TimeData2(R.drawable.humpti, "험프티", R.drawable.egghumpti,  "매직,천둥", "11시간15분"),
        TimeData2(R.drawable.tenerpeng, "테너펭", R.drawable.egginwa,  "얼음,물", "11시간15분"),
        TimeData2(R.drawable.ebinu, "에비누", R.drawable.eggebinu,  "얼음,불", "11시간15분"),
        TimeData2(R.drawable.mingku, "밍쿠", R.drawable.eggdrapet,  "매직,천둥", "11시간30분"),
        TimeData2(R.drawable.omiyacon, "오미야콘", R.drawable.eggomiyacon,  "얼음,땅", "11시간37분"),
        TimeData2(R.drawable.yurion, "유리온", R.drawable.eggyurion,  "물,얼음", "11시간37분"),
        TimeData2(R.drawable.minidragon, "미니드래곤", R.drawable.eggminidragon,  "숲,바람", "11시간37분"),
        TimeData2(R.drawable.marina, "마리나", R.drawable.eggwani,  "물,얼음", "11시간45분"),
        TimeData2(R.drawable.polaru, "폴라루", R.drawable.egginwa,  "얼음,물", "11시간45분"),
        TimeData2(R.drawable.chupiking, "츄파이킹", R.drawable.eggchupiking,  "얼음,물", "11시간45분"),
        TimeData2(R.drawable.sharky, "샤키", R.drawable.eggwanm,  "물,매직", "11시간45분"),
        TimeData2(R.drawable.silli, "실리", R.drawable.eggmnwa,  "매직,물", "11시간45분"),
        TimeData2(R.drawable.dolpi, "돌피", R.drawable.eggwanm,  "물,매직", "11시간45분"),
        TimeData2(R.drawable.ducki, "덕키", R.drawable.eggmnwi,  "매직,바람", "11시간45분"),
        TimeData2(R.drawable.orpeus, "오르페우스", R.drawable.eggorpeus,  "땅,천둥", "11시간57분"),
        TimeData2(R.drawable.krang, "크랑", R.drawable.eggwanwi,  "물,바람", "12시간"),
        TimeData2(R.drawable.rodi, "로디", R.drawable.eggmnwi,  "매직,바람", "12시간15분"),
        TimeData2(R.drawable.pandi, "팬디", R.drawable.eggwinm,  "바람,매직", "12시간15분"),
        TimeData2(R.drawable.tingklru, "팅클루", R.drawable.eggmnwi,  "매직,바람", "12시간15분"),
        TimeData2(R.drawable.shujel, "슈젤", R.drawable.eggwanwi,  "물,바람", "12시간30분"),
        TimeData2(R.drawable.penpen, "펜펜", R.drawable.eggmni,  "매직,얼음", "12시간45분"),
        TimeData2(R.drawable.softi, "소프티", R.drawable.egginm,  "얼음,매직", "12시간45분"),
        TimeData2(R.drawable.arki, "아르키", R.drawable.eggarki,  "얼음,매직", "12시간45분"),
        TimeData2(R.drawable.alpha, "알파", R.drawable.eggfnm,  "불,매직", "13시간"),
        TimeData2(R.drawable.toibo, "토이보", R.drawable.eggmnf,  "매직,불", "13시간"),
        TimeData2(R.drawable.penriru, "펜리루", R.drawable.eggfni,  "불,얼음", "14시간"),
        TimeData2(R.drawable.foxy, "폭시", R.drawable.egginf,  "얼음,불", "14시간"),
        TimeData2(R.drawable.chepy, "채피", R.drawable.eggchepy,  "얼음,불", "14시간"),
        TimeData2(R.drawable.photobi, "포토비", R.drawable.eggphotobi,  "천둥,매직", "14시간30분"),
        TimeData2(R.drawable.boradoru, "보라도루", R.drawable.egggrnwi,  "땅,바람", "16시간"),
        TimeData2(R.drawable.bau, "바우", R.drawable.eggwingr,  "바람,땅", "16시간"),
        TimeData2(R.drawable.dumpti, "덤프티", R.drawable.eggdumpti,  "매직,불", "16시간"),
        TimeData2(R.drawable.drapet, "드라펫", R.drawable.eggdrapet,  "매직,천둥", "17시간30분"),
        TimeData2(R.drawable.bongbong, "봉봉", R.drawable.egggni,  "숲,얼음", "18시간"),
        TimeData2(R.drawable.yuni, "유니", R.drawable.egging,  "얼음,숲", "18시간"),
        TimeData2(R.drawable.cray, "크레이", R.drawable.egglnwa,  "천둥,물", "20시간"),
        TimeData2(R.drawable.hermi, "헤르미", R.drawable.egglnwa,  "천둥,물", "20시간"),
        TimeData2(R.drawable.purni, "푸르니", R.drawable.egggnwangr,  "숲,물,땅", "20시간15분"),
        TimeData2(R.drawable.popomo, "포포모", R.drawable.eggpopomo,  "불,숲,물", "20시간17분"),
        TimeData2(R.drawable.wonderdragon, "원더드래곤", R.drawable.eggwonderdragon,  "천둥,바람,물", "20시간17분"),
        TimeData2(R.drawable.piki, "피키", R.drawable.eggpiki,  "매직,숲,천둥", "20시간30분"),
        TimeData2(R.drawable.mungchi, "뭉치", R.drawable.eggmungchi,  "땅,매직,천둥", "20시간30분"),
        TimeData2(R.drawable.ukong, "우콩", R.drawable.eggukong,  "숲,매직,천둥", "20시간30분"),
        TimeData2(R.drawable.nuni, "누니", R.drawable.eggnuni,  "얼음,땅,바람", "21시간"),
        TimeData2(R.drawable.totoru, "토토루", R.drawable.eggingrnwi,  "얼음,땅,바람", "21시간"),
        TimeData2(R.drawable.april, "에이프릴", R.drawable.eggapril,  "땅,바람,얼음", "21시간"),
        TimeData2(R.drawable.alroha, "알로하", R.drawable.eggalroha,  "물,얼음,숲", "22시간15분"),
        TimeData2(R.drawable.rosa, "로사", R.drawable.eggwining,  "바람,얼음,숲", "22시간30분"),
        TimeData2(R.drawable.tider, "티더", R.drawable.eggtider,  "얼음,숲,바람", "22시간30분"),
        TimeData2(R.drawable.merry2, "메리", R.drawable.eggmerry,  "불,땅,숲", "22시간30분"),
        TimeData2(R.drawable.pisingki, "피싱키", R.drawable.eggpisingki,  "숲,얼음,바람", "22시간30분"),
        TimeData2(R.drawable.whyki, "와이키", R.drawable.eggwhyki,  "물,얼음,천둥", "22시간45분"),
        TimeData2(R.drawable.resco, "레스코", R.drawable.eggresco,  "땅,불,물", "23시간15분"),
        TimeData2(R.drawable.chekiru, "체키루", R.drawable.eggchekiru,  "땅,얼음,물", "23시간15분"),
        TimeData2(R.drawable.caterfly, "캐터플라이", R.drawable.eggfnlng,  "불,천둥,숲", "23시간30분"),
        TimeData2(R.drawable.dodo, "도도", R.drawable.eggfnlnwi,  "불,천둥,바람", "23시간30분"),
        TimeData2(R.drawable.rudol, "루돌", R.drawable.eggfning,  "불,얼음,숲", "24시간"),
        TimeData2(R.drawable.yunipin, "유니핀", R.drawable.eggyunipin,  "얼음,물,바람", "24시간15분"),
        TimeData2(R.drawable.shellru, "쉘루", R.drawable.eggwinwani,  "바람,물,얼음", "24시간30분"),
        TimeData2(R.drawable.chao, "챠오", R.drawable.eggchao,  "숲,불,얼음", "24시간30분"),
        TimeData2(R.drawable.skulru2, "스컬루", R.drawable.eggskulru,  "천둥,바람,얼음", "25시간"),
        TimeData2(R.drawable.sufferyong2, "서퍼용", R.drawable.eggsufferyong,  "물,바람,천둥", "25시간"),
        TimeData2(R.drawable.boder, "보더", R.drawable.eggboder,  "숲,매직,불", "25시간"),
        TimeData2(R.drawable.beild, "베일드", R.drawable.eggbeild,  "땅,물,숲", "25시간15분"),
        TimeData2(R.drawable.chaupa, "차우파", R.drawable.eggchaupa,  "땅,천둥,물", "25시간30분"),
        TimeData2(R.drawable.kickpig, "킥피그", R.drawable.eggkickpig,  "불,숲,천둥", "25시간45분"),
        TimeData2(R.drawable.cupi2, "큐피", R.drawable.eggcupi,  "매직,바람,불", "26시간"),
        TimeData2(R.drawable.helsingpo, "헬싱포", R.drawable.egghelsingpo,  "불,땅,물", "26시간15분"),
        TimeData2(R.drawable.trumcat, "트럼캣", R.drawable.eggtrumcat,  "불,바람,천둥", "26시간20분"),
        TimeData2(R.drawable.jurayong2, "쥬라용", R.drawable.eggjurayong,  "땅,천둥,숲", "26시간30분"),
        TimeData2(R.drawable.reor, "레오르", R.drawable.eggreor,  "땅,천둥,불", "27시간15분"),
        TimeData2(R.drawable.capri, "카프리", R.drawable.eggcapri,  "매직,바람,숲", "27시간30분"),
        TimeData2(R.drawable.rambert2, "램버트", R.drawable.eggrambert,  "바람,물,숲", "28시간"),
        TimeData2(R.drawable.loveit2, "러빗", R.drawable.eggloveit,  "매직,얼음,천둥", "28시간"),
        TimeData2(R.drawable.berr2, "베르", R.drawable.eggberr,  "물,바람,땅", "28시간30분"),
        TimeData2(R.drawable.sparumong2, "스파루몽", R.drawable.eggsparumong,  "천둥,불,얼음", "28시간45분"),
        TimeData2(R.drawable.myti2, "마이티", R.drawable.eggmyti,  "얼음,불,매직", "29시간15분"),
        TimeData2(R.drawable.godaesinyong, "고대신룡", R.drawable.egggodaesinyong,  "빛", "35시간57분"),
        TimeData2(R.drawable.darknicks, "다크닉스", R.drawable.eggdarknicks,  "어둠", "35시간57분"),
        TimeData2(R.drawable.rey, "레이", R.drawable.eggrey,  "빛", "36시간"),
        TimeData2(R.drawable.shadow, "쉐도우", R.drawable.eggshadow,  "어둠", "36시간"),
        TimeData2(R.drawable.rupin, "루핀", R.drawable.eggrupin,  "빛", "40시간"),
        TimeData2(R.drawable.rumion2, "루미온", R.drawable.eggrumion,  "빛", "40시간"),
        TimeData2(R.drawable.krono, "크로노", R.drawable.eggkrono, "어둠", "42시간"),
        TimeData2(R.drawable.blackapis2, "블랙아피스", R.drawable.eggblackapis, "어둠", "47시간"),
        TimeData2(R.drawable.goldi, "골디", R.drawable.egggoldi,  "황금", "48시간"),
        TimeData2(R.drawable.darkgoldi, "다크골디", R.drawable.egggoldi,  "황금", "48시간")
    )

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val imgButton1 = findViewById<ImageButton>(R.id.randomButton1)
        val imgButton2 = findViewById<ImageButton>(R.id.randomButton2)

        imgButton1.setOnClickListener {
            val intent = Intent(this, SelectUparu::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        imgButton2.setOnClickListener {
            val intent = Intent(this, SelectUparu2::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        // MainActivity6에서 SharedPreferences를 사용하여 데이터 불러오기
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val changeUparu1 = sharedPreferences.getInt("changeUparu1", R.drawable.randomegg)
        val changeUparu2 = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)

        // 이미지 버튼 1 정보 업데이트
        val uparuView1 = findViewById<ImageButton>(R.id.randomButton1)
        uparuView1.setImageResource(changeUparu1)

        // 이미지 버튼 2 정보 업데이트
        val uparuView2 = findViewById<ImageButton>(R.id.randomButton2)
        uparuView2.setImageResource(changeUparu2)

        val changeType1 = sharedPreferences.getString("changeType1", "1")
        val changeType2 = sharedPreferences.getString("changeType2", "2")

        val buttonJohap = findViewById<ImageButton>(R.id.johapButton)
        val questionButton = findViewById<ImageButton>(R.id.questionButton)

        questionButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.question_popup_layout)

            val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
            textViewContent.text =
                "크로스할 두 우파루를 선택해주세요.\n\n이후 <조합시작> 버튼을 누르면\n\n소환 가능한 우파루를 확인할 수 있습니다"

            val closeButton = dialog.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                dialog.dismiss() // 팝업 닫기
            }

            dialog.show() // 팝업 다이얼로그 표시
        }

        buttonJohap.setOnClickListener {
            recyclerView.visibility = View.VISIBLE

            fun generateCombinations(str: String?): List<String> {
                val options = mutableListOf<String>()

                if (str != null) {
                    if (str.contains("숲")) options.add("숲")
                }
                if (str != null) {
                    if (str.contains("땅")) options.add("땅")
                }
                if (str != null) {
                    if (str.contains("불")) options.add("불")
                }
                if (str != null) {
                    if (str.contains("물")) options.add("물")
                }
                if (str != null) {
                    if (str.contains("천둥")) options.add("천둥")
                }
                if (str != null) {
                    if (str.contains("바람")) options.add("바람")
                }
                if (str != null) {
                    if (str.contains("얼음")) options.add("얼음")
                }
                if (str != null) {
                    if (str.contains("매직")) options.add("매직")
                }

                if (options.isEmpty()) {
                    return emptyList()
                } else if (options.size == 1) {
                    return options
                }

                val combinations = mutableListOf<String>()
                val n = options.size

                fun <T> List<T>.permutations(): List<List<T>> {
                    if (size <= 1) return listOf(this)
                    val element = first()
                    val perms = drop(1).permutations()
                    return perms.flatMap { perm ->
                        (0..perm.size).map { i ->
                            perm.toMutableList().apply { add(i, element) }
                        }
                    }
                }

                // 이진수를 사용하여 모든 부분집합을 생성
                for (i in 1 until (1 shl n)) {
                    val subset = mutableListOf<String>()
                    for (j in 0 until n) {
                        if (i and (1 shl j) != 0) {
                            subset.add(options[j])
                        }
                    }
                    combinations.add(subset.joinToString(","))
                    if (subset.size == 2) {
                        combinations.add(subset.reversed().joinToString(","))
                    }
                    if (subset.size == 3) {
                        val perms = subset.permutations()
                        perms.forEach { perm ->
                            combinations.add(perm.joinToString(","))
                        }
                    }
                }
                return combinations
            }

            val filteredDataList = DataList.filter { data ->
                val Uparu1 = resources.getResourceEntryName(changeUparu1)
                val Uparu2 = resources.getResourceEntryName(changeUparu2)
                val nameresult = data.profile

                val result = data.type
                val resulttype = generateCombinations(changeType1+changeType2)
                val typenum = (changeType1+","+changeType2).split(",").distinct().size
                val arrayRare = arrayOf("yuni", "bongbong", "penriru", "foxy", "chepy", "bau", "boradoru", "cray", "hermi", "rudol", "kota2", "alpha", "toibo", "dumpti", "chao")
                val isGrassContained = resulttype.contains("숲")
                val isGroundContained = resulttype.contains("땅")
                val isFireContained = resulttype.contains("불")
                val isWaterContained = resulttype.contains("물")
                val isWindContained = resulttype.contains("바람")
                val isIceContained = resulttype.contains("얼음")
                val isLightningContained = resulttype.contains("천둥")
                val isMagicContained = resulttype.contains("매직")
                val isRare0 = !arrayRare.contains(Uparu1) && !arrayRare.contains(Uparu2)// 레어 없음 확인
                val isRare1 = (arrayRare.contains(Uparu1) && !arrayRare.contains(Uparu2)) || (!arrayRare.contains(Uparu1) && arrayRare.contains(Uparu2))// 레어 1 이상 확인
                val isRare2 = arrayRare.contains(Uparu1) && arrayRare.contains(Uparu2)// 레어 2 이상 확인

                val impossibleset0 = (Uparu1 == Uparu2 && typenum == 3)
                val impossibleset1 = (Uparu1 == "chupa"&& Uparu2 == "pori") || (Uparu1 == "pori"&& Uparu2 == "chupa")
                val impossibleset2 = (Uparu1 == "bbururu"&& Uparu2 == "chupa") || (Uparu1 == "chupa"&& Uparu2 == "bbururu")
                val impossibleset3 = (Uparu1 == "yongaru"&& Uparu2 == "dudeoru") || (Uparu1 == "dudeoru"&& Uparu2 == "yongaru")
                val impossibleset4 = (Uparu1 == "ururu"&& Uparu2 == "dupa") || (Uparu1 == "dupa"&& Uparu2 == "ururu")
                val makingyongaru = isFireContained && isWaterContained
                val notmakingloveit = (Uparu1 != "candylove2" && Uparu2 != "candylove2")
                val impossibleset5 = Uparu1 == "randomegg" || Uparu2 == "randomegg"
                val caselovelove = (Uparu1 == "chocolove"&& Uparu2 == "cocolove") || (Uparu1 == "cocolove"&& Uparu2 == "chocolove")

                Log.d("Filtering", "$caselovelove $notmakingloveit $typenum $Uparu1 $Uparu2 resulttype: $resulttype rare: $isRare1 $isRare2")
                when {
                    //동일한 우파루를 놓았을 때
                    (Uparu1 == Uparu2) && !impossibleset0 -> {
                        nameresult==changeUparu1
                    }
                    //상성인 우파루 혹은 3속성 우파루를 놓았을때 를 놓았을때
                    impossibleset1 || impossibleset2 || impossibleset3 || impossibleset4 || impossibleset5 -> {
                        nameresult==null
                    }
                    impossibleset0 -> {
                        nameresult==null
                    }
                    //레어 없이, 속성 4개(물or바람, 숲, 땅 포함) (레이, 쉐도우, 루미온)
                    isRare0 && typenum == 4 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                            // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult == R.drawable.rey || nameresult == R.drawable.shadow || nameresult == R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                         else
                            // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult == R.drawable.rey || nameresult == R.drawable.shadow || nameresult == R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 4개(숲, 땅 포함) (루미온)
                    isRare0 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 4개(물or바람 포함) (레이, 쉐도우)
                    isRare0 && typenum == 4 && (isWindContained || isWaterContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 숲, 땅, 천둥 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 블랙아피스, 루미온)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 숲, 땅 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람, 땅, 천둥 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(숲, 땅, 천둥 포함) (루미온, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rumion2 || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rumion2 || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물or바람 포함) (레이, 쉐도우, 크로노, 고대신룡, 다크닉스)
                    isRare0 && typenum >= 5 && (isWindContained || isWaterContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rey || nameresult==R.drawable.shadow || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(땅, 천둥 포함) (크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare0 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(숲, 땅 포함) (크로노, 고대신룡, 다크닉스, 루미온)
                    isRare0 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 없이, 속성 5개 이상(물, 바람, 숲, 땅, 천둥 없이) (크로노, 고대신룡, 다크닉스)
                    isRare0 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 1개, 속성 4개(숲, 땅 포함) (루핀, 골디, 루미온)
                    isRare1 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 4개(숲, 땅 없이) (루핀, 골디)
                    isRare1 && typenum == 4 && (!isGrassContained || !isGroundContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅, 천둥 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온, 블랙아피스)
                    isRare1 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare1 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(땅, 천둥 포함) (루핀, 골디, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare1 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 1개, 속성 5개 이상(숲, 땅, 천둥 없이) (루핀, 골디, 크로노, 고대신룡, 다크닉스)
                    isRare1 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    //레어 2개, 속성 2, 3개 (다크골디)
                    isRare2 && (typenum == 2 || typenum == 3) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 4개(숲, 땅 포함) (다크골디, 루핀, 골디, 루미온)
                    isRare2 && typenum == 4 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.rumion2  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 4개(숲, 땅 없이) (다크골디, 루핀, 골디)
                    isRare2 && typenum == 4 && (!isGrassContained || !isGroundContained) -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅, 천둥 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온, 블랙아피스)
                    isRare2 && typenum >= 5 && isGrassContained && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || nameresult==R.drawable.blackapis2  || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 루미온)
                    isRare2 && typenum >= 5 && isGrassContained && isGroundContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.rumion2 || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(땅, 천둥 포함) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스, 블랙아피스)
                    isRare2 && typenum >= 5 && isGroundContained && isLightningContained -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2  || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || nameresult==R.drawable.blackapis2 || resulttype.contains(result)
                    }
                    //레어 2개, 속성 5개 이상(숲, 땅, 천둥 없이) (다크골디, 루핀, 골디, 크로노, 고대신룡, 다크닉스)
                    isRare2 && typenum >= 5 -> {
                        if (makingyongaru)
                        // makingyongaru도 만족하면 양쪽의 로직을 모두 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result) || nameresult==R.drawable.yongaru
                        else
                        // makingyongaru가 만족하지 않으면 caserey의 로직만 실행
                            nameresult==R.drawable.darkgoldi || nameresult==R.drawable.rupin || nameresult==R.drawable.goldi || nameresult==R.drawable.krono || nameresult==R.drawable.godaesinyong || nameresult==R.drawable.darknicks || resulttype.contains(result)
                    }
                    caselovelove -> {
                        nameresult == R.drawable.lovelove
                    }
                    notmakingloveit -> {
                        nameresult!=R.drawable.loveit2 && resulttype.contains(result)
                    }
                    //용가루 조합법
                    makingyongaru -> {
                        nameresult==R.drawable.yongaru || resulttype.contains(result)
                    }
                    else -> {
                        //평범한 경우
                        resulttype.contains(result) && nameresult != R.drawable.yongaru
                    }
                }
            } as ArrayList<TimeData2>

            val newAdapter = CustomAdapterTime2(this, filteredDataList)
            recyclerView.adapter = newAdapter
        }
    }
}