package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewAnimationUtils
import androidx.constraintlayout.widget.ConstraintHelper
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.hypot

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 22:51/2020/8/23
 *    Desc:
 * </pre>
 */
class CircleRevealVirtualHelper @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintHelper(context, attrs, defStyleAttr) {
    override fun updatePostLayout(container: ConstraintLayout?) {
        val container = container ?: return
        referencedIds.forEach {
            val view = container.findViewById<View>(it)
            val radius = hypot(view.width.toFloat(), view.height.toFloat())
            val animator =
                ViewAnimationUtils.createCircularReveal(view, 0, 0, 0f, radius)
            animator.duration = 3000
            animator.start()
        }
    }
}