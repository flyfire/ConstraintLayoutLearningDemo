package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.solarexsoft.constraintlayoutlearningdemo.motion.*

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
            R.id.motion_basic -> {
                Intent(this, MotionBasic::class.java)
            }
            R.id.motion_custom_attribute -> {
                Intent(this, MotionCustomAttribute::class.java)
            }
            R.id.motion_keyframeset_keyattribute -> {
                Intent(this, MotionKeyAttribute::class.java)
            }
            R.id.motion_keyframeset_keyposition -> {
                Intent(this, MotionKeyPosition::class.java)
            }
            R.id.motion_keyframeset_keycycle -> {
                Intent(this, MotionKeyCycle::class.java)
            }
            R.id.motion_coordinatelayout -> {
                Intent(this, MotionCoordinateLayout::class.java)
            }
            else -> {
                Intent()
            }
        }
        startActivity(intent)
    }
}
