package com.ttposmobile.coloredboxexampleb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ttposmobile.coloredboxexampleb.ui.theme.ColoredBoxExampleBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColoredBoxExampleBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Example (){
    Column(
        modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ColoredBox(color = Color.Red)
            ColoredBox(color = Color.Magenta)

        }

        ColoredBox(color = Color.Cyan)
        ColoredBox(color = Color.Yellow)
        ColoredBox(color = Color.Blue)
    }
}

@Composable
fun ColoredBox(color : Color){
    Surface(
        color=color,
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun ColoredBoxPreview() {
    ColoredBoxExampleBTheme {
        Example()
    }
}