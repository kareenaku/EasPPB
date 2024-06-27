package com.example.login

import HomeScreen
import SplashScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") {
                    SplashScreen(onClick = { navController.navigate("login") })
                }
                composable("login") {
                    AppContent(
                        navController = navController
                    )
                }
                composable("home") {
                    HomeScreen(
                        onLogoutClick = { navController.popBackStack() }
                    )
                }
                composable("otp") {
                    OTPScreen(
                        onBackClick = { navController.popBackStack() },
                        onContinueClick = { navController.navigate("otp") }
                    )
                }
            }
        }
    }
}

@Composable
fun AppContent(navController: NavController) {
    var showLoginScreen by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.background(Color(0xFF17FF74))
    ) {
        if (showLoginScreen) {
            LoginScreen(onSignUpClick = { showLoginScreen = false }, onSignInClick = { navController.navigate("home") })
        } else {
            SignUpScreen(
                onBackClick = { showLoginScreen = true },
                onContinueClick = {
                    // Navigate to OTPScreen when Continue is clicked
                    navController.navigate("otp")
                }
            )
        }
    }
}
