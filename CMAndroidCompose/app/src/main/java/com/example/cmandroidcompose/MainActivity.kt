package com.example.cmandroidcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cmandroidcompose.ui.theme.CMAndroidComposeTheme

@Preview
@Composable
fun TextFieldPreview(){
    Box (
        modifier = Modifier.run {
            padding(20.dp)
                .fillMaxSize()
        },
        contentAlignment = Alignment.Center
    ) {
        Column {
            TextHeader()
        }

    }
}

@Composable
fun TextHeader() {
    Text(text = "Number Guessing Game",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
    )
    Text(text = "Try to guess the number I'm thinking of from 1 - 1000!",
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
        )
}

@Composable
fun TextFieldView() {
    val textState = remember { mutableStateOf( "") }

    OutlinedTextField (
        value = textState.value,
        onValueChange = {
            textState.value = it
        },
        label = {
            Text(text = "Your Guess")
        }
    )
}

