package com.example.donuts.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donuts.R

/**
 * Created by Aziza Helmy on 7/16/2023.
 */

@Composable
fun RoundedButton(
    painter: Painter,
    roundedCornerSize: Int = 12,
    backgroundTintColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier

            .background(
                color = backgroundTintColor,
                shape = RoundedCornerShape(roundedCornerSize.dp),
            )
            .clickable { onClick }
    ) {
        Image(
            painter = painter,
            contentDescription = "rounded icon",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable
fun PreviewRoundedButton() {
    RoundedButton(
        painter = painterResource(id = R.drawable.icon_search),
        backgroundTintColor = Color.White,
        onClick = {}
    )
}