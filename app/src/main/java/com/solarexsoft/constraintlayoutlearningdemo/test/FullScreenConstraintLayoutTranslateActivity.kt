package com.solarexsoft.constraintlayoutlearningdemo.test

import android.animation.ObjectAnimator
import android.graphics.Point
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.core.view.updateLayoutParams
import com.solarexsoft.constraintlayoutlearningdemo.BaseDemoActivity
import com.solarexsoft.constraintlayoutlearningdemo.R
import kotlinx.android.synthetic.main.full_screen_constraint_translate.*

/**
 * Created by houruhou on 2020/9/21/8:31 PM
 * Desc:
 */
class FullScreenConstraintLayoutTranslateActivity : BaseDemoActivity() {
    override fun layoutId(): Int = R.layout.full_screen_constraint_translate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val point = Point()
        windowManager.defaultDisplay.getSize(point)
        content.updateLayoutParams<ViewGroup.LayoutParams> {
            width = 2*point.x
        }
        iv1.setOnClickListener {
            val translateXAnim = ObjectAnimator.ofFloat(
                content, View.TRANSLATION_X,
                0f, -point.x.toFloat()
            )
            translateXAnim.duration = 300
            translateXAnim.start()
        }
    }
}