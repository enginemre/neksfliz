package com.engin.neksfliz.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.engin.neksfliz.home.api.HomeApi

@Composable
fun AppNavGraph(modifier : Modifier,navController : NavHostController,navigationProvider: NavigationProvider) {
    NavHost(navController = navController, startDestination = HomeApi.HomeRoot){
        navigationProvider.homeApi.registerGraph(navController,this)
        navigationProvider.newAndPopularApi.registerGraph(navController,this)
        navigationProvider.downloadsApi.registerGraph(navController,this)
    }
}