package com.solarexsoft.constraintlayoutlearningdemo.motion

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import com.solarexsoft.constraintlayoutlearningdemo.BaseDemoActivity
import com.solarexsoft.constraintlayoutlearningdemo.R
import kotlinx.android.synthetic.main.movie_details_layout.*


/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 16:30/2020/8/24
 *    Desc:
 * </pre>
 */
class MotionTransition: BaseDemoActivity() {
    private val detailsSet = ConstraintSet()
    private val expandSet = ConstraintSet()
    private var isExpanded = false

    override fun layoutId(): Int = R.layout.movie_details_layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsSet.clone(constraint_layout)
        expandSet.clone(this, R.layout.movie_details_expand)
    }
    fun onClick(view: View) {
        val transition = ChangeBounds()
        transition.duration = 1000
        transition.interpolator = OvershootInterpolator()
        TransitionManager.beginDelayedTransition(constraint_layout, transition)
        isExpanded = if (isExpanded) {
            expandSet.applyTo(constraint_layout)
            false
        } else {
            detailsSet.applyTo(constraint_layout)
            true
        }
    }
}
 