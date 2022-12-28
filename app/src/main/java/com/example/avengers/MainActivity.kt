package com.example.avengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var titlename:String?=  "chelsea"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll)
        if(intent != null){
            titlename = intent.getStringExtra("Name")
        }
        title =titlename
    }



}