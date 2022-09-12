package com.batuhanberkertekin.cardviewdetailsdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.batuhanberkertekin.cardviewdetailsdesign.Data.Dizi
import com.batuhanberkertekin.cardviewdetailsdesign.adapter.DiziAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var  arrayList : ArrayList<Dizi>
    private lateinit var adapter : DiziAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.setHasFixedSize(true)











        recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val got = Dizi("Game of Thrones",99.9,R.drawable.gotnew)
        val house=Dizi("House of Dragon",89.9,R.drawable.houseofdargonnew)
        val yüzük =Dizi("Yüzükler Efendisi",79.9,R.drawable.yuzukler)
        val vikings = Dizi("Vikings",69.9,R.drawable.newvikings)
        val power = Dizi("Power of Rings",59.9,R.drawable.gucnew)
        val witcher = Dizi("Witcher",49.9,R.drawable.witchernew)


        arrayList = ArrayList()

        arrayList.add(got)
        arrayList.add(house)
        arrayList.add(yüzük)
        arrayList.add(vikings)
        arrayList.add(power)
        arrayList.add(witcher)

        adapter = DiziAdapter(this,arrayList)

        recyclerView.adapter = adapter

    }
}