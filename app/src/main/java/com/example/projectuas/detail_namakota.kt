package com.example.projectuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_namakota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_namakota)

        supportActionBar?.title = "Biodata Lengkap Nama Kota"

        val namakota = intent.getParcelableExtra<namakota>(MainActivity.INTENT_PARCELABLE)

        val imgnamakota = findViewById<ImageView>(R.id.img_item_photo)
        val namenamakota = findViewById<TextView>(R.id.tv_item_name)
        val descnamakota = findViewById<TextView>(R.id.tv_item_description)
        val desc2namakota = findViewById<TextView>(R.id.tv_item_description2)

        imgnamakota.setImageResource(namakota?.imgnamakota!!)
        namenamakota.text = namakota.namenamakota
        descnamakota.text = namakota.descnamakota
        desc2namakota.text = namakota.desc2namakota
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }

}