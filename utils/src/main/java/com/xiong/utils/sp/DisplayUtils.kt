package com.xiong.utils.sp

import android.content.Context
import android.util.DisplayMetrics
import kotlin.math.roundToInt

/**
 * 类描述：dp转px工具类
 */
object DisplayUtils {
    // 将 dp 转换为 px
    fun dpToPx(context: Context, dp: Float): Int {
        val displayMetrics = context.resources.displayMetrics
        return (dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }

    // 将 px 转换为 dp
    fun pxToDp(context: Context, px: Float): Int {
        val displayMetrics = context.resources.displayMetrics
        return (px / (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT)).roundToInt()
    }
}
