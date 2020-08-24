package com.solarexsoft.constraintlayoutlearningdemo.motion

import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.google.android.material.appbar.AppBarLayout
import com.solarexsoft.constraintlayoutlearningdemo.BaseDemoActivity
import com.solarexsoft.constraintlayoutlearningdemo.R

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 23:51/2020/8/24
 *    Desc:
 * </pre>
 */

class MotionCoordinateLayout : BaseDemoActivity() {
    override fun layoutId(): Int = R.layout.motion_coordinate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coordinateMotion()
    }
    private fun coordinateMotion() {
        val appBarLayout: AppBarLayout = findViewById(R.id.appbar_layout)
        val motionLayout: MotionLayout = findViewById(R.id.motion_layout)

        val listener = AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
            val seekPosition = -verticalOffset / appBarLayout.totalScrollRange.toFloat()
            motionLayout.progress = seekPosition
        }

        appBarLayout.addOnOffsetChangedListener(listener)
    }
}