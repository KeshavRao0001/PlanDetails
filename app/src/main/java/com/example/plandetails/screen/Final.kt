package com.example.plandetails.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
    fun bottomText() {
        Column() {
            Text(
                text = "1. Payment will be charged to iTunes Account at confirmation of purchase.\n" +
                        "2. Subscription automatically renews unless auto-renew is turned off at least 24-hours before the end of the current period.\n" +
                        "3. Account will be charged for renewal within 24-hours prior to the end of the current period, and identify the cost of the renewal.\n" +
                        "4. Subscriptions may be managed by the user and auto-renewal may be turned off by going to the user's Account Settings after purchase.\n" +
                        "5. Any unused portion of a free trial period, if offered, will be forfeited when the user\n" +
                        "purchases a subscription to that publication, where applicable.\n" +
                        "6. Upon cancellation, service access and use will end upon the completion of paid monthly or annual terms. Service access will end immediately upon cancellation during the free trial period.\n" +
                        "** Annual plan costs $49.99 and is charged annually. There is no refund for early termination of annual plan.\n" +
                        "See Terms of Use and Privacy Policy for more details.", fontSize = 10.sp,
                color = Color.White
            )
        }

    }



