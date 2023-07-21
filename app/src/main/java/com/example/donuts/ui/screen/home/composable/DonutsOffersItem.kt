package com.example.donuts.ui.screen.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donuts.ui.screen.home.OffersUiState
import com.example.donuts.ui.theme.BlueCard
import com.example.donuts.ui.theme.SecondaryText
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/17/2023.
 */

@Composable
fun DonutsOffersItem(
    backgroundTint: Color,
    state: OffersUiState,
    donutName: String,
    onClickDonut: (String) ->Unit = {},
    onClickFavorite: () -> Unit = {}
) {
    Box {
        Card(
            modifier = Modifier
                .clickable { onClickDonut(donutName) }
                .width(193.dp)
                .height(325.dp)
                .clip(RoundedCornerShape(20.dp)),
            colors = CardDefaults.cardColors(backgroundTint),
            ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                IconFavorite(onClickFavorite = onClickFavorite)
                Column(modifier = Modifier.padding(start = 20.dp, end = 16.dp)) {
                    Text(
                        text = state.name,
                        modifier = Modifier.padding(top = 16.dp, bottom = 12.dp),
                        style = Typography.labelLarge
                    )
                    Text(
                        text = state.description,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 3,
                        style = Typography.bodySmall.copy(color = SecondaryText)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = state.discount,
                            style = Typography.bodySmall.copy(color = SecondaryText),
                            textDecoration = TextDecoration.LineThrough,
                            modifier = Modifier.padding(end = 4.dp)
                        )
                        Text(text = "$${state.price}", style = Typography.bodyLarge)
                    }
                }
            }
        }
        Image(
            painter = painterResource(id = state.image),
            contentDescription = "",
            modifier = Modifier
                .padding(start = 45.dp, top = 10.dp)
                .size(200.dp),
            contentScale = ContentScale.Fit
        )
    }


}

@Preview(showSystemUi = true)
@Composable
fun PreviewDonutsOfferItem() {
    //DonutsOffersItem(BlueCard, OffersUiState(), onClickDonut = {})
}
