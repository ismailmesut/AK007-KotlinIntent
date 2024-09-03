package com.ismailmesutmujde.kotlinintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMainActivity.root
        setContentView(view)

        println("onCreate executed")
    }

    override fun onStart() {
        super.onStart()
        println("onStart executed")
        //bindingMainActivity.editText.setText("")
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executed")
    }




    fun test() {

    }
    fun test2() {

    }

    fun next(view: View) {
        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name", bindingMainActivity.editText.text.toString())
        intent.putExtra("myinteger", 10)
        startActivity(intent)
        finish()
    }
}