package com.example.donuts.ui.screen.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donuts.ui.screen.home.DonutsUiState
import com.example.donuts.ui.theme.Typography

/**
 * Created by Aziza Helmy on 7/19/2023.
 */
@Composable
fun DonutsItem(state: DonutsUiState) {
    Box {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(140.dp)
                .height(115.dp)
                .shadow(
                    shape = RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp,
                        bottomStart = 8.dp,
                        bottomEnd = 8.dp
                    ), elevation = 8.dp
                )
                .background(Color.White)
                .padding(horizontal = 2.dp)
        ) {
            Text(
                text = state.name,
                modifier = Modifier.padding(top = 16.dp),
                style = Typography.bodyMedium
            )
            Text(
                text = state.price,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp), style = Typography.bodySmall
            )
        }
        Image(
            painter = painterResource(id = state.image),
            contentDescription = "",
            modifier = Modifier
                .size(120.dp)
                .offset(y = -60.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewDonutsItem() {
    DonutsItem(DonutsUiState())
}