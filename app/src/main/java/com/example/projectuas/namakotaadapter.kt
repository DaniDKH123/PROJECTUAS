package com.example.projectuas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class namakotaadapter (private val context: Context, private val namakota: List<namakota>, val listener: (namakota)-> Unit)
    : RecyclerView.Adapter<namakotaadapter.namakotaViewHolder>(){
    class namakotaViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgnamakota = view.findViewById<ImageView>(R.id.img_item_photo)
        val namenamakota = view.findViewById<TextView>(R.id.tv_item_name)
        val descnamakota = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(namakota: namakota, listener: (namakota) ->Unit) {
            imgnamakota.setImageResource(namakota.imgnamakota)
            namenamakota.text = namakota.namenamakota
            descnamakota.text = namakota.descnamakota
            itemView.setOnClickListener {
                listener(namakota)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): namakotaViewHolder {
        return namakotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_namakota, parent, false)
        )
    }

    override fun onBindViewHolder(holder: namakotaViewHolder, position: Int) {
        holder.bindView(namakota[position], listener)
    }

    override fun getItemCount(): Int = namakota.size
    }
