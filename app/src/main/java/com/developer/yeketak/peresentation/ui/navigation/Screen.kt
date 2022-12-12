package com.developer.yeketak.peresentation.ui.navigation

import com.developer.yeketak.peresentation.helpers.constants.Constants

sealed class Screen(val route: String) {
    object SPLASH_SCREEN : Screen(Constants.Screens.SPLASH_SCREEN)
    object HOME_SCREEN : Screen(Constants.Screens.HOME_SCREEN)
    object MUSICS_SCREEN : Screen(Constants.Screens.MUSICS_SCREEN)
    object MUSIC_DETAIL_SCREEN : Screen(Constants.Screens.MUSIC_DETAIL_SCREEN)
}