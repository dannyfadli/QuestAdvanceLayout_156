package com.example.questadvancelayout_156

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun ProfilScreen(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E1E))
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        // Foto Profil
        Image(
            painter = painterResource(id = R.drawable.veliona),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .padding(5.dp),
            contentScale = ContentScale.Crop
        )



        Spacer(modifier = Modifier.height(10.dp))

        // 🔹 Row media sosial
        Row(
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SocialDot(color = Color(0xFF4C7DFF), content = { Text("f", color = Color.White, fontSize = 20.sp) })
            SocialDot(color = Color(0xFFFF0000), content = { Text("G+", color = Color.White, fontSize = 20.sp) })
            SocialDot(color = Color(0xFF00C2FF), content = { Text("t", color = Color.White, fontSize = 20.sp) })
            SocialDot(color = Color(0xFF0A66C2), content = { Text("in", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.Bold) })
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Veliona Vollerei",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            text = "@Seele_Vollerei",
            fontSize = 16.sp,
            color = Color.Gray
        )

        // Deskripsi singkat
        Text(
            text = "Saya seorang Valkry dan Juga seorang...",
            fontSize = 16.sp,
            color = Color(0xFFD0D0D0)
        )

        Spacer(modifier = Modifier.height(30.dp))

        // Tombol-tombol
        MenuPill(
            title = stringResource(R.string.menu1),
            icon = { Icon(Icons.Outlined.Lock, null, tint = Color.White) }
        )
        Spacer(Modifier.height(12.dp))
        MenuPill(
            title = stringResource(R.string.menu2),
            icon = { Icon(Icons.Outlined.ShoppingCart, null, tint = Color.White) }
        )
        Spacer(Modifier.height(12.dp))
        MenuPill(
            title = stringResource(R.string.menu3),
            icon = { Icon(Icons.Outlined.Settings, null, tint = Color.White) }
        )

        Spacer(Modifier.weight(1f))


        // Copyright
        Text(
            text = "© Honkai Impact3rd",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }
}


@Composable
private fun SocialDot(
    color: Color,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .size(44.dp)
            .clip(CircleShape)
            .background(color),
        contentAlignment = Alignment.Center
    ) { content() }
}

@Composable
fun ProfilButton(text: String) {
    Button(
        onClick = { /* TODO: aksi tombol */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2C2C2C)
        ),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .height(55.dp)
    ) {
        Text(text = text, color = Color.White, fontSize = 16.sp)
    }
}

@Composable
private fun MenuPill(
    title: String,
    icon: @Composable () -> Unit
) {
    val pillShape = RoundedCornerShape(22.dp)
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(8.dp, pillShape),
        shape = pillShape,
        color = Color.DarkGray
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 18.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ) {
                icon()
            }

            Spacer(Modifier.width(14.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.weight(1f)
            )

            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = null,
                tint = Color.White.copy(alpha = 0.9f)
            )
        }
    }
}
