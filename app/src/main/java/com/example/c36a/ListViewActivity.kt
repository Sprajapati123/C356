package com.example.c36a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c36a.ui.theme.C36ATheme

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListViewBody()
        }
    }
}

@Composable
fun ListViewBody() {
    Scaffold { innerPadding ->
        val scrollState = rememberScrollState()
        val scrollStateRow = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(scrollState)
        ) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollStateRow)) {
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Gray)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Yellow)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Magenta)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.DarkGray)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Black)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Blue)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Red)
                )

                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .padding(10.dp)
                        .background(color = Color.Gray)
                )
            }

            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Red)
            )

            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Green)
            )

            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Yellow)
            )
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Magenta)
            )

            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Gray)
            )
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Blue)
            )
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .padding(20.dp)
                    .background(color = Color.Black)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListViewPreview() {
    ListViewBody()
}