package com.github.kingjha13.mathapi

import kotlin.math.abs

object AdvancedMath {

    fun factorial(n: Int): Long {
        require(n >= 0)
        var result = 1L
        for (i in 2..n) result *= i
        return result
    }
    fun power(base: Double, exp: Int): Double {
        if (exp == 0) return 1.0
        var b = base
        var e = abs(exp)
        var result = 1.0

        while (e > 0) {
            if (e and 1 == 1) result *= b
            b *= b
            e = e shr 1
        }
        return if (exp > 0) result else 1 / result
    }

    fun gcd(a: Int, b: Int): Int {
        var x = abs(a)
        var y = abs(b)
        while (y != 0) {
            val t = y
            y = x % y
            x = t
        }
        return x
    }

    fun lcm(a: Int, b: Int): Int =
        abs(a / gcd(a, b) * b)
}
