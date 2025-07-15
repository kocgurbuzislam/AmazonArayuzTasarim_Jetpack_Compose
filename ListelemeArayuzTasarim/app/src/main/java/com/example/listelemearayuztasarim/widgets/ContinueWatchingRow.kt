package com.example.listelemearayuztasarim.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.listelemearayuztasarim.R

@Composable
fun MoviePoster(posterResId: Int) {

    Card(
        modifier = Modifier
            .width(250.dp)
            .height(150.dp),
        shape = RoundedCornerShape(8.dp)
    ) {

        Image(
            painter = painterResource(id = posterResId),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

    }

}

@Composable
fun ContinueWatchingRow() {
    val posters = listOf(R.drawable.the_summer, R.drawable.pruge, R.drawable.the_boys)

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        items(posters) { posterResId ->
            MoviePoster(posterResId)

        }


    }
}