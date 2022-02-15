package com.example.scroll_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

var fname: EditText?= null
var lname: EditText?= null
var mail: EditText?= null
var phone: EditText?= null
var reset_button: Button?= null
var submit: Button?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findviews()
        submitForm()
        resetForm()
    }

    private fun resetForm(){
        reset_button?.setOnClickListener(View.OnClickListener { v ->
            fname?.setText("")
            lname?.setText("")
            mail?.setText("")
            phone?.setText("")
        })
    }
    val bundle = Bundle()
    fun submitForm(){
        submit?.setOnClickListener( View.OnClickListener { v ->
                if (TextUtils.isEmpty(fname?.text.toString()) || TextUtils.isEmpty(lname?.text.toString())
                    || TextUtils.isEmpty(mail?.text.toString()) || TextUtils.isEmpty((phone?.text.toString()))
                ) {
                    Toast.makeText(this, "Please Enter all the details",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Good to go", Toast.LENGTH_LONG).show()
                    val intent = Intent(this,MainActivity2::class.java)
                    bundle.putString("FName",fname?.text.toString())
                    intent.putExtras(bundle)
                    startActivity(intent)

                }
            })
    }
    fun findviews(){
        fname = findViewById(R.id.fname_input)
        lname = findViewById(R.id.lname_input)
        mail = findViewById(R.id.email_input)
        phone = findViewById(R.id.contact_number_input)
        reset_button = findViewById(R.id.reset_button)
        submit = findViewById(R.id.submit_button)

    }

}
