package com.example.listelemearayuztasarim.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listelemearayuztasarim.R
import com.example.listelemearayuztasarim.ui.theme.textColor

@Composable
fun SectionHeader1(text: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, top = 16.dp, bottom = 8.dp)
    ) {
        Text(
            text = text,
            style = TextStyle(
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            ),
        )

        Spacer(modifier = Modifier.padding(start = 4.dp))

        Icon(
            painter = painterResource(R.drawable.arrow_right), contentDescription = "",
            tint = Color.White

        )


    }
}

@Composable
fun SectionHeader2() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, top = 16.dp, bottom = 8.dp)
    ) {
        Text(
            text = "Prime",
            color = textColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = " - ",
            color = Color.White,
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Amazon Originals And Exclusives ",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )


    }
}