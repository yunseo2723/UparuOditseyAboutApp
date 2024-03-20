
package com.uparu.uparumaking

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity7 : AppCompatActivity() {
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
        TimeData2(R.drawable.yongyong, "용용", R.drawable.egggrnl,  "땅,천둥", "6시간"),
        TimeData2(R.drawable.butterfin, "버터핀", R.drawable.egggrnl,  "땅,천둥", "6시간"),
        TimeData2(R.drawable.dori, "도리", R.drawable.egggrni,  "땅,얼음", "6시간"),
        TimeData2(R.drawable.jjingyo, "찡요", R.drawable.eggwang,  "물,숲", "6시간"),
        TimeData2(R.drawable.chichi, "치치", R.drawable.eggingr,  "얼음,땅", "6시간"),
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
        TimeData2(R.drawable.piguru, "피구루", R.drawable.egggnwi,  "숲,바람", "8시간"),
        TimeData2(R.drawable.crapi, "크래피", R.drawable.egggnwi,  "숲,바람", "8시간"),
        TimeData2(R.drawable.tutu, "투투", R.drawable.eggwing,  "바람,숲", "8시간"),
        TimeData2(R.drawable.ggobu, "꼬부", R.drawable.eggwing,  "바람,숲", "8시간"),
        TimeData2(R.drawable.bobo, "보보", R.drawable.eggwinwa,  "바람,물", "8시간15분"),
        TimeData2(R.drawable.pumki2, "펌키", R.drawable.eggpumki,  "천둥,바람", "8시간30분"),
        TimeData2(R.drawable.giroro, "기로로", R.drawable.eggwinl,  "바람,천둥", "8시간30분"),
        TimeData2(R.drawable.gururu, "구루루", R.drawable.eggwinl,  "바람,천둥", "8시간30분"),
        TimeData2(R.drawable.kitz, "키츠", R.drawable.eggkitz,  "천둥,바람", "8시간40분"),
        TimeData2(R.drawable.raku, "라쿠", R.drawable.egglnwi,  "천둥,바람", "8시간45분"),
        TimeData2(R.drawable.nyao, "냐오", R.drawable.eggnyao,  "천둥,바람", "8시간45분"),
        TimeData2(R.drawable.dalguru, "달구루", R.drawable.egggnm,  "풀,매직", "8시간45분"),
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
        TimeData2(R.drawable.applechick22, "애플칙", R.drawable.eggapplechick2,  "숲,땅", "9시간57분"),
        TimeData2(R.drawable.chomchom, "촘촘", R.drawable.egglngr,  "천둥,땅", "10시간"),
        TimeData2(R.drawable.koka, "코카", R.drawable.egglngr,  "천둥,땅", "10시간"),
        TimeData2(R.drawable.cropet, "크로펫", R.drawable.eggcropet,  "천둥,땅", "10시간15분"),
        TimeData2(R.drawable.pogisa, "포기사", R.drawable.eggpogisa,  "숲,불", "10시간15분"),
        TimeData2(R.drawable.dumurai, "두무라이", R.drawable.eggdumurai,  "땅,얼음", "10시간15분"),
        TimeData2(R.drawable.jelisia, "젤리시아", R.drawable.eggjelisia,  "매직,숲", "10시간15분"),
        TimeData2(R.drawable.dujangun, "듀장군", R.drawable.eggdujangun,  "물,매직", "10시간15분"),
        TimeData2(R.drawable.chocolove, "초코럽", R.drawable.egglove,  "천둥,숲", "10시간30분"),
        TimeData2(R.drawable.cocolove, "코코럽", R.drawable.egglove,  "천둥,숲", "10시간30분"),
        TimeData2(R.drawable.lovelove, "러브럽", R.drawable.egglove,  "천둥,숲", "10시간30분"),
        TimeData2(R.drawable.candylove, "캔디럽", R.drawable.eggcandylove,  "얼음,천둥", "10시간30분"),
        TimeData2(R.drawable.spain, "스파인", R.drawable.eggspain,  "바람,천둥", "10시간37분"),
        TimeData2(R.drawable.spain22, "스파인", R.drawable.eggspain2,  "바람,천둥", "10시간37분"),
        TimeData2(R.drawable.mushroom2, "머쉬룸", R.drawable.eggmushroom,  "땅,불", "10시간37분"),
        TimeData2(R.drawable.sharkgon2, "샤크곤", R.drawable.eggsharkgon,  "물,얼음", "10시간37분"),
        TimeData2(R.drawable.godium, "고디움", R.drawable.egggodium,  "불,바람", "10시간57분"),
        TimeData2(R.drawable.warru, "왈루", R.drawable.egginwa,  "얼음,물", "11시간"),
        TimeData2(R.drawable.kota2, "코타", R.drawable.eggkota,  "얼음,불", "11시간15분"),
        TimeData2(R.drawable.suri, "수리", R.drawable.eggmnl,  "매직,천둥", "11시간15분"),
        TimeData2(R.drawable.pus, "푸스", R.drawable.egglnm,  "천둥,매직", "11시간15분"),
        TimeData2(R.drawable.cline, "클리네", R.drawable.eggcline,  "천둥,매직", "11시간15분"),
        TimeData2(R.drawable.humpti, "험프티", R.drawable.egghumpti,  "매직,천둥", "11시간15분"),
        TimeData2(R.drawable.omiyacon, "오미야콘", R.drawable.eggomiyacon,  "얼음,땅", "11시간37분"),
        TimeData2(R.drawable.yurion, "유리온", R.drawable.eggyurion,  "물,얼음", "11시간37분"),
        TimeData2(R.drawable.marina, "마리나", R.drawable.eggwani,  "물,얼음", "11시간45분"),
        TimeData2(R.drawable.polaru, "폴라루", R.drawable.egginwa,  "얼음,물", "11시간45분"),
        TimeData2(R.drawable.chupiking, "츄파이킹", R.drawable.eggchupiking,  "얼음,물", "11시간45분"),
        TimeData2(R.drawable.sharky, "샤키", R.drawable.eggwanm,  "물,매직", "11시간45분"),
        TimeData2(R.drawable.silli, "실리", R.drawable.eggmnwa,  "매직,물", "11시간45분"),
        TimeData2(R.drawable.dolpi, "돌피", R.drawable.eggwanm,  "물,매직", "11시간45분"),
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
        TimeData2(R.drawable.nuni, "누니", R.drawable.eggnuni,  "얼음,땅,바람", "21시간"),
        TimeData2(R.drawable.totoru, "토토루", R.drawable.eggingrnwi,  "얼음,땅,바람", "21시간"),
        TimeData2(R.drawable.alroha, "알로하", R.drawable.eggalroha,  "물,얼음,숲", "22시간15분"),
        TimeData2(R.drawable.rosa, "로사", R.drawable.eggwining,  "바람,얼음,숲", "22시간30분"),
        TimeData2(R.drawable.tider, "티더", R.drawable.eggtider,  "얼음,숲,바람", "22시간30분"),
        TimeData2(R.drawable.merry2, "메리", R.drawable.eggmerry,  "불,땅,숲", "22시간30분"),
        TimeData2(R.drawable.whyki, "와이키", R.drawable.eggwhyki,  "물,얼음,천둥", "22시간45분"),
        TimeData2(R.drawable.resco, "레스코", R.drawable.eggresco,  "땅,불,물", "23시간15분"),
        TimeData2(R.drawable.chekiru, "체키루", R.drawable.eggchekiru,  "땅,얼음,물", "23시간15분"),
        TimeData2(R.drawable.caterfly, "캐터플라이", R.drawable.eggfnlng,  "불,천둥,숲", "23시간30분"),
        TimeData2(R.drawable.dodo, "도도", R.drawable.eggfnlnwi,  "불,천둥,바람", "23시간30분"),
        TimeData2(R.drawable.rudol, "루돌", R.drawable.eggfning,  "불,얼음,숲", "24시간"),
        TimeData2(R.drawable.shellru, "쉘루", R.drawable.eggwinwani,  "바람,물,얼음", "24시간30분"),
        TimeData2(R.drawable.skulru2, "스컬루", R.drawable.eggskulru,  "천둥,바람,얼음", "25시간"),
        TimeData2(R.drawable.sufferyong2, "서퍼용", R.drawable.eggsufferyong,  "물,바람,천둥", "25시간"),
        TimeData2(R.drawable.cupi2, "큐피", R.drawable.eggcupi,  "매직,바람,불", "26시간"),
        TimeData2(R.drawable.jurayong2, "쥬라용", R.drawable.eggjurayong,  "땅,천둥,숲", "26시간30분"),
        TimeData2(R.drawable.piko2, "피코", R.drawable.eggpiko,  "물,숲,천둥", "27시간"),
        TimeData2(R.drawable.shasha2, "샤샤", R.drawable.eggshasha,  "땅,얼음,천둥", "27시간"),
        TimeData2(R.drawable.sechimi2, "새치미", R.drawable.eggsechimi,  "얼음,바람,불", "27시간"),
        TimeData2(R.drawable.rambert2, "램버트", R.drawable.eggrambert,  "바람,물,숲", "28시간"),
        TimeData2(R.drawable.berr2, "베르", R.drawable.eggberr,  "물,바람,땅", "28시간30분"),
        TimeData2(R.drawable.sparumong2, "스파루몽", R.drawable.eggsparumong,  "천둥,불,얼음", "28시간45분"),
        TimeData2(R.drawable.godaesinyong, "고대신룡", R.drawable.egggodaesinyong,  "빛", "35시간57분"),
        TimeData2(R.drawable.darknicks, "다크닉스", R.drawable.eggdarknicks,  "어둠", "35시간57분"),
        TimeData2(R.drawable.godaesinyong22, "고대신룡", R.drawable.egggodaesinyong2,  "빛", "35시간57분"),
        TimeData2(R.drawable.rey, "레이", R.drawable.eggrey,  "빛", "36시간"),
        TimeData2(R.drawable.shadow, "쉐도우", R.drawable.eggshadow,  "어둠", "36시간"),
        TimeData2(R.drawable.rupin, "루핀", R.drawable.eggrupin,  "빛", "40시간"),
        TimeData2(R.drawable.krono, "크로노", R.drawable.eggkrono,  "어둠", "42시간"),
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
        setContentView(R.layout.activity_main7)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val imgButton = findViewById<ImageButton>(R.id.selectButton)
        val questionButton = findViewById<ImageButton>(R.id.questionButton)


        questionButton.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.question_popup_layout)

            val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
            textViewContent.text =
                "상대 우파루를 선택해주세요.\n\n이후 <상성확인> 버튼을 누르면\n\n유리한 상성의 우파루를 확인할 수 있습니다."

            val closeButton = dialog.findViewById<Button>(R.id.closeButton)
            closeButton.setOnClickListener {
                dialog.dismiss() // 팝업 닫기
            }

            dialog.show() // 팝업 다이얼로그 표시
        }

        imgButton.setOnClickListener {
            val intent = Intent(this, SelectUparu3::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        // MainActivity7에서 SharedPreferences를 사용하여 데이터 불러오기
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val changeUparu = sharedPreferences.getInt("changeUparu2", R.drawable.randomegg)

        // 이미지 버튼 1 정보 업데이트
        val uparuView1 = findViewById<ImageButton>(R.id.selectButton)
        uparuView1.setImageResource(changeUparu)

        val changeType = sharedPreferences.getString("changeType2", "1")

        val buttonJohap = findViewById<ImageButton>(R.id.checkButton)

        buttonJohap.setOnClickListener {
            recyclerView.visibility = View.VISIBLE

            // 각 속성에 대한 강한 속성과 약한 속성을 맵으로 지정
            val strongProperties = mapOf(
                "숲" to listOf("불", "얼음"),
                "땅" to listOf("바람", "매직", "황금"),
                "불" to listOf("물", "매직"),
                "물" to listOf("숲", "천둥"),
                "천둥" to listOf("땅", "바람", "빛"),
                "바람" to listOf("불", "매직"),
                "얼음" to listOf("불", "황금"),
                "매직" to listOf("물", "얼음"),
                "빛" to listOf("숲", "어둠"),
                "어둠" to listOf("땅", "빛"),
                "황금" to listOf("천둥", "어둠")
            )

            val weakProperties = mapOf(
                "숲" to listOf("물", "빛"),
                "땅" to listOf("천둥", "어둠"),
                "불" to listOf("숲", "바람", "얼음"),
                "물" to listOf("불", "매직"),
                "천둥" to listOf("물", "황금"),
                "바람" to listOf("땅", "천둥"),
                "얼음" to listOf("숲", "매직"),
                "매직" to listOf("땅", "불", "바람"),
                "빛" to listOf("천둥", "어둠"),
                "어둠" to listOf("빛", "황금"),
                "황금" to listOf("땅", "얼음")
            )
            fun getRemainingProperties(selectedProperty: String, weakProperties: Map<String, List<String>>): List<String> {
                val allProperties = listOf("숲", "땅", "불", "물", "천둥", "바람", "얼음", "매직", "빛", "어둠", "황금")

                val excludedProperties = weakProperties[selectedProperty] ?: emptyList()
                return allProperties.filterNot { excludedProperties.contains(it) }
            }

            fun printAllPossibleCombinations(strongA: List<String>, commonElements: List<String>, alltype: List<String>) : List<String> {
                val combinations = mutableListOf<String>()
                val combinationsa = mutableListOf<String>()
                val combinationsb = mutableListOf<String>()
                val combinationsc = mutableListOf<String>()
                val combinationsd = mutableListOf<String>()

                for (a in commonElements) {
                    if (strongA.contains(a)) {
                        for (b in alltype) {
                            for (c in alltype) {
                                val combination1 = listOf(a, b, c).joinToString(",")
                                val combination2 = listOf(a, b).joinToString(",")
                                val combination3 = listOf(a).joinToString(",")
                                combinationsa.add(combination1)
                                combinationsa.add(combination2)
                                if (combination3.contains(b)) {
                                    combinationsa.add(combination3)
                                }
                            }
                        }
                    }
                }
                for (a in commonElements) {
                    if (!strongA.contains(a)) {
                        for (b in strongA) {
                            for (c in strongA) {
                                val combination1 = listOf(a, b, c).joinToString(",")
                                val combination2 = listOf(a, b).joinToString(",")
                                val combination3 = listOf(a).joinToString(",")
                                combinationsb.add(combination1)
                                combinationsb.add(combination2)
                                if (combination3.contains(b)) {
                                    combinationsb.add(combination3)
                                }
                            }
                        }
                    }
                }
                for (a in commonElements) {
                    if (!strongA.contains(a)) {
                        for (b in strongA) {
                            if(strongA.contains(b))
                                for (c in alltype) {
                                    val combination1 = listOf(a, b, c).joinToString(",")
                                    val combination2 = listOf(a, b).joinToString(",")
                                    val combination3 = listOf(a).joinToString(",")
                                    combinationsc.add(combination1)
                                    combinationsc.add(combination2)
                                    if (combination3.contains(b)) {
                                        combinationsc.add(combination3)
                                    }
                                }
                        }
                    }
                }
                    for (a in commonElements) {
                        if (!strongA.contains(a)) {
                            for (c in strongA) {
                                if (alltype.contains(c) && strongA.contains(c)) {
                                    for (b in alltype) {
                                        val combination1 = listOf(a, b, c).joinToString(",")
                                        val combination2 = listOf(a, b).joinToString(",")
                                        val combination3 = listOf(a).joinToString(",")
                                        combinationsd.add(combination1)
                                        if (combination3.contains(c)) {
                                            combinationsd.add(combination2)
                                        }
                                        if (combination3.contains(c)) {
                                            combinationsd.add(combination3)
                                        }
                                    }
                                }
                            }
                        }
                    }

                combinations.addAll(combinationsa)
                combinations.addAll(combinationsb)
                combinations.addAll(combinationsc)
                combinations.addAll(combinationsd)
                return combinations.distinct()
            }

            val filteredDataList = DataList.filter { data ->
                    val result = data.type
                    val options = changeType?.split(",") ?: emptyList()
                    val a = options.getOrNull(0) ?: ""
                    val b = options.getOrNull(1) ?: ""
                    val c = options.getOrNull(2) ?: ""
                    val strongA = strongProperties[a] ?: emptyList()
                    val remaining = getRemainingProperties(a, weakProperties)
                    val remaining2 = getRemainingProperties(b, weakProperties)
                    val remaining3 = getRemainingProperties(c, weakProperties)
                    val commonElements = remaining.intersect(remaining2).intersect(remaining3).toList()
                    val alltype = getRemainingProperties("", weakProperties)
                    Log.d("Filtering", "$a $b $c $strongA $commonElements")

                    val resulttype = printAllPossibleCombinations(strongA, commonElements, alltype)

                resulttype.contains(result)

                } as ArrayList<TimeData2>

                val newAdapter = CustomAdapterTime2(this, filteredDataList)
                recyclerView.adapter = newAdapter
            }
        }
    }