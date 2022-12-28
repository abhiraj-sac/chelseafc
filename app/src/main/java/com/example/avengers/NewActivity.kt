package com.example.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NewActivity : AppCompatActivity() {
   
    lateinit  var etmobilenum:EditText
    lateinit var etpassword:EditText
    lateinit var loginin:Button
    lateinit var forget:EditText
    lateinit var register:EditText
val validmobile="00"
    val validpassword= arrayOf("mount","hazard", "jorginho","chelsea")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title ="login"
        etmobilenum =findViewById(R.id.etmobilenum)
        etpassword =findViewById(R.id.etpassword)
        loginin =findViewById(R.id.loginin)
        forget=findViewById(R.id.forget)
        register=findViewById(R.id.register)




      loginin.setOnClickListener {
          val mobileno=etmobilenum.text.toString()
          val password=etpassword.text.toString()
          var name="fanclubboii"
          val intent= Intent(this@NewActivity,MainActivity::class.java)
          if(password == validpassword[0]){
              name="mount"
              intent.putExtra("Name",name)
              startActivity(intent)
              }
          else if(password == validpassword[1]){
              name="hazard"
              intent.putExtra("Name",name)
              startActivity(intent)
          }
          else if(password == validpassword[2]){
              name="jorginho"
              intent.putExtra("Name",name)
              startActivity(intent)
          }
          else if(password == validpassword[3]){
              name="chelsea"
              intent.putExtra("Name",name)
              startActivity(intent)
          }
          else{
              Toast.makeText(this@NewActivity, "go home kid!!", Toast.LENGTH_SHORT).show()
      }

      }
      }



}