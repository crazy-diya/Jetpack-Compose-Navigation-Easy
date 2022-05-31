package com.ktl1.kotlineasynavigationjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ktl1.kotlineasynavigationjetpackcompose.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun DetailsScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to Login Page!")
        Text(text = "Welcome to Registration Page!")

    }
}