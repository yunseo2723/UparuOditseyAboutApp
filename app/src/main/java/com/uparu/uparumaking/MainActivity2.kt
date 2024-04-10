package com.uparu.uparumaking

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    var DataList = arrayListOf(
        Data(R.drawable.star1, "Star"),
        Data(R.drawable.grass1, "Grass"),
        Data(R.drawable.ground1, "Ground"),
        Data(R.drawable.fire1, "Fire"),
        Data(R.drawable.water1, "Water"),
        Data(R.drawable.lightning1, "Lightning"),
        Data(R.drawable.wind1, "Wind"),
        Data(R.drawable.ice1, "Ice"),
        Data(R.drawable.magic1, "Magic")
    )

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = CustomAdapter(this, DataList)

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val clickedData = DataList[position]
            when (clickedData.imageResId) {
                R.drawable.star1 -> showStarDialog()
                R.drawable.grass1 -> showGrassDialog()
                R.drawable.ground1 -> showGroundDialog()
                R.drawable.fire1 -> showFireDialog()
                R.drawable.water1 -> showWaterDialog()
                R.drawable.lightning1 -> showLightningDialog()
                R.drawable.wind1 -> showWindDialog()
                R.drawable.ice1 -> showIceDialog()
                R.drawable.magic1 -> showMagicDialog()
            }
        }

        val imgButton2 = findViewById<ImageButton>(R.id.button2)
        imgButton2.setOnClickListener {
            // 새로운 액티비티로 이동
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0);
        }
    }

    private fun showStarDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.rey, "레이"),
            Pair(R.drawable.shadow, "쉐도우"),
            Pair(R.drawable.rupin, "루핀"),
            Pair(R.drawable.goldi, "골디"),
            Pair(R.drawable.darkgoldi, "다크골디"),
            Pair(R.drawable.krono, "크로노"),
            Pair(R.drawable.godaesinyong, "고대신룡"),
            Pair(R.drawable.darknicks, "다크닉스"),
            Pair(R.drawable.godaesinyong22, "고대신룡S"),
            Pair(R.drawable.stella2, "스텔라")
        )
        showCustomDialog(dialogItems)
    }


    private fun showGrassDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.pori, "포리"),
            Pair(R.drawable.munguru, "뭉구루"),
            Pair(R.drawable.ddoruru, "또루루"),
            Pair(R.drawable.pring, "프링"),
            Pair(R.drawable.hakuru, "하쿠루"),
            Pair(R.drawable.pupu, "푸푸"),
            Pair(R.drawable.haerong, "해롱"),
            Pair(R.drawable.pero, "페로"),
            Pair(R.drawable.beobi, "버비"),
            Pair(R.drawable.anti, "앤티"),
            Pair(R.drawable.seed, "시드"),
            Pair(R.drawable.dorong, "도롱"),
            Pair(R.drawable.poter, "포터"),
            Pair(R.drawable.samsam, "삼삼"),
            Pair(R.drawable.roro, "로로"),
            Pair(R.drawable.ali, "알리"),
            Pair(R.drawable.chocolove, "초코럽"),
            Pair(R.drawable.cocolove, "코코럽"),
            Pair(R.drawable.lovelove, "러브럽"),
            Pair(R.drawable.raply, "라플리"),
            Pair(R.drawable.jjingyo, "찡요"),
            Pair(R.drawable.progu, "프로구"),
            Pair(R.drawable.tutu, "투투"),
            Pair(R.drawable.piguru, "피구루"),
            Pair(R.drawable.ggobu, "꼬부"),
            Pair(R.drawable.crapi, "크래피"),
            Pair(R.drawable.pogisa, "포기사"),
            Pair(R.drawable.dalguru, "달구루"),
            Pair(R.drawable.metoru, "메토루"),
            Pair(R.drawable.jelisia, "젤리시아"),
            Pair(R.drawable.purni, "푸르니"),
            Pair(R.drawable.caterfly, "캐터플라이"),
            Pair(R.drawable.yuni, "유니"),
            Pair(R.drawable.bongbong, "봉봉"),
            Pair(R.drawable.rudol, "루돌"),
            Pair(R.drawable.alroha, "알로하"),
            Pair(R.drawable.rosa, "로사"),
            Pair(R.drawable.tider, "티더"),
            Pair(R.drawable.merry2, "메리"),
            Pair(R.drawable.jurayong2, "쥬라용"),
            Pair(R.drawable.rambert2, "램버트"),
            Pair(R.drawable.piko2, "피코"),
            Pair(R.drawable.applechick, "애플칙"),
            Pair(R.drawable.popomo, "포포모"),
            Pair(R.drawable.applechick22, "애플칙S")
        )
        showCustomDialog(dialogItems)
    }

    private fun showGroundDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.dudeoru, "두더루"),
            Pair(R.drawable.munguru, "뭉구루"),
            Pair(R.drawable.ddoruru, "또루루"),
            Pair(R.drawable.mumu, "무무"),
            Pair(R.drawable.panpan, "판판"),
            Pair(R.drawable.yongyong, "용용"),
            Pair(R.drawable.beobi, "버비"),
            Pair(R.drawable.anti, "앤티"),
            Pair(R.drawable.donk, "동크"),
            Pair(R.drawable.bingo, "빙고"),
            Pair(R.drawable.butterfin, "버터핀"),
            Pair(R.drawable.uparupa, "우파루파"),
            Pair(R.drawable.ulami, "울라미"),
            Pair(R.drawable.eli, "엘리"),
            Pair(R.drawable.chichi, "치치"),
            Pair(R.drawable.dori, "도리"),
            Pair(R.drawable.armang, "아르망"),
            Pair(R.drawable.scoti, "스코티"),
            Pair(R.drawable.baretsa, "바렛사"),
            Pair(R.drawable.danbi, "단비"),
            Pair(R.drawable.rari, "래리"),
            Pair(R.drawable.buffru, "버프루"),
            Pair(R.drawable.copyru, "카피루"),
            Pair(R.drawable.chomchom, "촘촘"),
            Pair(R.drawable.cropet, "크로펫"),
            Pair(R.drawable.koka, "코카"),
            Pair(R.drawable.dumurai, "두무라이"),
            Pair(R.drawable.neoguru, "너구루"),
            Pair(R.drawable.tedi, "테디"),
            Pair(R.drawable.bamkuri, "밤쿠리"),
            Pair(R.drawable.purni, "푸르니"),
            Pair(R.drawable.resco, "레스코"),
            Pair(R.drawable.chekiru, "체키루"),
            Pair(R.drawable.bau, "바우"),
            Pair(R.drawable.boradoru, "보라도루"),
            Pair(R.drawable.nuni, "누니"),
            Pair(R.drawable.totoru, "토토루"),
            Pair(R.drawable.merry2, "메리"),
            Pair(R.drawable.jurayong2, "쥬라용"),
            Pair(R.drawable.berr2, "베르"),
            Pair(R.drawable.shasha2, "샤샤"),
            Pair(R.drawable.applechick, "애플칙"),
            Pair(R.drawable.omiyacon, "오미야콘"),
            Pair(R.drawable.orpeus, "오르페우스"),
            Pair(R.drawable.mushroom2, "머쉬룸"),
            Pair(R.drawable.applechick22, "애플칙S")
        )
        showCustomDialog(dialogItems)
    }

    private fun showFireDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.bbururu, "뿌루루"),
            Pair(R.drawable.pring, "프링"),
            Pair(R.drawable.mumu, "무무"),
            Pair(R.drawable.hakuru, "하쿠루"),
            Pair(R.drawable.panpan, "판판"),
            Pair(R.drawable.pepe, "페페"),
            Pair(R.drawable.meme, "메메"),
            Pair(R.drawable.daram, "다람"),
            Pair(R.drawable.donk, "동크"),
            Pair(R.drawable.seed, "시드"),
            Pair(R.drawable.puddeok, "푸드덕"),
            Pair(R.drawable.raply, "라플리"),
            Pair(R.drawable.toto, "토토"),
            Pair(R.drawable.bibi, "비비"),
            Pair(R.drawable.ulfo, "울포"),
            Pair(R.drawable.armang, "아르망"),
            Pair(R.drawable.betsi, "벳시"),
            Pair(R.drawable.koku, "코쿠"),
            Pair(R.drawable.hipopo, "히포포"),
            Pair(R.drawable.scoti, "스코티"),
            Pair(R.drawable.baretsa, "바렛사"),
            Pair(R.drawable.danbi, "단비"),
            Pair(R.drawable.tod, "토드"),
            Pair(R.drawable.gogo, "고고"),
            Pair(R.drawable.firu, "파이루"),
            Pair(R.drawable.kogi, "코기"),
            Pair(R.drawable.miko, "미코"),
            Pair(R.drawable.mendi, "맨디"),
            Pair(R.drawable.flameru, "플라메루"),
            Pair(R.drawable.pogisa, "포기사"),
            Pair(R.drawable.resco, "레스코"),
            Pair(R.drawable.caterfly, "캐터플라이"),
            Pair(R.drawable.dodo, "도도"),
            Pair(R.drawable.penriru, "펜리루"),
            Pair(R.drawable.foxy, "폭시"),
            Pair(R.drawable.chepy, "채피"),
            Pair(R.drawable.alpha, "알파"),
            Pair(R.drawable.toibo, "토이보"),
            Pair(R.drawable.dumpti, "덤프티"),
            Pair(R.drawable.rudol, "루돌"),
            Pair(R.drawable.kota2, "코타"),
            Pair(R.drawable.merry2, "메리"),
            Pair(R.drawable.sparumong2, "스파루몽"),
            Pair(R.drawable.cupi2, "큐피"),
            Pair(R.drawable.sechimi2, "새치미"),
            Pair(R.drawable.godium, "고디움"),
            Pair(R.drawable.popomo, "포포모"),
            Pair(R.drawable.mushroom2, "머쉬룸")
        )
        showCustomDialog(dialogItems)
    }

    private fun showWaterDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.dupa, "듀파"),
            Pair(R.drawable.pupu, "푸푸"),
            Pair(R.drawable.haerong, "해롱"),
            Pair(R.drawable.toto, "토토"),
            Pair(R.drawable.bibi, "비비"),
            Pair(R.drawable.uparupa, "우파루파"),
            Pair(R.drawable.jjingyo, "찡요"),
            Pair(R.drawable.eli, "엘리"),
            Pair(R.drawable.progu, "프로구"),
            Pair(R.drawable.betsi, "벳시"),
            Pair(R.drawable.koku, "코쿠"),
            Pair(R.drawable.hipopo, "히포포"),
            Pair(R.drawable.rari, "래리"),
            Pair(R.drawable.buffru, "버프루"),
            Pair(R.drawable.copyru, "카피루"),
            Pair(R.drawable.tod, "토드"),
            Pair(R.drawable.bobo, "보보"),
            Pair(R.drawable.polaru, "폴라루"),
            Pair(R.drawable.marina, "마리나"),
            Pair(R.drawable.warru, "왈루"),
            Pair(R.drawable.krang, "크랑"),
            Pair(R.drawable.shujel, "슈젤"),
            Pair(R.drawable.chupiking, "츄파이킹"),
            Pair(R.drawable.sharky, "샤키"),
            Pair(R.drawable.silli, "실리"),
            Pair(R.drawable.dolpi, "돌피"),
            Pair(R.drawable.dujangun,"듀장군"),
            Pair(R.drawable.purni, "푸르니"),
            Pair(R.drawable.resco, "레스코"),
            Pair(R.drawable.chekiru, "체키루"),
            Pair(R.drawable.shellru, "쉘루"),
            Pair(R.drawable.cray, "크레이"),
            Pair(R.drawable.hermi, "헤르미"),
            Pair(R.drawable.alroha, "알로하"),
            Pair(R.drawable.whyki, "와이키"),
            Pair(R.drawable.sufferyong2, "서퍼용"),
            Pair(R.drawable.rambert2, "램버트"),
            Pair(R.drawable.berr2, "베르"),
            Pair(R.drawable.remrem2, "렘렘"),
            Pair(R.drawable.piko2, "피코"),
            Pair(R.drawable.wonderdragon, "원더드래곤"),
            Pair(R.drawable.yurion, "유리온"),
            Pair(R.drawable.popomo, "포포모"),
            Pair(R.drawable.sharkgon2, "샤크곤")
        )
        showCustomDialog(dialogItems)
    }

    private fun showLightningDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.ururu, "우루루"),
            Pair(R.drawable.pero, "페로"),
            Pair(R.drawable.pepe, "페페"),
            Pair(R.drawable.meme, "메메"),
            Pair(R.drawable.yongyong, "용용"),
            Pair(R.drawable.daram, "다람"),
            Pair(R.drawable.dorong, "도롱"),
            Pair(R.drawable.poter, "포터"),
            Pair(R.drawable.samsam, "삼삼"),
            Pair(R.drawable.roro, "로로"),
            Pair(R.drawable.puddeok, "푸드덕"),
            Pair(R.drawable.ali, "알리"),
            Pair(R.drawable.chocolove, "초코럽"),
            Pair(R.drawable.cocolove, "코코럽"),
            Pair(R.drawable.lovelove, "러브럽"),
            Pair(R.drawable.butterfin, "버터핀"),
            Pair(R.drawable.ulfo, "울포"),
            Pair(R.drawable.rairu, "라이루"),
            Pair(R.drawable.tamami, "타마미"),
            Pair(R.drawable.chomchom, "촘촘"),
            Pair(R.drawable.cropet, "크로펫"),
            Pair(R.drawable.mongkiru, "몽키루"),
            Pair(R.drawable.beti, "베티"),
            Pair(R.drawable.giroro, "기로로"),
            Pair(R.drawable.gururu, "구루루"),
            Pair(R.drawable.kitz, "키츠"),
            Pair(R.drawable.raku, "라쿠"),
            Pair(R.drawable.nyao, "냐오"),
            Pair(R.drawable.koka, "코카"),
            Pair(R.drawable.suri, "수리"),
            Pair(R.drawable.pus, "푸스"),
            Pair(R.drawable.cline, "클리네"),
            Pair(R.drawable.humpti, "험프티"),
            Pair(R.drawable.mingku, "밍쿠"),
            Pair(R.drawable.drapet, "드라펫"),
            Pair(R.drawable.caterfly, "캐터플라이"),
            Pair(R.drawable.dodo, "도도"),
            Pair(R.drawable.cray, "크레이"),
            Pair(R.drawable.hermi, "헤르미"),
            Pair(R.drawable.pumki2, "펌키"),
            Pair(R.drawable.whyki, "와이키"),
            Pair(R.drawable.candylove2, "캔디럽"),
            Pair(R.drawable.skulru2, "스컬루"),
            Pair(R.drawable.sparumong2, "스파루몽"),
            Pair(R.drawable.sufferyong2, "서퍼용"),
            Pair(R.drawable.jurayong2, "쥬라용"),
            Pair(R.drawable.loveit2, "러빗"),
            Pair(R.drawable.piko2, "피코"),
            Pair(R.drawable.shasha2, "샤샤"),
            Pair(R.drawable.spain, "스파인"),
            Pair(R.drawable.spain22, "스파인S"),
            Pair(R.drawable.orpeus, "오르페우스"),
            Pair(R.drawable.wonderdragon, "원더드래곤")
        )
        showCustomDialog(dialogItems)
    }

    private fun showWindDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.yongaru, "용가루"),
            Pair(R.drawable.tutu, "투투"),
            Pair(R.drawable.piguru, "피구루"),
            Pair(R.drawable.ggobu, "꼬부"),
            Pair(R.drawable.crapi, "크래피"),
            Pair(R.drawable.bobo, "보보"),
            Pair(R.drawable.gogo, "고고"),
            Pair(R.drawable.firu, "파이루"),
            Pair(R.drawable.kogi, "코기"),
            Pair(R.drawable.miko, "미코"),
            Pair(R.drawable.mendi, "맨디"),
            Pair(R.drawable.flameru, "플라메루"),
            Pair(R.drawable.giroro, "기로로"),
            Pair(R.drawable.skungki, "스컹키"),
            Pair(R.drawable.gururu, "구루루"),
            Pair(R.drawable.wow, "와우"),
            Pair(R.drawable.uli, "울리"),
            Pair(R.drawable.kitz, "키츠"),
            Pair(R.drawable.doli, "돌리"),
            Pair(R.drawable.raku, "라쿠"),
            Pair(R.drawable.nyao, "냐오"),
            Pair(R.drawable.tigo, "티고"),
            Pair(R.drawable.dudu, "두두"),
            Pair(R.drawable.miyo, "미요"),
            Pair(R.drawable.krang, "크랑"),
            Pair(R.drawable.shujel, "슈젤"),
            Pair(R.drawable.rodi, "로디"),
            Pair(R.drawable.pandi, "팬디"),
            Pair(R.drawable.tingklru, "팅클루"),
            Pair(R.drawable.dodo, "도도"),
            Pair(R.drawable.shellru, "쉘루"),
            Pair(R.drawable.bau, "바우"),
            Pair(R.drawable.boradoru, "보라도루"),
            Pair(R.drawable.nuni, "누니"),
            Pair(R.drawable.totoru, "토토루"),
            Pair(R.drawable.pumki2, "펌키"),
            Pair(R.drawable.rosa, "로사"),
            Pair(R.drawable.tider, "티더"),
            Pair(R.drawable.skulru2, "스컬루"),
            Pair(R.drawable.sufferyong2, "서퍼용"),
            Pair(R.drawable.cupi2, "큐피"),
            Pair(R.drawable.rambert2, "램버트"),
            Pair(R.drawable.berr2, "베르"),
            Pair(R.drawable.sechimi2, "새치미"),
            Pair(R.drawable.spain, "스파인"),
            Pair(R.drawable.spain22, "스파인S"),
            Pair(R.drawable.godium, "고디움"),
            Pair(R.drawable.wonderdragon, "원더드래곤")
        )
        showCustomDialog(dialogItems)
    }

    private fun showIceDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.chupa, "츄파"),
            Pair(R.drawable.bingo, "빙고"),
            Pair(R.drawable.ulami, "울라미"),
            Pair(R.drawable.chichi, "치치"),
            Pair(R.drawable.dori, "도리"),
            Pair(R.drawable.rairu, "라이루"),
            Pair(R.drawable.tamami, "타마미"),
            Pair(R.drawable.mongkiru, "몽키루"),
            Pair(R.drawable.beti, "베티"),
            Pair(R.drawable.skungki, "스컹키"),
            Pair(R.drawable.wow, "와우"),
            Pair(R.drawable.uli, "울리"),
            Pair(R.drawable.doli, "돌리"),
            Pair(R.drawable.tigo, "티고"),
            Pair(R.drawable.dudu, "두두"),
            Pair(R.drawable.miyo, "미요"),
            Pair(R.drawable.polaru, "폴라루"),
            Pair(R.drawable.marina, "마리나"),
            Pair(R.drawable.warru, "왈루"),
            Pair(R.drawable.dumurai, "두무라이"),
            Pair(R.drawable.chupiking, "츄파이킹"),
            Pair(R.drawable.penpen, "펜펜"),
            Pair(R.drawable.softi, "소프티"),
            Pair(R.drawable.arki, "아르키"),
            Pair(R.drawable.chekiru, "체키루"),
            Pair(R.drawable.shellru, "쉘루"),
            Pair(R.drawable.penriru, "펜리루"),
            Pair(R.drawable.foxy, "폭시"),
            Pair(R.drawable.chepy, "채피"),
            Pair(R.drawable.yuni, "유니"),
            Pair(R.drawable.bongbong, "봉봉"),
            Pair(R.drawable.rudol, "루돌"),
            Pair(R.drawable.kota2, "코타"),
            Pair(R.drawable.nuni, "누니"),
            Pair(R.drawable.alroha, "알로하"),
            Pair(R.drawable.totoru, "토토루"),
            Pair(R.drawable.rosa, "로사"),
            Pair(R.drawable.tider, "티더"),
            Pair(R.drawable.whyki, "와이키"),
            Pair(R.drawable.candylove2, "캔디럽"),
            Pair(R.drawable.skulru2, "스컬루"),
            Pair(R.drawable.sparumong2, "스파루몽"),
            Pair(R.drawable.loveit2, "러빗"),
            Pair(R.drawable.remrem2, "렘렘"),
            Pair(R.drawable.shasha2, "샤샤"),
            Pair(R.drawable.sechimi2, "새치미"),
            Pair(R.drawable.omiyacon, "오미야콘"),
            Pair(R.drawable.yurion, "유리온"),
            Pair(R.drawable.sharkgon2, "샤크곤")
        )
        showCustomDialog(dialogItems)
    }

    private fun showMagicDialog() {
        val dialogItems = listOf(
            Pair(R.drawable.jello, "젤로"),
            Pair(R.drawable.dalguru, "달구루"),
            Pair(R.drawable.neoguru, "너구루"),
            Pair(R.drawable.tedi, "테디"),
            Pair(R.drawable.bamkuri, "밤쿠리"),
            Pair(R.drawable.metoru, "메토루"),
            Pair(R.drawable.jelisia, "젤리시아"),
            Pair(R.drawable.sharky, "샤키"),
            Pair(R.drawable.suri, "수리"),
            Pair(R.drawable.pus, "푸스"),
            Pair(R.drawable.silli, "실리"),
            Pair(R.drawable.dolpi, "돌피"),
            Pair(R.drawable.cline, "클리네"),
            Pair(R.drawable.humpti, "험프티"),
            Pair(R.drawable.mingku, "밍쿠"),
            Pair(R.drawable.rodi, "로디"),
            Pair(R.drawable.pandi, "팬디"),
            Pair(R.drawable.tingklru, "팅클루"),
            Pair(R.drawable.penpen, "펜펜"),
            Pair(R.drawable.softi, "소프티"),
            Pair(R.drawable.arki, "아르키"),
            Pair(R.drawable.dujangun, "듀장군"),
            Pair(R.drawable.drapet, "드라펫"),
            Pair(R.drawable.alpha, "알파"),
            Pair(R.drawable.toibo, "토이보"),
            Pair(R.drawable.dumpti, "덤프티"),
            Pair(R.drawable.cupi2, "큐피"),
            Pair(R.drawable.loveit2, "러빗"),
            Pair(R.drawable.remrem2, "렘렘")
        )
        showCustomDialog(dialogItems)
    }

    private fun showCustomDialog(items: List<Pair<Int, String>>) {
        val builder = AlertDialog.Builder(this)

        val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog_layout, null)
        val dialogListView = dialogView.findViewById<ListView>(R.id.dialogListView)

        val adapter = CustomListAdapter(this, items)
        dialogListView.adapter = adapter

        builder.setView(dialogView)

        val dialog = builder.create()
        dialog.show()

        dialogListView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            handleDialogItemClick(selectedItem.second) // 선택한 아이템에 따른 처리 함수 호출
            dialog.dismiss() // 다이얼로그 닫기
        }
    }

    private fun handleDialogItemClick(selectedItem: String) {
        // 선택한 아이템에 따라 다른 화면으로 이동
        val intent = Intent(this, MainActivity4::class.java)
        intent.putExtra("changeName", selectedItem)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}
