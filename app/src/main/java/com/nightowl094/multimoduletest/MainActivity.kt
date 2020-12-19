package com.nightowl094.multimoduletest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nightowl094.login.LoginActivity
import com.nightowl094.multimoduletest.databinding.ActivityMainBinding
import com.nightowl094.registeruser.RegisterUserActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpLabel.setOnClickListener {
            startActivity(
                Intent(this, RegisterUserActivity::class.java)
            )
        }

        binding.loginLabel.setOnClickListener {
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
        }

    }
}