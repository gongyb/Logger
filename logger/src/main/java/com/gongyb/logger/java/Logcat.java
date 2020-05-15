package com.gongyb.logger.java;

import android.util.Log;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

import com.gongyb.logger.BuildConfig;

import java.util.Locale;

/**
 * Created on 2020/5/12 12:00.
 *
 * @author gongyb
 */
public class Logcat {

    private static String logTag = "Logcat";
    private static int logLevel = Log.VERBOSE;

    static {
        // Release mode switch log level to {@link Log#INFO}.
        if (!BuildConfig.DEBUG) {
            logLevel = Log.INFO;
        }
    }

    public static void setLogTag(@NonNull String tag) {
        logTag = tag;
    }

    public static void setLogLevel(@IntRange(from = Log.VERBOSE, to = Log.ERROR) int level) {
        logLevel = level;
    }

    public static void v(@NonNull String msg) {
        if (logLevel > Log.VERBOSE) return;
        Log.v(getTag(), msg);
    }

    public static void v(@NonNull String format, Object... args) {
        if (logLevel > Log.VERBOSE) return;
        Log.v(getTag(), String.format(Locale.US, format, args));
    }

    public static void d(@NonNull String msg) {
        if (logLevel > Log.DEBUG) return;
        Log.d(getTag(), msg);
    }

    public static void d(@NonNull String format, Object... args) {
        if (logLevel > Log.DEBUG) return;
        Log.d(getTag(), String.format(Locale.US, format, args));
    }

    public static void i(@NonNull String msg) {
        if (logLevel > Log.INFO) return;
        Log.i(getTag(), msg);
    }

    public static void i(@NonNull String format, Object... args) {
        if (logLevel > Log.INFO) return;
        Log.i(getTag(), String.format(Locale.US, format, args));
    }

    public static void w(@NonNull String msg) {
        if (logLevel > Log.WARN) return;
        Log.w(getTag(), msg);
    }

    public static void w(@NonNull String format, Object... args) {
        if (logLevel > Log.WARN) return;
        Log.w(getTag(), String.format(Locale.US, format, args));
    }

    public static void e(@NonNull String msg) {
        if (logLevel > Log.ERROR) return;
        Log.e(getTag(), msg);
    }

    public static void e(@NonNull String format, Object... args) {
        if (logLevel > Log.ERROR) return;
        Log.e(getTag(), String.format(Locale.US, format, args));
    }

    private static String getTag() {
        if (BuildConfig.DEBUG) {
            // Debug mode print line number.
            StackTraceElement element = Thread.currentThread().getStackTrace()[4];
            return "[" +
                    Thread.currentThread().getId() +
                    ":(" +
                    element.getFileName() +
                    ":" +
                    element.getLineNumber() +
                    ")]";
        }
        return logTag;
    }
}
