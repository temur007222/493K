package com.example.a493k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    fun initViews(){
        imageView = findViewById(R.id.iv_image)
        val button: Button = findViewById(R.id.b_button)

        button.setOnClickListener(View.OnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.together)
            imageView.startAnimation(animation)
        })
    }
}