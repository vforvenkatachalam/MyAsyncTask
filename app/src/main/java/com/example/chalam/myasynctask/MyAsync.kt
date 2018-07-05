package com.example.chalam.myasynctask

import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.widget.ImageView
import java.io.InputStream
import java.net.URL

class MyAsync(var iview:ImageView):AsyncTask<Unit,Unit,Unit>()
{
    var irs:InputStream? = null
    override fun doInBackground(vararg p0: Unit?) {

        var url = URL("https://secure.meetupstatic.com/photos/member/6/9/e/d/highres_261747117.jpeg")
        irs = url.openStream()
    }

    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun onPostExecute(result: Unit?) {
        var bmp = BitmapFactory.decodeStream(irs)
        iview.setImageBitmap(bmp)

        super.onPostExecute(result)
    }

}