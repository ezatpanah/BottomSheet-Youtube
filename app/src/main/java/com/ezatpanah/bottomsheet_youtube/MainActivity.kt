package com.ezatpanah.bottomsheet_youtube

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ezatpanah.bottomsheet_youtube.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnSampleOne.setOnClickListener {
                showDialogOne()
            }

            btnSampleTwo.setOnClickListener {
                showDialogTwo()
            }
        }


    }


    fun showDialogOne() {

        val dialog = BottomSheetDialog(this)
        dialog.setContentView(R.layout.sample_dialog_one)
        val btnEdit= dialog.findViewById<RelativeLayout>(R.id.rl_edit)
        val btnDelete= dialog.findViewById<RelativeLayout>(R.id.rl_delete)
        val btnAdd= dialog.findViewById<RelativeLayout>(R.id.rl_add)

        btnEdit?.setOnClickListener {
            Toast.makeText(this, "Clicked on Edit", Toast.LENGTH_SHORT).show()
        }
        btnDelete?.setOnClickListener {
            Toast.makeText(this, "Clicked on Delete", Toast.LENGTH_SHORT).show()
        }
        btnAdd?.setOnClickListener {
            Toast.makeText(this, "Clicked on Add", Toast.LENGTH_SHORT).show()

        }

        dialog.show()


    }

    fun showDialogTwo() {
        val dialog = BottomSheetDialog(this)
        dialog.setContentView(R.layout.sample_dialog_two)
        val btnClose= dialog.findViewById<Button>(R.id.idBtnDismiss)

        btnClose?.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setCancelable(false)
        dialog.show()


    }
}