package com.example.plandetails.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoxUI() {
    Row() {
        Card(
            Modifier
                .background(Color.Gray)
                .size(183.dp)
                .clickable { },
        shape = RoundedCornerShape(0.dp)
        ) {
            Text(text = "Annual\n",
            fontSize = 24.sp)
            Text(text = "7-Day Free Trial\n" + "Save 25%\n",
                fontSize = 16.sp)
            Text(text = "$99.99/ year",
                fontSize = 16.sp)
            Text(text = "Billed annually after trial",
                fontSize = 12.sp)
        }
        Spacer(modifier = Modifier.size(15.dp))

        Card(
            Modifier
                .background(Color.Gray)
                .size(183.dp)
                .clickable { },
            shape = RoundedCornerShape(0.dp)) {
            Text(text = "Monthly\n" + "\n" + "\n",
                fontSize = 24.sp)
            Text(text = "$99.99/ year\n",
                fontSize = 16.sp)
            Text(text = "Billed annually after trial",
                fontSize = 12.sp)
        }

    }
}