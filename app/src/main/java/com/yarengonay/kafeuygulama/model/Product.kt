package com.yarengonay.kafeuygulama.model
data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val price: Double,
    val rating: Double,
    val imageRes: Int
)