package com.yarengonay.kafeuygulama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yarengonay.kafeuygulama.screens.HomeScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yarengonay.kafeuygulama.screens.SplashScreen
import com.yarengonay.kafeuygulama.ui.theme.KafeuygulamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KafeuygulamaTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "splash") {

                    composable("splash") {
                        SplashScreen(
                            onGecisYap = {
                                navController.navigate("home") {
                                    popUpTo("splash") { inclusive = true }
                                }
                            }
                        )
                    }
                    composable("home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}