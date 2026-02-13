package com.github.kingjha13.mathapi

object SafeMath {

    fun safeDivide(a: Double, b: Double, default: Double = 0.0): Double =
        if (b == 0.0 || a.isNaN() || b.isNaN()) default else a / b

    fun clamp(value: Int, min: Int, max: Int): Int =
        when {
            value < min -> min
            value > max -> max
            else -> value
        }
}
