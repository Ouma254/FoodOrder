package com.deknowh.foodorder.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deknowh.foodorder.R

@Composable
fun FoodScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.LightGray)
                ) {
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "navigate back icon",
                            tint = Color.Black
                        )
                    }
                    Spacer(modifier = Modifier.padding(30.dp))
                    Text(
                        text = "Food Order && Selection ",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Spacer(modifier = Modifier.padding(25.dp))
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(imageVector = Icons.Default.Delete,
                            contentDescription = "delete icon",
                            tint = Color.Red
                        )
                    }
                }
                Text(
                    text = "Favorites",
                    modifier = Modifier.padding(start = 5.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
//                LazyRow(modifier = Modifier.background(Color.White) ) {
//                    items(7) {
//                        Box(modifier = Modifier
//                            .height(90.dp)
//                            .background(Color.White), contentAlignment = Alignment.Center) {
//                            TextButton(
//                                onClick = { /*TODO*/ },
//                                modifier = Modifier.clip(RoundedCornerShape(1.dp))
//                            ) {
//                                Text(
//                                    text = "All Foods",
//                                    color = Color.Blue
//                                )
//                            }
//                        }
//                        Spacer(modifier = Modifier.padding(start = 15.dp))
//                    }
//                }

            }
            Spacer(modifier = Modifier.padding(top = 4.dp))
            LazyRow( ) {
                items(34) {
                    Card(
                        modifier = Modifier.padding(start = 10.dp),) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(painter = painterResource(
                                id = R.drawable.andazi),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(5.dp))
                                    .height(80.dp)
                            )
                            Text(
                                text = "Favorite Meal",
                                fontSize = 10.sp
                            )
                        }

                    }
                }
            }
            Spacer(modifier = Modifier.padding(top = 2.dp))
            Column(
                modifier = Modifier.padding(10.dp)
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "All Categories", fontWeight = FontWeight.Bold)
                LazyColumn() {
                    items(10) {
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp)) {
                            Row(horizontalArrangement = Arrangement.Center, 
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Spacer(modifier = Modifier.padding(start = 6.dp))
                                Card() {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(modifier = Modifier.size(100.dp)) {
                                            Image(painter = painterResource(
                                                id = R.drawable.piza),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .height(85.dp)
                                            )
                                            Row(
                                                verticalAlignment = Alignment.Bottom,
                                                //horizontalArrangement = Arrangement.End
                                            ) {
                                                Text(
                                                    text = "Rate",
                                                    modifier = Modifier.padding(start = 42.dp, top = 86.dp),
                                                    fontSize = 9.sp
                                                )
                                                Text(text = "4.0", fontSize = 9.sp)
                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = null,
                                                    tint = Color.Black,
                                                    modifier = Modifier.size(12.dp)
                                                )
                                            }
                                        }
                                        Text(text = "Pizza", fontSize = 12.sp)
                                    }
                                }
                                Spacer(modifier = Modifier.padding(start = 9.dp))
                                Card() {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(modifier = Modifier.size(100.dp)) {
                                            Image(painter = painterResource(
                                                id = R.drawable.andazi),
                                                contentDescription = null,
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .height(90.dp)
                                            )
                                            Row(
                                                verticalAlignment = Alignment.Bottom,
                                                //horizontalArrangement = Arrangement.End
                                            ) {
                                                Text(
                                                    text = "Rate",
                                                    modifier = Modifier.padding(start = 42.dp, top = 86.dp),
                                                    fontSize = 9.sp
                                                )
                                                Text(text = "3.5", fontSize = 9.sp)
                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = null,
                                                    tint = Color.Blue,
                                                    modifier = Modifier.size(12.dp)
                                                )
                                            }
                                        }
                                        Text(text = "Mandazi", fontSize = 12.sp)
                                    }
                                }
                                Spacer(modifier = Modifier.padding(start = 9.dp))
                                Card() {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(modifier = Modifier.size(100.dp)) {
                                            Image(painter = painterResource(
                                                id = R.drawable.cake),
                                                contentDescription = null,
                                                modifier =  Modifier
                                                    .fillMaxWidth()
                                                    .height(100.dp)
                                            )
                                            Row(
                                                verticalAlignment = Alignment.Bottom,
                                                //horizontalArrangement = Arrangement.End
                                            ) {
                                                Text(
                                                    text = "Rate",
                                                    modifier = Modifier.padding(start = 42.dp, top = 86.dp),
                                                    fontSize = 9.sp
                                                )
                                                Text(text = "3.5", fontSize = 9.sp)
                                                Icon(
                                                    imageVector = Icons.Default.Favorite,
                                                    contentDescription = null,
                                                    tint = Color.Red,
                                                    modifier = Modifier.size(12.dp)
                                                )
                                            }
                                        }
                                        Text(text = "Cake", fontSize = 12.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}