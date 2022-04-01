package com.musab.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.spatiu.spatiutoaster.SpatiuMeassge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SpatiuMeassge.toaster(this,"fab_transformation_sheet_behavior", 1)
    }
}