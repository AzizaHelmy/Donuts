package com.example.donuts.ui.screen.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.donuts.R
import com.example.donuts.ui.composable.RoundedButton
import com.example.donuts.ui.theme.Secondary
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

@Composable
fun HomeHeader(modifier: Modifier = Modifier, painter: Painter) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Top
    ) {
        Column(modifier = Modifier) {
            Text(text = stringResource(R.string.let_s_gonuts), style = Typography.titleMedium)
            Text(text = stringResource(R.string.order_your_favourite_donuts_from_here))
        }
        RoundedButton(
            backgroundTintColor = Secondary,
            content = {
                Image(
                    painter = painter,
                    contentDescription = "rounded icon",
                    modifier = Modifier.padding(8.dp)
                )
            })
    }
}