package com.developer.yeketak.peresentation.components.layout

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun Layout(content: @Composable () -> Unit) {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { ScaffoldTopBar(scaffoldState, scope) },
        content = { content() },
        drawerContent = { ScaffoldDrawerMenu()},
        drawerBackgroundColor = MaterialTheme.colors.background,
        drawerGesturesEnabled = true,
    )

}