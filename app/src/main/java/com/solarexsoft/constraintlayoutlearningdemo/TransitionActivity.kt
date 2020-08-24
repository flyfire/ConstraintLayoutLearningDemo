package com.solarexsoft.constraintlayoutlearningdemo

import android.os.Bundle
import android.os.PersistableBundle
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.updateLayoutParams
import kotlinx.android.synthetic.main.transition_14.*
import java.util.concurrent.locks.ReentrantLock

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 07:56/2020/8/24
 *    Desc:
 * </pre>
 */

class TransitionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transition_14)
    }

    fun onClick(view: View) {
        TransitionManager.beginDelayedTransition(root)
        val set = ConstraintSet()
        set.clone(root)
        set.clear(R.id.avatar, ConstraintSet.START)
        set.connect(R.id.avatar, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END)
        set.applyTo(root)
    }
}