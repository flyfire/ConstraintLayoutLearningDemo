package com.solarexsoft.constraintlayoutlearningdemo.test

import android.animation.ObjectAnimator
import android.graphics.Point
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.updateLayoutParams
import com.solarexsoft.constraintlayoutlearningdemo.BaseDemoActivity
import com.solarexsoft.constraintlayoutlearningdemo.R
import kotlinx.android.synthetic.main.full_screen_translate_test.*

/**
 * Created by houruhou on 2020/9/21/7:58 PM
 * Desc:
 */
class FullScreenTranslateActivity : BaseDemoActivity() {
    private var iv1Width = 0
    override fun layoutId(): Int {
        return  R.layout.full_screen_translate_test
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val point = Point()
        windowManager.defaultDisplay.getSize(point)
        content.updateLayoutParams<ViewGroup.LayoutParams> {
            width = 2 * point.x
        }
        iv1.updateLayoutParams<LinearLayout.LayoutParams> {
            width = point.x
        }
        iv2.updateLayoutParams<LinearLayout.LayoutParams> {
            width = point.x
        }
        iv1.setOnClickListener {
            val translateYAnimator = ObjectAnimator.ofFloat(
                content, View.TRANSLATION_X,
                0f, -point.x.toFloat()
            )
            translateYAnimator.duration = 300
            translateYAnimator.start()
        }
    }
}