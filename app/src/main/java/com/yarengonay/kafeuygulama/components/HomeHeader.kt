package com.yarengonay.kafeuygulama.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yarengonay.kafeuygulama.model.Product

@Composable
fun HomeHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Hoşgeldin,",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Gray
                )
                Text(
                    text = "CANIN NE İSTER? 🍪☕",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF4E342E)
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Bildirim",
                    tint = Color(0xFF4E342E),
                    modifier = Modifier.size(28.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(12.dp)),
            placeholder = { Text("Kahve veya cookie ara...", color = Color.Gray) },
            leadingIcon = {
                Icon(Icons.Default.Search, contentDescription = null, tint = Color(0xFF4E342E))
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFF5F5F5),
                unfocusedContainerColor = Color(0xFFF5F5F5),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            shape = RoundedCornerShape(12.dp)
        )
    }
}

@Composable
fun CategoryBar(
    categories: List<String>,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(categories) { category ->
            val isSelected = category == selectedCategory
            val containerColor = if (isSelected) Color(0xFF4E342E) else Color(0xFFEFEBE9)
            val contentColor = if (isSelected) Color.White else Color(0xFF4E342E)

            Surface(
                color = containerColor,
                contentColor = contentColor,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .clickable { onCategorySelected(category) }
            ) {
                Text(
                    text = category,
                    modifier = Modifier.padding(horizontal = 24.dp, vertical = 10.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun ProductItem(
    product: Product,
    onItemClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable { onItemClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color(0xFFEFEBE9), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text("☕", style = MaterialTheme.typography.headlineMedium)
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = product.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = product.description,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "₺${product.price}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4E342E)
                    )

                    IconButton(
                        onClick = { },
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFFD7CCC8), CircleShape)
                    ) {
                        Icon(Icons.Default.Add, contentDescription = "Ekle", tint = Color(0xFF4E342E))
                    }
                }
            }
        }
    }
}

