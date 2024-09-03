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

    }
}