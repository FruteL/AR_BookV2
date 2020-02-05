package com.KanPa.AR_book

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TailsList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tails_list)

    }

    fun goBack(view: View){
        val toList = Intent (this,MainActivity::class.java)
        startActivity(toList)
    }

    fun playGame(view: View){
        val toList = Intent (this,UnityPlayerActivity::class.java)
        startActivity(toList)
    }
}
