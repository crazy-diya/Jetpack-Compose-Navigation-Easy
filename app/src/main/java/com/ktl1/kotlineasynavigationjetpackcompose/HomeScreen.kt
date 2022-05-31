package com.ktl1.kotlineasynavigationjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ktl1.kotlineasynavigationjetpackcompose.destinations.DetailsScreenDestination
import com.ktl1.kotlineasynavigationjetpackcompose.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator,
    user: User
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Welcome to Home Page ${user.name}!")
        Button(onClick = {
            navigator.navigate(DetailsScreenDestination)
        }) {
            Text(text = "Click")

        }
        Text(text = "You are selected ${user.university}")
    }
}