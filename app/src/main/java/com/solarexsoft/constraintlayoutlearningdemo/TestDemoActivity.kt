package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Intent
import android.view.View
import com.solarexsoft.constraintlayoutlearningdemo.test.FullScreenConstraintLayoutTranslateActivity
import com.solarexsoft.constraintlayoutlearningdemo.test.FullScreenTranslateActivity

/**
 * Created by houruhou on 2020/9/21/8:09 PM
 * Desc:
 */
class TestDemoActivity : BaseDemoActivity() {
    override fun layoutId(): Int = R.layout.activity_test

    fun onClick(view: View) {
        val intent = when (view.id) {
            R.id.fullscreen_translate -> {
                Intent(this, FullScreenTranslateActivity::class.java)
            }
            R.id.fullscreen_constraint_translate -> {
                Intent(this, FullScreenConstraintLayoutTranslateActivity::class.java)
            }
            else -> {
                Intent()
            }
        }
        startActivity(intent)
    }
}