package otus.homework.customview

import androidx.annotation.ColorInt

data class PieChartState(
    val colorStates: List<ColorState>
) {

    private val totalValue = colorStates.sumOf { it.value }

    fun getPercentage(value: Int): Float {
        assert(value > 0 || value <= totalValue)
        return value.toFloat() / totalValue
    }

    data class ColorState(
        val value: Int,
        @ColorInt val color: Long
    )

    companion object {
        fun default() = PieChartState(emptyList())
    }

}