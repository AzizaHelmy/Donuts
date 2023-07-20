package com.example.donuts.ui.screen.home.composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donuts.R

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

@Composable
fun IconFavorite(modifier: Modifier = Modifier, onClickFavorite: () -> Unit = {}) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .size(34.dp)
            .clickable { onClickFavorite( )}
            .background(
                shape = CircleShape,
                color = Color.White
            ), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.icon_round_fav),
            contentDescription = "fav icon",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(4.dp)
        )
    }
}