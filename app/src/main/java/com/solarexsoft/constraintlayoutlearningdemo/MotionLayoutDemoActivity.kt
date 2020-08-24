package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.solarexsoft.constraintlayoutlearningdemo.motion.MotionTransition

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:24/2020/8/24
 *    Desc:
 * </pre>
 */
class MotionLayoutDemoActivity: BaseDemoActivity() {
    override fun layoutId(): Int = R.layout.activity_motion
    fun onClick(view: View) {
        val intent = when (view.id) {
            R.id.motion_transition -> {
                Intent(this, MotionTransition::class.java)
            }
            else -> {
                Intent()
            }
        }
        startActivity(intent)
    }
}
