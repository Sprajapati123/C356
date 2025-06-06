package com.example.c36a.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ForgetPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            forgetBody()
        }
    }
}

@Composable
fun forgetBody() {
    var email by remember { mutableStateOf("") }
    Scaffold  { padding->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                placeholder = {
                    Text("abc@gmail.com")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {

                },
                modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
            ) {
                Text("Submit")
            }
        }
    }
}

@Preview
@Composable
fun prev() {
    forgetBody()
}