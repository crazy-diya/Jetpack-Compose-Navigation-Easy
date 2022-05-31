package com.ktl1.kotlineasynavigationjetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ktl1.kotlineasynavigationjetpackcompose.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(true)
@Destination

@Composable
fun LoginScreen(navigator: DestinationsNavigator) {
    var name by remember {
        mutableStateOf("")
    }
    var unversity by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to Login Page!")

        TextField(
            value = name,
            onValueChange = {
                name = it
            },
            placeholder = {
                Text("Enter your Name")
            },

            )

        TextField(
            value = unversity,
            onValueChange = {
                unversity = it
            },
            placeholder = {
                Text("Enter your University ")
            },

            )
        Button(onClick = {
            navigator.navigate(
                HomeScreenDestination(
                    User(
                        name = name,
                        university = unversity
                    )
                )
            )
        }) {

        }
    }

}