package com.yarengonay.kafeuygulama.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yarengonay.kafeuygulama.components.CategoryBar
import com.yarengonay.kafeuygulama.components.HomeHeader
import com.yarengonay.kafeuygulama.components.ProductItem
import com.yarengonay.kafeuygulama.data.ProductDataSource

@Composable
fun HomeScreen() {
    var selectedCategory by remember { mutableStateOf("Hepsini Gör") }
    val filteredProducts = if (selectedCategory == "Hepsini Gör") {
        ProductDataSource.productList
    } else {
        ProductDataSource.productList.filter { it.category == selectedCategory }
    }

    Scaffold(
        containerColor = Color(0xFFF9F9F9)
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(bottom = 100.dp)
        ) {


            item {
                HomeHeader()
            }

            item {
                CategoryBar(
                    categories = listOf("Hepsini Gör", "Coffee", "Cookie"),
                    selectedCategory = selectedCategory,
                    onCategorySelected = { secilen ->
                        selectedCategory = secilen
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            items(filteredProducts) { product ->
                ProductItem(
                    isim = product.name,
                    resimId = product.imageRes,
                    fiyat = product.price,
                    onItemClick = { }
                )
            }
        }
    }
}