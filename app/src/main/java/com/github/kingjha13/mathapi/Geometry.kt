package com.github.kingjha13.mathapi

import kotlin.math.abs
import kotlin.math.sqrt

object Geometry {

    fun distance(p1: Point, p2: Point): Double {
        val dx = p2.x - p1.x
        val dy = p2.y - p1.y
        return sqrt(dx * dx + dy * dy)
    }

    fun triangleArea(a: Point, b: Point, c: Point): Double =
        abs(
            (a.x * (b.y - c.y) +
                    b.x * (c.y - a.y) +
                    c.x * (a.y - b.y)) / 2
        )
}
