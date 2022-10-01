package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//import androidx.databinding.DataBindingUtil
//import com.example.android.aboutme.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private fun addNickname(view:View){

        val editText= findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView= findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text= editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE
        nicknameTextView.visibility=View.VISIBLE

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
            val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)
        }

    }
    private fun updateNickname(view: View){
        val editText= findViewById<EditText>(R.id.nickname_edit)
       // //val doneButton= findViewById<Button>(R.id.done_button)

        //val doneButton= findViewById<Button>(R.id.binding.doneButton)

        //// updateNickname(it)
        editText.requestFocus()

        val imm= getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText,0)


    }

    fun clickHandlerFunction(view: View) {}

}

class ActivityMainBinding {

    //val  binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    //binding.doneButton.setOnClickListener {
    //    addNickname(it)
   // }

}
