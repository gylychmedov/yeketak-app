package com.developer.yeketak.peresentation.components.layout

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.developer.yeketak.peresentation.helpers.constants.Constants

@Composable
fun ScaffoldDrawerMenu() {
    Column {
        DrawMenuItem(title = "Esasy", icon = Icons.Rounded.Home, route = Constants.Screens.HOME_SCREEN)
        Divider()
        DrawMenuItem(title = "Aýdymlar", icon = Icons.Rounded.Home, route = Constants.Screens.HOME_SCREEN)
        Divider()
        DrawMenuItem(title = "Klipler", icon = Icons.Rounded.Home, route = Constants.Screens.HOME_SCREEN)

    }
}

@Composable
private fun DrawMenuItem (title: String, icon: ImageVector, route: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Icon(imageVector = icon, contentDescription = "")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = title)
    }
}