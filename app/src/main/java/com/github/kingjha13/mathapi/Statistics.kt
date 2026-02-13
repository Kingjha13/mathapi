package com.github.kingjha13.mathapi

import kotlin.math.sqrt

object Statistics {

    fun mean(values: List<Double>): Double =
        values.sum() / values.size

    fun median(values: List<Double>): Double {
        val sorted = values.sorted()
        val mid = sorted.size / 2
        return if (sorted.size % 2 == 0)
            (sorted[mid - 1] + sorted[mid]) / 2
        else
            sorted[mid]
    }

    fun variance(values: List<Double>): Double {
        val mean = mean(values)
        var sum = 0.0
        for (v in values) {
            val d = v - mean
            sum += d * d
        }
        return sum / values.size
    }

    fun standardDeviation(values: List<Double>): Double =
        sqrt(variance(values))
}
