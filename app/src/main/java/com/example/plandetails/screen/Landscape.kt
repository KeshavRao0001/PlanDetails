package com.example.plandetails.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plandetails.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun landscapeMode() {
    val height = LocalConfiguration.current.screenHeightDp.dp
    val width = LocalConfiguration.current.screenWidthDp.dp
    val agerState = rememberPagerState()

    Box(
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
                .background(color = Common.navyBlue),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                state = agerState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                count = 4

            ) {
                Box(modifier = Modifier,
                    contentAlignment = Alignment.BottomCenter) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(16.dp),
                        contentScale = ContentScale.Crop
                    )

                    Column() {
                        Text(text = "WE’RE ALWAYS ON LOREM AMET",
                            modifier = Modifier
                                .fillMaxWidth(),
                            color = Color.White,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Stream live games at home or on the go. Lorem ipsum dolor sit amet, consectetur adipiscing do eiusmod tempor.",
                            modifier = Modifier
                                .fillMaxWidth(),
                            color = Color.White,
                            fontSize = 14.sp)
                    }
                }


            }
            HorizontalPagerIndicator(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 4.dp),
                indicatorShape = RectangleShape,
                indicatorHeight = 3.dp,
                spacing = 5.dp,
                indicatorWidth = 25.dp,
                activeColor = Color.White,
                inactiveColor = Color.Gray,
                pageCount = 4,
                pagerState = agerState
            )
        }

    }


}
