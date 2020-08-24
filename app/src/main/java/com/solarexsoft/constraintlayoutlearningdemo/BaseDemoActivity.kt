package com.solarexsoft.constraintlayoutlearningdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:54/2020/8/24
 *    Desc:
 * </pre>
 */

abstract class BaseDemoActivity : AppCompatActivity() {
    abstract fun layoutId(): Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
    }
}