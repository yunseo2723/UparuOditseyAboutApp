package com.uparu.uparumaking

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

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
        Data2(R.drawable.kitz, "키츠", 7, R.drawable.typelnwi, 8.66),
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
        Data2(R.drawable.rey, "레이", 35, R.drawable.typelight, 36.0),
        Data2(R.drawable.shadow, "쉐도우", 35, R.drawable.typedark, 36.0),
        Data2(R.drawable.rupin, "루핀", 42, R.drawable.typelight, 40.0),
        Data2(R.drawable.goldi, "골디", 53, R.drawable.typegold, 48.0),
        Data2(R.drawable.darkgoldi, "다크골디", 55, R.drawable.typegold, 48.0),
        Data2(R.drawable.krono, "크로노", 60, R.drawable.typedark, 42.0),
        Data2(R.drawable.piko2, "피코", 30, R.drawable.typewangnl, 27.0),
        Data2(R.drawable.shasha2, "샤샤", 30, R.drawable.typegrninl, 27.0),
        Data2(R.drawable.sechimi2, "새치미", 30, R.drawable.typeinwinf, 27.0),
        Data2(R.drawable.applechick, "애플칙", 14, R.drawable.typegngr, 9.95),
        Data2(R.drawable.spain, "스파인", 14, R.drawable.typewinl, 10.61),
        Data2(R.drawable.spain22, "스파인S", 14, R.drawable.typewinl, 10.61),
        Data2(R.drawable.godium, "고디움", 15, R.drawable.typefnwi, 10.95),
        Data2(R.drawable.omiyacon, "오미야콘", 16, R.drawable.typeingr, 11.61),
        Data2(R.drawable.orpeus, "오르페우스", 17, R.drawable.typegrnl, 11.95),
        Data2(R.drawable.wonderdragon, "원더드래곤", 19, R.drawable.typelnwinwa, 20.28),
        Data2(R.drawable.yurion, "유리온", 15, R.drawable.typewani, 11.61),
        Data2(R.drawable.popomo, "포포모", 19, R.drawable.typefngnwa, 20.28),
        Data2(R.drawable.godaesinyong, "고대신룡", 53, R.drawable.typelight, 35.95),
        Data2(R.drawable.darknicks, "다크닉스", 53, R.drawable.typedark, 35.95),
        Data2(R.drawable.godaesinyong22, "고대신룡S", 53, R.drawable.typelight, 35.95),
        Data2(R.drawable.mushroom2, "머쉬룸", 14, R.drawable.typegrnf, 10.61),
        Data2(R.drawable.sharkgon2, "샤크곤", 16, R.drawable.typewani, 10.61),
        Data2(R.drawable.applechick22, "애플칙S", 16, R.drawable.typegngr, 9.95)
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
        setContentView(R.layout.activity_main3)

        var sortedDataList: List<Data2> = DataList
        val spinnerSort = findViewById<Spinner>(R.id.spinner)
        val sortOptions = listOf("가나다순", "생산량순", "소환시간순")

        // 스피너 어댑터를 초기화하고 정렬 기준 목록을 설정
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sortOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSort.adapter = adapter

        val gridView = findViewById<GridView>(R.id.gridView)
        val searchView = findViewById<SearchView>(R.id.searchView)


