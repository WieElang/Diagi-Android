package com.meatrix.diagi.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meatrix.diagi.ui.theme.DiagiTheme
import com.meatrix.diagi.ui.theme.type

@Composable
fun HomeScreen() {
    HomeContent()
}

@Composable
private fun HomeContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Hello 👋",
            style = MaterialTheme.type.semiBoldLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* TODO: Add Data */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF836DF4))
        ) {
            Text(text = "+ Add Data", color = Color.White)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "My Health",
            style = MaterialTheme.type.semiBoldMedium,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Health Info Grid
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxHeight(),
            contentPadding = PaddingValues(4.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                HealthCard("Blood Pressure", "120/80 mmHg", Icons.Default.Favorite, Color(0xFFFFF1E3))
            }
            item {
                HealthCard("Glucose", "95 mg/dL", Icons.Default.InvertColors, Color(0xFFF1EEFF))
            }
            item {
                HealthCard("Cholesterol", "180 mg/dL", Icons.Default.CheckCircle, Color(0xFFFFF1E3))
            }
            item {
                HealthCard("Uric Acid", "5.8 mg/dL", Icons.Default.Opacity, Color(0xFFFFF1E3))
            }
        }
    }
}

@Composable
private fun HealthCard(title: String, value: String, icon: ImageVector, backgroundColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFFFF6D00)
            )
            Column {
                Text(text = title, fontWeight = FontWeight.Bold)
                Text(text = value, style = MaterialTheme.type.regularSmall)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeContentPreview() {
    DiagiTheme {
        HomeContent()
    }
}