package com.example.donuts.ui.screen.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donuts.R
import com.example.donuts.ui.composable.DefaultButton
import com.example.donuts.ui.theme.Secondary
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/14/2023.
 */

@Composable
fun OnBoardingScreen() {
    // val navController = localNavigationProvider.current
    OnBoardingContent(onClickGetStart = { })
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingContent(onClickGetStart: () -> Unit) {
    Box(
        modifier = Modifier
            .background(Secondary),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight(.6f)
                .fillMaxWidth(1.5f)
                .basicMarquee(
                    iterations = 1,
                    velocity = 100.dp,
                    initialDelayMillis = 0
                ),
            painter = painterResource(id = R.drawable.donuts),
            contentDescription = "Donuts Image",
            contentScale = ContentScale.FillHeight
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .aspectRatio(2 / 4f),
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = stringResource(R.string.gonuts_with_donuts),
                style = Typography.titleLarge,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = stringResource(R.string.gonuts_with_donuts_is_a_sri_lanka_dedicated_food_outlets_for_specialize_manufacturing_of_donuts_in_colombo_sri_lanka),
                style = Typography.bodySmall
            )
            DefaultButton(
                text = stringResource(R.string.get_started),
                containerColor = Color.White,
                contentColor = Color.Black,
                onClick = onClickGetStart
            )
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun PreviewOnBoardingScreen() {
    OnBoardingScreen()
}