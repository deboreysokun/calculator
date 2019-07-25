package com.example.myapplication_17

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle = intent.extras
        a1.text = "First number: "+bundle?.get("num1").toString()
        a2.text = "Second number: "+bundle?.get("num2").toString()
    }
    fun calcu(v:View)
    {
        var bundle = intent.extras
        var num1 = bundle?.get("num1").toString().toInt()
        var num2 = bundle?.get("num2").toString().toInt()
        var res:Int = 0
        var i = Intent()
        when(v.id)
        {
            R.id.add -> res = num1+num2
            R.id.sub -> res = num1-num2
            R.id.mul -> res = num1 * num2
            R.id.div -> res = num1/num2
        }
        i.putExtra("result",res)
        setResult(Activity.RESULT_OK,i)
        finish()
    }

}

