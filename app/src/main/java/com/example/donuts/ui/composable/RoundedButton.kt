package com.example.donuts.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Aziza Helmy on 7/16/2023.
 */

@Composable
fun RoundedButton(
    roundedCornerSize: Int = 12,
    backgroundTintColor: Color,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {},
    onClick: () -> Unit={}
) {
    Box(
        modifier = modifier
            .background(
                color = backgroundTintColor,
                shape = RoundedCornerShape(roundedCornerSize.dp),
            )
            .clickable { onClick }
    ) {
        content()
    }
}

@Preview
@Composable
fun PreviewRoundedButton() {
    RoundedButton(
        backgroundTintColor = Color.White,
        onClick = {}
    )
}