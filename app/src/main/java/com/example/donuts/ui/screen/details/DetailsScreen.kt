package com.example.donuts.ui.screen.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.donuts.R
import com.example.donuts.ui.composable.DefaultButton
import com.example.donuts.ui.composable.RoundedButton
import com.example.donuts.ui.navigation.localNavigationProvider
import com.example.donuts.ui.theme.Primary
import com.example.donuts.ui.theme.PrimaryText
import com.example.donuts.ui.theme.Secondary
import com.example.donuts.ui.theme.SecondaryText
import com.example.donuts.ui.theme.Typography
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Created by Aziza Helmy on 7/15/2023.
 */

@Composable
fun DetailsScreen(viewModel: DetailsViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsState()
    val navController = localNavigationProvider.current

    val systemUiControl = rememberSystemUiController()
    systemUiControl.setStatusBarColor(color = Secondary, darkIcons = true)

    DetailsContent(
        state = state,
        onClickBack = { navController.navigateUp() },
        detailsInteractionsListener = viewModel
    )
}

@Composable
fun DetailsContent(
    state: DetailsUiState,
    onClickBack: () -> Unit = {},
    detailsInteractionsListener: DetailsInteractionsListener
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Secondary)
    ) {
        Box(
            modifier = Modifier.fillMaxHeight(0.5f)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Image(
                    painter = painterResource(id = state.image),
                    contentDescription = "Donut Image",
                    modifier = Modifier.size(220.dp),
                    contentScale = ContentScale.FillWidth,
                    alignment = Alignment.Center
                )

            }
            Image(
                painter = painterResource(id = R.drawable.icon_round_arrow_back),
                contentDescription = "back image",
                modifier = Modifier
                    .padding(24.dp)
                    .clickable { onClickBack() }
            )
        }
        Card(
            modifier = Modifier
                .zIndex(5f)
                .padding(end = 32.dp)
        ) {
            Icon(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(White)
                    .padding(4.dp),
                painter = painterResource(id = R.drawable.icon_fav),
                contentDescription = "",
                tint = Primary
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(3 / 4f)
                .clip(
                    shape = AbsoluteRoundedCornerShape(32.dp, 32.dp, 0.dp, 0.dp),
                )
                .background(
                    color = Color.White
                )
                .padding(24.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(text = state.name, style = Typography.titleMedium)
            Text(
                text = stringResource(R.string.about_gonut),
                style = Typography.titleSmall.copy(color = PrimaryText)
            )
            Text(
                text = state.description,
                style = Typography.bodySmall.copy(color = SecondaryText)
            )
            Text(
                text = stringResource(R.string.quantity),
                style = Typography.titleSmall.copy(color = PrimaryText)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                RoundedButton(
                    backgroundTintColor = Color.White,
                    content = {
                        Text(
                            text = "-",
                            style = Typography.titleMedium.copy(color = Color.Black),
                        )
                    }, onClick = detailsInteractionsListener::onClickDecrease
                )
                RoundedButton(
                    backgroundTintColor = Color.White,
                    content = {
                        Text(
                            text = state.quantity.toString(),
                            style = Typography.bodyLarge.copy(color = Color.Black),
                        )
                    },
                )
                RoundedButton(backgroundTintColor = Color.Black, content = {
                    Text(
                        text = "+",
                        style = Typography.titleMedium.copy(color = Color.White),
                        color = Color.White,
                    )
                }, onClick = detailsInteractionsListener::onClickIncrease)
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 44.dp)
                    .fillMaxWidth()
            ) {
                val totalPrice = state.quantity * (state.price).toInt()
                Text(
                    text = "$$totalPrice",
                    style = Typography.titleMedium.copy(color = Black, fontSize = 18.sp)
                )
                DefaultButton(
                    text = stringResource(R.string.add_to_cart),
                    containerColor = Primary,
                    contentColor = Color.White,
                    onClick = {},
                    modifier = Modifier
                    //.fillMaxWidth(0.6f)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewDetailsScreen() {
    DetailsScreen()
}