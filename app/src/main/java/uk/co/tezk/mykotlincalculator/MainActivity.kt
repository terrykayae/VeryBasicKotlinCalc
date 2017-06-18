package uk.co.tezk.mykotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var input: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun numClick(view: View) {
        val button: Button = view as Button
        editText.text = editText.text.append(button.text);
    }

    fun plusClick(view: View) {
        if (input.length == 0) {
            input = editText.text.toString()
            editText.setText("")
        } else {
            val numOne = Integer.parseInt(input)
            val numTwo = Integer.parseInt(editText.text.toString())
            editText.setText(Integer.toString(numOne + numTwo))
        }
    }
}

