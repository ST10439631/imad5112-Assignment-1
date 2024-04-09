package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("KotlinConstantConditions")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declaration the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btngenerate)
        val btnCancel = findViewById<Button>(R.id.biCancel)
        val txtResults = findViewById<TextView>(R.id.textResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..29 -> "James Dean"
                    in 30..39 -> "wolfgang Amedeus"
                    in 40..49 -> "F.Scott Fitzgerald"
                    in 50..59 -> "Steve Jobs"
                    in 60..69 -> "Bill Paxton"
                    in 70..79 -> "Albert Einstein"
                    in 80..89 ->"Queen Victoria"
                    in 90..95-> "Rosa Parks"
                    in 95..100 ->"Krik Douglas"
                    else -> "please enter an age between 10 and 100"
                }
                txtResults.text = "Age: $age\n${
                    when (result) {
                        "Ptolemy V Epiphanies" -> "Ptolemy V Epiphanes became pharoh of egypt at the age of 5 and died at the age of 10"
                        "James Dean" -> "Close to James Dean, The Iconic American Actor who died in a  car accident at the age of 24, just as he was gaining widespread fame for his roles "
                        "Wolfgang Amendeus" -> "Just as Wolfgang Amedeus, the polific and influential composes who died at the age of 35 and was considered relatively young considering his immense talent and contribution to classical music"
                        "F.Scott Fitzgerald" -> "F.Scott Fitzgerald, the renowned Americam author best known for his novels. He dies of a heart attack on decmber 21,1940, at the age of 44"
                        "Steve Jobs" -> "Just as Steve Jobs, the co-founder and fomer CEO of Apple Inc,Diwed on October 5,2011, at the age of 56.He had been battling a rare form of pancreatic neuroendocrine tumor since 2004"
                        "Bill Paxton"->"A talented actor known for his roles in films like titanic and passed away on february 25,2017, due to his complications from surgery"                                                                                                              
                        "Albert Einstein"-> "Just as Albert, the renowned theoretical physicist known for his theory of reactivity, he died on April 18th,1955, at the age of 76 "
                         "Queen Victoria" -> "Just close as Queen Victoria Who died at the age of 81,but her health started deteriorating in her 60s "
                        "Rosa Parks" -> "Close to Rosa,She died at 92 in 2005, but she was in her 60s when she became less active in civil rights movements."
                          "Krik Douglas" -> "Close to Krik,the legendary American actor and producer who passed away on February 5,2020,at the age of 103. He died peacefully at his home in Beverly Hills"
                        else -> "please enter an age between 10 and 109"
                    }
                } "
            } else {
                txtResults.text = "Please enter a valid age"

            }
        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResults.text = ""
        }
    }
}