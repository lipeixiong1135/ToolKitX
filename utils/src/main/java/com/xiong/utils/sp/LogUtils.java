package com.xiong.utils.sp;

/**
 * 类描述：Log工具类
 */

import android.util.Log;

public class LogUtils {

    private static final String TAG = "MyApp"; // 这里可以设置默认的标签名


    // 日志级别：Verbose
    public static void v(String message) {
        Log.v(TAG, message);
    }


    // 日志级别：Debug
    public static void d(String message) {
        Log.d(TAG, message);
    }


    // 日志级别：Info
    public static void i(String message) {
        Log.i(TAG, message);
    }


    // 日志级别：Warning
    public static void w(String message) {
        Log.w(TAG, message);
    }


    // 日志级别：Error
    public static void e(String message) {
        Log.e(TAG, message);
    }
}
