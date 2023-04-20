package com.example.plandetails.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun paymentButtons() {
    Column(modifier = Modifier,
    verticalArrangement = Arrangement.SpaceEvenly,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .size(383.dp, 40.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(0.dp)
        ) {
            Text("Start Free Trial", fontSize = 20.sp, color = Color.White)
        }

            Text(
                text = "Skip",
                color = Color.White,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable(enabled = true, onClick = {})
            )
        Row() {
            Text(text = "Already Paid?", color = Color.White,)

            Text(text = "Restore Purchase",
                color = Color.White,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable(enabled = true, onClick = {}))
        }
    }
}