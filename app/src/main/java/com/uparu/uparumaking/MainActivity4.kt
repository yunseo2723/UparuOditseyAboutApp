package com.uparu.uparumaking

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val recyclerView = findViewById<RecyclerView>(R.id.johpaList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val changeName = intent.getStringExtra("changeName")
        val uparuView = findViewById<ImageView>(R.id.uparuView)
        val typeView = findViewById<ImageView>(R.id.typeView)
        val eggView = findViewById<ImageView>(R.id.eggView)
        val nameView = findViewById<TextView>(R.id.nameView)
        val goldView = findViewById<TextView>(R.id.goldView)
        val habitatView = findViewById<TextView>(R.id.habitatView)
        val sellView = findViewById<TextView>(R.id.sellView)
        val timeView = findViewById<TextView>(R.id.timeView)
        nameView.text = changeName

        fun setMonsterData(
            uparuRes: Int,
            typeRes: Int,
            eggRes: Int,
            name: String,
            gold: String,
            habitat: String,
            sell: String,
            time: String
        ): ArrayList<JohapData> {
            uparuView.setImageResource(uparuRes)
            typeView.setImageResource(typeRes)
            eggView.setImageResource(eggRes)
            goldView.text = gold
            habitatView.text = habitat
            sellView.text = sell
            timeView.text = time

            return arrayListOf(
                JohapData(
                    uparuRes,
                    name,
                    R.drawable.plus,
                    name,
                    uparuRes
                )
            )
        }

        // JohapData 생성 부분을 줄여서 각 항목을 묶어 설정합니다.
        when (changeName) {
            "포리" -> {
                setMonsterData(
                    R.drawable.pori, R.drawable.typegrass, R.drawable.eggg,
                    "포리", "10/분", "숲", "50", "7초"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "두더루" -> {
                setMonsterData(
                    R.drawable.dudeoru, R.drawable.typeground, R.drawable.egggr,
                    "두더루", "4/분", "땅", "50", "3분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "뿌루루" -> {
                setMonsterData(
                    R.drawable.bbururu, R.drawable.typefire, R.drawable.eggf,
                    "뿌루루", "6/분", "불", "250", "15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "듀파" -> {
                setMonsterData(
                    R.drawable.dupa, R.drawable.typewater, R.drawable.eggwa,
                    "듀파", "7/분", "물", "7,500", "45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "듀파", R.drawable.dupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "우루루" -> {
                setMonsterData(
                    R.drawable.ururu, R.drawable.typelightning, R.drawable.eggl,
                    "우루루", "8/분", "천둥", "25,000", "2시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "츄파" -> {
                setMonsterData(
                    R.drawable.chupa, R.drawable.typeice, R.drawable.eggi,
                    "츄파", "4/분", "얼음", "150,000", "4시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "젤로" -> {
                setMonsterData(
                    R.drawable.jello, R.drawable.typemagic, R.drawable.eggm,
                    "젤로", "10/분", "매직", "250,000", "6시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "젤로", R.drawable.jello
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "용가루" -> {
                setMonsterData(
                    R.drawable.yongaru, R.drawable.typewind, R.drawable.eggwi,
                    "용가루", "5/분", "바람", "200,000", "5시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "왈루", R.drawable.warru
                    ),JohapData(
                        R.drawable.tod, "토드", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "토토", R.drawable.toto
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "뭉구루" -> {
                setMonsterData(
                    R.drawable.munguru, R.drawable.typegrng, R.drawable.egggrng,
                    "뭉구루", "4/분", "땅, 숲", "500", "20분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "무무", R.drawable.mumu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "또루루" -> {
                setMonsterData(
                    R.drawable.ddoruru, R.drawable.typegngr, R.drawable.egggngr,
                    "또루루", "4/분", "숲, 땅", "500", "30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "폭시", R.drawable.foxy
                    ),JohapData(
                        R.drawable.panpan, "판판", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "프링" -> {
                setMonsterData(
                    R.drawable.pring, R.drawable.typegnf, R.drawable.egggnf,
                    "프링", "7/분", "숲, 불", "3,000", "2시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "유니", R.drawable.yuni
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "무무" -> {
                setMonsterData(
                    R.drawable.mumu, R.drawable.typefngr, R.drawable.eggfngr,
                    "무무", "4/분", "불, 땅", "3,000", "3시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "촘촘", R.drawable.chomchom
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "뭉구루", R.drawable.munguru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "하쿠루" -> {
                setMonsterData(
                    R.drawable.hakuru, R.drawable.typefng, R.drawable.eggfng,
                    "하쿠루", "5/분", "불, 숲", "3,000", "2시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "용용", R.drawable.yongyong
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "판판" -> {
                setMonsterData(
                    R.drawable.panpan, R.drawable.typegrnf, R.drawable.egggrnf,
                    "판판", "4/분", "땅, 불", "15,000", "3시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "아르망", R.drawable.armang
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "푸푸" -> {
                setMonsterData(
                    R.drawable.pupu, R.drawable.typewang, R.drawable.eggwang,
                    "푸푸", "7/분", "물, 숲", "20,000", "4시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.shellru, "쉘루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "프로구", R.drawable.progu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "해롱" -> {
                setMonsterData(
                    R.drawable.haerong, R.drawable.typegnwa, R.drawable.egggnwa,
                    "해롱", "8/분", "숲, 물", "25,000", "4시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "페로" -> {
                setMonsterData(
                    R.drawable.pero, R.drawable.typegnl, R.drawable.egggnl,
                    "페로", "7/분", "숲, 천둥", "40,000", "3시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "버터핀", R.drawable.butterfin
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "페페" -> {
                setMonsterData(
                    R.drawable.pepe, R.drawable.typefnl, R.drawable.eggfnl,
                    "페페", "7/분", "불, 천둥", "50,000", "4시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "메메" -> {
                setMonsterData(
                    R.drawable.meme, R.drawable.typelnf, R.drawable.egglnf,
                    "메메", "6/분", "천둥, 불", "50,000", "4시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "우루루", R.drawable.ururu
                    )

                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "용용" -> {
                setMonsterData(
                    R.drawable.yongyong, R.drawable.typegrnl, R.drawable.egggrnl,
                    "용용", "5/분", "땅, 천둥", "50,000", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.shujel, "슈젤", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "울포", R.drawable.ulfo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "다람" -> {
                setMonsterData(
                    R.drawable.daram, R.drawable.typefnl, R.drawable.eggfnl,
                    "다람", "7/분", "불, 천둥", "105,000", "4시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.tod, "토드", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.tod, "토드", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "버비" -> {
                setMonsterData(
                    R.drawable.beobi, R.drawable.typegrng, R.drawable.egggrng,
                    "버비", "5/분", "땅, 숲", "56,000", "20분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "토토", R.drawable.toto
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "앤티" -> {
                setMonsterData(
                    R.drawable.anti, R.drawable.typegngr, R.drawable.egganti,
                    "앤티", "5/분", "숲, 땅", "175,000", "35분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "토토", R.drawable.toto
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "동크" -> {
                setMonsterData(
                    R.drawable.donk, R.drawable.typefngr, R.drawable.eggfngr,
                    "동크", "4/분", "불, 땅", "70,000", "3시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.whyki, "와이키", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "도리", R.drawable.dori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "시드" -> {
                setMonsterData(
                    R.drawable.seed, R.drawable.typegnf, R.drawable.egggnf,
                    "시드", "5/분", "숲, 불", "245,000", "2시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "도롱" -> {
                setMonsterData(
                    R.drawable.dorong, R.drawable.typelng, R.drawable.egglng,
                    "도롱", "7/분", "천둥, 숲", "55,000", "3시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "페로", R.drawable.pero
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "누니", R.drawable.nuni
                    ),JohapData(
                        R.drawable.roro, "로로", R.drawable.plus, "페로", R.drawable.pero
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "포터" -> {
                setMonsterData(
                    R.drawable.poter, R.drawable.typegnl, R.drawable.egggnl,
                    "포터", "7/분", "숲, 천둥", "140,000", "3시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "삼삼" -> {
                setMonsterData(
                    R.drawable.samsam, R.drawable.typegnl, R.drawable.egggnl,
                    "삼삼", "7/분", "숲, 천둥", "420,000", "3시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "포기사", R.drawable.pogisa
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.beobi, "버비", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "로로" -> {
                setMonsterData(
                    R.drawable.roro, R.drawable.typegnl, R.drawable.egggnl,
                    "로로", "7/분", "숲, 천둥", "245,000", "3시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ), JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ), JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "푸드덕" -> {
                setMonsterData(
                    R.drawable.puddeok, R.drawable.typelnf, R.drawable.egglnf,
                    "푸드덕", "6/분", "천둥, 불", "300,000", "4시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ), JohapData(
                        R.drawable.gururu, "구루루", R.drawable.plus, "다람", R.drawable.daram
                    ), JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "다람", R.drawable.daram
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "알리" -> {
                setMonsterData(
                    R.drawable.ali, R.drawable.typelng, R.drawable.egglng,
                    "알리", "8/분", "천둥, 숲", "245,000", "4시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "페로", R.drawable.pero
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "초코럽" -> {
                setMonsterData(
                    R.drawable.chocolove, R.drawable.typelng, R.drawable.egglove,
                    "초코럽", "9/분", "천둥, 숲", "245,000", "10시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "페로", R.drawable.pero
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "코코럽" -> {
                setMonsterData(
                    R.drawable.cocolove, R.drawable.typelng, R.drawable.egglove,
                    "코코럽", "16/분", "천둥, 숲", "245,000", "10시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "페로", R.drawable.pero
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "러브럽" -> {
                setMonsterData(
                    R.drawable.lovelove, R.drawable.typelng, R.drawable.egglove,
                    "러브럽", "16/분", "천둥, 숲", "350,000", "10시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chocolove, "초코럽", R.drawable.plus, "코코럽", R.drawable.cocolove
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "라플리" -> {
                setMonsterData(
                    R.drawable.raply, R.drawable.typefng, R.drawable.eggfng,
                    "라플리", "5/분", "불, 숲", "343,000", "2시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "포리", R.drawable.pori
                    ), JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "프링", R.drawable.pring
                    ), JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "판판", R.drawable.panpan
                    ), JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    ), JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "포기사", R.drawable.pogisa
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "시드", R.drawable.seed
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "토토" -> {
                setMonsterData(
                    R.drawable.toto, R.drawable.typewanf, R.drawable.eggwanf,
                    "토토", "8/분", "물, 불", "125,000", "5시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "비비" -> {
                setMonsterData(
                    R.drawable.bibi, R.drawable.typefnwa, R.drawable.eggfnwa,
                    "비비", "8/분", "불, 물", "55,000", "5시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "빙고" -> {
                setMonsterData(
                    R.drawable.bingo, R.drawable.typeingr, R.drawable.eggingr,
                    "빙고", "4/분", "얼음, 땅", "25,000", "4시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "유니", R.drawable.yuni
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "버터핀" -> {
                setMonsterData(
                    R.drawable.butterfin, R.drawable.typegrnl, R.drawable.egggrnl,
                    "버터핀", "5/분", "땅, 천둥", "367,500", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "코카", R.drawable.koka
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "바나덕" -> {
                setMonsterData(
                    R.drawable.banaduck, R.drawable.typegnl, R.drawable.eggbanaduck,
                    "바나덕", "9/분", "숲, 천둥", "정보없음", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ), JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "우루루", R.drawable.ururu
                    ), JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "우파루파" -> {
                setMonsterData(
                    R.drawable.uparupa, R.drawable.typegrnwa, R.drawable.egggrnwa,
                    "우파루파", "7/분", "땅, 물", "300,000", "7시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.applechick, "애플칙", R.drawable.plus, "히포포", R.drawable.hipopo
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "찡요" -> {
                setMonsterData(
                    R.drawable.jjingyo, R.drawable.typewang, R.drawable.eggwang,
                    "찡요", "8/분", "물, 숲", "210,000", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.seed, "시드", R.drawable.plus, "푸푸", R.drawable.pupu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "울라미" -> {
                setMonsterData(
                    R.drawable.ulami, R.drawable.typeingr, R.drawable.eggingr,
                    "울라미", "5/분", "얼음, 땅", "175,000", "5시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "두무라이", R.drawable.dumurai
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.merry, "메리", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "울포" -> {
                setMonsterData(
                    R.drawable.ulfo, R.drawable.typefnl, R.drawable.eggulfo,
                    "울포", "7/분", "불, 천둥", "280,000", "6시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "울리", R.drawable.uli
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "펜리루", R.drawable.penriru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "오구구" -> {
                setMonsterData(
                    R.drawable.ogugu, R.drawable.typeingr, R.drawable.eggogugu,
                    "오구구", "5/분", "얼음, 땅", "245,000", "5시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "두무라이", R.drawable.dumurai
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.merry, "메리", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "엘리" -> {
                setMonsterData(
                    R.drawable.eli, R.drawable.typewangr, R.drawable.eggwangr,
                    "엘리", "8/분", "물, 땅", "300,000", "7시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용용", R.drawable.yongyong
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "치치" -> {
                setMonsterData(
                    R.drawable.chichi, R.drawable.typeingr, R.drawable.eggingr,
                    "치치", "4/분", "얼음, 땅", "150,000", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "뭉구루", R.drawable.munguru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "도리" -> {
                setMonsterData(
                    R.drawable.dori, R.drawable.typegrni, R.drawable.egggrni,
                    "도리", "4/분", "땅, 얼음", "150,000", "6시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "프로구" -> {
                setMonsterData(
                    R.drawable.progu, R.drawable.typegnwa, R.drawable.egggnwa,
                    "프로구", "10/분", "숲, 물", "350,000", "7시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "아르망" -> {
                setMonsterData(
                    R.drawable.armang, R.drawable.typegrnf, R.drawable.egggrnf,
                    "아르망", "8/분", "땅, 불", "350,000", "9시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "벳시" -> {
                setMonsterData(
                    R.drawable.betsi, R.drawable.typewanf, R.drawable.eggbetsi,
                    "벳시", "8/분", "물, 불", "350,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "슈젤", R.drawable.shujel
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "코쿠" -> {
                setMonsterData(
                    R.drawable.koku, R.drawable.typefnwa, R.drawable.eggfnwa,
                    "코쿠", "8/분", "불, 물", "420,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "듀파", R.drawable.dupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "라이루" -> {
                setMonsterData(
                    R.drawable.rairu, R.drawable.typelni, R.drawable.egglni,
                    "라이루", "6/분", "천둥, 얼음", "392,000", "5시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "히포포" -> {
                setMonsterData(
                    R.drawable.hipopo, R.drawable.typewanf, R.drawable.eggwanf,
                    "히포포", "8/분", "물, 불", "350,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스코티" -> {
                setMonsterData(
                    R.drawable.scoti, R.drawable.typegrnf, R.drawable.eggscoti,
                    "스코티", "8/분", "땅, 불", "350,000", "9시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "바렛사" -> {
                setMonsterData(
                    R.drawable.baretsa, R.drawable.typefngr, R.drawable.eggbaretsa,
                    "바렛사", "8/분", "불, 땅", "350,000", "9시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.betsi, "벳시", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "판판", R.drawable.panpan
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "타마미" -> {
                setMonsterData(
                    R.drawable.tamami, R.drawable.typeinl, R.drawable.eggtamami,
                    "타마미", "6/분", "얼음, 천둥", "595,000", "5시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "라이루", R.drawable.rairu
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "미요", R.drawable.miyo
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "루돌", R.drawable.rudol
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "단비" -> {
                setMonsterData(
                    R.drawable.danbi, R.drawable.typegrnf, R.drawable.eggdanbi,
                    "단비", "8/분", "땅, 불", "385,000", "9시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "스코티", R.drawable.scoti
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "머쉬룸", R.drawable.mushroom
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.gururu, "구루루", R.drawable.plus, "스코티", R.drawable.scoti
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "래리" -> {
                setMonsterData(
                    R.drawable.rari, R.drawable.typewangr, R.drawable.eggrari,
                    "래리", "10/분", "물, 땅", "360,000", "8시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "무무", R.drawable.mumu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "버프루" -> {
                setMonsterData(
                    R.drawable.buffru, R.drawable.typegrnwa, R.drawable.egggrnwa,
                    "버프루", "8/분", "땅, 물", "420,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "카피루", R.drawable.copyru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "카피루" -> {
                setMonsterData(
                    R.drawable.copyru, R.drawable.typewangr, R.drawable.eggwangr,
                    "카피루", "8/분", "물, 땅", "420,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "해롱", R.drawable.haerong
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "투투" -> {
                setMonsterData(
                    R.drawable.tutu, R.drawable.typewing, R.drawable.eggwing,
                    "투투", "8/분", "바람, 숲", "300,000", "8시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "피구루" -> {
                setMonsterData(
                    R.drawable.piguru, R.drawable.typegnwi, R.drawable.egggnwi,
                    "피구루", "10/분", "숲, 바람", "350,000", "8시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.tutu, "투투", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "토드" -> {
                setMonsterData(
                    R.drawable.tod, R.drawable.typewanf, R.drawable.eggwanf,
                    "토드", "14/분", "물, 불", "500,000", "5시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.betsi, "벳시", R.drawable.plus, "와우", R.drawable.wow
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "촘촘" -> {
                setMonsterData(
                    R.drawable.chomchom, R.drawable.typelngr, R.drawable.egglngr,
                    "촘촘", "5/분", "천둥, 땅", "385,000", "10시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "코카", R.drawable.koka
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "크로펫" -> {
                setMonsterData(
                    R.drawable.cropet, R.drawable.typelngr, R.drawable.eggcropet,
                    "크로펫", "5/분", "천둥, 땅", "420,000", "10시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "촘촘", R.drawable.chomchom
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.scoti, "스코티", R.drawable.plus, "라이루", R.drawable.rairu
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.eli, "엘리", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "무무", R.drawable.mumu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "꼬부" -> {
                setMonsterData(
                    R.drawable.ggobu, R.drawable.typewing, R.drawable.eggwing,
                    "꼬부", "8/분", "바람, 숲", "245,000", "8시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.miyo, "미요", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "다람", R.drawable.daram
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "크래피" -> {
                setMonsterData(
                    R.drawable.crapi, R.drawable.typegnwi, R.drawable.egggnwi,
                    "크래피", "10/분", "숲, 바람", "350,000", "8시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.miyo, "미요", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "다람", R.drawable.daram
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "보보" -> {
                setMonsterData(
                    R.drawable.bobo, R.drawable.typewinwa, R.drawable.eggwinwa,
                    "보보", "10/분", "바람, 물", "300,000", "8시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "비비", R.drawable.bibi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "몽키루" -> {
                setMonsterData(
                    R.drawable.mongkiru, R.drawable.typelni, R.drawable.egglni,
                    "몽키루", "6/분", "천둥, 얼음", "350,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "고고" -> {
                setMonsterData(
                    R.drawable.gogo, R.drawable.typewinf, R.drawable.eggwinf,
                    "고고", "9/분", "바람, 불", "300,000", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "벳시", R.drawable.betsi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "파이루" -> {
                setMonsterData(
                    R.drawable.firu, R.drawable.typefnwi, R.drawable.eggfnwi,
                    "파이루", "10/분", "불, 바람", "350,000", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "벳시", R.drawable.betsi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "베티" -> {
                setMonsterData(
                    R.drawable.beti, R.drawable.typeinl, R.drawable.egginl,
                    "베티", "6/분", "얼음, 천둥", "350,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "듀파", R.drawable.plus, "포리", R.drawable.ururu
                    ),JohapData(
                        R.drawable.chupa, "듀파", R.drawable.plus, "해롱", R.drawable.koka
                    ),JohapData(
                        R.drawable.chichi, "듀파", R.drawable.plus, "프링", R.drawable.giroro
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "돌리", R.drawable.doli
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "코기" -> {
                setMonsterData(
                    R.drawable.kogi, R.drawable.typefnwi, R.drawable.eggfnwi,
                    "코기", "10/분", "불, 바람", "428,750", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "바우", R.drawable.bau
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "미코" -> {
                setMonsterData(
                    R.drawable.miko, R.drawable.typewinf, R.drawable.eggmiko,
                    "미코", "10/분", "바람, 불", "420,000", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.wow, "와우", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "바우", R.drawable.bau
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "맨디" -> {
                setMonsterData(
                    R.drawable.mendi, R.drawable.typewinf, R.drawable.eggwinf,
                    "맨디", "10/분", "바람, 불", "420,000", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "쉘루", R.drawable.shellru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "프링", R.drawable.pring
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "플라메루" -> {
                setMonsterData(
                    R.drawable.flameru, R.drawable.typefnwi, R.drawable.eggflameru,
                    "플라메루", "10/분", "불, 바람", "428,750", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.crapi, "크래피", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.wow, "와우", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "기로로" -> {
                setMonsterData(
                    R.drawable.giroro, R.drawable.typewinl, R.drawable.eggwinl,
                    "기로로", "8/분", "바람, 천둥", "300,000", "8시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스컹키" -> {
                setMonsterData(
                    R.drawable.skungki, R.drawable.typewini, R.drawable.eggwini,
                    "스컹키", "7/분", "바람, 얼음", "245,000", "7시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.dudu, "두두", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "왈루", R.drawable.warru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "구루루" -> {
                setMonsterData(
                    R.drawable.gururu, R.drawable.typewinl, R.drawable.eggwinl,
                    "구루루", "8/분", "바람, 천둥", "245,000", "8시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "와우" -> {
                setMonsterData(
                    R.drawable.wow, R.drawable.typeinwi, R.drawable.egginwi,
                    "와우", "7/분", "얼음, 바람", "404,250", "7시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "도도", R.drawable.dodo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "울리" -> {
                setMonsterData(
                    R.drawable.uli, R.drawable.typeinwi, R.drawable.egginwi,
                    "울리", "7/분", "얼음, 바람", "420,000", "7시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.betsi, "벳시", R.drawable.plus, "돌리", R.drawable.doli
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "바우", R.drawable.bau
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "키츠" -> {
                setMonsterData(
                    R.drawable.kitz, R.drawable.typelnwi, R.drawable.eggkitz,
                    "키츠", "10/분", "천둥, 바람", "490,000", "8시간40분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "듀파", R.drawable.dupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "돌리" -> {
                setMonsterData(
                    R.drawable.doli, R.drawable.typeinwi, R.drawable.eggdoli,
                    "돌리", "7/분", "얼음, 바람", "420,000", "7시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "라쿠" -> {
                setMonsterData(
                    R.drawable.raku, R.drawable.typelnwi, R.drawable.egglnwi,
                    "라쿠", "9/분", "천둥, 바람", "350,000", "8시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "바렛사", R.drawable.baretsa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "냐오" -> {
                setMonsterData(
                    R.drawable.nyao, R.drawable.typelnwi, R.drawable.eggnyao,
                    "냐오", "9/분", "천둥, 바람", "490,000", "8시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "꿀소리" -> {
                setMonsterData(
                    R.drawable.ggulsori, R.drawable.typewini, R.drawable.eggggulsori,
                    "꿀소리", "7/분", "바람, 얼음", "정보없음", "7시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "코카" -> {
                setMonsterData(
                    R.drawable.koka, R.drawable.typelngr, R.drawable.egglngr,
                    "코카", "9/분", "천둥, 땅", "200,000", "10시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "두더루", R.drawable.dudeoru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "티고" -> {
                setMonsterData(
                    R.drawable.tigo, R.drawable.typeinwi, R.drawable.egginwi,
                    "티고", "7/분", "얼음, 바람", "420,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "두두" -> {
                setMonsterData(
                    R.drawable.dudu, R.drawable.typewini, R.drawable.eggwini,
                    "두두", "7/분", "바람, 얼음", "420,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "미요" -> {
                setMonsterData(
                    R.drawable.miyo, R.drawable.typeinwi, R.drawable.eggmiyo,
                    "미요", "7/분", "얼음, 바람", "420,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "테너펭" -> {
                setMonsterData(
                    R.drawable.tenerpeng, R.drawable.typeinwa, R.drawable.egginwa,
                    "테너펭", "13/분", "얼음, 물", "612,000", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "왈루", R.drawable.warru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "폴라루" -> {
                setMonsterData(
                    R.drawable.polaru, R.drawable.typeinwa, R.drawable.egginwa,
                    "폴라루", "14/분", "얼음, 물", "522,000", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "왈루", R.drawable.warru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "마리나" -> {
                setMonsterData(
                    R.drawable.marina, R.drawable.typewani, R.drawable.eggwani,
                    "마리나", "11/분", "물, 얼음", "551,250", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "왈루", R.drawable.warru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "포기사" -> {
                setMonsterData(
                    R.drawable.pogisa, R.drawable.typegnf, R.drawable.eggpogisa,
                    "포기사", "15/분", "숲, 불", "500,000", "10시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.dorong, "도롱", R.drawable.plus, "레스코", R.drawable.resco
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "왈루" -> {
                setMonsterData(
                    R.drawable.warru, R.drawable.typeinwa, R.drawable.egginwa,
                    "왈루", "11/분", "얼음, 물", "700,000", "11시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "피코", R.drawable.piko
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "크랑" -> {
                setMonsterData(
                    R.drawable.krang, R.drawable.typewanwi, R.drawable.eggwanwi,
                    "크랑", "11/분", "물, 바람", "700,000", "12시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "왈루", R.drawable.warru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "두무라이" -> {
                setMonsterData(
                    R.drawable.dumurai, R.drawable.typegrni, R.drawable.eggdumurai,
                    "두무라이", "15/분", "땅, 얼음", "500,000", "10시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "두두", R.drawable.dudu
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "무무", R.drawable.mumu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "슈젤" -> {
                setMonsterData(
                    R.drawable.shujel, R.drawable.typewanwi, R.drawable.eggwanwi,
                    "슈젤", "11/분", "물, 바람", "700,000", "12시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.tod, "토드", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "듀파", R.drawable.dupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "달구루" -> {
                setMonsterData(
                    R.drawable.dalguru, R.drawable.typegnm, R.drawable.egggnm,
                    "달구루", "10/분", "숲, 매직", "380,000", "8시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "젤로", R.drawable.jello
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "너구루" -> {
                setMonsterData(
                    R.drawable.neoguru, R.drawable.typegrnm, R.drawable.egggrnm,
                    "너구루", "10/분", "땅, 매직", "400,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "치치", R.drawable.chichi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "테디" -> {
                setMonsterData(
                    R.drawable.tedi, R.drawable.typemngr, R.drawable.eggmngr,
                    "테디", "10/분", "매직, 땅", "400,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "치치", R.drawable.chichi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "밤쿠리" -> {
                setMonsterData(
                    R.drawable.bamkuri, R.drawable.typegrnm, R.drawable.egggrnm,
                    "밤쿠리", "10/분", "땅, 매직", "400,000", "9시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "치치", R.drawable.chichi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "메토루" -> {
                setMonsterData(
                    R.drawable.metoru, R.drawable.typemng, R.drawable.eggmng,
                    "메토루", "10/분", "매직, 숲", "490,000", "9시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "젤로", R.drawable.jello
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "젤리시아" -> {
                setMonsterData(
                    R.drawable.jelisia, R.drawable.typemng, R.drawable.eggjelisia,
                    "젤리시아", "19/분", "매직, 숲", "500,000", "10시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "젤로", R.drawable.jello
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "츄파이킹" -> {
                setMonsterData(
                    R.drawable.chupiking, R.drawable.typeinwa, R.drawable.eggchupiking,
                    "츄파이킹", "15/분", "얼음, 물", "1,300,000", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "빙고", R.drawable.bingo
                    ),JohapData(
                        R.drawable.eli, "엘리", R.drawable.plus, "로사", R.drawable.rosa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "샤키" -> {
                setMonsterData(
                    R.drawable.sharky, R.drawable.typewanm, R.drawable.eggwanm,
                    "샤키", "11/분", "물, 매직", "550,000", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "보보", R.drawable.bobo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "수리" -> {
                setMonsterData(
                    R.drawable.suri, R.drawable.typemnl, R.drawable.eggmnl,
                    "수리", "12/분", "매직, 천둥", "500,000", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "푸스" -> {
                setMonsterData(
                    R.drawable.pus, R.drawable.typelnm, R.drawable.egglnm,
                    "푸스", "12/분", "천둥, 매직", "735,000", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "실리" -> {
                setMonsterData(
                    R.drawable.silli, R.drawable.typemnwa, R.drawable.eggmnwa,
                    "실리", "11/분", "매직, 물", "696,500", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "보보", R.drawable.bobo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "돌피" -> {
                setMonsterData(
                    R.drawable.dolpi, R.drawable.typewanm, R.drawable.eggwanm,
                    "돌피", "11/분", "물, 매직", "550,000", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "보보", R.drawable.bobo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "클리네" -> {
                setMonsterData(
                    R.drawable.cline, R.drawable.typelnm, R.drawable.eggcline,
                    "클리네", "12/분", "천둥, 매직", "735,000", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "험프티" -> {
                setMonsterData(
                    R.drawable.humpti, R.drawable.typemnl, R.drawable.egghumpti,
                    "험프티", "12/분", "매직, 천둥", "500,000", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "밍쿠" -> {
                setMonsterData(
                    R.drawable.mingku, R.drawable.typemnl, R.drawable.eggdrapet,
                    "밍쿠", "13/분", "매직, 천둥", "735,000", "11시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "덕키" -> {
                setMonsterData(
                    R.drawable.ducki, R.drawable.typemnwi, R.drawable.eggmnwi,
                    "츄파", "12/분", "매직, 바람", "정보없음", "11시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도도", R.drawable.dodo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "로디" -> {
                setMonsterData(
                    R.drawable.rodi, R.drawable.typemnwi, R.drawable.eggmnwi,
                    "로디", "12/분", "매직, 바람", "600,000", "12시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도도", R.drawable.dodo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "팬디" -> {
                setMonsterData(
                    R.drawable.pandi, R.drawable.typewinm, R.drawable.eggwinm,
                    "팬디", "12/분", "바람, 매직", "600,000", "12시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도도", R.drawable.dodo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "팅클루" -> {
                setMonsterData(
                    R.drawable.tingklru, R.drawable.typemnwi, R.drawable.eggmnwi,
                    "팅클루", "12/분", "매직, 바람", "600,000", "12시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도도", R.drawable.dodo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "펜펜" -> {
                setMonsterData(
                    R.drawable.penpen, R.drawable.typemni, R.drawable.eggmni,
                    "펜펜", "13/분", "매직, 얼음", "550,000", "12시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "라이루", R.drawable.rairu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "소프티" -> {
                setMonsterData(
                    R.drawable.softi, R.drawable.typeinm, R.drawable.egginm,
                    "소프티", "13/분", "얼음, 매직", "624,750", "12시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "라이루", R.drawable.rairu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "아르키" -> {
                setMonsterData(
                    R.drawable.arki, R.drawable.typeinm, R.drawable.eggarki,
                    "아르키", "13/분", "얼음, 매직", "624,750", "12시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "라이루", R.drawable.rairu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "포토비" -> {
                setMonsterData(
                    R.drawable.photobi, R.drawable.typelnm, R.drawable.eggphotobi,
                    "포토비", "13/분", "천둥, 매직", "정보없음", "14시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "듀장군" -> {
                setMonsterData(
                    R.drawable.dujangun, R.drawable.typewanm, R.drawable.eggdujangun,
                    "듀장군", "16/분", "물, 매직", "550,000", "10시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "보보", R.drawable.bobo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "푸르니" -> {
                setMonsterData(
                    R.drawable.purni, R.drawable.typegnwangr, R.drawable.egggnwangr,
                    "푸르니", "17/분", "숲, 물, 땅", "1,300,000", "20시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.nuni, "누니", R.drawable.plus, "피코", R.drawable.piko
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "드라펫" -> {
                setMonsterData(
                    R.drawable.drapet, R.drawable.typemnl, R.drawable.eggdrapet,
                    "드라펫", "14/분", "매직, 천둥", "770,000", "17시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "레스코" -> {
                setMonsterData(
                    R.drawable.resco, R.drawable.typegrnfnwa, R.drawable.eggresco,
                    "레스코", "18/분", "땅, 불, 물", "1,530,000", "23시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "스코티", R.drawable.scoti
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "동크", R.drawable.donk
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.betsi, "벳시", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "히포포", R.drawable.hipopo
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "프로구", R.drawable.progu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "캐터플라이" -> {
                setMonsterData(
                    R.drawable.caterfly, R.drawable.typefnlng, R.drawable.eggfnlng,
                    "캐터플라이", "17/분", "불, 천둥, 숲", "1,190,000", "23시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.roro, "로로", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "버터핀", R.drawable.butterfin
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "페페", R.drawable.pepe
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "베일드" -> {
                setMonsterData(
                    R.drawable.beild, R.drawable.typegrnwang, R.drawable.eggbeild,
                    "베일드", "18/분", "땅, 물, 숲", "정보없음", "25시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "버프루", R.drawable.buffru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "체키루" -> {
                setMonsterData(
                    R.drawable.chekiru, R.drawable.typegrninwa, R.drawable.eggchekiru,
                    "체키루", "18/분", "땅, 얼음, 물", "1,960,000", "23시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.bobo, "보보", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.eli, "엘리", R.drawable.plus, "라이루", R.drawable.rairu
                    ),JohapData(
                        R.drawable.sharkgon, "샤크곤", R.drawable.plus, "머쉬룸", R.drawable.mushroom
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "헬싱포" -> {
                setMonsterData(
                    R.drawable.helsingpo, R.drawable.typefngrnwa, R.drawable.egghelsingpo,
                    "헬싱포", "18/분", "불, 땅, 물", "정보없음", "26시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "버프루", R.drawable.buffru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "킥피그" -> {
                setMonsterData(
                    R.drawable.kickpig, R.drawable.typefngnl, R.drawable.eggkickpig,
                    "킥피그", "17/분", "불, 숲, 천둥", "정보없음", "25시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "라플리", R.drawable.raply
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "도도" -> {
                setMonsterData(
                    R.drawable.dodo, R.drawable.typefnlnwi, R.drawable.eggfnlnwi,
                    "도도", "19/분", "불, 천둥, 바람", "1,530,000", "23시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "파이루", R.drawable.firu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.mendi, "맨디", R.drawable.plus, "버터핀", R.drawable.butterfin
                    ),JohapData(
                        R.drawable.bibi, "비비", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "푸드덕", R.drawable.puddeok
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "에비누" -> {
                setMonsterData(
                    R.drawable.ebinu, R.drawable.typeinf, R.drawable.eggebinu,
                    "에비누", "16/분", "얼음, 불", "정보없음", "11시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "쉘루" -> {
                setMonsterData(
                    R.drawable.shellru, R.drawable.typewinwani, R.drawable.eggwinwani,
                    "쉘루", "18/분", "바람, 물, 얼음", "1,530,000", "24시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.omiyacon, "오미야콘", R.drawable.plus, "슈젤", R.drawable.shujel
                    ),JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "비비", R.drawable.bibi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "뭉치" -> {
                setMonsterData(
                    R.drawable.mungchi, R.drawable.typegrnmnl, R.drawable.eggmungchi,
                    "뭉치", "19/분", "땅, 매직, 천둥", "정보없음", "20시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "드라펫", R.drawable.drapet
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "너구루", R.drawable.neoguru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "우콩" -> {
                setMonsterData(
                    R.drawable.ukong, R.drawable.typegnmnl, R.drawable.eggukong,
                    "우콩", "19/분", "숲, 매직, 천둥", "정보없음", "20시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "밍쿠", R.drawable.mingku
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "젤리시아", R.drawable.jelisia
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "트럼캣" -> {
                setMonsterData(
                    R.drawable.trumcat, R.drawable.typefnwinl, R.drawable.eggtrumcat,
                    "트럼캣", "19/분", "불, 바람, 천둥", "정보없음", "26시간20분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "고고", R.drawable.gogo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "펜리루" -> {
                setMonsterData(
                    R.drawable.penriru, R.drawable.typefni, R.drawable.eggfni,
                    "펜리루", "15/분", "불, 얼음", "500,000", "14시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "폭시" -> {
                setMonsterData(
                    R.drawable.foxy, R.drawable.typeinf, R.drawable.egginf,
                    "폭시", "16/분", "얼음, 불", "550,000", "14시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "채피" -> {
                setMonsterData(
                    R.drawable.chepy, R.drawable.typeinf, R.drawable.eggchepy,
                    "채피", "16/분", "얼음, 불", "550,000", "14시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "폴라루", R.drawable.polaru
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "포기사", R.drawable.pogisa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.rairu, "라이루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "바우" -> {
                setMonsterData(
                    R.drawable.bau, R.drawable.typewingr, R.drawable.eggwingr,
                    "바우", "14/분", "바람, 땅", "1,250,000", "16시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.ulami, "울라미", R.drawable.plus, "구루루", R.drawable.gururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "보라도루" -> {
                setMonsterData(
                    R.drawable.boradoru, R.drawable.typegrnwi, R.drawable.egggrnwi,
                    "보라도루", "14/분", "땅, 바람", "1,250,000", "16시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.ulami, "울라미", R.drawable.plus, "구루루", R.drawable.gururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "알파" -> {
                setMonsterData(
                    R.drawable.alpha, R.drawable.typefnm, R.drawable.eggfnm,
                    "알파", "17/분", "불, 매직", "1,350,000", "13시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bibi, "비비", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "동크", R.drawable.donk
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "토이보" -> {
                setMonsterData(
                    R.drawable.toibo, R.drawable.typemnf, R.drawable.eggmnf,
                    "토이보", "17/분", "매직, 불", "1,127,000", "13시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bibi, "비비", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "동크", R.drawable.donk
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "유니" -> {
                setMonsterData(
                    R.drawable.yuni, R.drawable.typeing, R.drawable.egging,
                    "유니", "15/분", "얼음, 숲", "500,000", "18시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "봉봉" -> {
                setMonsterData(
                    R.drawable.bongbong, R.drawable.typegni, R.drawable.egggni,
                    "봉봉", "15/분", "숲, 얼음", "500,000", "18시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.hakuru, "하쿠루", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "크레이" -> {
                setMonsterData(
                    R.drawable.cray, R.drawable.typelnwa, R.drawable.egglnwa,
                    "크레이", "15/분", "천둥, 물", "1,300,000", "20시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "구루루", R.drawable.gururu
                    ),JohapData(
                        R.drawable.jjingyo, "찡요", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.tamami, "타마미", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "엘리", R.drawable.eli
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "헤르미" -> {
                setMonsterData(
                    R.drawable.hermi, R.drawable.typelnwa, R.drawable.egglnwa,
                    "헤르미", "15/분", "천둥, 물", "1,300,000", "20시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.uparupa, "우파루파", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "구루루", R.drawable.gururu
                    ),JohapData(
                        R.drawable.jjingyo, "찡요", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.tamami, "타마미", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "엘리", R.drawable.eli
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "덤프티" -> {
                setMonsterData(
                    R.drawable.dumpti, R.drawable.typemnf, R.drawable.eggdumpti,
                    "덤프티", "17/분", "매직, 불", "1,127,000", "16시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bibi, "비비", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "동크", R.drawable.donk
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "루돌" -> {
                setMonsterData(
                    R.drawable.rudol, R.drawable.typefning, R.drawable.eggfning,
                    "루돌", "18/분", "불, 얼음, 숲", "1,500,000", "24시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "푸드덕", R.drawable.puddeok
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "채피", R.drawable.chepy
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "코쿠", R.drawable.koku
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "캐터플라이", R.drawable.caterfly
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "코타" -> {
                setMonsterData(
                    R.drawable.kota2, R.drawable.typeinf, R.drawable.eggkota,
                    "코타", "16/분", "얼음, 불", "350,000", "11시간15분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.kota2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "코타\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2023.12.20 ~ 2024.01.11 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "울포", R.drawable.ulfo
                    ),JohapData(
                        R.drawable.doli, "돌리", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.omiyacon, "오미야콘", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.scoti, "스코티", R.drawable.plus, "봉봉", R.drawable.bongbong
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "돌리", R.drawable.doli
                    ),JohapData(
                        R.drawable.tod, "토드", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "코쿠", R.drawable.koku
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "펌키", R.drawable.pumki
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "누니" -> {
                setMonsterData(
                    R.drawable.nuni, R.drawable.typeingrnwi, R.drawable.eggnuni,
                    "누니", "18/분", "얼음, 땅, 바람", "1,530,000", "21시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.dudu, "두두", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.resco, "레스코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "스코티", R.drawable.scoti
                    ),JohapData(
                        R.drawable.miyo, "미요", R.drawable.plus, "스코티", R.drawable.scoti
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "알로하" -> {
                setMonsterData(
                    R.drawable.alroha, R.drawable.typewaning, R.drawable.eggalroha,
                    "알로하", "18/분", "물, 얼음, 숲", "1,487,500", "22시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.nuni, "누니", R.drawable.plus, "푸르니", R.drawable.purni
                    ),JohapData(
                        R.drawable.whyki, "와이키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.sharkgon, "샤크곤", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "토토루" -> {
                setMonsterData(
                    R.drawable.totoru, R.drawable.typeingrnwi, R.drawable.eggingrnwi,
                    "토토루", "18/분", "얼음, 땅, 바람", "1,530,000", "21시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.dudu, "두두", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.resco, "레스코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "스코티", R.drawable.scoti
                    ),JohapData(
                        R.drawable.miyo, "미요", R.drawable.plus, "스코티", R.drawable.scoti
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "펌키" -> {
                setMonsterData(
                    R.drawable.pumki2, R.drawable.typelnwi, R.drawable.eggpumki,
                    "펌키", "10/분", "천둥, 바람", "350,000", "8시간30분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.pumki2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "펌키\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 베티 포함\n\n2. 2023.10.19 ~ 2023.11.09 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "두두", R.drawable.dudu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "캔디럽" -> {
                setMonsterData(
                    R.drawable.candylove2, R.drawable.typeinl, R.drawable.eggcandylove,
                    "캔디럽", "10/분", "얼음, 천둥", "350,000", "10시간30분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.candylove2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "캔디럽\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.03.06 ~ 2024.04.03 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "페로", R.drawable.pero
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.wow, "와우", R.drawable.plus, "용용", R.drawable.yongyong
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "로사" -> {
                setMonsterData(
                    R.drawable.rosa, R.drawable.typewining, R.drawable.eggwining,
                    "츄파", "18/분", "바람, 얼음, 숲", "1,350,000", "22시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "누니", R.drawable.nuni
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "쉘루", R.drawable.shellru
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.dudu, "두두", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "도도", R.drawable.dodo
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "유니핀" -> {
                setMonsterData(
                    R.drawable.yunipin, R.drawable.typeinwanwi, R.drawable.eggyunipin,
                    "유니핀", "29/분", "얼음, 물, 바람", "정보없음", "24시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "미요", R.drawable.miyo
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "마리나", R.drawable.marina
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "차우파" -> {
                setMonsterData(
                    R.drawable.chaupa, R.drawable.typegrnlnwa, R.drawable.eggchaupa,
                    "츄파", "30/분", "땅, 천둥, 물", "정보없음", "25시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "헤르미", R.drawable.hermi
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "버터핀", R.drawable.butterfin
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "챠오" -> {
                setMonsterData(
                    R.drawable.chao, R.drawable.typegnfni, R.drawable.eggchao,
                    "챠오", "23/분", "숲, 불, 얼음", "정보없음", "24시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "폭시", R.drawable.foxy
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "포리", R.drawable.pori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "피싱키" -> {
                setMonsterData(
                    R.drawable.pisingki, R.drawable.typegninwi, R.drawable.eggpisingki,
                    "피싱키", "21/분", "숲, 얼음, 바람", "정보없음", "22시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "돌리", R.drawable.doli
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "꼬부", R.drawable.ggobu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "티더" -> {
                setMonsterData(
                    R.drawable.tider, R.drawable.typeingnwi, R.drawable.eggtider,
                    "티더", "19/분", "얼음, 숲, 바람", "1,350,000", "22시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "누니", R.drawable.nuni
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "쉘루", R.drawable.shellru
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.dudu, "두두", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "도도", R.drawable.dodo
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미", R.drawable.hermi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "와이키" -> {
                setMonsterData(
                    R.drawable.whyki, R.drawable.typewaninl, R.drawable.eggwhyki,
                    "와이키", "18/분", "물, 얼음, 천둥", "1,487,500", "22시간45분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.warru, "왈루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.wonderdragon, "원더드래곤", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미", R.drawable.hermi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "보더" -> {
                setMonsterData(
                    R.drawable.boder, R.drawable.typegnmnf, R.drawable.eggboder,
                    "보더", "19/분", "숲, 매직, 불", "정보없음", "25시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "덤프티", R.drawable.dumpti
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "달구루", R.drawable.dalguru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스파루몽" -> {
                setMonsterData(
                    R.drawable.sparumong2, R.drawable.typelnfni, R.drawable.eggsparumong,
                    "스파루몽", "20/분", "천둥, 불, 얼음", "1,850,000", "28시간45분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.sparumong2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "스파루몽\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2023.11.23 ~ 2023.12.07 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "폭시", R.drawable.foxy
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "울리", R.drawable.uli
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "푸드덕", R.drawable.puddeok
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    ),JohapData(
                        R.drawable.nuni, "누니", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.puddeok, "푸드덕", R.drawable.plus, "채피", R.drawable.chepy
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.rairu, "라이루", R.drawable.plus, "푸드덕", R.drawable.puddeok
                    ),JohapData(
                        R.drawable.marina, "마리나", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "츄파", R.drawable.chupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "서퍼용" -> {
                setMonsterData(
                    R.drawable.sufferyong2, R.drawable.typewanwinl, R.drawable.eggsufferyong,
                    "서퍼용", "20/분", "물, 바람, 천둥", "1,850,000", "25시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.sufferyong2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "서퍼용\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2023.12.28 ~ 2024.01.18 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.shellru, "쉘루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.shujel, "슈젤", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.purni, "푸르니", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.shellru, "쉘루", R.drawable.plus, "와이키", R.drawable.whyki
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "듀파", R.drawable.dupa
                    ),JohapData(
                        R.drawable.firu, "파이루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.shujel, "슈젤", R.drawable.plus, "타마미", R.drawable.tamami
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "레이" -> {
                setMonsterData(
                    R.drawable.rey, R.drawable.typelight, R.drawable.eggrey,
                    "레이", "35/분", "빛", "4,000,000", "36시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.rey)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "레이\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 레어 우파루\n(ex: 루돌, 유니 등 반대 상성 우파루) 포함 X\n\n2. 물이나 바람을 포함한 4가지 속성 이상 크로스\n\n3. 09~21시 사이에 소환"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "파이루", R.drawable.firu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "도도", R.drawable.dodo
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "히포포", R.drawable.hipopo
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.poter, "포터", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.koku, "코쿠", R.drawable.plus, "와우", R.drawable.wow
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "샤크곤", R.drawable.sharkgon
                    ),JohapData(
                        R.drawable.flameru, "플라메루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.resco, "레스코", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.nyao, "냐오", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dorong, "도롱", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.shasha, "샤샤", R.drawable.plus, "슈젤", R.drawable.shujel
                    ),JohapData(
                        R.drawable.sparumong, "스파루몽", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "미요", R.drawable.miyo
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "와이키", R.drawable.whyki
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "울리", R.drawable.uli
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "샤샤", R.drawable.shasha
                    ),JohapData(
                        R.drawable.rairu, "라이루", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.chupiking, "츄파이킹", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "메메", R.drawable.meme
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "쉐도우" -> {
                setMonsterData(
                    R.drawable.shadow, R.drawable.typedark, R.drawable.eggshadow,
                    "쉐도우", "35/분", "어둠", "4,000,000", "36시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.shadow)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "쉐도우\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 레어 우파루\n(ex: 루돌, 유니 등 반대 상성 우파루) 포함 X\n\n2. 물이나 바람을 포함한 4가지 속성 이상 크로스\n\n3. 21~09시 사이에 소환"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "하쿠루", R.drawable.hakuru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "파이루", R.drawable.firu
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "보보", R.drawable.bobo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "도도", R.drawable.dodo
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "히포포", R.drawable.hipopo
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.poter, "포터", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.koku, "코쿠", R.drawable.plus, "와우", R.drawable.wow
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "샤크곤", R.drawable.sharkgon
                    ),JohapData(
                        R.drawable.flameru, "플라메루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.resco, "레스코", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.nyao, "냐오", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.dorong, "도롱", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.shasha, "샤샤", R.drawable.plus, "슈젤", R.drawable.shujel
                    ),JohapData(
                        R.drawable.sparumong, "스파루몽", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "미요", R.drawable.miyo
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "버프루", R.drawable.buffru
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "와이키", R.drawable.whyki
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "울리", R.drawable.uli
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "샤샤", R.drawable.shasha
                    ),JohapData(
                        R.drawable.rairu, "라이루", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.chupiking, "츄파이킹", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.polaru, "폴라루", R.drawable.plus, "메메", R.drawable.meme
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "루핀" -> {
                setMonsterData(
                    R.drawable.rupin, R.drawable.typelight, R.drawable.eggrupin,
                    "루핀", "42/분", "빛", "4,500,000", "40시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.rupin)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "루핀\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 레어 우파루\n(ex: 루돌, 유니 등 반대 상성 우파루)\n1마리 이상 포함\n\n2. 4가지 속성 이상 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.bau, "바우", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.sparumong, "스파루몽", R.drawable.plus, "봉봉", R.drawable.bongbong
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "쉘루", R.drawable.shellru
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.bobo, "보보", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "엘리", R.drawable.eli
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "라쿠", R.drawable.raku
                    ),JohapData(
                        R.drawable.yongyong, "용용", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "크래피", R.drawable.crapi
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "히포포", R.drawable.hipopo
                    ),JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "봉봉", R.drawable.bongbong
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스컬루" -> {
                setMonsterData(
                    R.drawable.skulru2, R.drawable.typelnwini, R.drawable.eggskulru,
                    "스컬루", "23/분", "천둥, 바람, 얼음", "2,000,000", "25시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.skulru2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "스컬루\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 펌키 포함\n\n2. 2023.10.19 ~ 2023.11.09 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.tigo, "티고", R.drawable.plus, "펌키", R.drawable.pumki
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "메리" -> {
                setMonsterData(
                    R.drawable.merry2, R.drawable.typefngrng, R.drawable.eggmerry,
                    "메리", "19/분", "불, 땅, 숲", "1,530,000", "22시간30분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.merry2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "메리\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2023.12.20 ~ 2024.01.04 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.panpan, "판판", R.drawable.plus, "프링", R.drawable.pring
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "샤샤", R.drawable.shasha
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "버비", R.drawable.beobi
                    ),JohapData(
                        R.drawable.baretsa, "바렛사", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.pogisa, "포기사", R.drawable.plus, "촘촘", R.drawable.chomchom
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "샤샤", R.drawable.shasha
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "애플칙", R.drawable.applechick
                    ),JohapData(
                        R.drawable.scoti, "스코티", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.panpan, "판판", R.drawable.plus, "로사", R.drawable.rosa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "쥬라용" -> {
                setMonsterData(
                    R.drawable.jurayong2, R.drawable.typegrnlng, R.drawable.eggjurayong,
                    "쥬라용", "20/분", "땅, 천둥, 숲", "1,550,000", "26시간30분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.jurayong2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "쥬라용\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.01.18 ~ 2024.02.01 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.dorong, "도롱", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.samsam, "삼삼", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.nuni, "누니", R.drawable.plus, "로로", R.drawable.roro
                    ),JohapData(
                        R.drawable.orpeus, "오르페우스", R.drawable.plus, "알리", R.drawable.ali
                    ),JohapData(
                        R.drawable.orpeus, "오르페우스", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "큐피" -> {
                setMonsterData(
                    R.drawable.cupi2, R.drawable.typemnwinf, R.drawable.eggcupi,
                    "큐피", "28/분", "매직, 바람, 불", "2,205,000", "26시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.cupi2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "큐피\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.01.24 ~ 2024.02.14 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "파이루", R.drawable.firu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "고고", R.drawable.gogo
                    ),JohapData(
                        R.drawable.rodi, "로디", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "램버트" -> {
                setMonsterData(
                    R.drawable.rambert2, R.drawable.typewinwang, R.drawable.eggrambert,
                    "램버트", "25/분", "바람, 물, 숲", "1,855,000", "28시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.rambert2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "램버트\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.02.07 ~ 2024.02.21 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "슈젤", R.drawable.shujel
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "꼬부", R.drawable.ggobu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "베르" -> {
                setMonsterData(
                    R.drawable.berr2, R.drawable.typewanwingr, R.drawable.eggberr,
                    "베르", "26/분", "물, 바람, 땅", "1,960,000", "28시간30분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.berr2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "베르\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.03.06 ~ 2024.03.20 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bobo, "보보", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "우파루파", R.drawable.uparupa
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "러빗" -> {
                setMonsterData(
                    R.drawable.loveit2, R.drawable.typemninl, R.drawable.eggloveit,
                    "러빗", "20/분", "매직, 얼음, 천둥", "1,850,000", "28시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.loveit2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "러빗\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 캔디럽 포함 \n\n2. 2024.03.27 ~ 2024.04.10 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.candylove, "캔디럽", R.drawable.plus, "젤로", R.drawable.jello
                    ),JohapData(
                        R.drawable.candylove, "캔디럽", R.drawable.plus, "아르키", R.drawable.arki
                    ),JohapData(
                        R.drawable.candylove, "캔디럽", R.drawable.plus, "푸스", R.drawable.pus
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "마이티" -> {
                setMonsterData(
                    R.drawable.myti2, R.drawable.typeinfnm, R.drawable.eggmyti,
                    "마이티", "19/분", "얼음, 불, 매직", "1,750,000", "29시간15분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.myti2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "마이티\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.04.24 ~ 2024.05.08 기간동안만\n소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "러빗", R.drawable.loveit
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "스파루몽", R.drawable.sparumong
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "소프티", R.drawable.softi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "골디" -> {
                setMonsterData(
                    R.drawable.goldi, R.drawable.typegold, R.drawable.egggoldi,
                    "골디", "53/분", "황금", "5,000,000", "48시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.goldi)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "골디\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 레어 우파루\n(ex: 루돌, 유니 등 반대 상성 우파루)\n1마리 이상 포함\n\n2. 4가지 속성 이상 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.bau, "바우", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.raply, "라플리", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.foxy, "폭시", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "봉봉", R.drawable.bongbong
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "원더드래곤", R.drawable.wonderdragon
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "봉봉", R.drawable.bongbong
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.boradoru, "보라도루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "머쉬룸", R.drawable.mushroom
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "다크골디" -> {
                setMonsterData(
                    R.drawable.darkgoldi, R.drawable.typegold, R.drawable.egggoldi,
                    "다크골디", "55/분", "황금", "6,000,000", "48시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.darkgoldi)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "다크골디\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 크로스에 레어 우파루\n(ex: 루돌, 유니 등 반대 상성 우파루) 2마리 포함\n\n2. 2가지 속성 이상 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.bau, "바우", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.bau, "바우", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "폭시", R.drawable.foxy
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.yuni, "유니", R.drawable.plus, "폭시", R.drawable.foxy
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.cray, "크레이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "크로노" -> {
                setMonsterData(
                    R.drawable.krono, R.drawable.typedark, R.drawable.eggkrono,
                    "크로노", "60/분", "어둠", "6,500,000", "42시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.krono)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "크로노\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 5가지 속성 이상 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미",R.drawable.hermi
                    ),JohapData(
                        R.drawable.totoru, "토토루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "고디움", R.drawable.godium
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "원더드래곤", R.drawable.wonderdragon
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.shasha, "샤샤", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.sparumong, "스파루몽", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.eli, "엘리", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.sufferyong, "서퍼용", R.drawable.plus, "메리", R.drawable.merry
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "크랑", R.drawable.krang
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "블랙아피스" -> {
                setMonsterData(
                    R.drawable.blackapis2, R.drawable.typedark, R.drawable.eggblackapis,
                    "블랙아피스", "80/분", "어둠", "8,250,000", "47시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.blackapis2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "블랙아피스\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 땅, 천둥 속성을 포함한 5가지 속성 이상 크로스\n\n2. 2024.04.13 ~ 2024.04.15 기간동안만 소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "버터핀", R.drawable.butterfin
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "래리", R.drawable.rari
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.shasha, "샤샤", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.sparumong, "스파루몽", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.sufferyong, "서퍼용", R.drawable.plus, "메리", R.drawable.merry
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "루미온" -> {
                setMonsterData(
                    R.drawable.rumion2, R.drawable.typelight, R.drawable.eggrumion,
                    "루미온", "42/분", "빛", "4,500,000", "40시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.rumion2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "루미온\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 숲, 땅 속성을 포함한 4가지 속성 이상 크로스\n\n2. 2024.04.17 ~ 2024.05.01 기간동안 접속 시 소환석 지급\n\n3. 2024.04.17 ~ 2024.05.15 기간동안 크로스 소환 가능"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dorong, "도롱", R.drawable.plus, "단비", R.drawable.danbi
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.crapi, "크래피", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.purni, "푸르니", R.drawable.plus, "우루루", R.drawable.ururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "애플칙" -> {
                setMonsterData(
                    R.drawable.applechick, R.drawable.typegngr, R.drawable.eggapplechick,
                    "애플칙", "14/분", "숲, 땅", "1,250,000", "9시간57분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.bibi, "비비", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "바렛사", R.drawable.baretsa
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.pring, "프링", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.samsam, "삼삼", R.drawable.plus, "동크", R.drawable.donk
                    ),JohapData(
                        R.drawable.pogisa, "포기사", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "버비", R.drawable.beobi
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "버비", R.drawable.beobi
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "또루루", R.drawable.ddoruru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스파인" -> {
                setMonsterData(
                    R.drawable.spain, R.drawable.typewinl, R.drawable.eggspain,
                    "스파인", "14/분", "바람, 천둥", "1,350,000", "10시간37분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.skungki, "스컹키", R.drawable.plus, "메메", R.drawable.meme
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.scoti, "스코티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.skungki, "스컹키", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "와우", R.drawable.wow
                    ),JohapData(
                        R.drawable.raku, "라쿠", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.bobo, "보보", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "용가루", R.drawable.yongaru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "스파인S" -> {
                setMonsterData(
                    R.drawable.spain22, R.drawable.typewinl, R.drawable.eggspain2,
                    "스파인S", "14/분", "바람, 천둥", "1,350,000", "10시간37분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.spain22)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "스파인\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 2024.03.20 ~ 2024.05.01 기간동안만\n소환 가능 \n\n2. 이벤트 뽑기를 통해 알을 획득하여 소환\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss()
                }
                dialog.show()
            }
            "고디움" -> {
                setMonsterData(
                    R.drawable.godium, R.drawable.typefnwi, R.drawable.egggodium,
                    "고디움", "15/분", "불, 바람", "1,530,000", "10시간57분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.hipopo, "히포포", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.koku, "코쿠", R.drawable.plus, "돌리", R.drawable.doli
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "와우", R.drawable.wow
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.panpan, "판판", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "채피", R.drawable.chepy
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "포기사", R.drawable.pogisa
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "기로로", R.drawable.giroro
                    ),JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "미코", R.drawable.miko
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.gogo, "고고", R.drawable.plus, "몽키루", R.drawable.mongkiru
                    ),JohapData(
                        R.drawable.donk, "동크", R.drawable.plus, "스파인", R.drawable.spain
                    ),JohapData(
                        R.drawable.resco, "레스코", R.drawable.plus, "돌리", R.drawable.doli
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "오미야콘" -> {
                setMonsterData(
                    R.drawable.omiyacon, R.drawable.typeingr, R.drawable.eggomiyacon,
                    "오미야콘", "16/분", "얼음, 땅", "1,710,000", "11시간37분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dori, "도리", R.drawable.plus, "미코", R.drawable.miko
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "또루루", R.drawable.ddoruru
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.chupa, "츄파", R.drawable.plus, "두더루", R.drawable.dudeoru
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.pepe, "페페", R.drawable.plus, "두무라이", R.drawable.dumurai
                    ),JohapData(
                        R.drawable.alroha, "알로하", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.wow, "와우", R.drawable.plus, "아르망", R.drawable.armang
                    ),JohapData(
                        R.drawable.mumu, "무무", R.drawable.plus, "유니", R.drawable.yuni
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "무무", R.drawable.mumu
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "티고", R.drawable.tigo
                    ),JohapData(
                        R.drawable.hipopo, "히포포", R.drawable.plus, "빙고", R.drawable.bingo
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "뿌루루", R.drawable.bbururu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "오르페우스" -> {
                setMonsterData(
                    R.drawable.orpeus, R.drawable.typegrnl, R.drawable.eggorpeus,
                    "오르페우스", "17/분", "땅, 천둥", "1,890,000", "11시간57분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.buffru, "버프루", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.chichi, "치치", R.drawable.plus, "펌키", R.drawable.pumki
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "도리", R.drawable.dori
                    ),JohapData(
                        R.drawable.munguru, "뭉구루", R.drawable.plus, "우루루", R.drawable.ururu
                    ),JohapData(
                        R.drawable.dumurai, "두무라이", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.koka, "코카", R.drawable.plus, "촘촘", R.drawable.chomchom
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "빙고", R.drawable.bingo
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.boradoru, "보라도루", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.ddoruru, "또루루", R.drawable.plus, "용용", R.drawable.yongyong
                    ),JohapData(
                        R.drawable.daram, "다람", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.meme, "메메", R.drawable.plus, "뭉구루", R.drawable.munguru
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "푸르니", R.drawable.purni
                    ),JohapData(
                        R.drawable.butterfin, "버터핀", R.drawable.plus, "무무", R.drawable.mumu
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "피코" -> {
                setMonsterData(
                    R.drawable.piko2, R.drawable.typewangnl, R.drawable.eggpiko,
                    "피코", "30/분", "물, 숲, 천둥", "2,000,000", "27시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)

                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.piko2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "피코\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "프리미엄 뽑기 전용 우파루입니다.\n\n2023.12.07 이후 획득 불가"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }
            "샤샤" -> {
                setMonsterData(
                    R.drawable.shasha2, R.drawable.typegrninl, R.drawable.eggshasha,
                    "샤샤", "30/분", "땅, 얼음, 천둥", "2,000,000", "27시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.shasha2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "샤샤\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "프리미엄 뽑기 전용 우파루입니다.\n\n2024.02.07 이후 획득 불가"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show()
            }
            "새치미" -> {
                setMonsterData(
                    R.drawable.sechimi2, R.drawable.typeinwinf, R.drawable.eggsechimi,
                    "새치미", "30/분", "얼음, 바람, 불", "2,000,000", "27시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.sechimi2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "새치미\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "프리미엄 뽑기 전용 우파루입니다.\n\n2024.04.03 이후 획득 불가"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show()
            }
            "렘렘" -> {
                setMonsterData(
                    R.drawable.remrem2, R.drawable.typewaninm, R.drawable.eggremrem,
                    "렘렘", "30/분", "물, 얼음, 매직", "2,000,000", "27시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.remrem2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "렘렘\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "프리미엄 뽑기 전용 우파루입니다.\n\n프리미엄 뽑기를 통해 알을 획득하여 소환하세요.\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show()

            }
            "원더드래곤" -> {
                setMonsterData(
                    R.drawable.wonderdragon, R.drawable.typelnwinwa, R.drawable.eggwonderdragon,
                    "원더드래곤", "19/분", "천둥, 바람, 물", "2,070,000", "20시간17분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.krang, "크랑", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.nyao, "냐오", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "고디움", R.drawable.godium
                    ),JohapData(
                        R.drawable.nyao, "냐오", R.drawable.plus, "폴라루", R.drawable.polaru
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "우파루파", R.drawable.uparupa
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.pupu, "푸푸", R.drawable.plus, "냐오", R.drawable.nyao
                    ),JohapData(
                        R.drawable.bobo, "보보", R.drawable.plus, "코카", R.drawable.koka
                    ),JohapData(
                        R.drawable.gururu, "구루루", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.whyki, "와이키", R.drawable.plus, "도도", R.drawable.dodo
                    ),JohapData(
                        R.drawable.beti, "베티", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "비비", R.drawable.bibi
                    ),JohapData(
                        R.drawable.giroro, "기로로", R.drawable.plus, "크랑", R.drawable.krang
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "슈젤", R.drawable.shujel
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "유리온" -> {
                setMonsterData(
                    R.drawable.yurion, R.drawable.typewani, R.drawable.eggyurion,
                    "유리온", "15/분", "물, 얼음", "1,710,000", "11시간37분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.haerong, "해롱", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "베티", R.drawable.beti
                    ),JohapData(
                        R.drawable.mongkiru, "몽키루", R.drawable.plus, "토드", R.drawable.tod
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "벳시", R.drawable.betsi
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미", R.drawable.hermi
                    ),JohapData(
                        R.drawable.omiyacon, "오미야콘", R.drawable.plus, "샤크곤", R.drawable.sharkgon
                    ),JohapData(
                        R.drawable.totoru, "토토루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.hermi, "헤르미", R.drawable.plus, "펜리루", R.drawable.penriru
                    ),JohapData(
                        R.drawable.shellru, "쉘루", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.sharkgon, "샤크곤", R.drawable.plus, "타마미", R.drawable.tamami
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "로사", R.drawable.rosa
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "쉘루", R.drawable.shellru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "포포모" -> {
                setMonsterData(
                    R.drawable.popomo, R.drawable.typefngnwa, R.drawable.eggpopomo,
                    "포포모", "19/분", "불, 숲, 물", "2,070,000", "20시간17분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dupa, "듀파", R.drawable.plus, "라플리", R.drawable.raply
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "찡요", R.drawable.jjingyo
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "비비", R.drawable.bibi
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "카프리" -> {
                setMonsterData(
                    R.drawable.capri, R.drawable.typemnwing, R.drawable.eggcapri,
                    "카프리", "32/분", "매직, 바람, 숲", "1,960,000", "27시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "꼬부", R.drawable.ggobu
                    ),JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "투투", R.drawable.tutu
                    ),JohapData(
                        R.drawable.dalguru, "달구루", R.drawable.plus, "용가루", R.drawable.yongaru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "에이프릴" -> {
                setMonsterData(
                    R.drawable.april, R.drawable.typegrnwini, R.drawable.eggapril,
                    "에이프릴", "31/분", "땅, 바람, 얼음", "1,540,000", "21시간"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.nuni, "누니", R.drawable.plus, "츄파", R.drawable.chupa
                    ),JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "돌리", R.drawable.doli
                    ),JohapData(
                        R.drawable.yongaru, "용가루", R.drawable.plus, "도리", R.drawable.dori
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "피키" -> {
                setMonsterData(
                    R.drawable.piki, R.drawable.typemngnl, R.drawable.eggpiki,
                    "피키", "19/분", "매직, 숲, 천둥", "992,250", "20시간30분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.jello, "젤로", R.drawable.plus, "도롱", R.drawable.dorong
                    ),JohapData(
                        R.drawable.pori, "포리", R.drawable.plus, "드라펫", R.drawable.drapet
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "달구루", R.drawable.dalguru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "레오르" -> {
                setMonsterData(
                    R.drawable.reor, R.drawable.typegrnlnf, R.drawable.eggreor,
                    "레오르", "26/분", "땅, 천둥, 불", "1,190,000", "27시간15분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.dudeoru, "두더루", R.drawable.plus, "다람", R.drawable.daram
                    ),JohapData(
                        R.drawable.ururu, "우루루", R.drawable.plus, "동크", R.drawable.donk
                    ),JohapData(
                        R.drawable.bbururu, "뿌루루", R.drawable.plus, "버터핀", R.drawable.butterfin
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "미니드래곤" -> {
                setMonsterData(
                    R.drawable.minidragon, R.drawable.typegnwi, R.drawable.eggminidragon,
                    "미니드래곤", "14/분", "숲, 바람", "1,710,000", "11시간37분"
                )
                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.pori,
                        "포리", R.drawable.plus, "용가루", R.drawable.yongaru
                    ),JohapData(
                        R.drawable.ggobu,
                        "꼬부", R.drawable.plus, "포리", R.drawable.pori
                    ),JohapData(
                        R.drawable.crapi,
                        "크래피", R.drawable.plus, "용가루", R.drawable.yongaru
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "고대신룡" -> {
                setMonsterData(
                    R.drawable.godaesinyong, R.drawable.typelight, R.drawable.egggodaesinyong,
                    "고대신룡", "53/분", "빛", "5,000,000", "35시간57분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.godaesinyong)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "고대신룡\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 5가지 속성 이상 크로스\n\n2. 16렙 이상 우파루로만 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미", R.drawable.hermi
                    ),JohapData(
                        R.drawable.totoru, "토토루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "고디움", R.drawable.godium
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "원더드래곤", R.drawable.wonderdragon
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "다크닉스" -> {
                setMonsterData(
                    R.drawable.darknicks, R.drawable.typedark, R.drawable.eggdarknicks,
                    "다크닉스", "53/분", "어둠", "5,000,000", "35시간57분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.darknicks)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "다크닉스\n조합조건"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text = "1. 5가지 속성 이상 크로스\n\n2. 16렙 이상 우파루로만 크로스"
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시

                val newDataList = arrayListOf(
                    JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "보라도루", R.drawable.boradoru
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "크레이", R.drawable.cray
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "페페", R.drawable.pepe
                    ),JohapData(
                        R.drawable.skulru, "스컬루", R.drawable.plus, "푸푸", R.drawable.pupu
                    ),JohapData(
                        R.drawable.caterfly, "캐터플라이", R.drawable.plus, "치치", R.drawable.chichi
                    ),JohapData(
                        R.drawable.chepy, "채피", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "토토", R.drawable.toto
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.pumki, "펌키", R.drawable.plus, "루돌", R.drawable.rudol
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "헤르미", R.drawable.hermi
                    ),JohapData(
                        R.drawable.totoru, "토토루", R.drawable.plus, "해롱", R.drawable.haerong
                    ),JohapData(
                        R.drawable.rosa, "로사", R.drawable.plus, "판판", R.drawable.panpan
                    ),JohapData(
                        R.drawable.toto, "토토", R.drawable.plus, "스컬루", R.drawable.skulru
                    ),JohapData(
                        R.drawable.piko, "피코", R.drawable.plus, "고디움", R.drawable.godium
                    ),JohapData(
                        R.drawable.bongbong, "봉봉", R.drawable.plus, "원더드래곤", R.drawable.wonderdragon
                    ),JohapData(
                        R.drawable.dodo, "도도", R.drawable.plus, "오미야콘", R.drawable.omiyacon
                    ),JohapData(
                        R.drawable.spain, "스파인", R.drawable.plus, "레스코", R.drawable.resco
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "바우", R.drawable.bau
                    ),JohapData(
                        R.drawable.penriru, "펜리루", R.drawable.plus, "피코", R.drawable.piko
                    ),JohapData(
                        R.drawable.rudol, "루돌", R.drawable.plus, "크레이", R.drawable.cray
                    )
                )
                recyclerView.adapter = CustomAdapterJohap(this, newDataList)
            }
            "고대신룡S" -> {
                setMonsterData(
                    R.drawable.godaesinyong22, R.drawable.typelight, R.drawable.egggodaesinyong2,
                    "고대신룡S", "53/분", "빛", "5,000,000", "35시간57분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.godaesinyong22)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "고대신룡\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2023.11.16 ~ 2023.11.30 기간동안만\n소환 가능 \n\n2. 아래 3번 혹은 4번 방법으로만 획득 가능\n\n" +
                            "3. 프리미엄 뽑기를 통해 알을 획득하여 소환\n\n4. 원정 이벤트 스테이지 <빛의 방문자>\n클리어시 획득 가능\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표
            }
            "스텔라" -> {
                setMonsterData(
                    R.drawable.stella2, R.drawable.typelight, R.drawable.eggstella,
                    "스텔라", "55/분", "빛", "5,000,000", "48시간"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.stella2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "스텔라\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2024.04.10 ~ 2024.06.19 기간동안은\n차원상점에서 구매 가능 \n\n2. 차원 크로스를 통해서 상시 획득 가능\n\n" +
                            "일반 크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }

            "머쉬룸" -> {
                setMonsterData(
                    R.drawable.mushroom2, R.drawable.typegrnf, R.drawable.eggmushroom,
                    "머쉬룸", "14/분", "땅, 불", "1,350,000", "10시간37분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.mushroom2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "머쉬룸\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2023.11.16 ~ 2023.11.30 기간동안만\n소환 가능 \n\n2. 아래 3번 혹은 4번 방법으로만 획득 가능\n\n" +
                            "3. 프리미엄 뽑기를 통해 알을 획득하여 소환\n\n4. 원정 이벤트 스테이지 <산맥의 방문자>\n클리어시 획득 가능\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }
            "샤크곤" -> {
                setMonsterData(
                    R.drawable.sharkgon2, R.drawable.typewani, R.drawable.eggsharkgon,
                    "샤크곤", "16/분", "물, 얼음", "1,350,000", "10시간37분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.sharkgon2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "샤크곤\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2023.11.16 ~ 2023.11.30 기간동안만\n소환 가능 \n\n2. 아래 3번 혹은 4번 방법으로만 획득 가능\n\n" +
                            "3. 프리미엄 뽑기를 통해 알을 획득하여 소환\n\n4. 원정 이벤트 스테이지 <바다의 방문자>\n클리어시 획득 가능\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }
            "애플칙S" -> {
                setMonsterData(
                    R.drawable.applechick22, R.drawable.typegngr, R.drawable.eggapplechick2,
                    "애플칙S", "14/분", "숲, 땅", "1,250,000", "9시간57분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.applechick22)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "애플칙\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2024.01.16 ~ 2024.02.01 기간동안만\n소환 가능 \n\n2. 아래 3번 혹은 4번 방법으로만 획득 가능\n\n" +
                            "3. 이벤트 뽑기를 통해 알을 획득하여 소환\n\n4. 원정 이벤트 스테이지 <수다쟁이 사과>\n클리어시 획득 가능\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }
            "팡팡" -> {
                setMonsterData(
                    R.drawable.pangpang2, R.drawable.typewinmng, R.drawable.pangpang2,
                    "팡팡", "19/분", "바람, 매직, 숲", "2,070,000", "20시간17분"
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.popup_layout)
                val popupImage = dialog.findViewById<ImageView>(R.id.popupImage)
                popupImage.setImageResource(R.drawable.pangpang2)
                val textViewTitle = dialog.findViewById<TextView>(R.id.popupTitle)
                textViewTitle.text = "팡팡\n조합법"
                val textViewContent = dialog.findViewById<TextView>(R.id.popupContent)
                textViewContent.text =
                    "1. 2024.04.30 ~ 2024.05.08 기간동안만\n소환 가능 \n\n2. 기간 내 접속시 선물함 지급\n\n크로스를 통해서는 획득할 수 없습니다."
                val closeButton = dialog.findViewById<Button>(R.id.closeButton)
                closeButton.setOnClickListener {
                    dialog.dismiss() // 팝업 닫기
                }
                dialog.show() // 팝업 다이얼로그 표시
            }
            else -> null
        }
        //먹이량 계산
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val levelView = findViewById<TextView>(R.id.levelView)
        val feedView = findViewById<TextView>(R.id.feedView)
        val feedNum = findViewById<TextView>(R.id.feedNum)
        progressBar.progress = 0 // 0부터 100까지의 값을 설정 (0%부터 100%까지의 진행 상황)


        val feed = intArrayOf(4, 8, 16, 40, 80, 160, 320, 640, 1280, 2560, 5120, 6400, 8400, 12000, 16000, 20500, 25000, 35000, 50000, 65000, 82500,
            100000, 120000, 150000, 180000, 216000, 252000, 288000, 324000, 364000, 412000, 460000, 512000, 568000, 632000, 696000, 768000, 844000,
            924000, 1012000, 1104000, 1200000, 1304000, 1416000, 0)

        if (habitatView.text == "빛" || habitatView.text == "어둠" ||habitatView.text == "황금") {
            for (i in feed.indices) {
                feed[i] *= 2
            }
        }

        var level = 1
        var num=0
        var feedSum = 0
        levelView.text = "LV "+ level
        feedView.text = "총 먹이량: $feedSum"
        feedNum.text = "${feed[num]}"

        val feedButton = findViewById<ImageButton>(R.id.feedButton)
        var clickCount = 0;

        feedButton.setOnClickListener {
            // 현재 진행 상황을 가져옴
            val currentProgress = progressBar.progress
            // 1%씩 증가 (최대값은 100)

            if (level < 44) {
                feedSum += feed[num]
                feedView.text = "총 먹이량: $feedSum"
                if (currentProgress < 75) {
                    progressBar.progress = currentProgress + 25
                    clickCount++
                } else if (currentProgress >= 75) {
                    // 게이지가 100% 이상인 경우
                    if (clickCount < 3)
                    // 처음 3번 클릭에서는 게이지만 채우고, 4번째 클릭에서 게이지를 0으로 설정
                        clickCount++
                    else {
                        // 4번째 클릭부터 게이지를 0으로 설정
                        progressBar.progress = 0
                        clickCount = 0
                        level++
                        levelView.text = "LV $level"
                        num++
                        feedNum.text = "${feed[num]}"
                    }
                }
            } else if (level == 44) {
                feedView.text = "총 먹이량: $feedSum"
                if (currentProgress < 75) {
                    feedSum += feed[num]
                    feedView.text = "총 먹이량: $feedSum"
                    progressBar.progress = currentProgress + 25
                    clickCount++
                } else if (currentProgress >= 75) {
                    // 게이지가 100% 이상인 경우
                    if (clickCount < 3) {
                        // 처음 3번 클릭에서는 게이지만 채우고, 4번째 클릭에서 게이지를 0으로 설정
                        clickCount++
                    } else if (clickCount == 3) {
                        levelView.text = "LV 45"
                        feedNum.text = "최대레벨"
                        progressBar.progress = 100
                        feedSum += feed[num]
                        feedView.text = "총 먹이량: $feedSum"
                        clickCount++
                    } else{
                        levelView.text = "LV 45"
                        feedNum.text = "최대레벨"
                        progressBar.progress = 100
                        clickCount = 4
                    }
                }
            }
        }
    }
}