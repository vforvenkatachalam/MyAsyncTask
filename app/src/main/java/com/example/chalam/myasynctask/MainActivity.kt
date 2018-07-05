package com.example.chalam.myasynctask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var iview:ImageView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iview=findViewById(R.id.imageview)
        imagebutton.setOnClickListener({
            var async = MyAsync(iview!!)
            async.execute()
        })

        var policy  = StrictMode.ThreadPolicy.Builder().
                permitAll().build()
        StrictMode.setThreadPolicy(policy)

    }
}
