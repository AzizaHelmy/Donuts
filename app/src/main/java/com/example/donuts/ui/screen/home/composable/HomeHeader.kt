package com.example.donuts.ui.screen.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.donuts.R
import com.example.donuts.ui.composable.RoundedButton
import com.example.donuts.ui.theme.Secondary
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/20/2023.
 */

@Composable
fun HomeHeader(modifier: Modifier = Modifier) {
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
            painter = painterResource(id = R.drawable.icon_search),
            backgroundTintColor = Secondary,
            onClick = {})
    }
}