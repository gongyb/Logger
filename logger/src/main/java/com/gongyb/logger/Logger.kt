package com.gongyb.logger

import android.util.Log

/**
 *  Created on 2020/4/8 17:58.
 *  @author gongyb
 */
class Logger {
    companion object {
        private const val logTag = "Logger"

        @JvmStatic
        fun v(msg: String) {
            Log.v(logTag, msg)
        }

        @JvmStatic
        fun d(msg: String) {
            Log.d(logTag, msg)
        }
    }
}