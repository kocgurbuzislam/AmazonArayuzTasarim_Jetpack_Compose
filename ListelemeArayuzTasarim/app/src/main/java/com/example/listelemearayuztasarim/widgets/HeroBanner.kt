package com.example.listelemearayuztasarim.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.listelemearayuztasarim.ui.theme.mainColor

@Composable
fun HeroBanner(posterResId: Int) {

    Card(
        modifier = Modifier
            .width(380.dp)
            .height(200.dp)
            .background(mainColor),
        shape = RoundedCornerShape(8.dp),

        ) {

        Image(
            painter = painterResource(id = posterResId),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

    }
}

@Composable
fun HeroBannerRow() {

    val poters =
        listOf(R.drawable.citadel, R.drawable.mr_robot, R.drawable.the_ex, R.drawable.the_tomorrow)

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        items(poters) { potersResId ->
            HeroBanner(potersResId)

        }
    }
}
