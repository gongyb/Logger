package com.gongyb.logger

import android.util.Log

/**
 *  Created on 2020/4/8 17:58.
 *  @author gongyb
 */
class Logger {


    companion object {
        private const val logTag = "Logger"
        private var logLevel = Log.DEBUG

        @JvmStatic
        fun v(msg: String) {
            Log.v(logTag, msg)
        }

        @JvmStatic
        fun d(tag: String, msg: String) {
            Log.d(logTag, msg)

            val functionName = getFunctionName()
            val ls = "$functionName - $msg"
            Log.v(logTag, ls)
        }

        @JvmStatic
        fun d(msg: String) {
            Log.d(logTag, msg)

            val functionName = getFunctionName()
            val ls = "$functionName - $msg"
            Log.v(logTag, ls)
        }

        private fun getFunctionName(): String {
            var name = "[: :]"
            for (st in Thread.currentThread().stackTrace) {
                if (st.isNativeMethod
                    || st.className == Thread::class.java.name
                    || st.className == Throwable().stackTrace[0].className
                ) {
                    continue
                }

                name = "[${Thread.currentThread().id}: ${st.fileName}: ${st.lineNumber}]"
                break
            }
            return name
        }
    }


}