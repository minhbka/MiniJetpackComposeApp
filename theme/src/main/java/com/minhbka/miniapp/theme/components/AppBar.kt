package com.minhbka.miniapp.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.minhbka.miniapp.theme.MiniAppTheme

@Composable
fun Appbar(
    title: String,
    navIcon: ImageVector? = null,
    onNav: () -> Unit = {},
) {
    TopAppBar(
        title = { Text(text = title) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        navigationIcon = {
            navIcon?.let {
                IconButton(onClick = { onNav() }) {
                    Icon(navIcon, contentDescription = "Nav Icon")
                }
            }
        },
    )
}

@Composable
@AppPreview
private fun AppBarPreview() {
    MiniAppTheme {
        Surface {
            Appbar(title = "Mini App", navIcon = Icons.Filled.ArrowBack)
        }
    }
}
