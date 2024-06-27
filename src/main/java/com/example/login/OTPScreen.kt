package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OTPScreen(onBackClick: () -> Unit, onContinueClick: () -> Unit) {
    val darkGreen = Color(0xFF033718)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkGreen),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Check your phone number or email.",
            fontSize = 18.sp,
            color = Color.White,
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "We already sent the OTP code.",
            fontSize = 18.sp,
            color = Color.White,
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Timer
        Text(
            text = "(1.23)",
            fontSize = 18.sp,
            color = Color.White,
        )

        Spacer(modifier = Modifier.height(16.dp))

        // OTP Input
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            repeat(5) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color.White, shape = CircleShape)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Resend OTP code",
                color = Color.Blue
            )



        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onBackClick
        ) {
            Text(text = "Continue")
        }
    }
}
