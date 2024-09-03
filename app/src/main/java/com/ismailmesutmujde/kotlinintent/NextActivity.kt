package com.ismailmesutmujde.kotlinintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var bindingNextActivity: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingNextActivity = ActivityNextBinding.inflate(layoutInflater)
        val view = bindingNextActivity.root
        setContentView(view)

        val intentFromMain = intent  //getIntent()
        val name = intentFromMain.getStringExtra("name")
        val myInteger = intentFromMain.getIntExtra("myInteger", 10)
        println(myInteger)
        bindingNextActivity.nameText.text = "Name : ${name}"
    }
}