// 스피너 선택 이벤트 처리
        spinnerSort.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedSort = sortOptions[position] // 선택한 정렬 기준

                // 정렬 기준에 따라 데이터를 정렬
                sortedDataList = when (selectedSort) {
                    "가나다순" -> DataList.sortedBy { it.name }
                    "생산량순" -> DataList.sortedWith(compareBy({ -it.gold }, { it.name }))
                    "소환시간순" -> DataList.sortedWith(compareBy({ it.time }, { it.name }))
                    else -> DataList // 이 예제에서는 기본으로 원본 데이터 유지
                }

                // 새로운 어댑터로 그리드뷰 업데이트
                val selectedAdapter = CustomAdapter2(this@MainActivity3, sortedDataList)
                gridView.adapter = selectedAdapter
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // 선택된 것이 없을 때의 처리
            }
        }
        val buttonTypeAll = findViewById<ImageButton>(R.id.buttonTypeAll)
        val buttonTypeGrass = findViewById<ImageButton>(R.id.buttonTypeGrass)
        val buttonTypeGround = findViewById<ImageButton>(R.id.buttonTypeGround)
        val buttonTypeFire = findViewById<ImageButton>(R.id.buttonTypeFire)
        val buttonTypeWater = findViewById<ImageButton>(R.id.buttonTypeWater)
        val buttonTypeLightning = findViewById<ImageButton>(R.id.buttonTypeLightning)
        val buttonTypeWind = findViewById<ImageButton>(R.id.buttonTypeWind)
        val buttonTypeIce = findViewById<ImageButton>(R.id.buttonTypeIce)
        val buttonTypeMagic = findViewById<ImageButton>(R.id.buttonTypeMagic)
        val buttonTypeStar = findViewById<ImageButton>(R.id.buttonTypeStar)

        buttonTypeAll.setOnClickListener {
            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, sortedDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeGrass.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typegrass || it.type == R.drawable.typefng ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typefnlng ||
                        it.type == R.drawable.typegnf || it.type == R.drawable.typegngr ||
                        it.type == R.drawable.typegni || it.type == R.drawable.typegnl ||
                        it.type == R.drawable.typegnwa || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegnwi || it.type == R.drawable.typegrng ||
                        it.type == R.drawable.typeing || it.type == R.drawable.typelng ||
                        it.type == R.drawable.typewang || it.type == R.drawable.typewangnl ||
                        it.type == R.drawable.typewaning || it.type == R.drawable.typewing ||
                        it.type == R.drawable.typewining || it.type == R.drawable.typefngrng ||
                        it.type == R.drawable.typefngnwa || it.type == R.drawable.typeingnwi ||
                        it.type == R.drawable.typegrnlng || it.type == R.drawable.typewinwang ||
                        it.type == R.drawable.typegnm || it.type == R.drawable.typemng
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeGround.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typeground || it.type == R.drawable.typefngr ||
                        it.type == R.drawable.typegngr || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegrnf || it.type == R.drawable.typegrnfnwa ||
                        it.type == R.drawable.typegrng || it.type == R.drawable.typegrni ||
                        it.type == R.drawable.typegrninwa || it.type == R.drawable.typegrnl ||
                        it.type == R.drawable.typegrnwa || it.type == R.drawable.typegrnwi ||
                        it.type == R.drawable.typeingr || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typelngr || it.type == R.drawable.typewangr ||
                        it.type == R.drawable.typewingr || it.type == R.drawable.typegrninl ||
                        it.type == R.drawable.typefngrng || it.type == R.drawable.typegrnlng ||
                        it.type == R.drawable.typegrnm || it.type == R.drawable.typemngr ||
                        it.type == R.drawable.typewanwingr
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeFire.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typefire || it.type == R.drawable.typefng ||
                        it.type == R.drawable.typefngr || it.type == R.drawable.typefni ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typefnl ||
                        it.type == R.drawable.typefnlng || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typefnwa || it.type == R.drawable.typefnwi ||
                        it.type == R.drawable.typegnf || it.type == R.drawable.typegrnf ||
                        it.type == R.drawable.typegrnfnwa || it.type == R.drawable.typeinf ||
                        it.type == R.drawable.typelnf || it.type == R.drawable.typewanf ||
                        it.type == R.drawable.typewinf || it.type == R.drawable.typelnfni ||
                        it.type == R.drawable.typefngrng || it.type == R.drawable.typefngnwa ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typefnm ||
                        it.type == R.drawable.typemnf || it.type == R.drawable.typemnwinf
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeWater.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typewater || it.type == R.drawable.typefnwa ||
                        it.type == R.drawable.typegnwa || it.type == R.drawable.typegnwangr ||
                        it.type == R.drawable.typegrnfnwa || it.type == R.drawable.typegrninwa ||
                        it.type == R.drawable.typegrnwa || it.type == R.drawable.typeinwa ||
                        it.type == R.drawable.typelnwa || it.type == R.drawable.typelnwinwa ||
                        it.type == R.drawable.typewanf || it.type == R.drawable.typewang ||
                        it.type == R.drawable.typewangnl || it.type == R.drawable.typewangr ||
                        it.type == R.drawable.typewani || it.type == R.drawable.typewaning ||
                        it.type == R.drawable.typewaninl || it.type == R.drawable.typewanwi ||
                        it.type == R.drawable.typewinwa || it.type == R.drawable.typewinwani ||
                        it.type == R.drawable.typewanwinl || it.type == R.drawable.typefngnwa ||
                        it.type == R.drawable.typewinwang || it.type == R.drawable.typewanm ||
                        it.type == R.drawable.typemnwa || it.type == R.drawable.typewanwingr
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeLightning.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typelightning || it.type == R.drawable.typefnl ||
                        it.type == R.drawable.typefnlng || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typegnl || it.type == R.drawable.typegrnl ||
                        it.type == R.drawable.typeinl || it.type == R.drawable.typelnf ||
                        it.type == R.drawable.typelng || it.type == R.drawable.typelngr ||
                        it.type == R.drawable.typelni || it.type == R.drawable.typelnwa ||
                        it.type == R.drawable.typelnwi || it.type == R.drawable.typelnwini ||
                        it.type == R.drawable.typelnwinwa || it.type == R.drawable.typewangnl ||
                        it.type == R.drawable.typewaninl || it.type == R.drawable.typewinl ||
                        it.type == R.drawable.typelnfni || it.type == R.drawable.typegrninl ||
                        it.type == R.drawable.typewanwinl || it.type == R.drawable.typegrnlng ||
                        it.type == R.drawable.typelnm || it.type == R.drawable.typemnl
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeWind.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typewind || it.type == R.drawable.typefnlnwi ||
                        it.type == R.drawable.typefnwi || it.type == R.drawable.typegnwi ||
                        it.type == R.drawable.typegrnwi || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typeinwi || it.type == R.drawable.typelnwi ||
                        it.type == R.drawable.typelnwini || it.type == R.drawable.typelnwinwa ||
                        it.type == R.drawable.typewanwi || it.type == R.drawable.typewinf ||
                        it.type == R.drawable.typewing || it.type == R.drawable.typewingr ||
                        it.type == R.drawable.typewini || it.type == R.drawable.typewining ||
                        it.type == R.drawable.typewinl || it.type == R.drawable.typewinwa ||
                        it.type == R.drawable.typewinwani || it.type == R.drawable.typewanwinl ||
                        it.type == R.drawable.typeingnwi || it.type == R.drawable.typewinwang ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typemnwinf ||
                        it.type == R.drawable.typemnwi || it.type == R.drawable.typewinm ||
                        it.type == R.drawable.typewanwingr
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeIce.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typeice || it.type == R.drawable.typefni ||
                        it.type == R.drawable.typefning || it.type == R.drawable.typegni ||
                        it.type == R.drawable.typegrni || it.type == R.drawable.typegrninwa ||
                        it.type == R.drawable.typeinf || it.type == R.drawable.typeing ||
                        it.type == R.drawable.typeingr || it.type == R.drawable.typeingrnwi ||
                        it.type == R.drawable.typeinl || it.type == R.drawable.typeinwa ||
                        it.type == R.drawable.typeinwi || it.type == R.drawable.typelni ||
                        it.type == R.drawable.typelnwini || it.type == R.drawable.typewani ||
                        it.type == R.drawable.typewaning || it.type == R.drawable.typewaninl ||
                        it.type == R.drawable.typewini || it.type == R.drawable.typewining ||
                        it.type == R.drawable.typewinwani || it.type == R.drawable.typelnfni ||
                        it.type == R.drawable.typegrninl || it.type == R.drawable.typeingnwi ||
                        it.type == R.drawable.typeinwinf || it.type == R.drawable.typemni ||
                        it.type == R.drawable.typeinm
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeMagic.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typemagic || it.type == R.drawable.typegrnm ||
                        it.type == R.drawable.typewanm || it.type == R.drawable.typemnl ||
                        it.type == R.drawable.typemnwi || it.type == R.drawable.typemnwinf ||
                        it.type == R.drawable.typemng || it.type == R.drawable.typegnm ||
                        it.type == R.drawable.typemnf || it.type == R.drawable.typefnm ||
                        it.type == R.drawable.typewinm || it.type == R.drawable.typelnm ||
                        it.type == R.drawable.typemngr || it.type == R.drawable.typemnwa ||
                        it.type == R.drawable.typeinm || it.type == R.drawable.typemni
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        buttonTypeStar.setOnClickListener {
            // 타입에 따라 필터링
            val filteredDataList = sortedDataList.filter {
                it.type == R.drawable.typelight || it.type == R.drawable.typedark ||
                        it.type == R.drawable.typegold
            }

            // 새로운 어댑터로 그리드뷰 업데이트
            val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
            gridView.adapter = newAdapter
        }

        val imgButton3 = findViewById<ImageButton>(R.id.button3)
        imgButton3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        searchView.setIconifiedByDefault(false)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    // 현재 보여지는 데이터를 filteredDataList로 업데이트
                    val filteredDataList =
                        sortedDataList.filter { data -> data.name.contains(newText) }
                    // 그리드뷰 어댑터를 새로운 어댑터로 업데이트
                    val newAdapter = CustomAdapter2(this@MainActivity3, filteredDataList)
                    gridView.adapter = newAdapter
                }
                return true
            }
        })


        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = (gridView.adapter as CustomAdapter2).getItem(position)?.name

            val intent = Intent(this, MainActivity4::class.java)

            intent.putExtra("changeName", selectedItem)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
    }
}