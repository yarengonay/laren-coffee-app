package com.yarengonay.kafeuygulama.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onGecisYap: () -> Unit) {
    val scale = remember { Animatable(0f) }

    val DarkCoffee = Color(0xFF4E342E)
    val WarmCream = Color(0xFFF5F5F5)

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = { OvershootInterpolator(2f).getInterpolation(it) }
            )
        )
        delay(1500)
        onGecisYap()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkCoffee),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Surface(
                modifier = Modifier
                    .size(120.dp)
                    .scale(scale.value),
                shape = CircleShape,
                color = WarmCream,
                shadowElevation = 8.dp
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Default.Spa,
                        contentDescription = "Logo",
                        tint = DarkCoffee,
                        modifier = Modifier.size(60.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Laren",
                color = WarmCream,
                fontSize = 58.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.scale(scale.value)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Sizin mutluluğunuz için özenle",
                color = WarmCream.copy(alpha = 0.8f),
                fontSize = 19.sp,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
