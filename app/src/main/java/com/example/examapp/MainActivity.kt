package com.example.examapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.examapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {
            val answers = arrayOf("Narmada","Mahanadi","Son","Netravati")
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Choose the correct Answer")
            builder1.setSingleChoiceItems(answers, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have selected ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val answers = arrayOf("Chennai","Cuttack","Bangalore","Quilion")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Choose the correct Answer")
            builder2.setSingleChoiceItems(answers, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have selected ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder2.show()
        }


        binding.btn3.setOnClickListener {
            val answers = arrayOf("Kalidasa","Charak","Panini","Aryabhatt")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Choose the correct Answer")
            builder3.setSingleChoiceItems(answers, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have selected ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder3.show()
        }


        binding.btn4.setOnClickListener {
            val answers = arrayOf("Alaknanda","Pindar","Mandakini","Bhagirathi")
            val builder4 = AlertDialog.Builder(this)
            builder4.setTitle("Choose the correct Answer")
            builder4.setSingleChoiceItems(answers, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have selected ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder4.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder4.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder4.show()
        }


        binding.btn5.setOnClickListener {
            val answers = arrayOf("Pennar","Cauvery","Krishna","Tapti")
            val builder5 = AlertDialog.Builder(this)
            builder5.setTitle("Choose the correct Answer")
            builder5.setSingleChoiceItems(answers, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You have selected ${answers[which]}", Toast.LENGTH_SHORT).show()
            })
            builder5.setPositiveButton("Submit",DialogInterface.OnClickListener { dialog, which ->  })
            builder5.setNegativeButton("Decline",DialogInterface.OnClickListener { dialog, which ->  })
            builder5.show()
        }


    }
}