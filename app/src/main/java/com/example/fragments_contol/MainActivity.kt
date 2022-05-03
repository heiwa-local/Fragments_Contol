package com.example.fragments_contol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<Fragment1>(R.id.fl1)
            }
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<Fragment2>(R.id.fl2)
            }
        }

    }
}