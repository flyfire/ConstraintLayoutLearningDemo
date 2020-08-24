package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val intent: Intent = when (view.id) {
            R.id.constraint -> {
                Intent(this, ConstraintLayoutDemoActivity::class.java)
            }
            R.id.transition -> {
                Intent(this, TransitionDemoActivity::class.java)
            }
            R.id.motion -> {
                Intent(this, MotionLayoutDemoActivity::class.java)
            }
            else -> {
                Intent()
            }
        }
        startActivity(intent)
    }
}
