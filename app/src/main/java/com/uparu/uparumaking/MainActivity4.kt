package com.uparu.uparumaking

import android.app.Dialog
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ListView
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

        if (changeName == "포리") {
            uparuView.setImageResource(R.drawable.pori)
            typeView.setImageResource(R.drawable.typegrass)
            eggView.setImageResource(R.drawable.eggg)
            goldView.text = "10/분"
            habitatView.text = "숲"
            sellView.text = "50"
            timeView.text = "7초"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "두더루") {
            uparuView.setImageResource(R.drawable.dudeoru)
            typeView.setImageResource(R.drawable.typeground)
            eggView.setImageResource(R.drawable.egggr)
            goldView.text = "4/분"
            habitatView.text = "땅"
            sellView.text = "50"
            timeView.text = "3분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "뿌루루") {
            uparuView.setImageResource(R.drawable.bbururu)
            typeView.setImageResource(R.drawable.typefire)
            eggView.setImageResource(R.drawable.eggf)
            goldView.text = "6/분"
            habitatView.text = "불"
            sellView.text = "250"
            timeView.text = "15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "듀파") {
            uparuView.setImageResource(R.drawable.dupa)
            typeView.setImageResource(R.drawable.typewater)
            eggView.setImageResource(R.drawable.eggwa)
            goldView.text = "7/분"
            habitatView.text = "물"
            sellView.text = "7,500"
            timeView.text = "45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "우루루") {
            uparuView.setImageResource(R.drawable.ururu)
            typeView.setImageResource(R.drawable.typelightning)
            eggView.setImageResource(R.drawable.eggl)
            goldView.text = "8/분"
            habitatView.text = "천둥"
            sellView.text = "25,000"
            timeView.text = "2시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "츄파") {
            uparuView.setImageResource(R.drawable.chupa)
            typeView.setImageResource(R.drawable.typeice)
            eggView.setImageResource(R.drawable.eggi)
            goldView.text = "4/분"
            habitatView.text = "얼음"
            sellView.text = "150,000"
            timeView.text = "4시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "젤로") {
            uparuView.setImageResource(R.drawable.jello)
            typeView.setImageResource(R.drawable.typemagic)
            eggView.setImageResource(R.drawable.eggm)
            goldView.text = "10/분"
            habitatView.text = "매직"
            sellView.text = "250,000"
            timeView.text = "6시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "용가루") {
            uparuView.setImageResource(R.drawable.yongaru)
            typeView.setImageResource(R.drawable.typewind)
            eggView.setImageResource(R.drawable.eggwi)
            goldView.text = "5/분"
            habitatView.text = "바람"
            sellView.text = "200,000"
            timeView.text = "5시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "왈루",
                    R.drawable.warru
                ),JohapData(
                    R.drawable.tod,
                    "토드",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "뭉구루") {
            uparuView.setImageResource(R.drawable.munguru)
            typeView.setImageResource(R.drawable.typegrng)
            eggView.setImageResource(R.drawable.egggrng)
            goldView.text = "4/분"
            habitatView.text = "땅, 숲"
            sellView.text = "500"
            timeView.text = "20분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "또루루") {
            uparuView.setImageResource(R.drawable.ddoruru)
            typeView.setImageResource(R.drawable.typegngr)
            eggView.setImageResource(R.drawable.egggngr)
            goldView.text = "4/분"
            habitatView.text = "숲, 땅"
            sellView.text = "500"
            timeView.text = "30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "폭시",
                    R.drawable.foxy
                ),JohapData(
                    R.drawable.panpan,
                    "판판",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "프링") {
            uparuView.setImageResource(R.drawable.pring)
            typeView.setImageResource(R.drawable.typegnf)
            eggView.setImageResource(R.drawable.egggnf)
            goldView.text = "7/분"
            habitatView.text = "숲, 불"
            sellView.text = "3,000"
            timeView.text = "2시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "무무") {
            uparuView.setImageResource(R.drawable.mumu)
            typeView.setImageResource(R.drawable.typefngr)
            eggView.setImageResource(R.drawable.eggfngr)
            goldView.text = "4/분"
            habitatView.text = "불, 땅"
            sellView.text = "3,000"
            timeView.text = "3시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "촘촘",
                    R.drawable.chomchom
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "하쿠루") {
            uparuView.setImageResource(R.drawable.hakuru)
            typeView.setImageResource(R.drawable.typefng)
            eggView.setImageResource(R.drawable.eggfng)
            goldView.text = "5/분"
            habitatView.text = "불, 숲"
            sellView.text = "3,000"
            timeView.text = "2시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "판판") {
            uparuView.setImageResource(R.drawable.panpan)
            typeView.setImageResource(R.drawable.typegrnf)
            eggView.setImageResource(R.drawable.egggrnf)
            goldView.text = "4/분"
            habitatView.text = "땅, 불"
            sellView.text = "15,000"
            timeView.text = "3시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "푸푸") {
            uparuView.setImageResource(R.drawable.pupu)
            typeView.setImageResource(R.drawable.typewang)
            eggView.setImageResource(R.drawable.eggwang)
            goldView.text = "7/분"
            habitatView.text = "물, 숲"
            sellView.text = "20,000"
            timeView.text = "4시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.warru,
                    "왈루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.shellru,
                    "쉘루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "프로구",
                    R.drawable.progu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "해롱") {
            uparuView.setImageResource(R.drawable.haerong)
            typeView.setImageResource(R.drawable.typegnwa)
            eggView.setImageResource(R.drawable.egggnwa)
            goldView.text = "8/분"
            habitatView.text = "숲, 물"
            sellView.text = "25,000"
            timeView.text = "4시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "페로") {
            uparuView.setImageResource(R.drawable.pero)
            typeView.setImageResource(R.drawable.typegnl)
            eggView.setImageResource(R.drawable.egggnl)
            goldView.text = "7/분"
            habitatView.text = "숲, 천둥"
            sellView.text = "40,000"
            timeView.text = "3시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "버터핀",
                    R.drawable.butterfin
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "페페") {
            uparuView.setImageResource(R.drawable.pepe)
            typeView.setImageResource(R.drawable.typefnl)
            eggView.setImageResource(R.drawable.eggfnl)
            goldView.text = "7/분"
            habitatView.text = "불, 천둥"
            sellView.text = "50,000"
            timeView.text = "4시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "메메") {
            uparuView.setImageResource(R.drawable.meme)
            typeView.setImageResource(R.drawable.typelnf)
            eggView.setImageResource(R.drawable.egglnf)
            goldView.text = "6/분"
            habitatView.text = "천둥, 불"
            sellView.text = "50,000"
            timeView.text = "4시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "용용") {
            uparuView.setImageResource(R.drawable.yongyong)
            typeView.setImageResource(R.drawable.typegrnl)
            eggView.setImageResource(R.drawable.egggrnl)
            goldView.text = "5/분"
            habitatView.text = "땅, 천둥"
            sellView.text = "50,000"
            timeView.text = "6시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.shujel,
                    "슈젤",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "울포",
                    R.drawable.ulfo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "다람") {
            uparuView.setImageResource(R.drawable.daram)
            typeView.setImageResource(R.drawable.typefnl)
            eggView.setImageResource(R.drawable.eggfnl)
            goldView.text = "7/분"
            habitatView.text = "불, 천둥"
            sellView.text = "105,000"
            timeView.text = "4시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.tod,
                    "토드",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.tod,
                    "토드",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "버비") {
            uparuView.setImageResource(R.drawable.beobi)
            typeView.setImageResource(R.drawable.typegrng)
            eggView.setImageResource(R.drawable.egggrng)
            goldView.text = "5/분"
            habitatView.text = "땅, 숲"
            sellView.text = "56,000"
            timeView.text = "20분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }else if (changeName == "앤티") {
            uparuView.setImageResource(R.drawable.anti)
            typeView.setImageResource(R.drawable.typegngr)
            eggView.setImageResource(R.drawable.egganti)
            goldView.text = "5/분"
            habitatView.text = "숲, 땅"
            sellView.text = "175,000"
            timeView.text = "35분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "동크") {
            uparuView.setImageResource(R.drawable.donk)
            typeView.setImageResource(R.drawable.typefngr)
            eggView.setImageResource(R.drawable.eggfngr)
            goldView.text = "4/분"
            habitatView.text = "불, 땅"
            sellView.text = "70,000"
            timeView.text = "3시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.whyki,
                    "와이키",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "시드") {
            uparuView.setImageResource(R.drawable.seed)
            typeView.setImageResource(R.drawable.typegnf)
            eggView.setImageResource(R.drawable.egggnf)
            goldView.text = "5/분"
            habitatView.text = "숲, 불"
            sellView.text = "245,000"
            timeView.text = "2시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "도롱") {
            uparuView.setImageResource(R.drawable.dorong)
            typeView.setImageResource(R.drawable.typelng)
            eggView.setImageResource(R.drawable.egglng)
            goldView.text = "7/분"
            habitatView.text = "천둥, 숲"
            sellView.text = "55,000"
            timeView.text = "3시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "누니",
                    R.drawable.nuni
                ),JohapData(
                    R.drawable.roro,
                    "로로",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "포터") {
            uparuView.setImageResource(R.drawable.poter)
            typeView.setImageResource(R.drawable.typegnl)
            eggView.setImageResource(R.drawable.egggnl)
            goldView.text = "7/분"
            habitatView.text = "숲, 천둥"
            sellView.text = "140,000"
            timeView.text = "3시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "삼삼") {
            uparuView.setImageResource(R.drawable.samsam)
            typeView.setImageResource(R.drawable.typegnl)
            eggView.setImageResource(R.drawable.egggnl)
            goldView.text = "7/분"
            habitatView.text = "숲, 천둥"
            sellView.text = "420,000"
            timeView.text = "3시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "포기사",
                    R.drawable.pogisa
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.beobi,
                    "버비",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "로로") {
            uparuView.setImageResource(R.drawable.roro)
            typeView.setImageResource(R.drawable.typegnl)
            eggView.setImageResource(R.drawable.egggnl)
            goldView.text = "7/분"
            habitatView.text = "숲, 천둥"
            sellView.text = "245,000"
            timeView.text = "3시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ), JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ), JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "푸드덕") {
            uparuView.setImageResource(R.drawable.puddeok)
            typeView.setImageResource(R.drawable.typelnf)
            eggView.setImageResource(R.drawable.egglnf)
            goldView.text = "6/분"
            habitatView.text = "천둥, 불"
            sellView.text = "300,000"
            timeView.text = "4시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ), JohapData(
                    R.drawable.gururu,
                    "구루루",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ), JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "알리") {
            uparuView.setImageResource(R.drawable.ali)
            typeView.setImageResource(R.drawable.typelng)
            eggView.setImageResource(R.drawable.egglng)
            goldView.text = "8/분"
            habitatView.text = "천둥, 숲"
            sellView.text = "245,000"
            timeView.text = "4시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "초코럽") {
            uparuView.setImageResource(R.drawable.chocolove)
            typeView.setImageResource(R.drawable.typelng)
            eggView.setImageResource(R.drawable.egglove)
            goldView.text = "9/분"
            habitatView.text = "천둥, 숲"
            sellView.text = "245,000"
            timeView.text = "10시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "코코럽") {
            uparuView.setImageResource(R.drawable.cocolove)
            typeView.setImageResource(R.drawable.typelng)
            eggView.setImageResource(R.drawable.egglove)
            goldView.text = "16/분"
            habitatView.text = "천둥, 숲"
            sellView.text = "245,000"
            timeView.text = "10시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "러브럽") {
            uparuView.setImageResource(R.drawable.lovelove)
            typeView.setImageResource(R.drawable.typelng)
            eggView.setImageResource(R.drawable.egglove)
            goldView.text = "16/분"
            habitatView.text = "천둥, 숲"
            sellView.text = "350,000"
            timeView.text = "10시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chocolove,
                    "초코럽",
                    R.drawable.plus,
                    "코코럽",
                    R.drawable.cocolove
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "라플리") {
            uparuView.setImageResource(R.drawable.raply)
            typeView.setImageResource(R.drawable.typefng)
            eggView.setImageResource(R.drawable.eggfng)
            goldView.text = "5/분"
            habitatView.text = "불, 숲"
            sellView.text = "343,000"
            timeView.text = "2시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ), JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ), JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ), JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ), JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "포기사",
                    R.drawable.pogisa
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "시드",
                    R.drawable.seed
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "토토") {
            uparuView.setImageResource(R.drawable.toto)
            typeView.setImageResource(R.drawable.typewanf)
            eggView.setImageResource(R.drawable.eggwanf)
            goldView.text = "8/분"
            habitatView.text = "물, 불"
            sellView.text = "125,000"
            timeView.text = "5시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "비비") {
            uparuView.setImageResource(R.drawable.bibi)
            typeView.setImageResource(R.drawable.typefnwa)
            eggView.setImageResource(R.drawable.eggfnwa)
            goldView.text = "8/분"
            habitatView.text = "불, 물"
            sellView.text = "55,000"
            timeView.text = "5시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "빙고") {
            uparuView.setImageResource(R.drawable.bingo)
            typeView.setImageResource(R.drawable.typeingr)
            eggView.setImageResource(R.drawable.eggingr)
            goldView.text = "4/분"
            habitatView.text = "얼음, 땅"
            sellView.text = "25,000"
            timeView.text = "4시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "버터핀") {
            uparuView.setImageResource(R.drawable.butterfin)
            typeView.setImageResource(R.drawable.typegrnl)
            eggView.setImageResource(R.drawable.egggrnl)
            goldView.text = "5/분"
            habitatView.text = "땅, 천둥"
            sellView.text = "367,500"
            timeView.text = "6시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "도롱",
                    R.drawable.dorong
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "우파루파") {
            uparuView.setImageResource(R.drawable.uparupa)
            typeView.setImageResource(R.drawable.typegrnwa)
            eggView.setImageResource(R.drawable.egggrnwa)
            goldView.text = "7/분"
            habitatView.text = "땅, 물"
            sellView.text = "300,000"
            timeView.text = "7시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.applechick,
                    "애플칙",
                    R.drawable.plus,
                    "히포포",
                    R.drawable.hipopo
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "찡요") {
            uparuView.setImageResource(R.drawable.jjingyo)
            typeView.setImageResource(R.drawable.typewang)
            eggView.setImageResource(R.drawable.eggwang)
            goldView.text = "8/분"
            habitatView.text = "물, 숲"
            sellView.text = "210,000"
            timeView.text = "6시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.seed,
                    "시드",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "울라미") {
            uparuView.setImageResource(R.drawable.ulami)
            typeView.setImageResource(R.drawable.typeingr)
            eggView.setImageResource(R.drawable.eggingr)
            goldView.text = "5/분"
            habitatView.text = "얼음, 땅"
            sellView.text = "175,000"
            timeView.text = "5시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "두무라이",
                    R.drawable.dumurai
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.merry,
                    "메리",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "울포") {
            uparuView.setImageResource(R.drawable.ulfo)
            typeView.setImageResource(R.drawable.typefnl)
            eggView.setImageResource(R.drawable.eggulfo)
            goldView.text = "7/분"
            habitatView.text = "불, 천둥"
            sellView.text = "280,000"
            timeView.text = "6시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "울리",
                    R.drawable.uli
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "오구구") {
            uparuView.setImageResource(R.drawable.ogugu)
            typeView.setImageResource(R.drawable.typeingr)
            eggView.setImageResource(R.drawable.eggogugu)
            goldView.text = "5/분"
            habitatView.text = "얼음, 땅"
            sellView.text = "정보없음"
            timeView.text = "5시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "두무라이",
                    R.drawable.dumurai
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.merry,
                    "메리",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "엘리") {
            uparuView.setImageResource(R.drawable.eli)
            typeView.setImageResource(R.drawable.typewangr)
            eggView.setImageResource(R.drawable.eggwangr)
            goldView.text = "8/분"
            habitatView.text = "물, 땅"
            sellView.text = "300,000"
            timeView.text = "7시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "치치") {
            uparuView.setImageResource(R.drawable.chichi)
            typeView.setImageResource(R.drawable.typeingr)
            eggView.setImageResource(R.drawable.eggingr)
            goldView.text = "4/분"
            habitatView.text = "얼음, 땅"
            sellView.text = "150,000"
            timeView.text = "6시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "도리") {
            uparuView.setImageResource(R.drawable.dori)
            typeView.setImageResource(R.drawable.typegrni)
            eggView.setImageResource(R.drawable.egggrni)
            goldView.text = "4/분"
            habitatView.text = "땅, 얼음"
            sellView.text = "150,000"
            timeView.text = "6시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "프로구") {
            uparuView.setImageResource(R.drawable.progu)
            typeView.setImageResource(R.drawable.typegnwa)
            eggView.setImageResource(R.drawable.egggnwa)
            goldView.text = "10/분"
            habitatView.text = "숲, 물"
            sellView.text = "350,000"
            timeView.text = "7시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "아르망") {
            uparuView.setImageResource(R.drawable.armang)
            typeView.setImageResource(R.drawable.typegrnf)
            eggView.setImageResource(R.drawable.egggrnf)
            goldView.text = "8/분"
            habitatView.text = "땅, 불"
            sellView.text = "350,000"
            timeView.text = "9시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "벳시") {
            uparuView.setImageResource(R.drawable.betsi)
            typeView.setImageResource(R.drawable.typewanf)
            eggView.setImageResource(R.drawable.eggbetsi)
            goldView.text = "8/분"
            habitatView.text = "물, 불"
            sellView.text = "350,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "코쿠") {
            uparuView.setImageResource(R.drawable.koku)
            typeView.setImageResource(R.drawable.typefnwa)
            eggView.setImageResource(R.drawable.eggfnwa)
            goldView.text = "8/분"
            habitatView.text = "불, 물"
            sellView.text = "420,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "라이루") {
            uparuView.setImageResource(R.drawable.rairu)
            typeView.setImageResource(R.drawable.typelni)
            eggView.setImageResource(R.drawable.egglni)
            goldView.text = "6/분"
            habitatView.text = "천둥, 얼음"
            sellView.text = "392,000"
            timeView.text = "5시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "히포포") {
            uparuView.setImageResource(R.drawable.hipopo)
            typeView.setImageResource(R.drawable.typewanf)
            eggView.setImageResource(R.drawable.eggwanf)
            goldView.text = "8/분"
            habitatView.text = "물, 불"
            sellView.text = "350,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스코티") {
            uparuView.setImageResource(R.drawable.scoti)
            typeView.setImageResource(R.drawable.typegrnf)
            eggView.setImageResource(R.drawable.eggscoti)
            goldView.text = "8/분"
            habitatView.text = "땅, 불"
            sellView.text = "350,000"
            timeView.text = "9시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "바렛사") {
            uparuView.setImageResource(R.drawable.baretsa)
            typeView.setImageResource(R.drawable.typefngr)
            eggView.setImageResource(R.drawable.eggbaretsa)
            goldView.text = "8/분"
            habitatView.text = "불, 땅"
            sellView.text = "350,000"
            timeView.text = "9시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.betsi,
                    "벳시",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "타마미") {
            uparuView.setImageResource(R.drawable.tamami)
            typeView.setImageResource(R.drawable.typeinl)
            eggView.setImageResource(R.drawable.eggtamami)
            goldView.text = "6/분"
            habitatView.text = "얼음, 천둥"
            sellView.text = "595,000"
            timeView.text = "5시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "미요",
                    R.drawable.miyo
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "단비") {
            uparuView.setImageResource(R.drawable.danbi)
            typeView.setImageResource(R.drawable.typegrnf)
            eggView.setImageResource(R.drawable.eggdanbi)
            goldView.text = "8/분"
            habitatView.text = "땅, 불"
            sellView.text = "385,000"
            timeView.text = "9시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "스코티",
                    R.drawable.scoti
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "머쉬룸",
                    R.drawable.mushroom
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.gururu,
                    "구루루",
                    R.drawable.plus,
                    "스코티",
                    R.drawable.scoti
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }

        else if (changeName == "래리") {
            uparuView.setImageResource(R.drawable.rari)
            typeView.setImageResource(R.drawable.typewangr)
            eggView.setImageResource(R.drawable.eggrari)
            goldView.text = "10/분"
            habitatView.text = "물, 땅"
            sellView.text = "360,000"
            timeView.text = "8시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "버프루") {
            uparuView.setImageResource(R.drawable.buffru)
            typeView.setImageResource(R.drawable.typegrnwa)
            eggView.setImageResource(R.drawable.egggrnwa)
            goldView.text = "8/분"
            habitatView.text = "땅, 물"
            sellView.text = "420,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "카피루",
                    R.drawable.copyru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "카피루") {
            uparuView.setImageResource(R.drawable.copyru)
            typeView.setImageResource(R.drawable.typewangr)
            eggView.setImageResource(R.drawable.eggwangr)
            goldView.text = "8/분"
            habitatView.text = "물, 땅"
            sellView.text = "420,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "투투") {
            uparuView.setImageResource(R.drawable.tutu)
            typeView.setImageResource(R.drawable.typewing)
            eggView.setImageResource(R.drawable.eggwing)
            goldView.text = "8/분"
            habitatView.text = "바람, 숲"
            sellView.text = "300,000"
            timeView.text = "8시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "피구루") {
            uparuView.setImageResource(R.drawable.piguru)
            typeView.setImageResource(R.drawable.typegnwi)
            eggView.setImageResource(R.drawable.egggnwi)
            goldView.text = "10/분"
            habitatView.text = "숲, 바람"
            sellView.text = "350,000"
            timeView.text = "8시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.tutu,
                    "투투",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "토드") {
            uparuView.setImageResource(R.drawable.tod)
            typeView.setImageResource(R.drawable.typewanf)
            eggView.setImageResource(R.drawable.eggwanf)
            goldView.text = "14/분"
            habitatView.text = "물, 불"
            sellView.text = "500,000"
            timeView.text = "5시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.betsi,
                    "벳시",
                    R.drawable.plus,
                    "와우",
                    R.drawable.wow
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "촘촘") {
            uparuView.setImageResource(R.drawable.chomchom)
            typeView.setImageResource(R.drawable.typelngr)
            eggView.setImageResource(R.drawable.egglngr)
            goldView.text = "5/분"
            habitatView.text = "천둥, 땅"
            sellView.text = "385,000"
            timeView.text = "10시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "크로펫") {
            uparuView.setImageResource(R.drawable.cropet)
            typeView.setImageResource(R.drawable.typelngr)
            eggView.setImageResource(R.drawable.eggcropet)
            goldView.text = "5/분"
            habitatView.text = "천둥, 땅"
            sellView.text = "420,000"
            timeView.text = "10시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "촘촘",
                    R.drawable.chomchom
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.scoti,
                    "스코티",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.eli,
                    "엘리",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "꼬부") {
            uparuView.setImageResource(R.drawable.ggobu)
            typeView.setImageResource(R.drawable.typewing)
            eggView.setImageResource(R.drawable.eggwing)
            goldView.text = "8/분"
            habitatView.text = "바람, 숲"
            sellView.text = "245,000"
            timeView.text = "8시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.miyo,
                    "미요",
                    R.drawable.plus,
                    "애플칙",
                    R.drawable.applechick
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "크래피") {
            uparuView.setImageResource(R.drawable.crapi)
            typeView.setImageResource(R.drawable.typegnwi)
            eggView.setImageResource(R.drawable.egggnwi)
            goldView.text = "10/분"
            habitatView.text = "숲, 바람"
            sellView.text = "350,000"
            timeView.text = "8시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "보보") {
            uparuView.setImageResource(R.drawable.bobo)
            typeView.setImageResource(R.drawable.typewinwa)
            eggView.setImageResource(R.drawable.eggwinwa)
            goldView.text = "10/분"
            habitatView.text = "바람, 물"
            sellView.text = "300,000"
            timeView.text = "8시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "몽키루") {
            uparuView.setImageResource(R.drawable.mongkiru)
            typeView.setImageResource(R.drawable.typelni)
            eggView.setImageResource(R.drawable.egglni)
            goldView.text = "6/분"
            habitatView.text = "천둥, 얼음"
            sellView.text = "350,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "고고") {
            uparuView.setImageResource(R.drawable.gogo)
            typeView.setImageResource(R.drawable.typewinf)
            eggView.setImageResource(R.drawable.eggwinf)
            goldView.text = "9/분"
            habitatView.text = "바람, 불"
            sellView.text = "300,000"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "파이루") {
            uparuView.setImageResource(R.drawable.firu)
            typeView.setImageResource(R.drawable.typefnwi)
            eggView.setImageResource(R.drawable.eggfnwi)
            goldView.text = "10/분"
            habitatView.text = "불, 바람"
            sellView.text = "350,000"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "베티") {
            uparuView.setImageResource(R.drawable.beti)
            typeView.setImageResource(R.drawable.typeinl)
            eggView.setImageResource(R.drawable.egginl)
            goldView.text = "6/분"
            habitatView.text = "얼음, 천둥"
            sellView.text = "350,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "듀파",
                    R.drawable.plus,
                    "포리",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.chupa,
                    "듀파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.chichi,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "돌리",
                    R.drawable.doli
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "코기") {
            uparuView.setImageResource(R.drawable.kogi)
            typeView.setImageResource(R.drawable.typefnwi)
            eggView.setImageResource(R.drawable.eggfnwi)
            goldView.text = "10/분"
            habitatView.text = "불, 바람"
            sellView.text = "428,750"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "미코") {
            uparuView.setImageResource(R.drawable.miko)
            typeView.setImageResource(R.drawable.typewinf)
            eggView.setImageResource(R.drawable.eggmiko)
            goldView.text = "10/분"
            habitatView.text = "바람, 불"
            sellView.text = "420,000"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.wow,
                    "와우",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "맨디") {
            uparuView.setImageResource(R.drawable.mendi)
            typeView.setImageResource(R.drawable.typewinf)
            eggView.setImageResource(R.drawable.eggwinf)
            goldView.text = "10/분"
            habitatView.text = "바람, 불"
            sellView.text = "420,000"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "쉘루",
                    R.drawable.shellru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "플라메루") {
            uparuView.setImageResource(R.drawable.flameru)
            typeView.setImageResource(R.drawable.typefnwi)
            eggView.setImageResource(R.drawable.eggflameru)
            goldView.text = "10/분"
            habitatView.text = "불, 바람"
            sellView.text = "428,750"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.crapi,
                    "크래피",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.wow,
                    "와우",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "기로로") {
            uparuView.setImageResource(R.drawable.giroro)
            typeView.setImageResource(R.drawable.typewinl)
            eggView.setImageResource(R.drawable.eggwinl)
            goldView.text = "8/분"
            habitatView.text = "바람, 천둥"
            sellView.text = "300,000"
            timeView.text = "8시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스컹키") {
            uparuView.setImageResource(R.drawable.skungki)
            typeView.setImageResource(R.drawable.typewini)
            eggView.setImageResource(R.drawable.eggwini)
            goldView.text = "7/분"
            habitatView.text = "바람, 얼음"
            sellView.text = "245,000"
            timeView.text = "7시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dudu,
                    "두두",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "왈루",
                    R.drawable.warru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "구루루") {
            uparuView.setImageResource(R.drawable.gururu)
            typeView.setImageResource(R.drawable.typewinl)
            eggView.setImageResource(R.drawable.eggwinl)
            goldView.text = "8/분"
            habitatView.text = "바람, 천둥"
            sellView.text = "245,000"
            timeView.text = "8시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "와우") {
            uparuView.setImageResource(R.drawable.wow)
            typeView.setImageResource(R.drawable.typeinwi)
            eggView.setImageResource(R.drawable.egginwi)
            goldView.text = "7/분"
            habitatView.text = "얼음, 바람"
            sellView.text = "404,250"
            timeView.text = "7시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "울리") {
            uparuView.setImageResource(R.drawable.uli)
            typeView.setImageResource(R.drawable.typeinwi)
            eggView.setImageResource(R.drawable.egginwi)
            goldView.text = "7/분"
            habitatView.text = "얼음, 바람"
            sellView.text = "420,000"
            timeView.text = "7시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.betsi,
                    "벳시",
                    R.drawable.plus,
                    "돌리",
                    R.drawable.doli
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "키츠") {
            uparuView.setImageResource(R.drawable.kitz)
            typeView.setImageResource(R.drawable.typelnwi)
            eggView.setImageResource(R.drawable.eggkitz)
            goldView.text = "10/분"
            habitatView.text = "천둥, 바람"
            sellView.text = "490,000"
            timeView.text = "8시간40분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "돌리") {
            uparuView.setImageResource(R.drawable.doli)
            typeView.setImageResource(R.drawable.typeinwi)
            eggView.setImageResource(R.drawable.eggdoli)
            goldView.text = "7/분"
            habitatView.text = "얼음, 바람"
            sellView.text = "420,000"
            timeView.text = "7시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "라쿠") {
            uparuView.setImageResource(R.drawable.raku)
            typeView.setImageResource(R.drawable.typelnwi)
            eggView.setImageResource(R.drawable.egglnwi)
            goldView.text = "9/분"
            habitatView.text = "천둥, 바람"
            sellView.text = "350,000"
            timeView.text = "8시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "바렛사",
                    R.drawable.baretsa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "냐오") {
            uparuView.setImageResource(R.drawable.nyao)
            typeView.setImageResource(R.drawable.typelnwi)
            eggView.setImageResource(R.drawable.eggnyao)
            goldView.text = "9/분"
            habitatView.text = "천둥, 바람"
            sellView.text = "490,000"
            timeView.text = "8시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "버프루",
                    R.drawable.buffru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "코카") {
            uparuView.setImageResource(R.drawable.koka)
            typeView.setImageResource(R.drawable.typelngr)
            eggView.setImageResource(R.drawable.egglngr)
            goldView.text = "9/분"
            habitatView.text = "천둥, 땅"
            sellView.text = "200,000"
            timeView.text = "10시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "티고") {
            uparuView.setImageResource(R.drawable.tigo)
            typeView.setImageResource(R.drawable.typeinwi)
            eggView.setImageResource(R.drawable.egginwi)
            goldView.text = "7/분"
            habitatView.text = "얼음, 바람"
            sellView.text = "420,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.tutu,
                    "투투",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "두두") {
            uparuView.setImageResource(R.drawable.dudu)
            typeView.setImageResource(R.drawable.typewini)
            eggView.setImageResource(R.drawable.eggwini)
            goldView.text = "7/분"
            habitatView.text = "바람, 얼음"
            sellView.text = "420,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "미요") {
            uparuView.setImageResource(R.drawable.miyo)
            typeView.setImageResource(R.drawable.typeinwi)
            eggView.setImageResource(R.drawable.eggmiyo)
            goldView.text = "7/분"
            habitatView.text = "얼음, 바람"
            sellView.text = "420,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "샤샤",
                    R.drawable.shasha
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "폴라루") {
            uparuView.setImageResource(R.drawable.polaru)
            typeView.setImageResource(R.drawable.typeinwa)
            eggView.setImageResource(R.drawable.egginwa)
            goldView.text = "14/분"
            habitatView.text = "얼음, 물"
            sellView.text = "522,000"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.warru,
                    "왈루",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "왈루",
                    R.drawable.warru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "마리나") {
            uparuView.setImageResource(R.drawable.marina)
            typeView.setImageResource(R.drawable.typewani)
            eggView.setImageResource(R.drawable.eggwani)
            goldView.text = "11/분"
            habitatView.text = "물, 얼음"
            sellView.text = "551,250"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.sharkgon,
                    "샤크곤",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.sharkgon,
                    "샤크곤",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "포기사") {
            uparuView.setImageResource(R.drawable.pogisa)
            typeView.setImageResource(R.drawable.typegnf)
            eggView.setImageResource(R.drawable.eggpogisa)
            goldView.text = "15/분"
            habitatView.text = "숲, 불"
            sellView.text = "500,000"
            timeView.text = "10시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.dorong,
                    "도롱",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "왈루") {
            uparuView.setImageResource(R.drawable.warru)
            typeView.setImageResource(R.drawable.typeinwa)
            eggView.setImageResource(R.drawable.egginwa)
            goldView.text = "11/분"
            habitatView.text = "얼음, 물"
            sellView.text = "700,000"
            timeView.text = "11시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "크랑") {
            uparuView.setImageResource(R.drawable.krang)
            typeView.setImageResource(R.drawable.typewanwi)
            eggView.setImageResource(R.drawable.eggwanwi)
            goldView.text = "11/분"
            habitatView.text = "물, 바람"
            sellView.text = "700,000"
            timeView.text = "12시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "왈루",
                    R.drawable.warru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "두무라이") {
            uparuView.setImageResource(R.drawable.dumurai)
            typeView.setImageResource(R.drawable.typegrni)
            eggView.setImageResource(R.drawable.eggdumurai)
            goldView.text = "15/분"
            habitatView.text = "땅, 얼음"
            sellView.text = "500,000"
            timeView.text = "10시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "두두",
                    R.drawable.dudu
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "슈젤") {
            uparuView.setImageResource(R.drawable.shujel)
            typeView.setImageResource(R.drawable.typewanwi)
            eggView.setImageResource(R.drawable.eggwanwi)
            goldView.text = "11/분"
            habitatView.text = "물, 바람"
            sellView.text = "700,000"
            timeView.text = "12시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.tod,
                    "토드",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "달구루") {
            uparuView.setImageResource(R.drawable.dalguru)
            typeView.setImageResource(R.drawable.typegnm)
            eggView.setImageResource(R.drawable.egggnm)
            goldView.text = "10/분"
            habitatView.text = "숲, 매직"
            sellView.text = "380,000"
            timeView.text = "8시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "너구루") {
            uparuView.setImageResource(R.drawable.neoguru)
            typeView.setImageResource(R.drawable.typegrnm)
            eggView.setImageResource(R.drawable.egggrnm)
            goldView.text = "10/분"
            habitatView.text = "땅, 매직"
            sellView.text = "400,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "테디") {
            uparuView.setImageResource(R.drawable.tedi)
            typeView.setImageResource(R.drawable.typemngr)
            eggView.setImageResource(R.drawable.eggmngr)
            goldView.text = "10/분"
            habitatView.text = "매직, 땅"
            sellView.text = "400,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "밤쿠리") {
            uparuView.setImageResource(R.drawable.bamkuri)
            typeView.setImageResource(R.drawable.typegrnm)
            eggView.setImageResource(R.drawable.egggrnm)
            goldView.text = "10/분"
            habitatView.text = "땅, 매직"
            sellView.text = "400,000"
            timeView.text = "9시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "메토루") {
            uparuView.setImageResource(R.drawable.metoru)
            typeView.setImageResource(R.drawable.typemng)
            eggView.setImageResource(R.drawable.eggmng)
            goldView.text = "10/분"
            habitatView.text = "매직, 숲"
            sellView.text = "490,000"
            timeView.text = "9시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "젤리시아") {
            uparuView.setImageResource(R.drawable.jelisia)
            typeView.setImageResource(R.drawable.typemng)
            eggView.setImageResource(R.drawable.eggjelisia)
            goldView.text = "19/분"
            habitatView.text = "매직, 숲"
            sellView.text = "500,000"
            timeView.text = "10시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "츄파이킹") {
            uparuView.setImageResource(R.drawable.chupiking)
            typeView.setImageResource(R.drawable.typeinwa)
            eggView.setImageResource(R.drawable.eggchupiking)
            goldView.text = "15/분"
            habitatView.text = "얼음, 물"
            sellView.text = "1,300,000"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "빙고",
                    R.drawable.bingo
                ),JohapData(
                    R.drawable.eli,
                    "엘리",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "샤키") {
            uparuView.setImageResource(R.drawable.sharky)
            typeView.setImageResource(R.drawable.typewanm)
            eggView.setImageResource(R.drawable.eggwanm)
            goldView.text = "11/분"
            habitatView.text = "물, 매직"
            sellView.text = "550,000"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "수리") {
            uparuView.setImageResource(R.drawable.suri)
            typeView.setImageResource(R.drawable.typemnl)
            eggView.setImageResource(R.drawable.eggmnl)
            goldView.text = "12/분"
            habitatView.text = "매직, 천둥"
            sellView.text = "500,000"
            timeView.text = "11시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "푸스") {
            uparuView.setImageResource(R.drawable.pus)
            typeView.setImageResource(R.drawable.typelnm)
            eggView.setImageResource(R.drawable.egglnm)
            goldView.text = "12/분"
            habitatView.text = "천둥, 매직"
            sellView.text = "735,000"
            timeView.text = "11시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "실리") {
            uparuView.setImageResource(R.drawable.silli)
            typeView.setImageResource(R.drawable.typemnwa)
            eggView.setImageResource(R.drawable.eggmnwa)
            goldView.text = "11/분"
            habitatView.text = "매직, 물"
            sellView.text = "696,500"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "돌피") {
            uparuView.setImageResource(R.drawable.dolpi)
            typeView.setImageResource(R.drawable.typewanm)
            eggView.setImageResource(R.drawable.eggwanm)
            goldView.text = "11/분"
            habitatView.text = "물, 매직"
            sellView.text = "550,000"
            timeView.text = "11시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "클리네") {
            uparuView.setImageResource(R.drawable.cline)
            typeView.setImageResource(R.drawable.typelnm)
            eggView.setImageResource(R.drawable.eggcline)
            goldView.text = "12/분"
            habitatView.text = "천둥, 매직"
            sellView.text = "735,000"
            timeView.text = "11시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "험프티") {
            uparuView.setImageResource(R.drawable.humpti)
            typeView.setImageResource(R.drawable.typemnl)
            eggView.setImageResource(R.drawable.egghumpti)
            goldView.text = "12/분"
            habitatView.text = "매직, 천둥"
            sellView.text = "500,000"
            timeView.text = "11시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "밍쿠") {
            uparuView.setImageResource(R.drawable.mingku)
            typeView.setImageResource(R.drawable.typemnl)
            eggView.setImageResource(R.drawable.eggdrapet)
            goldView.text = "13/분"
            habitatView.text = "매직, 천둥"
            sellView.text = "735,000"
            timeView.text = "11시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "로디") {
            uparuView.setImageResource(R.drawable.rodi)
            typeView.setImageResource(R.drawable.typemnwi)
            eggView.setImageResource(R.drawable.eggmnwi)
            goldView.text = "12/분"
            habitatView.text = "매직, 바람"
            sellView.text = "600,000"
            timeView.text = "12시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "팬디") {
            uparuView.setImageResource(R.drawable.pandi)
            typeView.setImageResource(R.drawable.typewinm)
            eggView.setImageResource(R.drawable.eggwinm)
            goldView.text = "12/분"
            habitatView.text = "바람, 매직"
            sellView.text = "600,000"
            timeView.text = "12시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "팅클루") {
            uparuView.setImageResource(R.drawable.tingklru)
            typeView.setImageResource(R.drawable.typemnwi)
            eggView.setImageResource(R.drawable.eggmnwi)
            goldView.text = "12/분"
            habitatView.text = "매직, 바람"
            sellView.text = "600,000"
            timeView.text = "12시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "펜펜") {
            uparuView.setImageResource(R.drawable.penpen)
            typeView.setImageResource(R.drawable.typemni)
            eggView.setImageResource(R.drawable.eggmni)
            goldView.text = "13/분"
            habitatView.text = "매직, 얼음"
            sellView.text = "550,000"
            timeView.text = "12시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "소프티") {
            uparuView.setImageResource(R.drawable.softi)
            typeView.setImageResource(R.drawable.typeinm)
            eggView.setImageResource(R.drawable.egginm)
            goldView.text = "13/분"
            habitatView.text = "얼음, 매직"
            sellView.text = "624,750"
            timeView.text = "12시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "아르키") {
            uparuView.setImageResource(R.drawable.arki)
            typeView.setImageResource(R.drawable.typeinm)
            eggView.setImageResource(R.drawable.eggarki)
            goldView.text = "13/분"
            habitatView.text = "얼음, 매직"
            sellView.text = "624,750"
            timeView.text = "12시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "듀장군") {
            uparuView.setImageResource(R.drawable.dujangun)
            typeView.setImageResource(R.drawable.typewanm)
            eggView.setImageResource(R.drawable.eggdujangun)
            goldView.text = "16/분"
            habitatView.text = "물, 매직"
            sellView.text = "550,000"
            timeView.text = "10시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "푸르니") {
            uparuView.setImageResource(R.drawable.purni)
            typeView.setImageResource(R.drawable.typegnwangr)
            eggView.setImageResource(R.drawable.egggnwangr)
            goldView.text = "17/분"
            habitatView.text = "숲, 물, 땅"
            sellView.text = "정보없음"
            timeView.text = "20시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "애플칙",
                    R.drawable.applechick
                ),JohapData(
                    R.drawable.nuni,
                    "누니",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "드라펫") {
            uparuView.setImageResource(R.drawable.drapet)
            typeView.setImageResource(R.drawable.typemnl)
            eggView.setImageResource(R.drawable.eggdrapet)
            goldView.text = "14/분"
            habitatView.text = "매직, 천둥"
            sellView.text = "770,000"
            timeView.text = "17시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "레스코") {
            uparuView.setImageResource(R.drawable.resco)
            typeView.setImageResource(R.drawable.typegrnfnwa)
            eggView.setImageResource(R.drawable.eggresco)
            goldView.text = "18/분"
            habitatView.text = "땅, 불, 물"
            sellView.text = "정보없음"
            timeView.text = "23시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "스코티",
                    R.drawable.scoti
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "동크",
                    R.drawable.donk
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.betsi,
                    "벳시",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "히포포",
                    R.drawable.hipopo
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "프로구",
                    R.drawable.progu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "캐터플라이") {
            uparuView.setImageResource(R.drawable.caterfly)
            typeView.setImageResource(R.drawable.typefnlng)
            eggView.setImageResource(R.drawable.eggfnlng)
            goldView.text = "17/분"
            habitatView.text = "불, 천둥, 숲"
            sellView.text = "1,190,000"
            timeView.text = "23시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.roro,
                    "로로",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "버터핀",
                    R.drawable.butterfin
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "체키루") {
            uparuView.setImageResource(R.drawable.chekiru)
            typeView.setImageResource(R.drawable.typegrninwa)
            eggView.setImageResource(R.drawable.eggchekiru)
            goldView.text = "18/분"
            habitatView.text = "땅, 얼음, 물"
            sellView.text = "1,960,000"
            timeView.text = "23시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.bobo,
                    "보보",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.eli,
                    "엘리",
                    R.drawable.plus,
                    "라이루",
                    R.drawable.rairu
                ),JohapData(
                    R.drawable.sharkgon,
                    "샤크곤",
                    R.drawable.plus,
                    "머쉬룸",
                    R.drawable.mushroom
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "도도") {
            uparuView.setImageResource(R.drawable.dodo)
            typeView.setImageResource(R.drawable.typefnlnwi)
            eggView.setImageResource(R.drawable.eggfnlnwi)
            goldView.text = "19/분"
            habitatView.text = "불, 천둥, 바람"
            sellView.text = "정보없음"
            timeView.text = "23시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "파이루",
                    R.drawable.firu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.mendi,
                    "맨디",
                    R.drawable.plus,
                    "버터핀",
                    R.drawable.butterfin
                ),JohapData(
                    R.drawable.bibi,
                    "비비",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "푸드덕",
                    R.drawable.puddeok
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "쉘루") {
            uparuView.setImageResource(R.drawable.shellru)
            typeView.setImageResource(R.drawable.typewinwani)
            eggView.setImageResource(R.drawable.eggwinwani)
            goldView.text = "18/분"
            habitatView.text = "바람, 물, 얼음"
            sellView.text = "1,530,000"
            timeView.text = "24시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.omiyacon,
                    "오미야콘",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                ),JohapData(
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "펜리루") {
            uparuView.setImageResource(R.drawable.penriru)
            typeView.setImageResource(R.drawable.typefni)
            eggView.setImageResource(R.drawable.eggfni)
            goldView.text = "15/분"
            habitatView.text = "불, 얼음"
            sellView.text = "500,000"
            timeView.text = "14시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "폭시") {
            uparuView.setImageResource(R.drawable.foxy)
            typeView.setImageResource(R.drawable.typeinf)
            eggView.setImageResource(R.drawable.egginf)
            goldView.text = "16/분"
            habitatView.text = "얼음, 불"
            sellView.text = "550,000"
            timeView.text = "14시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "채피") {
            uparuView.setImageResource(R.drawable.chepy)
            typeView.setImageResource(R.drawable.typeinf)
            eggView.setImageResource(R.drawable.eggchepy)
            goldView.text = "16/분"
            habitatView.text = "얼음, 불"
            sellView.text = "550,000"
            timeView.text = "14시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "폴라루",
                    R.drawable.polaru
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "포기사",
                    R.drawable.pogisa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.rairu,
                    "라이루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "바우") {
            uparuView.setImageResource(R.drawable.bau)
            typeView.setImageResource(R.drawable.typewingr)
            eggView.setImageResource(R.drawable.eggwingr)
            goldView.text = "14/분"
            habitatView.text = "바람, 땅"
            sellView.text = "1,250,000"
            timeView.text = "16시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "버프루",
                    R.drawable.buffru
                ),JohapData(
                    R.drawable.ulami,
                    "울라미",
                    R.drawable.plus,
                    "구루루",
                    R.drawable.gururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "보라도루") {
            uparuView.setImageResource(R.drawable.boradoru)
            typeView.setImageResource(R.drawable.typegrnwi)
            eggView.setImageResource(R.drawable.egggrnwi)
            goldView.text = "14/분"
            habitatView.text = "땅, 바람"
            sellView.text = "1,250,000"
            timeView.text = "16시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.gururu,
                    "구루루",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.wow,
                    "와우",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.skungki,
                    "스컹키",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "알파") {
            uparuView.setImageResource(R.drawable.alpha)
            typeView.setImageResource(R.drawable.typefnm)
            eggView.setImageResource(R.drawable.eggfnm)
            goldView.text = "17/분"
            habitatView.text = "불, 매직"
            sellView.text = "1,350,000"
            timeView.text = "13시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "동크",
                    R.drawable.donk
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "토이보") {
            uparuView.setImageResource(R.drawable.toibo)
            typeView.setImageResource(R.drawable.typemnf)
            eggView.setImageResource(R.drawable.eggmnf)
            goldView.text = "17/분"
            habitatView.text = "매직, 불"
            sellView.text = "1,127,000"
            timeView.text = "13시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "동크",
                    R.drawable.donk
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "유니") {
            uparuView.setImageResource(R.drawable.yuni)
            typeView.setImageResource(R.drawable.typeing)
            eggView.setImageResource(R.drawable.egging)
            goldView.text = "15/분"
            habitatView.text = "얼음, 숲"
            sellView.text = "500,000"
            timeView.text = "18시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.hakuru,
                    "하쿠루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.polaru,
                    "폴라루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "봉봉") {
            uparuView.setImageResource(R.drawable.bongbong)
            typeView.setImageResource(R.drawable.typegni)
            eggView.setImageResource(R.drawable.egggni)
            goldView.text = "15/분"
            habitatView.text = "숲, 얼음"
            sellView.text = "500,000"
            timeView.text = "18시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "알로하",
                    R.drawable.alroha
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "샤크곤",
                    R.drawable.sharkgon
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "크레이") {
            uparuView.setImageResource(R.drawable.cray)
            typeView.setImageResource(R.drawable.typelnwa)
            eggView.setImageResource(R.drawable.egglnwa)
            goldView.text = "15/분"
            habitatView.text = "천둥, 물"
            sellView.text = "1,300,000"
            timeView.text = "20시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.uparupa,
                    "우파루파",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "구루루",
                    R.drawable.gururu
                ),JohapData(
                    R.drawable.jjingyo,
                    "찡요",
                    R.drawable.plus,
                    "도롱",
                    R.drawable.dorong
                ),JohapData(
                    R.drawable.tamami,
                    "타마미",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "헤르미") {
            uparuView.setImageResource(R.drawable.hermi)
            typeView.setImageResource(R.drawable.typelnwa)
            eggView.setImageResource(R.drawable.egglnwa)
            goldView.text = "15/분"
            habitatView.text = "천둥, 물"
            sellView.text = "1,300,000"
            timeView.text = "20시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "덤프티") {
            uparuView.setImageResource(R.drawable.dumpti)
            typeView.setImageResource(R.drawable.typemnf)
            eggView.setImageResource(R.drawable.eggdumpti)
            goldView.text = "17/분"
            habitatView.text = "매직, 불"
            sellView.text = "1,127,000"
            timeView.text = "16시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "동크",
                    R.drawable.donk
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "루돌") {
            uparuView.setImageResource(R.drawable.rudol)
            typeView.setImageResource(R.drawable.typefning)
            eggView.setImageResource(R.drawable.eggfning)
            goldView.text = "18/분"
            habitatView.text = "불, 얼음, 숲"
            sellView.text = "1,500,000"
            timeView.text = "24시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "푸드덕",
                    R.drawable.puddeok
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "채피",
                    R.drawable.chepy
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "코쿠",
                    R.drawable.koku
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "캐터플라이",
                    R.drawable.caterfly
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "코타") {
            uparuView.setImageResource(R.drawable.kota2)
            typeView.setImageResource(R.drawable.typeinf)
            eggView.setImageResource(R.drawable.eggkota)
            goldView.text = "16/분"
            habitatView.text = "얼음, 불"
            sellView.text = "350,000"
            timeView.text = "11시간15분"
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
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "애플칙",
                    R.drawable.applechick
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "울포",
                    R.drawable.ulfo
                ),JohapData(
                    R.drawable.doli,
                    "돌리",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.omiyacon,
                    "오미야콘",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.scoti,
                    "스코티",
                    R.drawable.plus,
                    "봉봉",
                    R.drawable.bongbong
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "돌리",
                    R.drawable.doli
                ),JohapData(
                    R.drawable.tod,
                    "토드",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "코쿠",
                    R.drawable.koku
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "누니") {
            uparuView.setImageResource(R.drawable.nuni)
            typeView.setImageResource(R.drawable.typeingrnwi)
            eggView.setImageResource(R.drawable.eggnuni)
            goldView.text = "18/분"
            habitatView.text = "얼음, 땅, 바람"
            sellView.text = "1,530,000"
            timeView.text = "21시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.dudu,
                    "두두",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.resco,
                    "레스코",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "스코티",
                    R.drawable.scoti
                ),JohapData(
                    R.drawable.miyo,
                    "미요",
                    R.drawable.plus,
                    "스코티",
                    R.drawable.scoti
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "알로하") {
            uparuView.setImageResource(R.drawable.alroha)
            typeView.setImageResource(R.drawable.typewaning)
            eggView.setImageResource(R.drawable.eggalroha)
            goldView.text = "18/분"
            habitatView.text = "물, 얼음, 숲"
            sellView.text = "1,487,500"
            timeView.text = "22시간15분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.nuni,
                    "누니",
                    R.drawable.plus,
                    "푸르니",
                    R.drawable.purni
                ),JohapData(
                    R.drawable.whyki,
                    "와이키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.warru,
                    "왈루",
                    R.drawable.plus,
                    "도롱",
                    R.drawable.dorong
                ),JohapData(
                    R.drawable.sharkgon,
                    "샤크곤",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "토토루") {
            uparuView.setImageResource(R.drawable.totoru)
            typeView.setImageResource(R.drawable.typeingrnwi)
            eggView.setImageResource(R.drawable.eggingrnwi)
            goldView.text = "18/분"
            habitatView.text = "얼음, 땅, 바람"
            sellView.text = "1,530,000"
            timeView.text = "21시간"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.nuni,
                    "누니",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.doli,
                    "돌리",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.applechick,
                    "애플칙",
                    R.drawable.plus,
                    "울리",
                    R.drawable.uli
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "펌키") {
            uparuView.setImageResource(R.drawable.pumki2)
            typeView.setImageResource(R.drawable.typelnwi)
            eggView.setImageResource(R.drawable.eggpumki)
            goldView.text = "10/분"
            habitatView.text = "천둥, 바람"
            sellView.text = "350,000"
            timeView.text = "8시간30분"
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
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "두두",
                    R.drawable.dudu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "캔디럽") {
            uparuView.setImageResource(R.drawable.candylove2)
            typeView.setImageResource(R.drawable.typeinl)
            eggView.setImageResource(R.drawable.eggcandylove)
            goldView.text = "10/분"
            habitatView.text = "얼음, 천둥"
            sellView.text = "350,000"
            timeView.text = "10시간30분"
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
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "페로",
                    R.drawable.pero
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.wow,
                    "와우",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "로사") {
            uparuView.setImageResource(R.drawable.rosa)
            typeView.setImageResource(R.drawable.typewining)
            eggView.setImageResource(R.drawable.eggwining)
            goldView.text = "18/분"
            habitatView.text = "바람, 얼음, 숲"
            sellView.text = "1,350,000"
            timeView.text = "22시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "누니",
                    R.drawable.nuni
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "쉘루",
                    R.drawable.shellru
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.dudu,
                    "두두",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "티더") {
            uparuView.setImageResource(R.drawable.tider)
            typeView.setImageResource(R.drawable.typeingnwi)
            eggView.setImageResource(R.drawable.eggtider)
            goldView.text = "19/분"
            habitatView.text = "얼음, 숲, 바람"
            sellView.text = "정보없음"
            timeView.text = "22시간30분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "누니",
                    R.drawable.nuni
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "쉘루",
                    R.drawable.shellru
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.dudu,
                    "두두",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "와이키") {
            uparuView.setImageResource(R.drawable.whyki)
            typeView.setImageResource(R.drawable.typewaninl)
            eggView.setImageResource(R.drawable.eggwhyki)
            goldView.text = "18/분"
            habitatView.text = "물, 얼음, 천둥"
            sellView.text = "1,487,500"
            timeView.text = "22시간45분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.warru,
                    "왈루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.wonderdragon,
                    "원더드래곤",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스파루몽") {
            uparuView.setImageResource(R.drawable.sparumong2)
            typeView.setImageResource(R.drawable.typelnfni)
            eggView.setImageResource(R.drawable.eggsparumong)
            goldView.text = "20/분"
            habitatView.text = "천둥, 불, 얼음"
            sellView.text = "1,850,000"
            timeView.text = "28시간45분"
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
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "폭시",
                    R.drawable.foxy
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "울리",
                    R.drawable.uli
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "푸드덕",
                    R.drawable.puddeok
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                ),JohapData(
                    R.drawable.nuni,
                    "누니",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.puddeok,
                    "푸드덕",
                    R.drawable.plus,
                    "채피",
                    R.drawable.chepy
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.rairu,
                    "라이루",
                    R.drawable.plus,
                    "푸드덕",
                    R.drawable.puddeok
                ),JohapData(
                    R.drawable.marina,
                    "마리나",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "서퍼용") {
            uparuView.setImageResource(R.drawable.sufferyong2)
            typeView.setImageResource(R.drawable.typewanwinl)
            eggView.setImageResource(R.drawable.eggsufferyong)
            goldView.text = "20/분"
            habitatView.text = "물, 바람, 천둥"
            sellView.text = "1,850,000"
            timeView.text = "25시간"
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
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                ),JohapData(
                    R.drawable.shellru,
                    "쉘루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.shujel,
                    "슈젤",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.purni,
                    "푸르니",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.shellru,
                    "쉘루",
                    R.drawable.plus,
                    "와이키",
                    R.drawable.whyki
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "듀파",
                    R.drawable.dupa
                ),JohapData(
                    R.drawable.firu,
                    "파이루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.shujel,
                    "슈젤",
                    R.drawable.plus,
                    "타마미",
                    R.drawable.tamami
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "레이") {
            uparuView.setImageResource(R.drawable.rey)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.eggrey)
            goldView.text = "35/분"
            habitatView.text = "빛"
            sellView.text = "4,000,000"
            timeView.text = "36시간"
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
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "파이루",
                    R.drawable.firu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "히포포",
                    R.drawable.hipopo
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.poter,
                    "포터",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.koku,
                    "코쿠",
                    R.drawable.plus,
                    "와우",
                    R.drawable.wow
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "샤크곤",
                    R.drawable.sharkgon
                ),JohapData(
                    R.drawable.flameru,
                    "플라메루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.resco,
                    "레스코",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.nyao,
                    "냐오",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dorong,
                    "도롱",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.shasha,
                    "샤샤",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                ),JohapData(
                    R.drawable.sparumong,
                    "스파루몽",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.polaru,
                    "폴라루",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "미요",
                    R.drawable.miyo
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "버프루",
                    R.drawable.buffru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "와이키",
                    R.drawable.whyki
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "울리",
                    R.drawable.uli
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "샤샤",
                    R.drawable.shasha
                ),JohapData(
                    R.drawable.rairu,
                    "라이루",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.chupiking,
                    "츄파이킹",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.polaru,
                    "폴라루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "쉐도우") {
            uparuView.setImageResource(R.drawable.shadow)
            typeView.setImageResource(R.drawable.typedark)
            eggView.setImageResource(R.drawable.eggshadow)
            goldView.text = "35/분"
            habitatView.text = "어둠"
            sellView.text = "4,000,000"
            timeView.text = "36시간"
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
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "하쿠루",
                    R.drawable.hakuru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "파이루",
                    R.drawable.firu
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "보보",
                    R.drawable.bobo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "히포포",
                    R.drawable.hipopo
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.poter,
                    "포터",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.koku,
                    "코쿠",
                    R.drawable.plus,
                    "와우",
                    R.drawable.wow
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "샤크곤",
                    R.drawable.sharkgon
                ),JohapData(
                    R.drawable.flameru,
                    "플라메루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.resco,
                    "레스코",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.nyao,
                    "냐오",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.dorong,
                    "도롱",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.shasha,
                    "샤샤",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                ),JohapData(
                    R.drawable.sparumong,
                    "스파루몽",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.polaru,
                    "폴라루",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "미요",
                    R.drawable.miyo
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "버프루",
                    R.drawable.buffru
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "와이키",
                    R.drawable.whyki
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "울리",
                    R.drawable.uli
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "샤샤",
                    R.drawable.shasha
                ),JohapData(
                    R.drawable.rairu,
                    "라이루",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.chupiking,
                    "츄파이킹",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.polaru,
                    "폴라루",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "루핀") {
            uparuView.setImageResource(R.drawable.rupin)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.eggrupin)
            goldView.text = "42/분"
            habitatView.text = "빛"
            sellView.text = "4,500,000"
            timeView.text = "40시간"
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
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.bau,
                    "바우",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.sparumong,
                    "스파루몽",
                    R.drawable.plus,
                    "봉봉",
                    R.drawable.bongbong
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "쉘루",
                    R.drawable.shellru
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.bobo,
                    "보보",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "엘리",
                    R.drawable.eli
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "라쿠",
                    R.drawable.raku
                ),JohapData(
                    R.drawable.yongyong,
                    "용용",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "크래피",
                    R.drawable.crapi
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "히포포",
                    R.drawable.hipopo
                ),JohapData(
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "봉봉",
                    R.drawable.bongbong
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스컬루") {
            uparuView.setImageResource(R.drawable.skulru2)
            typeView.setImageResource(R.drawable.typelnwini)
            eggView.setImageResource(R.drawable.eggskulru)
            goldView.text = "23/분"
            habitatView.text = "천둥, 바람, 얼음"
            sellView.text = "2,000,000"
            timeView.text = "25시간"
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
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.tigo,
                    "티고",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "메리") {
            uparuView.setImageResource(R.drawable.merry2)
            typeView.setImageResource(R.drawable.typefngrng)
            eggView.setImageResource(R.drawable.eggmerry)
            goldView.text = "19/분"
            habitatView.text = "불, 땅, 숲"
            sellView.text = "1,530,000"
            timeView.text = "22시간30분"
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
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.panpan,
                    "판판",
                    R.drawable.plus,
                    "프링",
                    R.drawable.pring
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "샤샤",
                    R.drawable.shasha
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "애플칙",
                    R.drawable.applechick
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "버비",
                    R.drawable.beobi
                ),JohapData(
                    R.drawable.baretsa,
                    "바렛사",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.pogisa,
                    "포기사",
                    R.drawable.plus,
                    "촘촘",
                    R.drawable.chomchom
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "샤샤",
                    R.drawable.shasha
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "애플칙",
                    R.drawable.applechick
                ),JohapData(
                    R.drawable.scoti,
                    "스코티",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.panpan,
                    "판판",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "쥬라용") {
            uparuView.setImageResource(R.drawable.jurayong2)
            typeView.setImageResource(R.drawable.typegrnlng)
            eggView.setImageResource(R.drawable.eggjurayong)
            goldView.text = "20/분"
            habitatView.text = "땅, 천둥, 숲"
            sellView.text = "1,550,000"
            timeView.text = "26시간30분"
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
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.dorong,
                    "도롱",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.samsam,
                    "삼삼",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.nuni,
                    "누니",
                    R.drawable.plus,
                    "로로",
                    R.drawable.roro
                ),JohapData(
                    R.drawable.orpeus,
                    "오르페우스",
                    R.drawable.plus,
                    "알리",
                    R.drawable.ali
                ),JohapData(
                    R.drawable.orpeus,
                    "오르페우스",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "큐피") {
            uparuView.setImageResource(R.drawable.cupi2)
            typeView.setImageResource(R.drawable.typemnwinf)
            eggView.setImageResource(R.drawable.eggcupi)
            goldView.text = "28/분"
            habitatView.text = "매직, 바람, 불"
            sellView.text = "2,205,000"
            timeView.text = "26시간"
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
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "파이루",
                    R.drawable.firu
                ),JohapData(
                    R.drawable.jello,
                    "젤로",
                    R.drawable.plus,
                    "고고",
                    R.drawable.gogo
                ),JohapData(
                    R.drawable.rodi,
                    "로디",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "램버트") {
            uparuView.setImageResource(R.drawable.rambert2)
            typeView.setImageResource(R.drawable.typewinwang)
            eggView.setImageResource(R.drawable.eggrambert)
            goldView.text = "25/분"
            habitatView.text = "바람, 물, 숲"
            sellView.text = "1,855,000"
            timeView.text = "28시간"
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
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "꼬부",
                    R.drawable.ggobu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "베르") {
            uparuView.setImageResource(R.drawable.berr2)
            typeView.setImageResource(R.drawable.typewanwingr)
            eggView.setImageResource(R.drawable.eggberr)
            goldView.text = "26/분"
            habitatView.text = "물, 바람, 땅"
            sellView.text = "1,960,000"
            timeView.text = "28시간30분"
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
                    R.drawable.bobo,
                    "보보",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "러빗") {
            uparuView.setImageResource(R.drawable.loveit2)
            typeView.setImageResource(R.drawable.typemninl)
            eggView.setImageResource(R.drawable.eggloveit)
            goldView.text = "20/분"
            habitatView.text = "매직, 얼음, 천둥"
            sellView.text = "1,850,000"
            timeView.text = "28시간"
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
                    R.drawable.candylove,
                    "캔디럽",
                    R.drawable.plus,
                    "젤로",
                    R.drawable.jello
                ),JohapData(
                    R.drawable.candylove,
                    "캔디럽",
                    R.drawable.plus,
                    "아르키",
                    R.drawable.arki
                ),JohapData(
                    R.drawable.candylove,
                    "캔디럽",
                    R.drawable.plus,
                    "푸스",
                    R.drawable.pus
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "골디") {
            uparuView.setImageResource(R.drawable.goldi)
            typeView.setImageResource(R.drawable.typegold)
            eggView.setImageResource(R.drawable.egggoldi)
            goldView.text = "53/분"
            habitatView.text = "황금"
            sellView.text = "5,000,000"
            timeView.text = "48시간"
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
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.bau,
                    "바우",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.raply,
                    "라플리",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.foxy,
                    "폭시",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "봉봉",
                    R.drawable.bongbong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "원더드래곤",
                    R.drawable.wonderdragon
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "봉봉",
                    R.drawable.bongbong
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.boradoru,
                    "보라도루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "머쉬룸",
                    R.drawable.mushroom
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "다크골디") {
            uparuView.setImageResource(R.drawable.darkgoldi)
            typeView.setImageResource(R.drawable.typegold)
            eggView.setImageResource(R.drawable.egggoldi)
            goldView.text = "55/분"
            habitatView.text = "황금"
            sellView.text = "6,000,000"
            timeView.text = "48시간"
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
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.bau,
                    "바우",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.bau,
                    "바우",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "폭시",
                    R.drawable.foxy
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.yuni,
                    "유니",
                    R.drawable.plus,
                    "폭시",
                    R.drawable.foxy
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.cray,
                    "크레이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "크로노") {
            uparuView.setImageResource(R.drawable.krono)
            typeView.setImageResource(R.drawable.typedark)
            eggView.setImageResource(R.drawable.eggkrono)
            goldView.text = "60/분"
            habitatView.text = "어둠"
            sellView.text = "6,500,000"
            timeView.text = "42시간"
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
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                ),JohapData(
                    R.drawable.totoru,
                    "토토루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "고디움",
                    R.drawable.godium
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "원더드래곤",
                    R.drawable.wonderdragon
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.shasha,
                    "샤샤",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.sparumong,
                    "스파루몽",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.eli,
                    "엘리",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.sufferyong,
                    "서퍼용",
                    R.drawable.plus,
                    "메리",
                    R.drawable.merry
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "블랙아피스") {
            uparuView.setImageResource(R.drawable.blackapis2)
            typeView.setImageResource(R.drawable.typedark)
            eggView.setImageResource(R.drawable.eggblackapis)
            goldView.text = "80/분"
            habitatView.text = "어둠"
            sellView.text = "정보없음"
            timeView.text = "47시간"
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
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "버터핀",
                    R.drawable.butterfin
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "래리",
                    R.drawable.rari
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.shasha,
                    "샤샤",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.sparumong,
                    "스파루몽",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.sufferyong,
                    "서퍼용",
                    R.drawable.plus,
                    "메리",
                    R.drawable.merry
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "루미온") {
            uparuView.setImageResource(R.drawable.rumion2)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.eggrumion)
            goldView.text = "42/분"
            habitatView.text = "빛"
            sellView.text = "정보없음"
            timeView.text = "40시간"
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
                    R.drawable.dorong,
                    "도롱",
                    R.drawable.plus,
                    "단비",
                    R.drawable.danbi
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.crapi,
                    "크래피",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.purni,
                    "푸르니",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "애플칙") {
            uparuView.setImageResource(R.drawable.applechick)
            typeView.setImageResource(R.drawable.typegngr)
            eggView.setImageResource(R.drawable.eggapplechick)
            goldView.text = "14/분"
            habitatView.text = "숲, 땅"
            sellView.text = "1,250,000"
            timeView.text = "9시간57분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.bibi,
                    "비비",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "바렛사",
                    R.drawable.baretsa
                ),JohapData(
                    R.drawable.dudeoru,
                    "두더루",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.pring,
                    "프링",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.samsam,
                    "삼삼",
                    R.drawable.plus,
                    "동크",
                    R.drawable.donk
                ),JohapData(
                    R.drawable.pogisa,
                    "포기사",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "버비",
                    R.drawable.beobi
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "버비",
                    R.drawable.beobi
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스파인") {
            uparuView.setImageResource(R.drawable.spain)
            typeView.setImageResource(R.drawable.typewinl)
            eggView.setImageResource(R.drawable.eggspain)
            goldView.text = "14/분"
            habitatView.text = "바람, 천둥"
            sellView.text = "1,350,000"
            timeView.text = "10시간37분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.skungki,
                    "스컹키",
                    R.drawable.plus,
                    "메메",
                    R.drawable.meme
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.scoti,
                    "스코티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.skungki,
                    "스컹키",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "와우",
                    R.drawable.wow
                ),JohapData(
                    R.drawable.raku,
                    "라쿠",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.bobo,
                    "보보",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "스파인S") {
            uparuView.setImageResource(R.drawable.spain22)
            typeView.setImageResource(R.drawable.typewinl)
            eggView.setImageResource(R.drawable.eggspain2)
            goldView.text = "14/분"
            habitatView.text = "바람, 천둥"
            sellView.text = "1,350,000"
            timeView.text = "10시간37분"
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
        else if (changeName == "고디움") {
            uparuView.setImageResource(R.drawable.godium)
            typeView.setImageResource(R.drawable.typefnwi)
            eggView.setImageResource(R.drawable.egggodium)
            goldView.text = "15/분"
            habitatView.text = "불, 바람"
            sellView.text = "1,530,000"
            timeView.text = "10시간57분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.hipopo,
                    "히포포",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.koku,
                    "코쿠",
                    R.drawable.plus,
                    "돌리",
                    R.drawable.doli
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "와우",
                    R.drawable.wow
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "용가루",
                    R.drawable.yongaru
                ),JohapData(
                    R.drawable.panpan,
                    "판판",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "채피",
                    R.drawable.chepy
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "포기사",
                    R.drawable.pogisa
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "투투",
                    R.drawable.tutu
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "기로로",
                    R.drawable.giroro
                ),JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "미코",
                    R.drawable.miko
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.gogo,
                    "고고",
                    R.drawable.plus,
                    "몽키루",
                    R.drawable.mongkiru
                ),JohapData(
                    R.drawable.donk,
                    "동크",
                    R.drawable.plus,
                    "스파인",
                    R.drawable.spain
                ),JohapData(
                    R.drawable.resco,
                    "레스코",
                    R.drawable.plus,
                    "돌리",
                    R.drawable.doli
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "오미야콘") {
            uparuView.setImageResource(R.drawable.omiyacon)
            typeView.setImageResource(R.drawable.typeingr)
            eggView.setImageResource(R.drawable.eggomiyacon)
            goldView.text = "16/분"
            habitatView.text = "얼음, 땅"
            sellView.text = "1,710,000"
            timeView.text = "11시간37분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dori,
                    "도리",
                    R.drawable.plus,
                    "미코",
                    R.drawable.miko
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "또루루",
                    R.drawable.ddoruru
                ),JohapData(
                    R.drawable.yongaru,
                    "용가루",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.chupa,
                    "츄파",
                    R.drawable.plus,
                    "두더루",
                    R.drawable.dudeoru
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.pepe,
                    "페페",
                    R.drawable.plus,
                    "두무라이",
                    R.drawable.dumurai
                ),JohapData(
                    R.drawable.alroha,
                    "알로하",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.wow,
                    "와우",
                    R.drawable.plus,
                    "아르망",
                    R.drawable.armang
                ),JohapData(
                    R.drawable.mumu,
                    "무무",
                    R.drawable.plus,
                    "유니",
                    R.drawable.yuni
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "티고",
                    R.drawable.tigo
                ),JohapData(
                    R.drawable.hipopo,
                    "히포포",
                    R.drawable.plus,
                    "빙고",
                    R.drawable.bingo
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "포리",
                    R.drawable.pori
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "뿌루루",
                    R.drawable.bbururu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "오르페우스") {
            uparuView.setImageResource(R.drawable.orpeus)
            typeView.setImageResource(R.drawable.typegrnl)
            eggView.setImageResource(R.drawable.eggorpeus)
            goldView.text = "17/분"
            habitatView.text = "땅, 천둥"
            sellView.text = "1,890,000"
            timeView.text = "11시간57분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.buffru,
                    "버프루",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.chichi,
                    "치치",
                    R.drawable.plus,
                    "펌키",
                    R.drawable.pumki
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "도리",
                    R.drawable.dori
                ),JohapData(
                    R.drawable.munguru,
                    "뭉구루",
                    R.drawable.plus,
                    "우루루",
                    R.drawable.ururu
                ),JohapData(
                    R.drawable.dumurai,
                    "두무라이",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.koka,
                    "코카",
                    R.drawable.plus,
                    "촘촘",
                    R.drawable.chomchom
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "빙고",
                    R.drawable.bingo
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.boradoru,
                    "보라도루",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.ddoruru,
                    "또루루",
                    R.drawable.plus,
                    "용용",
                    R.drawable.yongyong
                ),JohapData(
                    R.drawable.daram,
                    "다람",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.meme,
                    "메메",
                    R.drawable.plus,
                    "뭉구루",
                    R.drawable.munguru
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "푸르니",
                    R.drawable.purni
                ),JohapData(
                    R.drawable.butterfin,
                    "버터핀",
                    R.drawable.plus,
                    "무무",
                    R.drawable.mumu
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "피코") {
            uparuView.setImageResource(R.drawable.piko2)
            typeView.setImageResource(R.drawable.typewangnl)
            eggView.setImageResource(R.drawable.eggpiko)
            goldView.text = "30/분"
            habitatView.text = "물, 숲, 천둥"
            sellView.text = "2,000,000"
            timeView.text = "27시간"
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
        else if (changeName == "샤샤") {
            uparuView.setImageResource(R.drawable.shasha2)
            typeView.setImageResource(R.drawable.typegrninl)
            eggView.setImageResource(R.drawable.eggshasha)
            goldView.text = "30/분"
            habitatView.text = "땅, 얼음, 천둥"
            sellView.text = "2,000,000"
            timeView.text = "27시간"
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
        else if (changeName == "새치미") {
            uparuView.setImageResource(R.drawable.sechimi2)
            typeView.setImageResource(R.drawable.typeinwinf)
            eggView.setImageResource(R.drawable.eggsechimi)
            goldView.text = "30/분"
            habitatView.text = "얼음, 바람, 불"
            sellView.text = "2,000,000"
            timeView.text = "27시간"
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
        else if (changeName == "렘렘") {
            uparuView.setImageResource(R.drawable.remrem2)
            typeView.setImageResource(R.drawable.typewaninm)
            eggView.setImageResource(R.drawable.eggremrem)
            goldView.text = "30/분"
            habitatView.text = "물, 얼음, 매직"
            sellView.text = "2,000,000"
            timeView.text = "27시간"
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
        else if (changeName == "원더드래곤") {
            uparuView.setImageResource(R.drawable.wonderdragon)
            typeView.setImageResource(R.drawable.typelnwinwa)
            eggView.setImageResource(R.drawable.eggwonderdragon)
            goldView.text = "19/분"
            habitatView.text = "천둥, 바람, 물"
            sellView.text = "2,070,000"
            timeView.text = "20시간17분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.krang,
                    "크랑",
                    R.drawable.plus,
                    "다람",
                    R.drawable.daram
                ),JohapData(
                    R.drawable.nyao,
                    "냐오",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "고디움",
                    R.drawable.godium
                ),JohapData(
                    R.drawable.nyao,
                    "냐오",
                    R.drawable.plus,
                    "폴라루",
                    R.drawable.polaru
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "우파루파",
                    R.drawable.uparupa
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.pupu,
                    "푸푸",
                    R.drawable.plus,
                    "냐오",
                    R.drawable.nyao
                ),JohapData(
                    R.drawable.bobo,
                    "보보",
                    R.drawable.plus,
                    "코카",
                    R.drawable.koka
                ),JohapData(
                    R.drawable.gururu,
                    "구루루",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.whyki,
                    "와이키",
                    R.drawable.plus,
                    "도도",
                    R.drawable.dodo
                ),JohapData(
                    R.drawable.beti,
                    "베티",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                ),JohapData(
                    R.drawable.giroro,
                    "기로로",
                    R.drawable.plus,
                    "크랑",
                    R.drawable.krang
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "슈젤",
                    R.drawable.shujel
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "유리온") {
            uparuView.setImageResource(R.drawable.yurion)
            typeView.setImageResource(R.drawable.typewani)
            eggView.setImageResource(R.drawable.eggyurion)
            goldView.text = "15/분"
            habitatView.text = "물, 얼음"
            sellView.text = "1,710,000"
            timeView.text = "11시간37분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "츄파",
                    R.drawable.chupa
                ),JohapData(
                    R.drawable.haerong,
                    "해롱",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "베티",
                    R.drawable.beti
                ),JohapData(
                    R.drawable.mongkiru,
                    "몽키루",
                    R.drawable.plus,
                    "토드",
                    R.drawable.tod
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "벳시",
                    R.drawable.betsi
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                ),JohapData(
                    R.drawable.omiyacon,
                    "오미야콘",
                    R.drawable.plus,
                    "샤크곤",
                    R.drawable.sharkgon
                ),JohapData(
                    R.drawable.totoru,
                    "토토루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.hermi,
                    "헤르미",
                    R.drawable.plus,
                    "펜리루",
                    R.drawable.penriru
                ),JohapData(
                    R.drawable.shellru,
                    "쉘루",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.sharkgon,
                    "샤크곤",
                    R.drawable.plus,
                    "타마미",
                    R.drawable.tamami
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "로사",
                    R.drawable.rosa
                ),JohapData(
                    R.drawable.ururu,
                    "우루루",
                    R.drawable.plus,
                    "쉘루",
                    R.drawable.shellru
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "포포모") {
            uparuView.setImageResource(R.drawable.popomo)
            typeView.setImageResource(R.drawable.typefngnwa)
            eggView.setImageResource(R.drawable.eggpopomo)
            goldView.text = "19/분"
            habitatView.text = "불, 숲, 물"
            sellView.text = "2,070,000"
            timeView.text = "20시간17분"
            val newDataList = arrayListOf(
                JohapData(
                    R.drawable.dupa,
                    "듀파",
                    R.drawable.plus,
                    "라플리",
                    R.drawable.raply
                ),JohapData(
                    R.drawable.bbururu,
                    "뿌루루",
                    R.drawable.plus,
                    "찡요",
                    R.drawable.jjingyo
                ),JohapData(
                    R.drawable.pori,
                    "포리",
                    R.drawable.plus,
                    "비비",
                    R.drawable.bibi
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "고대신룡") {
            uparuView.setImageResource(R.drawable.godaesinyong)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.egggodaesinyong)
            goldView.text = "53/분"
            habitatView.text = "빛"
            sellView.text = "5,000,000"
            timeView.text = "35시간57분"
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
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                ),JohapData(
                    R.drawable.totoru,
                    "토토루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "고디움",
                    R.drawable.godium
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "원더드래곤",
                    R.drawable.wonderdragon
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "다크닉스") {
            uparuView.setImageResource(R.drawable.darknicks)
            typeView.setImageResource(R.drawable.typedark)
            eggView.setImageResource(R.drawable.eggdarknicks)
            goldView.text = "53/분"
            habitatView.text = "어둠"
            sellView.text = "5,000,000"
            timeView.text = "35시간57분"
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
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "보라도루",
                    R.drawable.boradoru
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "페페",
                    R.drawable.pepe
                ),JohapData(
                    R.drawable.skulru,
                    "스컬루",
                    R.drawable.plus,
                    "푸푸",
                    R.drawable.pupu
                ),JohapData(
                    R.drawable.caterfly,
                    "캐터플라이",
                    R.drawable.plus,
                    "치치",
                    R.drawable.chichi
                ),JohapData(
                    R.drawable.chepy,
                    "채피",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "토토",
                    R.drawable.toto
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.pumki,
                    "펌키",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "헤르미",
                    R.drawable.hermi
                ),JohapData(
                    R.drawable.totoru,
                    "토토루",
                    R.drawable.plus,
                    "해롱",
                    R.drawable.haerong
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "루돌",
                    R.drawable.rudol
                ),JohapData(
                    R.drawable.rosa,
                    "로사",
                    R.drawable.plus,
                    "판판",
                    R.drawable.panpan
                ),JohapData(
                    R.drawable.toto,
                    "토토",
                    R.drawable.plus,
                    "스컬루",
                    R.drawable.skulru
                ),JohapData(
                    R.drawable.piko,
                    "피코",
                    R.drawable.plus,
                    "고디움",
                    R.drawable.godium
                ),JohapData(
                    R.drawable.bongbong,
                    "봉봉",
                    R.drawable.plus,
                    "원더드래곤",
                    R.drawable.wonderdragon
                ),JohapData(
                    R.drawable.dodo,
                    "도도",
                    R.drawable.plus,
                    "오미야콘",
                    R.drawable.omiyacon
                ),JohapData(
                    R.drawable.spain,
                    "스파인",
                    R.drawable.plus,
                    "레스코",
                    R.drawable.resco
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "바우",
                    R.drawable.bau
                ),JohapData(
                    R.drawable.penriru,
                    "펜리루",
                    R.drawable.plus,
                    "피코",
                    R.drawable.piko
                ),JohapData(
                    R.drawable.rudol,
                    "루돌",
                    R.drawable.plus,
                    "크레이",
                    R.drawable.cray
                )
            )
            recyclerView.adapter = CustomAdapterJohap(this, newDataList)
        }
        else if (changeName == "고대신룡S") {
            uparuView.setImageResource(R.drawable.godaesinyong22)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.egggodaesinyong2)
            goldView.text = "53/분"
            habitatView.text = "빛"
            sellView.text = "5,000,000"
            timeView.text = "35시간57분"
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
            dialog.show() // 팝업 다이얼로그 표시
        }
        else if (changeName == "스텔라") {
            uparuView.setImageResource(R.drawable.stella2)
            typeView.setImageResource(R.drawable.typelight)
            eggView.setImageResource(R.drawable.eggstella)
            goldView.text = "55/분"
            habitatView.text = "빛"
            sellView.text = "정보없음"
            timeView.text = "48시간"
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
        else if (changeName == "머쉬룸") {
            uparuView.setImageResource(R.drawable.mushroom2)
            typeView.setImageResource(R.drawable.typegrnf)
            eggView.setImageResource(R.drawable.eggmushroom)
            goldView.text = "14/분"
            habitatView.text = "땅, 불"
            sellView.text = "1,350,000"
            timeView.text = "10시간37분"
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
        else if (changeName == "샤크곤") {
            uparuView.setImageResource(R.drawable.sharkgon2)
            typeView.setImageResource(R.drawable.typewani)
            eggView.setImageResource(R.drawable.eggsharkgon)
            goldView.text = "16/분"
            habitatView.text = "물, 얼음"
            sellView.text = "1,350,000"
            timeView.text = "10시간37분"
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
        else if (changeName == "애플칙S") {
            uparuView.setImageResource(R.drawable.applechick22)
            typeView.setImageResource(R.drawable.typegngr)
            eggView.setImageResource(R.drawable.eggapplechick2)
            goldView.text = "14/분"
            habitatView.text = "숲, 땅"
            sellView.text = "1,250,000"
            timeView.text = "9시간57분"
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