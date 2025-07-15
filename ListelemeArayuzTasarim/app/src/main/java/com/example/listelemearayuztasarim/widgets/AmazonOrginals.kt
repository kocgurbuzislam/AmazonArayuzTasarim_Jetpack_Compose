package com.example.listelemearayuztasarim.widgets

import android.graphics.Movie
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
fun MoviePosterOrginals(posterResId: Int) {
    Card(
        modifier = Modifier
            .width(150.dp)
            .height(200.dp),
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
fun MoviePosterOrginalsRow() {
    val postersOrginals =
        listOf(R.drawable.shotgun, R.drawable.the_idea, R.drawable.moje, R.drawable.the_beekeeper)


    LazyRow (
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ){
        items(postersOrginals){posterResId->
            MoviePosterOrginals(posterResId)

        }

    }

}