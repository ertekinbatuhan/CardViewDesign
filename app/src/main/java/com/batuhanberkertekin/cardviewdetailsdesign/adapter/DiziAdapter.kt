package com.batuhanberkertekin.cardviewdetailsdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.batuhanberkertekin.cardviewdetailsdesign.Data.Dizi
import com.batuhanberkertekin.cardviewdetailsdesign.R

class DiziAdapter( private val context : Context , private val myList :List<Dizi>) :
    RecyclerView.Adapter<DiziAdapter.CardDesignObject>()
{



       //alt class 
    inner  class CardDesignObject(view :View) : RecyclerView.ViewHolder(view){



        var imageView : ImageView
        var textBaslik : TextView
        var textPrice : TextView
        var buyButton : Button

        init {

            imageView = view.findViewById(R.id.imageView)
            textBaslik = view.findViewById(R.id.textBaslik)
            textPrice = view.findViewById(R.id.textPrice)
            buyButton = view.findViewById(R.id.buyButton)


        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignObject {
          val design = LayoutInflater.from(context).inflate(R.layout.design,parent,false)

        return  CardDesignObject(design)

    }

    override fun onBindViewHolder(holder: CardDesignObject, position: Int) {

        val dizi = myList[position]

        holder.imageView.setImageResource(dizi.picture)
        holder.textBaslik.text = dizi.name
        holder.textPrice.text = "${dizi.price} TL"

        //dinamik olarak resim gösterebiliriz

        //holder.imageView.setImageResource(
          //  context.resources.getIdentifier(dizi.name,"drawable",context.packageName))

        holder.buyButton.setOnClickListener {
            Toast.makeText(context,"${dizi.name} Sepete Eklendi",Toast.LENGTH_LONG).show()
        }


    }

    override fun getItemCount(): Int {
       return  myList.size
    }


}