package kz.android.theme.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

enum class HomeSections(val title: String, val icon: ImageVector, val route: String) {
    SCREEN1("Screen1", Icons.Default.Home, "home/screen1"),
    SCREEN2("Screen2", Icons.Default.AccountCircle, "home/screen2"),
    SCREEN3("Screen3", Icons.Default.Search, "home/screen3")
}
