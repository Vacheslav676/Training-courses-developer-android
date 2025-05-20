package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}





@Composable
fun Greeting( modifier: Modifier = Modifier) {
fun Greeting(modifier: Modifier = Modifier) {
        Column(Modifier.fillMaxWidth()) {
            
            
           Column(Modifier.weight(1f)) {
               Text(text = "Hello")
               Text(text = "Hello")
               Text(text = "Hello")
               }
           Column(Modifier.weight(1f)) {
               Text(text = "Hello")
               Text(text = "Hello")
               Text(text = "Hello")
               Text(text = "Hello")
               }
    
        }





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting()
    }
}
