package com.uparu.uparumaking

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class SelectUparu2 : AppCompatActivity() {
    //조합 불가능한 우파루(별속성)는 추가하지 말것
    var DataList = arrayListOf(
        Data2(R.drawable.pumki2, "펌키", 10, R.drawable.typelnwi, 8.5),
        Data2(R.drawable.candylove2, "캔디럽", 10, R.drawable.typeinl, 10.5),
        Data2(R.drawable.skulru2, "스컬루", 23, R.drawable.typelnwini, 25.0),
        Data2(R.drawable.sparumong2, "스파루몽", 20, R.drawable.typelnfni, 28.75),
        Data2(R.drawable.merry2, "메리", 19, R.drawable.typefngrng, 22.5),
        Data2(R.drawable.sufferyong2, "서퍼용", 20, R.drawable.typewanwinl, 25.0),
        Data2(R.drawable.jurayong2, "쥬라용", 20, R.drawable.typegrnlng, 26.5),
        Data2(R.drawable.cupi2, "큐피", 28, R.drawable.typemnwinf, 26.0),
        Data2(R.drawable.rambert2, "램버트", 25, R.drawable.typewinwang, 28.0),
        Data2(R.drawable.berr2, "베르", 26, R.drawable.typewanwingr, 28.5),
        Data2(R.drawable.loveit2, "러빗", 20, R.drawable.typemninl, 28.0),
        Data2(R.drawable.pori, "포리", 10, R.drawable.typegrass, 0.01),
        Data2(R.drawable.dudeoru, "두더루", 4, R.drawable.typeground, 0.05),
        Data2(R.drawable.bbururu, "뿌루루", 6, R.drawable.typefire, 0.25),
        Data2(R.drawable.dupa, "듀파", 7, R.drawable.typewater, 0.75),
        Data2(R.drawable.ururu, "우루루", 8, R.drawable.typelightning, 2.0),
        Data2(R.drawable.chupa, "츄파", 4, R.drawable.typeice, 4.0),
        Data2(R.drawable.jello, "젤로", 10, R.drawable.typemagic, 6.5),
        Data2(R.drawable.yongaru, "용가루", 5, R.drawable.typewind, 5.5),
        Data2(R.drawable.munguru, "뭉구루", 4, R.drawable.typegrng, 0.33),
        Data2(R.drawable.ddoruru, "또루루", 4, R.drawable.typegngr, 0.5),
        Data2(R.drawable.pring, "프링", 7, R.drawable.typegnf, 2.5),
        Data2(R.drawable.mumu, "무무", 4, R.drawable.typefngr, 3.0),
        Data2(R.drawable.hakuru, "하쿠루", 5, R.drawable.typefng, 2.5),
        Data2(R.drawable.panpan, "판판", 4, R.drawable.typegrnf, 3.0),
        Data2(R.drawable.pupu, "푸푸", 7, R.drawable.typewang, 4.5),
        Data2(R.drawable.haerong, "해롱", 8, R.drawable.typegnwa, 4.5),
        Data2(R.drawable.pero, "페로", 7, R.drawable.typegnl, 3.5),
        Data2(R.drawable.pepe, "페페", 7, R.drawable.typefnl, 4.0),
        Data2(R.drawable.meme, "메메", 6, R.drawable.typelnf, 4.0),
        Data2(R.drawable.yongyong, "용용", 5, R.drawable.typegrnl, 6.0),
        Data2(R.drawable.daram, "다람", 7, R.drawable.typefnl, 4.0),
        Data2(R.drawable.beobi, "버비", 5, R.drawable.typegrng, 0.33),
        Data2(R.drawable.anti, "앤티", 5, R.drawable.typegngr, 0.58),
        Data2(R.drawable.donk, "동크", 4, R.drawable.typefngr, 3.0),
        Data2(R.drawable.seed, "시드", 5, R.drawable.typegnf, 2.5),
        Data2(R.drawable.dorong, "도롱", 7, R.drawable.typelng, 3.5),
        Data2(R.drawable.poter, "포터", 7, R.drawable.typegnl, 3.5),
        Data2(R.drawable.samsam, "삼삼", 7, R.drawable.typegnl, 3.5),
        Data2(R.drawable.roro, "로로", 7, R.drawable.typegnl, 3.75),
        Data2(R.drawable.puddeok, "푸드덕", 6, R.drawable.typelnf, 4.0),
        Data2(R.drawable.ali, "알리", 8, R.drawable.typelng, 4.25),
        Data2(R.drawable.chocolove, "초코럽", 9, R.drawable.typelng, 10.5),
        Data2(R.drawable.cocolove, "코코럽", 16, R.drawable.typelng, 10.5),
        Data2(R.drawable.lovelove, "러브럽", 16, R.drawable.typelng, 10.5),
        Data2(R.drawable.raply, "라플리", 5, R.drawable.typefng, 2.5),
        Data2(R.drawable.toto, "토토", 8, R.drawable.typewanf, 5.0),
        Data2(R.drawable.bibi, "비비", 8, R.drawable.typefnwa, 5.0),
        Data2(R.drawable.bingo, "빙고", 4, R.drawable.typeingr, 4.75),
        Data2(R.drawable.butterfin, "버터핀", 5, R.drawable.typegrnl, 6.0),
        Data2(R.drawable.uparupa, "우파루파", 7, R.drawable.typegrnwa, 7.0),
        Data2(R.drawable.jjingyo, "찡요", 8, R.drawable.typewang, 6.0),
        Data2(R.drawable.ulami, "울라미", 5, R.drawable.typeingr, 5.25),
        Data2(R.drawable.ulfo, "울포", 7, R.drawable.typefnl, 6.5),
        Data2(R.drawable.eli, "엘리", 8, R.drawable.typewangr, 7.0),
        Data2(R.drawable.chichi, "치치", 4, R.drawable.typeingr, 6.0),
        Data2(R.drawable.dori, "도리", 4, R.drawable.typegrni, 6.0),
        Data2(R.drawable.progu, "프로구", 10, R.drawable.typegnwa, 7.75),
        Data2(R.drawable.armang, "아르망", 8, R.drawable.typegrnf, 9.75),
        Data2(R.drawable.betsi, "벳시", 8, R.drawable.typewanf, 7.5),
        Data2(R.drawable.koku, "코쿠", 8, R.drawable.typefnwa, 7.5),
        Data2(R.drawable.rairu, "라이루", 6, R.drawable.typelni, 5.0),
        Data2(R.drawable.hipopo, "히포포", 8, R.drawable.typewanf, 7.5),
        Data2(R.drawable.scoti, "스코티", 8, R.drawable.typegrnf, 9.75),
        Data2(R.drawable.baretsa, "바렛사", 8, R.drawable.typefngr, 9.75),
        Data2(R.drawable.tamami, "타마미", 6, R.drawable.typeinl, 5.0),
        Data2(R.drawable.danbi, "단비", 8, R.drawable.typegrnf, 9.75),
        Data2(R.drawable.rari, "래리", 10, R.drawable.typewangr, 8.0),
        Data2(R.drawable.buffru, "버프루", 8, R.drawable.typegrnwa, 9.0),
        Data2(R.drawable.copyru, "카피루", 8, R.drawable.typewangr, 9.0),
        Data2(R.drawable.tutu, "투투", 8, R.drawable.typewing, 8.0),
        Data2(R.drawable.piguru, "피구루", 10, R.drawable.typegnwi, 8.0),
        Data2(R.drawable.tod, "토드", 14, R.drawable.typewanf, 5.0),
        Data2(R.drawable.chomchom, "촘촘", 5, R.drawable.typelngr, 10.0),
        Data2(R.drawable.ggobu, "꼬부", 8, R.drawable.typewing, 8.0),
        Data2(R.drawable.crapi, "크래피", 10, R.drawable.typegnwi, 8.0),
        Data2(R.drawable.cropet, "크로펫", 5, R.drawable.typelngr, 10.25),
        Data2(R.drawable.bobo, "보보", 10, R.drawable.typewinwa, 8.25),
        Data2(R.drawable.mongkiru, "몽키루", 6, R.drawable.typelni, 7.5),
        Data2(R.drawable.gogo, "고고", 9, R.drawable.typewinf, 9.5),
        Data2(R.drawable.firu, "파이루", 10, R.drawable.typefnwi, 9.5),
        Data2(R.drawable.beti, "베티", 6, R.drawable.typeinl, 7.5),
        Data2(R.drawable.kogi, "코기", 10, R.drawable.typefnwi, 9.5),
        Data2(R.drawable.miko, "미코", 10, R.drawable.typewinf, 9.5),
        Data2(R.drawable.mendi, "맨디", 10, R.drawable.typewinf, 9.5),
        Data2(R.drawable.flameru, "플라메루", 10, R.drawable.typefnwi, 9.5),
        Data2(R.drawable.giroro, "기로로", 8, R.drawable.typewinl, 8.5),
        Data2(R.drawable.skungki, "스컹키", 7, R.drawable.typewini, 7.0),
        Data2(R.drawable.gururu, "구루루", 8, R.drawable.typewinl, 8.5),
        Data2(R.drawable.wow, "와우", 7, R.drawable.typeinwi, 7.0),
        Data2(R.drawable.uli, "울리", 7, R.drawable.typeinwi, 7.0),
        Data2(R.drawable.kitz, "키츠", 10, R.drawable.typelnwi, 8.66),
        Data2(R.drawable.doli, "돌리", 7, R.drawable.typeinwi, 7.5),
        Data2(R.drawable.raku, "라쿠", 9, R.drawable.typelnwi, 8.75),
        Data2(R.drawable.nyao, "냐오", 9, R.drawable.typelnwi, 8.75),
        Data2(R.drawable.koka, "코카", 9, R.drawable.typelngr, 10.0),
        Data2(R.drawable.tigo, "티고", 7, R.drawable.typeinwi, 9.0),
        Data2(R.drawable.dudu, "두두", 7, R.drawable.typewini, 9.0),
        Data2(R.drawable.miyo, "미요", 7, R.drawable.typeinwi, 9.0),
        Data2(R.drawable.polaru, "폴라루", 14, R.drawable.typeinwa, 11.75),
        Data2(R.drawable.marina, "마리나", 11, R.drawable.typewani, 11.75),
        Data2(R.drawable.pogisa, "포기사", 15, R.drawable.typegnf, 10.25),
        Data2(R.drawable.warru, "왈루", 11, R.drawable.typeinwa, 11.0),
        Data2(R.drawable.krang, "크랑", 11, R.drawable.typewanwi, 12.0),
        Data2(R.drawable.dumurai, "두무라이", 15, R.drawable.typegrni, 10.25),
        Data2(R.drawable.shujel, "슈젤", 11, R.drawable.typewanwi, 12.5),
        Data2(R.drawable.dalguru, "달구루", 10, R.drawable.typegnm, 8.75),
        Data2(R.drawable.neoguru, "너구루", 10, R.drawable.typegrnm, 9.0),
        Data2(R.drawable.tedi, "테디", 10, R.drawable.typemngr, 9.0),
        Data2(R.drawable.bamkuri, "밤쿠리", 10, R.drawable.typegrnm, 9.0),
        Data2(R.drawable.metoru, "메토루", 10, R.drawable.typemng, 9.5),
        Data2(R.drawable.jelisia, "젤리시아", 19, R.drawable.typemng, 10.25),
        Data2(R.drawable.chupiking, "츄파이킹", 15, R.drawable.typeinwa, 11.75),
        Data2(R.drawable.sharky, "샤키", 11, R.drawable.typewanm, 11.75),
        Data2(R.drawable.suri, "수리", 12, R.drawable.typemnl, 11.25),
        Data2(R.drawable.pus, "푸스", 12, R.drawable.typelnm, 11.25),
        Data2(R.drawable.silli, "실리", 11, R.drawable.typemnwa, 11.75),
        Data2(R.drawable.dolpi, "돌피", 11, R.drawable.typewanm, 11.75),
        Data2(R.drawable.cline, "클리네", 12, R.drawable.typelnm, 11.25),
        Data2(R.drawable.humpti, "험프티", 12, R.drawable.typemnl, 11.25),
        Data2(R.drawable.mingku, "밍쿠", 13, R.drawable.typemnl, 11.5),
        Data2(R.drawable.rodi, "로디", 12, R.drawable.typemnwi, 12.25),
        Data2(R.drawable.pandi, "팬디", 12, R.drawable.typewinm, 12.25),
        Data2(R.drawable.tingklru, "팅클루", 12, R.drawable.typemnwi, 12.25),
        Data2(R.drawable.penpen, "펜펜", 13, R.drawable.typemni, 12.75),
        Data2(R.drawable.softi, "소프티", 13, R.drawable.typeinm, 12.75),
        Data2(R.drawable.arki, "아르키", 13, R.drawable.typeinm, 12.75),
        Data2(R.drawable.dujangun, "듀장군", 16, R.drawable.typewanm, 10.25),
        Data2(R.drawable.purni, "푸르니", 17, R.drawable.typegnwangr, 20.25),
        Data2(R.drawable.drapet, "드라펫", 14, R.drawable.typemnl, 17.5),
        Data2(R.drawable.resco, "레스코", 18, R.drawable.typegrnfnwa, 23.25),
        Data2(R.drawable.caterfly, "캐터플라이", 17, R.drawable.typefnlng, 23.5),
        Data2(R.drawable.chekiru, "체키루", 18, R.drawable.typegrninwa, 23.25),
        Data2(R.drawable.dodo, "도도", 19, R.drawable.typefnlnwi, 23.5),
        Data2(R.drawable.shellru, "쉘루", 18, R.drawable.typewinwani, 24.5),
        Data2(R.drawable.penriru, "펜리루", 15, R.drawable.typefni, 14.0),
        Data2(R.drawable.foxy, "폭시", 16, R.drawable.typeinf, 14.0),
        Data2(R.drawable.chepy, "채피", 16, R.drawable.typeinf, 14.0),
        Data2(R.drawable.bau, "바우", 14, R.drawable.typewingr, 16.0),
        Data2(R.drawable.boradoru, "보라도루", 14, R.drawable.typegrnwi, 16.0),
        Data2(R.drawable.alpha, "알파", 17, R.drawable.typefnm, 13.0),
        Data2(R.drawable.toibo, "토이보", 17, R.drawable.typemnf, 13.0),
        Data2(R.drawable.yuni, "유니", 15, R.drawable.typeing, 18.0),
        Data2(R.drawable.bongbong, "봉봉", 15, R.drawable.typegni, 18.0),
        Data2(R.drawable.cray, "크레이", 15, R.drawable.typelnwa, 20.0),
        Data2(R.drawable.hermi, "헤르미", 15, R.drawable.typelnwa, 20.0),
        Data2(R.drawable.dumpti, "덤프티", 17, R.drawable.typemnf, 16.0),
        Data2(R.drawable.rudol, "루돌", 18, R.drawable.typefning, 24.0),
        Data2(R.drawable.kota2, "코타", 16, R.drawable.typeinf, 11.25),
        Data2(R.drawable.nuni, "누니", 18, R.drawable.typeingrnwi, 21.0),
        Data2(R.drawable.alroha, "알로하", 18, R.drawable.typewaning, 22.25),
        Data2(R.drawable.totoru, "토토루", 18, R.drawable.typeingrnwi, 21.0),
        Data2(R.drawable.rosa, "로사", 18, R.drawable.typewining, 22.5),
        Data2(R.drawable.tider, "티더", 19, R.drawable.typeingnwi, 22.5),
        Data2(R.drawable.whyki, "와이키", 18, R.drawable.typewaninl, 22.75),
        Data2(R.drawable.piko2, "피코", 30, R.drawable.typewangnl, 27.0),
        Data2(R.drawable.shasha2, "샤샤", 30, R.drawable.typegrninl, 27.0),
        Data2(R.drawable.sechimi2, "새치미", 30, R.drawable.typeinwinf, 27.0),
        Data2(R.drawable.remrem2, "렘렘", 30, R.drawable.typewaninm, 27.0),
        Data2(R.drawable.applechick, "애플칙", 14, R.drawable.typegngr, 9.95),
        Data2(R.drawable.spain, "스파인", 14, R.drawable.typewinl, 10.61),
        Data2(R.drawable.godium, "고디움", 15, R.drawable.typefnwi, 10.95),
        Data2(R.drawable.omiyacon, "오미야콘", 16, R.drawable.typeingr, 11.61),
        Data2(R.drawable.orpeus, "오르페우스", 17, R.drawable.typegrnl, 11.95),
        Data2(R.drawable.wonderdragon, "원더드래곤", 19, R.drawable.typelnwinwa, 20.28),
        Data2(R.drawable.yurion, "유리온", 15, R.drawable.typewani, 11.61),
        Data2(R.drawable.popomo, "포포모", 19, R.drawable.typefngnwa, 20.28),
        Data2(R.drawable.mushroom2, "머쉬룸", 14, R.drawable.typegrnf, 10.61),
        Data2(R.drawable.sharkgon2, "샤크곤", 16, R.drawable.typewani, 10.61),
        Data2(R.drawable.applechick22, "애플칙S", 14, R.drawable.typegngr, 9.95),
        Data2(R.drawable.spain22, "스파인S", 14, R.drawable.typewinl, 10.61),
    )

    override fun onBackPressed() {
        super.onBackPressed();
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
        finishAffinity()
        overridePendingTransition(0, 0);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_uparu)

        val gridView = findViewById<GridView>(R.id.gridView2)
        val searchView = findViewById<SearchView>(R.id.searchView)
        val sortedDataList = DataList.sortedBy { it.name }
        var newAdapter = CustomAdapter2(this@SelectUparu2, sortedDataList)

        gridView.adapter = newAdapter
        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    // 현재 보여지는 데이터를 filteredDataList로 업데이트
                    val filteredDataList = sortedDataList.filter { data -> data.name.contains(newText) }
                    // 그리드뷰 어댑터를 새로운 어댑터로 업데이트
                    val newAdapter = CustomAdapter2(this@SelectUparu2, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })

        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = (gridView.adapter as CustomAdapter2).getItem(position)?.name

            val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            val intent = Intent(this@SelectUparu2, MainActivity6::class.java)

            if (selectedItem == "포리") {
                editor.putInt("changeUparu2", R.drawable.pori)
                editor.putString("changeType2", "숲")
                editor.apply()
            } else if (selectedItem == "두더루") {
                editor.putInt("changeUparu2", R.drawable.dudeoru)
                editor.putString("changeType2", "땅")
                editor.apply()
            } else if (selectedItem == "뿌루루") {
                editor.putInt("changeUparu2", R.drawable.bbururu)
                editor.putString("changeType2", "불")
                editor.apply()
            }else if (selectedItem == "듀파") {
                editor.putInt("changeUparu2", R.drawable.dupa)
                editor.putString("changeType2", "물")
                editor.apply()
            } else if (selectedItem == "우루루") {
                editor.putInt("changeUparu2", R.drawable.ururu)
                editor.putString("changeType2", "천둥")
                editor.apply()
            } else if (selectedItem == "츄파") {
                editor.putInt("changeUparu2", R.drawable.chupa)
                editor.putString("changeType2", "얼음")
                editor.apply()
            } else if (selectedItem == "젤로") {
                editor.putInt("changeUparu2", R.drawable.jello)
                editor.putString("changeType2", "매직")
                editor.apply()
            } else if (selectedItem == "용가루") {
                editor.putInt("changeUparu2", R.drawable.yongaru)
                editor.putString("changeType2", "바람")
                editor.apply()
            } else if (selectedItem == "뭉구루") {
                editor.putInt("changeUparu2", R.drawable.munguru)
                editor.putString("changeType2", "땅,숲")
                editor.apply()
            } else if (selectedItem == "또루루") {
                editor.putInt("changeUparu2", R.drawable.ddoruru)
                editor.putString("changeType2", "숲,땅")
                editor.apply()
            } else if (selectedItem == "프링") {
                editor.putInt("changeUparu2", R.drawable.pring)
                editor.putString("changeType2", "숲,불")
                editor.apply()
            } else if (selectedItem == "무무") {
                editor.putInt("changeUparu2", R.drawable.mumu)
                editor.putString("changeType2", "불,땅")
                editor.apply()
            } else if (selectedItem == "하쿠루") {
                editor.putInt("changeUparu2", R.drawable.hakuru)
                editor.putString("changeType2", "불,숲")
                editor.apply()
            } else if (selectedItem == "판판") {
                editor.putInt("changeUparu2", R.drawable.panpan)
                editor.putString("changeType2", "땅,불")
                editor.apply()
            } else if (selectedItem == "푸푸") {
                editor.putInt("changeUparu2", R.drawable.pupu)
                editor.putString("changeType2", "물,숲")
                editor.apply()
            } else if (selectedItem == "해롱") {
                editor.putInt("changeUparu2", R.drawable.haerong)
                editor.putString("changeType2", "숲,물")
                editor.apply()
            } else if (selectedItem == "페로") {
                editor.putInt("changeUparu2", R.drawable.pero)
                editor.putString("changeType2", "숲,천둥")
                editor.apply()
            } else if (selectedItem == "페페") {
                editor.putInt("changeUparu2", R.drawable.pepe)
                editor.putString("changeType2", "불,천둥")
                editor.apply()
            } else if (selectedItem == "메메") {
                editor.putInt("changeUparu2", R.drawable.meme)
                editor.putString("changeType2", "천둥,불")
                editor.apply()
            } else if (selectedItem == "용용") {
                editor.putInt("changeUparu2", R.drawable.yongyong)
                editor.putString("changeType2", "땅,천둥")
                editor.apply()
            } else if (selectedItem == "다람") {
                editor.putInt("changeUparu2", R.drawable.daram)
                editor.putString("changeType2", "불,천둥")
                editor.apply()
            } else if (selectedItem == "버비") {
                editor.putInt("changeUparu2", R.drawable.beobi)
                editor.putString("changeType2", "땅,숲")
                editor.apply()
            } else if (selectedItem == "앤티") {
                editor.putInt("changeUparu2", R.drawable.anti)
                editor.putString("changeType2", "숲,땅")
                editor.apply()
            } else if (selectedItem == "동크") {
                editor.putInt("changeUparu2", R.drawable.donk)
                editor.putString("changeType2", "불,땅")
                editor.apply()
            } else if (selectedItem == "시드") {
                editor.putInt("changeUparu2", R.drawable.seed)
                editor.putString("changeType2", "숲,불")
                editor.apply()
            } else if (selectedItem == "도롱") {
                editor.putInt("changeUparu2", R.drawable.dorong)
                editor.putString("changeType2", "천둥,숲")
                editor.apply()
            } else if (selectedItem == "포터") {
                editor.putInt("changeUparu2", R.drawable.poter)
                editor.putString("changeType2", "숲,천둥")
                editor.apply()
            } else if (selectedItem == "삼삼") {
                editor.putInt("changeUparu2", R.drawable.samsam)
                editor.putString("changeType2", "숲,천둥")
                editor.apply()
            } else if (selectedItem == "로로") {
                editor.putInt("changeUparu2", R.drawable.roro)
                editor.putString("changeType2", "숲,천둥")
                editor.apply()
            } else if (selectedItem == "푸드덕") {
                editor.putInt("changeUparu2", R.drawable.puddeok)
                editor.putString("changeType2", "천둥,불")
                editor.apply()
            } else if (selectedItem == "알리") {
                editor.putInt("changeUparu2", R.drawable.ali)
                editor.putString("changeType2", "천둥,숲")
                editor.apply()
            } else if (selectedItem == "초코럽") {
                editor.putInt("changeUparu2", R.drawable.chocolove)
                editor.putString("changeType2", "천둥,숲")
                editor.apply()
            } else if (selectedItem == "코코럽") {
                editor.putInt("changeUparu2", R.drawable.cocolove)
                editor.putString("changeType2", "천둥,숲")
                editor.apply()
            } else if (selectedItem == "러브럽") {
                editor.putInt("changeUparu2", R.drawable.lovelove)
                editor.putString("changeType2", "천둥,숲")
                editor.apply()
            } else if (selectedItem == "라플리") {
                editor.putInt("changeUparu2", R.drawable.raply)
                editor.putString("changeType2", "불,숲")
                editor.apply()
            } else if (selectedItem == "토토") {
                editor.putInt("changeUparu2", R.drawable.toto)
                editor.putString("changeType2", "물,불")
                editor.apply()
            } else if (selectedItem == "비비") {
                editor.putInt("changeUparu2", R.drawable.bibi)
                editor.putString("changeType2", "불,물")
                editor.apply()
            } else if (selectedItem == "빙고") {
                editor.putInt("changeUparu2", R.drawable.bingo)
                editor.putString("changeType2", "얼음,땅")
                editor.apply()
            } else if (selectedItem == "버터핀") {
                editor.putInt("changeUparu2", R.drawable.butterfin)
                editor.putString("changeType2", "땅,천둥")
                editor.apply()
            } else if (selectedItem == "우파루파") {
                editor.putInt("changeUparu2", R.drawable.uparupa)
                editor.putString("changeType2", "땅,물")
                editor.apply()
            } else if (selectedItem == "찡요") {
                editor.putInt("changeUparu2", R.drawable.jjingyo)
                editor.putString("changeType2", "물,숲")
                editor.apply()
            } else if (selectedItem == "울라미") {
                editor.putInt("changeUparu2", R.drawable.ulami)
                editor.putString("changeType2", "얼음,땅")
                editor.apply()
            } else if (selectedItem == "울포") {
                editor.putInt("changeUparu2", R.drawable.ulfo)
                editor.putString("changeType2", "불,천둥")
                editor.apply()
            } else if (selectedItem == "엘리") {
                editor.putInt("changeUparu2", R.drawable.eli)
                editor.putString("changeType2", "물,땅")
                editor.apply()
            } else if (selectedItem == "치치") {
                editor.putInt("changeUparu2", R.drawable.chichi)
                editor.putString("changeType2", "얼음,땅")
                editor.apply()
            } else if (selectedItem == "도리") {
                editor.putInt("changeUparu2", R.drawable.dori)
                editor.putString("changeType2", "땅,얼음")
                editor.apply()
            } else if (selectedItem == "프로구") {
                editor.putInt("changeUparu2", R.drawable.progu)
                editor.putString("changeType2", "숲,물")
                editor.apply()
            } else if (selectedItem == "아르망") {
                editor.putInt("changeUparu2", R.drawable.armang)
                editor.putString("changeType2", "땅,불")
                editor.apply()
            } else if (selectedItem == "벳시") {
                editor.putInt("changeUparu2", R.drawable.betsi)
                editor.putString("changeType2", "물,불")
                editor.apply()
            } else if (selectedItem == "코쿠") {
                editor.putInt("changeUparu2", R.drawable.koku)
                editor.putString("changeType2", "불,물")
                editor.apply()
            } else if (selectedItem == "라이루") {
                editor.putInt("changeUparu2", R.drawable.rairu)
                editor.putString("changeType2", "천둥,얼음")
                editor.apply()
            } else if (selectedItem == "타마미") {
                editor.putInt("changeUparu2", R.drawable.tamami)
                editor.putString("changeType2", "얼음,천둥")
                editor.apply()
            } else if (selectedItem == "히포포") {
                editor.putInt("changeUparu2", R.drawable.hipopo)
                editor.putString("changeType2", "물,불")
                editor.apply()
            } else if (selectedItem == "스코티") {
                editor.putInt("changeUparu2", R.drawable.scoti)
                editor.putString("changeType2", "땅,불")
                editor.apply()
            } else if (selectedItem == "바렛사") {
                editor.putInt("changeUparu2", R.drawable.baretsa)
                editor.putString("changeType2", "불,땅")
                editor.apply()
            } else if (selectedItem == "단비") {
                editor.putInt("changeUparu2", R.drawable.danbi)
                editor.putString("changeType2", "땅,불")
                editor.apply()
            } else if (selectedItem == "버프루") {
                editor.putInt("changeUparu2", R.drawable.buffru)
                editor.putString("changeType2", "땅,물")
                editor.apply()
            } else if (selectedItem == "카피루") {
                editor.putInt("changeUparu2", R.drawable.copyru)
                editor.putString("changeType2", "물,땅")
                editor.apply()
            } else if (selectedItem == "투투") {
                editor.putInt("changeUparu2", R.drawable.tutu)
                editor.putString("changeType2", "바람,숲")
                editor.apply()
            } else if (selectedItem == "피구루") {
                editor.putInt("changeUparu2", R.drawable.piguru)
                editor.putString("changeType2", "숲,바람")
                editor.apply()
            } else if (selectedItem == "토드") {
                editor.putInt("changeUparu2", R.drawable.tod)
                editor.putString("changeType2", "물,불")
                editor.apply()
            } else if (selectedItem == "촘촘") {
                editor.putInt("changeUparu2", R.drawable.chomchom)
                editor.putString("changeType2", "천둥,땅")
                editor.apply()
            } else if (selectedItem == "크로펫") {
                editor.putInt("changeUparu2", R.drawable.cropet)
                editor.putString("changeType2", "천둥,땅")
                editor.apply()
            } else if (selectedItem == "꼬부") {
                editor.putInt("changeUparu2", R.drawable.ggobu)
                editor.putString("changeType2", "바람,숲")
                editor.apply()
            } else if (selectedItem == "크래피") {
                editor.putInt("changeUparu2", R.drawable.crapi)
                editor.putString("changeType2", "숲,바람")
                editor.apply()
            } else if (selectedItem == "보보") {
                editor.putInt("changeUparu2", R.drawable.bobo)
                editor.putString("changeType2", "바람,물")
                editor.apply()
            } else if (selectedItem == "몽키루") {
                editor.putInt("changeUparu2", R.drawable.mongkiru)
                editor.putString("changeType2", "천둥,얼음")
                editor.apply()
            } else if (selectedItem == "고고") {
                editor.putInt("changeUparu2", R.drawable.gogo)
                editor.putString("changeType2", "바람,불")
                editor.apply()
            } else if (selectedItem == "파이루") {
                editor.putInt("changeUparu2", R.drawable.firu)
                editor.putString("changeType2", "불,바람")
                editor.apply()
            } else if (selectedItem == "베티") {
                editor.putInt("changeUparu2", R.drawable.beti)
                editor.putString("changeType2", "얼음,천둥")
                editor.apply()
            } else if (selectedItem == "코기") {
                editor.putInt("changeUparu2", R.drawable.kogi)
                editor.putString("changeType2", "불,바람")
                editor.apply()
            } else if (selectedItem == "미코") {
                editor.putInt("changeUparu2", R.drawable.miko)
                editor.putString("changeType2", "바람,불")
                editor.apply()
            } else if (selectedItem == "맨디") {
                editor.putInt("changeUparu2", R.drawable.mendi)
                editor.putString("changeType2", "바람,불")
                editor.apply()
            } else if (selectedItem == "플라메루") {
                editor.putInt("changeUparu2", R.drawable.flameru)
                editor.putString("changeType2", "불,바람")
                editor.apply()
            } else if (selectedItem == "기로로") {
                editor.putInt("changeUparu2", R.drawable.giroro)
                editor.putString("changeType2", "바람,천둥")
                editor.apply()
            } else if (selectedItem == "스컹키") {
                editor.putInt("changeUparu2", R.drawable.skungki)
                editor.putString("changeType2", "바람,얼음")
                editor.apply()
            } else if (selectedItem == "구루루") {
                editor.putInt("changeUparu2", R.drawable.gururu)
                editor.putString("changeType2", "바람,천둥")
                editor.apply()
            } else if (selectedItem == "와우") {
                editor.putInt("changeUparu2", R.drawable.wow)
                editor.putString("changeType2", "얼음,바람")
                editor.apply()
            } else if (selectedItem == "울리") {
                editor.putInt("changeUparu2", R.drawable.uli)
                editor.putString("changeType2", "얼음,바람")
                editor.apply()
            } else if (selectedItem == "키츠") {
                editor.putInt("changeUparu2", R.drawable.kitz)
                editor.putString("changeType2", "천둥,바람")
                editor.apply()
            } else if (selectedItem == "돌리") {
                editor.putInt("changeUparu2", R.drawable.doli)
                editor.putString("changeType2", "얼음,바람")
                editor.apply()
            } else if (selectedItem == "라쿠") {
                editor.putInt("changeUparu2", R.drawable.raku)
                editor.putString("changeType2", "천둥,바람")
                editor.apply()
            } else if (selectedItem == "냐오") {
                editor.putInt("changeUparu2", R.drawable.nyao)
                editor.putString("changeType2", "천둥,바람")
                editor.apply()
            } else if (selectedItem == "코카") {
                editor.putInt("changeUparu2", R.drawable.koka)
                editor.putString("changeType2", "천둥,땅")
                editor.apply()
            } else if (selectedItem == "티고") {
                editor.putInt("changeUparu2", R.drawable.tigo)
                editor.putString("changeType2", "얼음,바람")
                editor.apply()
            } else if (selectedItem == "두두") {
                editor.putInt("changeUparu2", R.drawable.dudu)
                editor.putString("changeType2", "바람,얼음")
                editor.apply()
            } else if (selectedItem == "미요") {
                editor.putInt("changeUparu2", R.drawable.miyo)
                editor.putString("changeType2", "얼음,바람")
                editor.apply()
            } else if (selectedItem == "폴라루") {
                editor.putInt("changeUparu2", R.drawable.polaru)
                editor.putString("changeType2", "얼음,물")
                editor.apply()
            } else if (selectedItem == "마리나") {
                editor.putInt("changeUparu2", R.drawable.marina)
                editor.putString("changeType2", "물,얼음")
                editor.apply()
            } else if (selectedItem == "포기사") {
                editor.putInt("changeUparu2", R.drawable.pogisa)
                editor.putString("changeType2", "숲,불")
                editor.apply()
            } else if (selectedItem == "왈루") {
                editor.putInt("changeUparu2", R.drawable.warru)
                editor.putString("changeType2", "얼음,물")
                editor.apply()
            } else if (selectedItem == "크랑") {
                editor.putInt("changeUparu2", R.drawable.krang)
                editor.putString("changeType2", "물,바람")
                editor.apply()
            } else if (selectedItem == "두무라이") {
                editor.putInt("changeUparu2", R.drawable.dumurai)
                editor.putString("changeType2", "땅,얼음")
                editor.apply()
            } else if (selectedItem == "슈젤") {
                editor.putInt("changeUparu2", R.drawable.shujel)
                editor.putString("changeType2", "물,바람")
                editor.apply()
            } else if (selectedItem == "너구루") {
                editor.putInt("changeUparu2", R.drawable.neoguru)
                editor.putString("changeType2", "땅,매직")
                editor.apply()
            } else if (selectedItem == "츄파이킹") {
                editor.putInt("changeUparu2", R.drawable.chupiking)
                editor.putString("changeType2", "얼음,물")
                editor.apply()
            } else if (selectedItem == "샤키") {
                editor.putInt("changeUparu2", R.drawable.sharky)
                editor.putString("changeType2", "물,매직")
                editor.apply()
            } else if (selectedItem == "수리") {
                editor.putInt("changeUparu2", R.drawable.suri)
                editor.putString("changeType2", "매직,천둥")
                editor.apply()
            } else if (selectedItem == "로디") {
                editor.putInt("changeUparu2", R.drawable.rodi)
                editor.putString("changeType2", "매직,바람")
                editor.apply()
            } else if (selectedItem == "푸르니") {
                editor.putInt("changeUparu2", R.drawable.purni)
                editor.putString("changeType2", "숲,물,땅")
                editor.apply()
            } else if (selectedItem == "레스코") {
                editor.putInt("changeUparu2", R.drawable.resco)
                editor.putString("changeType2", "땅,불,물")
                editor.apply()
            } else if (selectedItem == "캐터플라이") {
                editor.putInt("changeUparu2", R.drawable.caterfly)
                editor.putString("changeType2", "불,천둥,숲")
                editor.apply()
            } else if (selectedItem == "체키루") {
                editor.putInt("changeUparu2", R.drawable.chekiru)
                editor.putString("changeType2", "땅,얼음,물")
                editor.apply()
            } else if (selectedItem == "도도") {
                editor.putInt("changeUparu2", R.drawable.dodo)
                editor.putString("changeType2", "불,천둥,바람")
                editor.apply()
            } else if (selectedItem == "쉘루") {
                editor.putInt("changeUparu2", R.drawable.shellru)
                editor.putString("changeType2", "바람,물,얼음")
                editor.apply()
            } else if (selectedItem == "펜리루") {
                editor.putInt("changeUparu2", R.drawable.penriru)
                editor.putString("changeType2", "불,얼음")
                editor.apply()
            } else if (selectedItem == "폭시") {
                editor.putInt("changeUparu2", R.drawable.foxy)
                editor.putString("changeType2", "얼음,불")
                editor.apply()
            } else if (selectedItem == "채피") {
                editor.putInt("changeUparu2", R.drawable.chepy)
                editor.putString("changeType2", "얼음,불")
                editor.apply()
            } else if (selectedItem == "바우") {
                editor.putInt("changeUparu2", R.drawable.bau)
                editor.putString("changeType2", "바람,땅")
                editor.apply()
            } else if (selectedItem == "보라도루") {
                editor.putInt("changeUparu2", R.drawable.boradoru)
                editor.putString("changeType2", "땅,바람")
                editor.apply()
            } else if (selectedItem == "유니") {
                editor.putInt("changeUparu2", R.drawable.yuni)
                editor.putString("changeType2", "얼음,숲")
                editor.apply()
            } else if (selectedItem == "봉봉") {
                editor.putInt("changeUparu2", R.drawable.bongbong)
                editor.putString("changeType2", "숲,얼음")
                editor.apply()
            } else if (selectedItem == "크레이") {
                editor.putInt("changeUparu2", R.drawable.cray)
                editor.putString("changeType2", "천둥,물")
                editor.apply()
            } else if (selectedItem == "헤르미") {
                editor.putInt("changeUparu2", R.drawable.hermi)
                editor.putString("changeType2", "천둥,물")
                editor.apply()
            } else if (selectedItem == "루돌") {
                editor.putInt("changeUparu2", R.drawable.rudol)
                editor.putString("changeType2", "불,얼음,숲")
                editor.apply()
            } else if (selectedItem == "코타") {
                editor.putInt("changeUparu2", R.drawable.kota2)
                editor.putString("changeType2", "얼음,불")
                editor.apply()
            } else if (selectedItem == "누니") {
                editor.putInt("changeUparu2", R.drawable.nuni)
                editor.putString("changeType2", "얼음,땅,바람")
                editor.apply()
            } else if (selectedItem == "알로하") {
                editor.putInt("changeUparu2", R.drawable.alroha)
                editor.putString("changeType2", "물,얼음,숲")
                editor.apply()
            } else if (selectedItem == "토토루") {
                editor.putInt("changeUparu2", R.drawable.totoru)
                editor.putString("changeType2", "얼음,땅,바람")
                editor.apply()
            } else if (selectedItem == "펌키") {
                editor.putInt("changeUparu2", R.drawable.pumki2)
                editor.putString("changeType2", "천둥,바람")
                editor.apply()
            } else if (selectedItem == "로사") {
                editor.putInt("changeUparu2", R.drawable.rosa)
                editor.putString("changeType2", "바람,얼음,숲")
                editor.apply()
            } else if (selectedItem == "티더") {
                editor.putInt("changeUparu2", R.drawable.tider)
                editor.putString("changeType2", "얼음,숲,바람")
                editor.apply()
            } else if (selectedItem == "와이키") {
                editor.putInt("changeUparu2", R.drawable.whyki)
                editor.putString("changeType2", "물,얼음,천둥")
                editor.apply()
            } else if (selectedItem == "스컬루") {
                editor.putInt("changeUparu2", R.drawable.skulru2)
                editor.putString("changeType2", "천둥,바람,얼음")
                editor.apply()
            } else if (selectedItem == "스파루몽") {
                editor.putInt("changeUparu2", R.drawable.sparumong2)
                editor.putString("changeType2", "천둥,불,얼음")
                editor.apply()
            } else if (selectedItem == "메리") {
                editor.putInt("changeUparu2", R.drawable.merry2)
                editor.putString("changeType2", "불,땅,숲")
                editor.apply()
            } else if (selectedItem == "서퍼용") {
                editor.putInt("changeUparu2", R.drawable.sufferyong2)
                editor.putString("changeType2", "물,바람,천둥")
                editor.apply()
            } else if (selectedItem == "쥬라용") {
                editor.putInt("changeUparu2", R.drawable.jurayong2)
                editor.putString("changeType2", "땅,천둥,숲")
                editor.apply()
            } else if (selectedItem == "큐피") {
                editor.putInt("changeUparu2", R.drawable.cupi2)
                editor.putString("changeType2", "매직,바람,불")
                editor.apply()
            } else if (selectedItem == "램버트") {
                editor.putInt("changeUparu2", R.drawable.rambert2)
                editor.putString("changeType2", "바람,물,숲")
                editor.apply()
            } else if (selectedItem == "애플칙") {
                editor.putInt("changeUparu2", R.drawable.applechick)
                editor.putString("changeType2", "숲,땅")
                editor.apply()
            } else if (selectedItem == "스파인") {
                editor.putInt("changeUparu2", R.drawable.spain)
                editor.putString("changeType2", "바람,천둥")
                editor.apply()
            } else if (selectedItem == "고디움") {
                editor.putInt("changeUparu2", R.drawable.godium)
                editor.putString("changeType2", "불,바람")
                editor.apply()
            } else if (selectedItem == "오미야콘") {
                editor.putInt("changeUparu2", R.drawable.omiyacon)
                editor.putString("changeType2", "얼음,땅")
                editor.apply()
            } else if (selectedItem == "오르페우스") {
                editor.putInt("changeUparu2", R.drawable.orpeus)
                editor.putString("changeType2", "땅,천둥")
                editor.apply()
            } else if (selectedItem == "피코") {
                editor.putInt("changeUparu2", R.drawable.piko2)
                editor.putString("changeType2", "물,숲,천둥")
                editor.apply()
            } else if (selectedItem == "샤샤") {
                editor.putInt("changeUparu2", R.drawable.shasha2)
                editor.putString("changeType2", "땅,얼음,천둥")
                editor.apply()
            } else if (selectedItem == "새치미") {
                editor.putInt("changeUparu2", R.drawable.sechimi2)
                editor.putString("changeType2", "얼음,바람,불")
                editor.apply()
            } else if (selectedItem == "원더드래곤") {
                editor.putInt("changeUparu2", R.drawable.wonderdragon)
                editor.putString("changeType2", "천둥,바람,물")
                editor.apply()
            } else if (selectedItem == "유리온") {
                editor.putInt("changeUparu2", R.drawable.yurion)
                editor.putString("changeType2", "물,얼음")
                editor.apply()
            } else if (selectedItem == "포포모") {
                editor.putInt("changeUparu2", R.drawable.popomo)
                editor.putString("changeType2", "불,숲,물")
                editor.apply()
            } else if (selectedItem == "머쉬룸") {
                editor.putInt("changeUparu2", R.drawable.mushroom2)
                editor.putString("changeType2", "땅,불")
                editor.apply()
            } else if (selectedItem == "샤크곤") {
                editor.putInt("changeUparu2", R.drawable.sharkgon2)
                editor.putString("changeType2", "물,얼음")
                editor.apply()
            } else if (selectedItem == "애플칙S") {
                editor.putInt("changeUparu2", R.drawable.applechick22)
                editor.putString("changeType2", "숲,땅")
                editor.apply()
            } else if (selectedItem == "달구루") {
                editor.putInt("changeUparu2", R.drawable.dalguru)
                editor.putString("changeType2", "숲,매직")
                editor.apply()
            } else if (selectedItem == "테디") {
                editor.putInt("changeUparu2", R.drawable.tedi)
                editor.putString("changeType2", "매직,땅")
                editor.apply()
            } else if (selectedItem == "밤쿠리") {
                editor.putInt("changeUparu2", R.drawable.bamkuri)
                editor.putString("changeType2", "땅,매직")
                editor.apply()
            } else if (selectedItem == "메토루") {
                editor.putInt("changeUparu2", R.drawable.metoru)
                editor.putString("changeType2", "매직,숲")
                editor.apply()
            } else if (selectedItem == "젤리시아") {
                editor.putInt("changeUparu2", R.drawable.jelisia)
                editor.putString("changeType2", "매직,숲")
                editor.apply()
            } else if (selectedItem == "푸스") {
                editor.putInt("changeUparu2", R.drawable.pus)
                editor.putString("changeType2", "천둥,매직")
                editor.apply()
            } else if (selectedItem == "실리") {
                editor.putInt("changeUparu2", R.drawable.silli)
                editor.putString("changeType2", "매직,물")
                editor.apply()
            } else if (selectedItem == "돌피") {
                editor.putInt("changeUparu2", R.drawable.dolpi)
                editor.putString("changeType2", "물,매직")
                editor.apply()
            } else if (selectedItem == "클리네") {
                editor.putInt("changeUparu2", R.drawable.cline)
                editor.putString("changeType2", "천둥,매직")
                editor.apply()
            } else if (selectedItem == "험프티") {
                editor.putInt("changeUparu2", R.drawable.humpti)
                editor.putString("changeType2", "매직,천둥")
                editor.apply()
            } else if (selectedItem == "팬디") {
                editor.putInt("changeUparu2", R.drawable.pandi)
                editor.putString("changeType2", "바람,매직")
                editor.apply()
            } else if (selectedItem == "팅클루") {
                editor.putInt("changeUparu2", R.drawable.tingklru)
                editor.putString("changeType2", "매직,바람")
                editor.apply()
            } else if (selectedItem == "펜펜") {
                editor.putInt("changeUparu2", R.drawable.penpen)
                editor.putString("changeType2", "매직,얼음")
                editor.apply()
            } else if (selectedItem == "소프티") {
                editor.putInt("changeUparu2", R.drawable.softi)
                editor.putString("changeType2", "얼음,매직")
                editor.apply()
            } else if (selectedItem == "아르키") {
                editor.putInt("changeUparu2", R.drawable.arki)
                editor.putString("changeType2", "얼음,매직")
                editor.apply()
            } else if (selectedItem == "듀장군") {
                editor.putInt("changeUparu2", R.drawable.dujangun)
                editor.putString("changeType2", "물,매직")
                editor.apply()
            } else if (selectedItem == "드라펫") {
                editor.putInt("changeUparu2", R.drawable.drapet)
                editor.putString("changeType2", "매직,천둥")
                editor.apply()
            } else if (selectedItem == "알파") {
                editor.putInt("changeUparu2", R.drawable.alpha)
                editor.putString("changeType2", "불,매직")
                editor.apply()
            } else if (selectedItem == "토이보") {
                editor.putInt("changeUparu2", R.drawable.toibo)
                editor.putString("changeType2", "매직,불")
                editor.apply()
            } else if (selectedItem == "덤프티") {
                editor.putInt("changeUparu2", R.drawable.dumpti)
                editor.putString("changeType2", "매직,불")
                editor.apply()
            } else if (selectedItem == "캔디럽") {
                editor.putInt("changeUparu2", R.drawable.candylove2)
                editor.putString("changeType2", "얼음,천둥")
                editor.apply()
            } else if (selectedItem == "베르") {
                editor.putInt("changeUparu2", R.drawable.berr2)
                editor.putString("changeType2", "물,바람,땅")
                editor.apply()
            } else if (selectedItem == "스파인S") {
                editor.putInt("changeUparu2", R.drawable.spain22)
                editor.putString("changeType2", "바람,천둥")
                editor.apply()
            } else if (selectedItem == "러빗") {
                editor.putInt("changeUparu2", R.drawable.loveit2)
                editor.putString("changeType2", "매직,얼음,천둥")
                editor.apply()
            } else if (selectedItem == "래리") {
                editor.putInt("changeUparu2", R.drawable.rari)
                editor.putString("changeType2", "물,땅")
                editor.apply()
            } else if (selectedItem == "렘렘") {
                editor.putInt("changeUparu2", R.drawable.remrem2)
                editor.putString("changeType2", "물,얼음,매직")
                editor.apply()
            } else if (selectedItem == "밍쿠") {
                editor.putInt("changeUparu2", R.drawable.mingku)
                editor.putString("changeType2", "매직,천둥")
                editor.apply()
            }
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}