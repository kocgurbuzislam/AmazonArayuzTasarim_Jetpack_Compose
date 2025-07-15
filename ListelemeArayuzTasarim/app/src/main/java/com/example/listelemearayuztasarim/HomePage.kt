package com.example.listelemearayuztasarim


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listelemearayuztasarim.ui.theme.ListelemeArayuzTasarimTheme
import com.example.listelemearayuztasarim.ui.theme.mainColor
import com.example.listelemearayuztasarim.widgets.CategoryTabs
import com.example.listelemearayuztasarim.widgets.ContinueWatchingRow
import com.example.listelemearayuztasarim.widgets.HeroBannerRow
import com.example.listelemearayuztasarim.widgets.MoviePosterOrginalsRow
import com.example.listelemearayuztasarim.widgets.SectionHeader1
import com.example.listelemearayuztasarim.widgets.SectionHeader2


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = "", modifier = Modifier.height(24.dp)
                    )
                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.cast),
                            contentDescription = "",
                            tint = Color.White
                        )
                    }

                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "",
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = mainColor
                )

            )
        },
        containerColor = mainColor,

        ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            item { CategoryTabs() }
            item { HeroBannerRow() }
            item { SectionHeader1("Continue watching") }
            item { ContinueWatchingRow() }
            item { SectionHeader2() }
            item { MoviePosterOrginalsRow() }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListelemeArayuzTasarimTheme {
        Anasayfa()
    }
}


