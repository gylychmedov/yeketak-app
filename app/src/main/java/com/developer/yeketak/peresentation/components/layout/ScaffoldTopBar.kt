package com.developer.yeketak.peresentation.components.layout

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ScaffoldTopBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.background,
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() } }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = "")
            }
        },
        title = {
            Text(text = "Ýeketak")

        }
    )
}


//@Preview(showBackground = true, showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun NavbarPrev() {
    ScaffoldTopBar(rememberScaffoldState(), rememberCoroutineScope())
}


