package com.pgzxc.koindemo.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.pgzxc.koindemo.viewmodel.HomeViewModel
import org.koin.android.compat.ScopeCompat.getViewModel
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel = getViewModel()) {
    val greeting = viewModel.greet("Koin User")
      Surface {
        Column {
            Text(text = greeting)
            Button(onClick = { navController.navigate("detail/2") }) {
                Text("Go to Detail")
            }
        }
    }
}