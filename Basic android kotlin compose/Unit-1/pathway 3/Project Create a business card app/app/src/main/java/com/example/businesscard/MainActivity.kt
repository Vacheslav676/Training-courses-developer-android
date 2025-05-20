package com.example.businesscard

import android.content.res.Configuration
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.style.TextAlign
import com.example.businesscard.ui.theme.BusinessCardTheme
import com.example.businesscard.ui.theme.SoftGrey

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
         color = SoftGrey, // Теперь фон всегда мягко-зеленый
        // color = MaterialTheme.colorScheme.background, // Используем цвет из темы,(почемуто не работает)
        shadowElevation = 4.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Логотип Android
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Логотип Android",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Имя и фамилия
            Text(
                text = "Jennifer Doe",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Должность
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                color = Color.Green,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Блок контактов
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                ContactRow(icon = Icons.Default.Call, label = "+11 (123) 444 555 666", color = Color.Green)
                ContactRow(icon = Icons.Default.Share, label = "@AndroidDev", color = Color.Green)
                ContactRow(icon = Icons.Default.Email, label = "jen.doe@android.com", color = Color.Green)
            }
        }
    }
}

@Composable
fun ContactRow(icon: ImageVector, label: String, color: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 12.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = color,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = label,
            fontSize = 14.sp,
            color = color,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

@Preview(
    showBackground = true,
   // uiMode = Configuration.UI_MODE_NIGHT_YES // Показать темную тему
)
@Composable
fun PreviewBusinessCard() {
    BusinessCardTheme {
        BusinessCard()
    }
}