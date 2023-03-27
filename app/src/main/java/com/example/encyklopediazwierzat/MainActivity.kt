package com.example.encyklopediazwierzat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.encyklopediazwierzat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKot.setOnClickListener {
            pokazFragment(KotFragment())
        }

        binding.btnPies.setOnClickListener {
            pokazFragment(PiesFragment())
        }

        binding.btnKon.setOnClickListener {
            pokazFragment(KonFragment())
        }
    }

    private fun pokazFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.replace(R.id.gornyKontener, fragment, null)
        fragmentTransaction.commit()
    }
}