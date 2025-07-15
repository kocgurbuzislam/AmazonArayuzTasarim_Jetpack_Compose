package com.example.listelemearayuztasarim

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listelemearayuztasarim.ui.theme.mainColor

@Composable
fun BottomNavigationBarPage() {
    val selectedItem = remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                content = {
                    NavigationBarItem(
                        selected = selectedItem.value == 0,
                        onClick = { selectedItem.value = 0 },

                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.home),
                                contentDescription = "",
                                tint = Color.White
                            )
                        },
                        label = { Text(text = "Home", color = Color.White) },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = mainColor
                        )
                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 1,
                        onClick = { selectedItem.value = 1 },

                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.light),
                                contentDescription = "",
                                tint = Color.White
                            )
                        },
                        label = { Text(text = "With Ads", color = Color.White) },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = mainColor
                        )
                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 2,
                        onClick = { selectedItem.value = 2 },

                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.live),
                                contentDescription = "", tint = Color.White
                            )
                        },
                        label = { Text(text = "Live", color = Color.White) },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = mainColor
                        )
                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 3,
                        onClick = { selectedItem.value = 3 },

                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.download),
                                contentDescription = "", tint = Color.White
                            )
                        },
                        label = { Text(text = "Downloads", color = Color.White) },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = mainColor
                        )
                    )

                    NavigationBarItem(
                        selected = selectedItem.value == 4,
                        onClick = { selectedItem.value = 4 },

                        icon = {
                            Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = "", tint = Color.White
                            )
                        },
                        label = { Text(text = "Find", color = Color.White) },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = mainColor
                        )
                    )

                },
                containerColor = mainColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)

            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (selectedItem.value == 0) Anasayfa()

        }

    }
}