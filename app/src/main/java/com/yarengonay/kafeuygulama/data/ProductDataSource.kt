package com.yarengonay.kafeuygulama.data

import com.yarengonay.kafeuygulama.model.Product
import com.yarengonay.kafeuygulama.R
object ProductDataSource {
    val productList = listOf(
        Product(
            id = 1,
            name = "Laren'in Kahvesi",
            category = "Coffee",
            description = "Mekanımızın özel imzası kahvesi, titizlikle seçilmiş çekirdeklerle hazırlanan eşsiz bir lezzet.",
            price = 200.0,
            rating = 4.9,
            imageRes = R.drawable.larenscofe
        ),
        Product(
            id = 2,
            name = "Kehribar",
            category = "Coffee",
            description = "Yoğun espresso süt köpüğü ile zengin lezzet.",
            price = 200.0,
            rating = 4.5,
            imageRes = R.drawable.kehribar
        ),
        Product(
            id = 3,
            name = "Saraylı",
            category = "Coffee",
            description = "Geleneksel bakır cezvede ağır ateşte pişen, yanında çifte kavrulmuş lokumla sunulan kahve.",
            price = 200.0,
            rating = 4.5,
            imageRes = R.drawable.sarayli_turkish_coffee
        ),
        Product(
            id = 4,
            name = "Kızıl Yakut",
            category = "Coffee",
            description = "Karadeniz'in en taze yapraklarından özel harman.",
            price = 200.0,
            rating = 4.5,
            imageRes = R.drawable.kizil_yakut_top_down
        ),
        Product(
            id = 5,
            name = "Dolce Vita",
            category = "Coffee",
            description = "Espresso, karamel, vanilya ve belki de bir tutam tarçın.",
            price = 200.0,
            rating = 4.5,
            imageRes = R.drawable.dolcevv
        ),
        Product(
            id = 6,
            name = "Klasik",
            category = "Coffee",
            description = "Geleneksel americano lezzeti sade ve güçlü.",
            price = 200.0,
            rating = 4.5,
            imageRes = R.drawable.klasik
        ),
        Product(
            id = 7,
            name = "Laren Rüyası",
            category = "Cookie",
            description = "Karamelli, Belçika çikolatası ve lotus bisküvisi ile harmanlanmış lezzet.",
            price = 250.0,
            rating = 4.9,
            imageRes = R.drawable.laren_ruyasi_lotus_style
        ),
        Product(
            id = 8,
            name = "Fıstık Prens",
            category = "Cookie",
            description = "Gerçek Antep fıstığının başrolde olduğu dolgulu cookie.",
            price = 250.0,
            rating = 4.5,
            imageRes = R.drawable.fistik_prens_loaded_style
        ),
        Product(
            id = 9,
            name = "Mutluluk Kırığı",
            category = "Cookie",
            description = "Gerçek Belçika Çikolatası, Vanilya Özü ve Frambuaz'ın eşsiz uyumu.",
            price = 250.0,
            rating = 4.7,
            imageRes = R.drawable.mutluluk
        ),
        Product(
            id = 10,
            name = "Velvet Crush",
            category = "Cookie",
            description = "Yaban mersininin baş döndürücü lezzeti ve beyaz çikolata.",
            price = 250.0,
            rating = 4.4,
            imageRes = R.drawable.velvet
        ),
        Product(
            id = 11,
            name = "Charlotte",
            category = "Cookie",
            description = "Belçika çikolatasının yoğunluğu ile vişnenin tazeleyici lezzeti.",
            price = 250.0,
            rating = 4.8,
            imageRes = R.drawable.charlotte_cookie_loaded_style
        ),
        Product(
            id = 12,
            name = "Lemon Zest",
            category = "Cookie",
            description = "Limon kabuğunun canlandırıcı ve keskin lezzeti.",
            price = 250.0,
            rating = 4.6,
            imageRes = R.drawable.lemon_cookie_loaded_style
        )
    )
}