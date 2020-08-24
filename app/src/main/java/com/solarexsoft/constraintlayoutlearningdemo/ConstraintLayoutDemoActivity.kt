package com.solarexsoft.constraintlayoutlearningdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.solarexsoft.constraintlayoutlearningdemo.constraint.*

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 15:23/2020/8/24
 *    Desc:
 * </pre>
 */

class ConstraintLayoutDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
    }
    fun onClick(view: View) {
        val intent: Intent
        when (view.id) {
            R.id.center -> {
                intent = Intent(this, Center::class.java)
            }
            R.id.dimension_rules -> {
                intent = Intent(this, DimensionRules::class.java)
            }
            R.id.gone_margin -> {
                intent = Intent(this, GoneMargin::class.java)
            }
            R.id.bias -> {
                intent = Intent(this, Bias::class.java)
            }
            R.id.chains -> {
                intent = Intent(this, Chains::class.java)
            }
            R.id.weight -> {
                intent = Intent(this, Weight::class.java)
            }
            R.id.virtual_helper -> {
                intent = Intent(this, VirtualHelper::class.java)
            }
            R.id.custom_virtual_helper -> {
                intent = Intent(this, CustomVirtualHelper::class.java)
            }
            R.id.constraint_width -> {
                intent = Intent(this, ConstraintWidth::class.java)
            }
            R.id.aspect_ratio -> {
                intent = Intent(this, AspectRatio::class.java)
            }
            R.id.percent -> {
                intent = Intent(this, Percent::class.java)
            }
            R.id.circular_position -> {
                intent = Intent(this, CircularPosition::class.java)
            }
            R.id.negative_margin -> {
                intent = Intent(this, NegativeMargin::class.java)
            }
            else -> {
                intent = Intent()
            }
        }
        startActivity(intent)
    }
}