package com.pgzxc.koindemo.ui.screen

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.pgzxc.koindemo.viewmodel.DetailViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun DetailScreen(userId: Int, viewModel: DetailViewModel = getViewModel()) {
    val user = viewModel.getUser(userId)
   Surface {
        Text(text = user?.let { "User: ${it.name}" } ?: "User not found")
    }
}