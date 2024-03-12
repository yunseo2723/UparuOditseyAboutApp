package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity5 : AppCompatActivity() {

    var DataList = arrayListOf(
        TimeData(R.drawable.pori, "포리", R.drawable.eggg, "소환시간 :", "7초"),
        TimeData(R.drawable.dudeoru, "두더루", R.drawable.egggr, "소환시간 :", "3분"),
        TimeData(R.drawable.bbururu, "뿌루루", R.drawable.eggf, "소환시간 :", "15분"),
        TimeData(R.drawable.munguru, "뭉구루", R.drawable.egggrng, "소환시간 :", "20분"),
        TimeData(R.drawable.beobi, "버비", R.drawable.egggrng, "소환시간 :", "20분"),
        TimeData(R.drawable.ddoruru, "또루루", R.drawable.egggngr, "소환시간 :", "30분"),
        TimeData(R.drawable.anti, "앤티", R.drawable.egganti, "소환시간 :", "35분"),
        TimeData(R.drawable.dupa, "듀파", R.drawable.eggwa, "소환시간 :", "45분"),
        TimeData(R.drawable.ururu, "우루루", R.drawable.eggl, "소환시간 :", "2시간"),
        TimeData(R.drawable.pring, "프링", R.drawable.egggnf, "소환시간 :", "2시간30분"),
        TimeData(R.drawable.seed, "시드", R.drawable.egggnf, "소환시간 :", "2시간30분"),
        TimeData(R.drawable.hakuru, "하쿠루", R.drawable.eggfng, "소환시간 :", "2시간30분"),
        TimeData(R.drawable.raply, "라플리", R.drawable.eggfng, "소환시간 :", "2시간30분"),
        TimeData(R.drawable.panpan, "판판", R.drawable.egggrnf, "소환시간 :", "3시간"),
        TimeData(R.drawable.mumu, "무무", R.drawable.eggfngr, "소환시간 :", "3시간"),
        TimeData(R.drawable.donk, "동크", R.drawable.eggfngr, "소환시간 :", "3시간"),
        TimeData(R.drawable.pero, "페로", R.drawable.egggnl, "소환시간 :", "3시간30분"),
        TimeData(R.drawable.poter, "포터", R.drawable.egggnl, "소환시간 :", "3시간30분"),
        TimeData(R.drawable.samsam, "삼삼", R.drawable.egggnl, "소환시간 :", "3시간30분"),
        TimeData(R.drawable.dorong, "도롱", R.drawable.egglng, "소환시간 :", "3시간30분"),
        TimeData(R.drawable.roro, "로로", R.drawable.egggnl, "소환시간 :", "3시간45분"),
        TimeData(R.drawable.pepe, "페페", R.drawable.eggfnl, "소환시간 :", "4시간"),
        TimeData(R.drawable.daram, "다람", R.drawable.eggfnl, "소환시간 :", "4시간"),
        TimeData(R.drawable.meme, "메메", R.drawable.egglnf, "소환시간 :", "4시간"),
        TimeData(R.drawable.puddeok, "푸드덕", R.drawable.egglnf, "소환시간 :", "4시간"),
        TimeData(R.drawable.chupa, "츄파", R.drawable.eggi, "소환시간 :", "4시간"),
        TimeData(R.drawable.ali, "알리", R.drawable.egglng, "소환시간 :", "4시간15분"),
        TimeData(R.drawable.haerong, "해롱", R.drawable.egggnwa, "소환시간 :", "4시간30분"),
        TimeData(R.drawable.pupu, "푸푸", R.drawable.eggwang, "소환시간 :", "4시간30분"),
        TimeData(R.drawable.bingo, "빙고", R.drawable.eggingr, "소환시간 :", "4시간45분"),
        TimeData(R.drawable.bibi, "비비", R.drawable.eggfnwa, "소환시간 :", "5시간"),
        TimeData(R.drawable.toto, "토토", R.drawable.eggwanf, "소환시간 :", "5시간"),
        TimeData(R.drawable.tod, "토드", R.drawable.eggwanf, "소환시간 :", "5시간"),
        TimeData(R.drawable.rairu, "라이루", R.drawable.egglni, "소환시간 :", "5시간"),
        TimeData(R.drawable.tamami, "타마미", R.drawable.eggtamami, "소환시간 :", "5시간15분"),
        TimeData(R.drawable.ulami, "울라미", R.drawable.eggingr, "소환시간 :", "5시간15분"),
        TimeData(R.drawable.yongaru, "용가루", R.drawable.eggwi, "소환시간 :", "5시간30분"),
        TimeData(R.drawable.yongyong, "용용", R.drawable.egggrnl, "소환시간 :", "6시간"),
        TimeData(R.drawable.butterfin, "버터핀", R.drawable.egggrnl, "소환시간 :", "6시간"),
        TimeData(R.drawable.dori, "도리", R.drawable.egggrni, "소환시간 :", "6시간"),
        TimeData(R.drawable.jjingyo, "찡요", R.drawable.eggwang, "소환시간 :", "6시간"),
        TimeData(R.drawable.chichi, "치치", R.drawable.eggingr, "소환시간 :", "6시간"),
        TimeData(R.drawable.ulfo, "울포", R.drawable.eggulfo, "소환시간 :", "6시간30분"),
        TimeData(R.drawable.jello, "젤로", R.drawable.eggm, "소환시간 :", "6시간30분"),
        TimeData(R.drawable.uparupa, "우파루파", R.drawable.egggrnwa, "소환시간 :", "7시간"),
        TimeData(R.drawable.eli, "엘리", R.drawable.eggwangr, "소환시간 :", "7시간"),
        TimeData(R.drawable.wow, "와우", R.drawable.egginwi, "소환시간 :", "7시간"),
        TimeData(R.drawable.uli, "울리", R.drawable.egginwi, "소환시간 :", "7시간"),
        TimeData(R.drawable.skungki, "스컹키", R.drawable.eggwini, "소환시간 :", "7시간"),
        TimeData(R.drawable.koku, "코쿠", R.drawable.eggfnwa, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.betsi, "벳시", R.drawable.eggbetsi, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.hipopo, "히포포", R.drawable.eggwanf, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.beti, "베티", R.drawable.egginl, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.doli, "돌리", R.drawable.egginwi, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.mongkiru, "몽키루", R.drawable.egglni, "소환시간 :", "7시간30분"),
        TimeData(R.drawable.progu, "프로구", R.drawable.egggnwa, "소환시간 :", "7시간45분"),
        TimeData(R.drawable.piguru, "피구루", R.drawable.egggnwi, "소환시간 :", "8시간"),
        TimeData(R.drawable.crapi, "크래피", R.drawable.egggnwi, "소환시간 :", "8시간"),
        TimeData(R.drawable.tutu, "투투", R.drawable.eggwing, "소환시간 :", "8시간"),
        TimeData(R.drawable.ggobu, "꼬부", R.drawable.eggwing, "소환시간 :", "8시간"),
        TimeData(R.drawable.bobo, "보보", R.drawable.eggwinwa, "소환시간 :", "8시간15분"),
        TimeData(R.drawable.pumki2, "펌키", R.drawable.eggpumki, "소환시간 :", "8시간30분"),
        TimeData(R.drawable.giroro, "기로로", R.drawable.eggwinl, "소환시간 :", "8시간30분"),
        TimeData(R.drawable.gururu, "구루루", R.drawable.eggwinl, "소환시간 :", "8시간30분"),
        TimeData(R.drawable.kitz, "키츠", R.drawable.eggkitz, "소환시간 :", "8시간40분"),
        TimeData(R.drawable.raku, "라쿠", R.drawable.egglnwi, "소환시간 :", "8시간45분"),
        TimeData(R.drawable.nyao, "냐오", R.drawable.eggnyao, "소환시간 :", "8시간45분"),
        TimeData(R.drawable.dalguru, "달구루", R.drawable.egggnm, "소환시간 :", "8시간45분"),
        TimeData(R.drawable.buffru, "버프루", R.drawable.egggrnwa, "소환시간 :", "9시간"),
        TimeData(R.drawable.copyru, "카피루", R.drawable.eggwangr, "소환시간 :", "9시간"),
        TimeData(R.drawable.tigo, "티고", R.drawable.egginwi, "소환시간 :", "9시간"),
        TimeData(R.drawable.miyo, "미요", R.drawable.eggmiyo, "소환시간 :", "9시간"),
        TimeData(R.drawable.dudu, "두두", R.drawable.eggwini, "소환시간 :", "9시간"),
        TimeData(R.drawable.neoguru, "너구루", R.drawable.egggrnm, "소환시간 :", "9시간"),
        TimeData(R.drawable.tedi, "테디", R.drawable.eggmngr, "소환시간 :", "9시간"),
        TimeData(R.drawable.bamkuri, "밤쿠리", R.drawable.egggrnm, "소환시간 :", "9시간"),
        TimeData(R.drawable.firu, "파이루", R.drawable.eggfnwi, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.kogi, "코기", R.drawable.eggfnwi, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.gogo, "고고", R.drawable.eggwinf, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.miko, "미코", R.drawable.eggmiko, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.mendi, "맨디", R.drawable.eggwinf, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.flameru, "플라메루", R.drawable.eggflameru, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.metoru, "메토루", R.drawable.eggmng, "소환시간 :", "9시간30분"),
        TimeData(R.drawable.armang, "아르망", R.drawable.egggrnf, "소환시간 :", "9시간45분"),
        TimeData(R.drawable.scoti, "스코티", R.drawable.eggscoti, "소환시간 :", "9시간45분"),
        TimeData(R.drawable.baretsa, "바렛사", R.drawable.eggbaretsa, "소환시간 :", "9시간45분"),
        TimeData(R.drawable.danbi, "단비", R.drawable.eggdanbi, "소환시간 :", "9시간45분"),
        TimeData(R.drawable.applechick, "애플칙", R.drawable.eggapplechick, "소환시간 :", "9시간57분"),
        TimeData(R.drawable.applechick22, "애플칙", R.drawable.eggapplechick2, "소환시간 :", "9시간57분"),
        TimeData(R.drawable.chomchom, "촘촘", R.drawable.egglngr, "소환시간 :", "10시간"),
        TimeData(R.drawable.koka, "코카", R.drawable.egglngr, "소환시간 :", "10시간"),
        TimeData(R.drawable.cropet, "크로펫", R.drawable.eggcropet, "소환시간 :", "10시간15분"),
        TimeData(R.drawable.pogisa, "포기사", R.drawable.eggpogisa, "소환시간 :", "10시간15분"),
        TimeData(R.drawable.dumurai, "두무라이", R.drawable.eggdumurai, "소환시간 :", "10시간15분"),
        TimeData(R.drawable.jelisia, "젤리시아", R.drawable.eggjelisia, "소환시간 :", "10시간15분"),
        TimeData(R.drawable.dujangun, "듀장군", R.drawable.eggdujangun, "소환시간 :", "10시간15분"),
        TimeData(R.drawable.chocolove, "초코럽", R.drawable.egglove, "소환시간 :", "10시간30분"),
        TimeData(R.drawable.cocolove, "코코럽", R.drawable.egglove, "소환시간 :", "10시간30분"),
        TimeData(R.drawable.lovelove, "러브럽", R.drawable.egglove, "소환시간 :", "10시간30분"),
        TimeData(R.drawable.candylove2, "캔디럽", R.drawable.eggcandylove, "소환시간 :", "10시간30분"),
        TimeData(R.drawable.spain, "스파인", R.drawable.eggspain, "소환시간 :", "10시간37분"),
        TimeData(R.drawable.mushroom2, "머쉬룸", R.drawable.eggmushroom, "소환시간 :", "10시간37분"),
        TimeData(R.drawable.sharkgon2, "샤크곤", R.drawable.eggsharkgon, "소환시간 :", "10시간37분"),
        TimeData(R.drawable.godium, "고디움", R.drawable.egggodium, "소환시간 :", "10시간57분"),
        TimeData(R.drawable.warru, "왈루", R.drawable.egginwa, "소환시간 :", "11시간"),
        TimeData(R.drawable.kota2, "코타", R.drawable.egginf, "소환시간 :", "11시간15분"),
        TimeData(R.drawable.suri, "수리", R.drawable.eggmnl, "소환시간 :", "11시간15분"),
        TimeData(R.drawable.pus, "푸스", R.drawable.egglnm, "소환시간 :", "11시간15분"),
        TimeData(R.drawable.cline, "클리네", R.drawable.eggcline, "소환시간 :", "11시간15분"),
        TimeData(R.drawable.humpti, "험프티", R.drawable.egghumpti, "소환시간 :", "11시간15분"),
        TimeData(R.drawable.omiyacon, "오미야콘", R.drawable.eggomiyacon, "소환시간 :", "11시간37분"),
        TimeData(R.drawable.yurion, "유리온", R.drawable.eggyurion, "소환시간 :", "11시간37분"),
        TimeData(R.drawable.marina, "마리나", R.drawable.eggwani, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.polaru, "폴라루", R.drawable.egginwa, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.chupiking, "츄파이킹", R.drawable.eggchupiking, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.sharky, "샤키", R.drawable.eggwanm, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.silli, "실리", R.drawable.eggmnwa, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.dolpi, "돌피", R.drawable.eggwanm, "소환시간 :", "11시간45분"),
        TimeData(R.drawable.orpeus, "오르페우스", R.drawable.eggorpeus, "소환시간 :", "11시간57분"),
        TimeData(R.drawable.krang, "크랑", R.drawable.eggwanwi, "소환시간 :", "12시간"),
        TimeData(R.drawable.rodi, "로디", R.drawable.eggmnwi, "소환시간 :", "12시간15분"),
        TimeData(R.drawable.pandi, "팬디", R.drawable.eggwinm, "소환시간 :", "12시간15분"),
        TimeData(R.drawable.tingklru, "팅클루", R.drawable.eggmnwi, "소환시간 :", "12시간15분"),
        TimeData(R.drawable.shujel, "슈젤", R.drawable.eggwanwi, "소환시간 :", "12시간30분"),
        TimeData(R.drawable.penpen, "펜펜", R.drawable.eggmni, "소환시간 :", "12시간45분"),
        TimeData(R.drawable.softi, "소프티", R.drawable.egginm, "소환시간 :", "12시간45분"),
        TimeData(R.drawable.arki, "아르키", R.drawable.eggarki, "소환시간 :", "12시간45분"),
        TimeData(R.drawable.alpha, "알파", R.drawable.eggfnm, "소환시간 :", "13시간"),
        TimeData(R.drawable.toibo, "토이보", R.drawable.eggmnf, "소환시간 :", "13시간"),
        TimeData(R.drawable.penriru, "펜리루", R.drawable.eggfni, "소환시간 :", "14시간"),
        TimeData(R.drawable.foxy, "폭시", R.drawable.egginf, "소환시간 :", "14시간"),
        TimeData(R.drawable.chepy, "채피", R.drawable.eggchepy, "소환시간 :", "14시간"),
        TimeData(R.drawable.boradoru, "보라도루", R.drawable.egggrnwi, "소환시간 :", "16시간"),
        TimeData(R.drawable.bau, "바우", R.drawable.eggwingr, "소환시간 :", "16시간"),
        TimeData(R.drawable.dumpti, "덤프티", R.drawable.eggdumpti, "소환시간 :", "16시간"),
        TimeData(R.drawable.drapet, "드라펫", R.drawable.eggdrapet, "소환시간 :", "17시간30분"),
        TimeData(R.drawable.bongbong, "봉봉", R.drawable.egggni, "소환시간 :", "18시간"),
        TimeData(R.drawable.yuni, "유니", R.drawable.egging, "소환시간 :", "18시간"),
        TimeData(R.drawable.cray, "크레이", R.drawable.egglnwa, "소환시간 :", "20시간"),
        TimeData(R.drawable.hermi, "헤르미", R.drawable.egglnwa, "소환시간 :", "20시간"),
        TimeData(R.drawable.purni, "푸르니", R.drawable.egggnwangr, "소환시간 :", "20시간15분"),
        TimeData(R.drawable.wonderdragon, "원더드래곤", R.drawable.eggwonderdragon, "소환시간 :", "20시간17분"),
        TimeData(R.drawable.popomo, "포포모", R.drawable.eggpopomo, "소환시간 :", "20시간17분"),
        TimeData(R.drawable.nuni, "누니", R.drawable.eggnuni, "소환시간 :", "21시간"),
        TimeData(R.drawable.totoru, "토토루", R.drawable.eggingrnwi, "소환시간 :", "21시간"),
        TimeData(R.drawable.alroha, "알로하", R.drawable.eggalroha, "소환시간 :", "22시간15분"),
        TimeData(R.drawable.rosa, "로사", R.drawable.eggwining, "소환시간 :", "22시간30분"),
        TimeData(R.drawable.tider, "티더", R.drawable.eggtider, "소환시간 :", "22시간30분"),
        TimeData(R.drawable.merry2, "메리", R.drawable.eggmerry, "소환시간 :", "22시간30분"),
        TimeData(R.drawable.whyki, "와이키", R.drawable.eggwhyki, "소환시간 :", "22시간45분"),
        TimeData(R.drawable.resco, "레스코", R.drawable.eggresco, "소환시간 :", "23시간15분"),
        TimeData(R.drawable.chekiru, "체키루", R.drawable.eggchekiru, "소환시간 :", "23시간15분"),
        TimeData(R.drawable.caterfly, "캐터플라이", R.drawable.eggfnlng, "소환시간 :", "23시간30분"),
        TimeData(R.drawable.dodo, "도도", R.drawable.eggfnlnwi, "소환시간 :", "23시간30분"),
        TimeData(R.drawable.rudol, "루돌", R.drawable.eggfning, "소환시간 :", "24시간"),
        TimeData(R.drawable.shellru, "쉘루", R.drawable.eggwinwani, "소환시간 :", "24시간30분"),
        TimeData(R.drawable.skulru2, "스컬루", R.drawable.eggskulru, "소환시간 :", "25시간"),
        TimeData(R.drawable.sufferyong2, "서퍼용", R.drawable.eggsufferyong, "소환시간 :", "25시간"),
        TimeData(R.drawable.cupi2, "큐피", R.drawable.eggcupi, "소환시간 :", "26시간"),
        TimeData(R.drawable.jurayong2, "쥬라용", R.drawable.eggjurayong, "소환시간 :", "26시간30분"),
        TimeData(R.drawable.piko2, "피코", R.drawable.eggpiko, "소환시간 :", "27시간"),
        TimeData(R.drawable.shasha2, "샤샤", R.drawable.eggshasha, "소환시간 :", "27시간"),
        TimeData(R.drawable.sechimi2, "새치미", R.drawable.eggsechimi, "소환시간 :", "27시간"),
        TimeData(R.drawable.rambert2, "램버트", R.drawable.eggrambert, "소환시간 :", "28시간"),
        TimeData(R.drawable.berr2, "베르", R.drawable.eggberr, "소환시간 :", "28시간30분"),
        TimeData(R.drawable.sparumong2, "스파루몽", R.drawable.eggsparumong, "소환시간 :", "28시간45분"),
        TimeData(R.drawable.godaesinyong, "고대신룡", R.drawable.egggodaesinyong, "소환시간 :", "35시간57분"),
        TimeData(R.drawable.godaesinyong22, "고대신룡", R.drawable.egggodaesinyong2, "소환시간 :", "35시간57분"),
        TimeData(R.drawable.darknicks, "다크닉스", R.drawable.eggdarknicks, "소환시간 :", "35시간57분"),
        TimeData(R.drawable.rey, "레이", R.drawable.eggrey, "소환시간 :", "36시간"),
        TimeData(R.drawable.shadow, "쉐도우", R.drawable.eggshadow, "소환시간 :", "36시간"),
        TimeData(R.drawable.rupin, "루핀", R.drawable.eggrupin, "소환시간 :", "40시간"),
        TimeData(R.drawable.krono, "크로노", R.drawable.eggkrono, "소환시간 :", "42시간"),
        TimeData(R.drawable.goldi, "골디", R.drawable.egggoldi, "소환시간 :", "48시간"),
        TimeData(R.drawable.darkgoldi, "다크골디", R.drawable.egggoldi, "소환시간 :", "48시간")
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
        setContentView(R.layout.activity_main5)


        val timeList = findViewById<RecyclerView>(R.id.timeList)

        val customAdapter = CustomAdapterTime(this, DataList)

        timeList.adapter = customAdapter

        val layoutManager = LinearLayoutManager(this)
        timeList.layoutManager = layoutManager


    }

}
