package com.example.donuts.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.donuts.R
import com.example.donuts.ui.screen.home.composable.DonutsItem
import com.example.donuts.ui.screen.home.composable.DonutsOffersItem
import com.example.donuts.ui.screen.home.composable.HomeHeader
import com.example.donuts.ui.theme.Background
import com.example.donuts.ui.theme.BlueCard
import com.example.donuts.ui.theme.Secondary
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/15/2023.
 */
@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    // val navController = localNavigationProvider.current
    val state by viewModel.state.collectAsState()
    HomeContent(state)
}

@Composable
fun HomeContent(homeUiState: HomeUiState) {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 24.dp),
        modifier = Modifier
            .background(
                Background
            )

    ) {
        item {
            HomeHeader(
                modifier = Modifier.padding(16.dp),
                painter = painterResource(id = R.drawable.icon_search)
            )
        }
        item {
            Text(
                text = stringResource(R.string.today_offers),
                modifier = Modifier.padding(16.dp),
                style = Typography.bodyLarge
            )
        }
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.padding(bottom = 32.dp)
            ) {
                itemsIndexed(homeUiState.offers) { index, item ->
                    val color = if (index % 2 != 0) Secondary else BlueCard
                    DonutsOffersItem(backgroundTint = color, item)
                }
            }
        }
        item {
            Text(
                modifier = Modifier.padding(16.dp),
                text = stringResource(R.string.donuts),
                style = Typography.bodyLarge
            )
        }
        item {
            LazyRow(
                modifier = Modifier,
                contentPadding = PaddingValues(top = 64.dp, start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(homeUiState.donuts) {
                    DonutsItem(it)
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}