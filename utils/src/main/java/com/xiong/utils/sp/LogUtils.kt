package com.xiong.utils.sp

import android.util.Log

/**
 * 类描述：Log工具类
 */
object LogUtils {
    private const val TAG = "MyApp" // 这里可以设置默认的标签名

    // 日志级别：Verbose
    fun v(message: String?) {
        Log.v(TAG, message!!)
    }

    // 日志级别：Debug
    fun d(message: String?) {
        Log.d(TAG, message!!)
    }

    // 日志级别：Info
    fun i(message: String?) {
        Log.i(TAG, message!!)
    }

    // 日志级别：Warning
    fun w(message: String?) {
        Log.w(TAG, message!!)
    }

    // 日志级别：Error
    fun e(message: String?) {
        Log.e(TAG, message!!)
    }
}
