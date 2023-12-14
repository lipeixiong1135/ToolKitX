package com.xiong.utils.sp

import android.content.Context
import android.content.SharedPreferences

/**
 * 单例模式的 SharedPreferences 工具类。
 * 使用前需在 Application 类中通过 init 方法初始化。
 */
object SharedPreferencesUtils {
    private lateinit var sharedPreferences: SharedPreferences

    /**
     * 初始化 SharedPreferences 工具类。
     *
     * @param context 上下文，推荐传入 Application 上下文。
     */
    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences("MyAppPreferences", Context.MODE_PRIVATE)
    }

    fun putString(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    fun getString(key: String, defaultValue: String = ""): String? {
        return sharedPreferences.getString(key, defaultValue)
    }

    fun putInt(key: String, value: Int) {
        with(sharedPreferences.edit()) {
            putInt(key, value)
            apply()
        }
    }

    fun getInt(key: String, defaultValue: Int = 0): Int {
        return sharedPreferences.getInt(key, defaultValue)
    }

    fun putBoolean(key: String, value: Boolean) {
        with(sharedPreferences.edit()) {
            putBoolean(key, value)
            apply()
        }
    }

    fun getBoolean(key: String, defaultValue: Boolean = false): Boolean {
        return sharedPreferences.getBoolean(key, defaultValue)
    }

    fun putLong(key: String, value: Long) {
        with(sharedPreferences.edit()) {
            putLong(key, value)
            apply()
        }
    }

    fun getLong(key: String, defaultValue: Long = 0L): Long {
        return sharedPreferences.getLong(key, defaultValue)
    }

    fun putDouble(key: String, value: Double) {
        with(sharedPreferences.edit()) {
            putLong(key, java.lang.Double.doubleToRawLongBits(value))
            apply()
        }
    }

    fun getDouble(key: String, defaultValue: Double = 0.0): Double {
        return java.lang.Double.longBitsToDouble(sharedPreferences.getLong(key, java.lang.Double.doubleToRawLongBits(defaultValue)))
    }

    /**
     * 清除所有 SharedPreferences 数据。
     */
    fun clear() {
        with(sharedPreferences.edit()) {
            clear()
            apply()
        }
    }

    /**
     * 清除指定的键及其对应的值。
     *
     * @param key 要清除的键名
     */
    fun clearKey(key: String) {
        with(sharedPreferences.edit()) {
            remove(key)
            apply()
        }
    }
}

