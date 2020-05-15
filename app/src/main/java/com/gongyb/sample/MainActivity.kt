package com.gongyb.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gongyb.logger.Logger
import com.gongyb.logger.java.Logcat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.d("test")

        Logcat.setLogTag("this");

        Logcat.v("This is a test.");
        Logcat.d("This is a test.");
        Logcat.i("This is a test.");
        Logcat.w("This is a test.");
        Logcat.e("This is a test %s.", 2);

        Logcat.d("(MainActivity.kt:68) This is a test %s.", 2);


        //return

        var i = 10
        val begin = System.currentTimeMillis()
        while (i > 0) {
            Log.i("xxxx", "1234")
            Log.i("xxxx", "12345")
            Log.i("xxxx", "12346")
            Log.i("xxxx", "12347")
            Log.i("xxxx", "12348")
            Log.i("xxxx", "12349")
            Log.i("xxxx", "12340")
            Log.i("xxxx", "1234a")
            Log.i("xxxx", "1234b")
            Log.i("xxxx", "1234c")
            i--
        }


        i = 10
        val begin2 = System.currentTimeMillis()
        while (i > 0) {
            Logcat.d("1234a")
            Logcat.d("1234b")
            Logcat.d("1234c")
            Logcat.d("1234d")
            Logcat.d("1234e")
            Logcat.d("1234f")
            Logcat.d("1234g")
            Logcat.d("1234h")
            Logcat.d("1234i")
            Logcat.d("1234g")
            i--
        }


        i = 10
        val begin3 = System.currentTimeMillis()
        while (i > 0) {
            Logcat.d("a1234%s", 678)
            Logcat.d("b1234%s", 678)
            Logcat.d("c1234%s", 678)
            Logcat.d("d1234%s", 678)
            Logcat.d("e1234%s", 678)
            Logcat.d("f1234%s", 678)
            Logcat.d("g1234%s", 678)
            Logcat.d("h1234%s", 678)
            Logcat.d("i1234%s", 678)
            Logcat.d("g1234%s", 678)
            i--
        }

        i = 10
        val begin4 = System.currentTimeMillis()
        while (i > 0) {
            String.format(Locale.US, "a1234%s", 678)
            String.format(Locale.US, "b1234%s", 678)
            String.format(Locale.US, "c1234%s", 678)
            String.format(Locale.US, "d1234%s", 678)
            String.format(Locale.US, "e1234%s", 678)
            String.format(Locale.US, "f1234%s", 678)
            String.format(Locale.US, "g1234%s", 678)
            String.format(Locale.US, "h1234%s", 678)
            String.format(Locale.US, "i1234%s", 678)
            String.format(Locale.US, "g1234%s", 678)
            i--
        }

        Log.i("xxxx", "end4 diff=" + (System.currentTimeMillis() - begin4))
        Log.i("xxxx", "end diff=" + (begin2 - begin))
        Log.i("xxxx", "end2 diff=" + (begin3 - begin2))
        Log.i("xxxx", "end3 diff=" + (begin4 - begin3))

    }
}
