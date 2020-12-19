package com.nightowl094.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.nightowl094.login.ui.MultiModuleTestTheme

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Login")
                }
            }
        }
    }
}

@Composable
fun Greeting(string: String) {
    Text(text = "$string")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MultiModuleTestTheme {
        Greeting("Android")
    }
}