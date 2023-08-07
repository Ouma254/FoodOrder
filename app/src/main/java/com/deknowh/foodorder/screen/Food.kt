package com.deknowh.foodorder.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deknowh.foodorder.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodScren() {
    val search by remember {
        mutableStateOf("")
    }
    Column {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Row {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "user icon",
                        modifier = Modifier.padding(top = 20.dp, start = 5.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 10.dp, top = 5.dp))
                    OutlinedTextField(
                        value = search,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                            .height(45.dp),
                        onValueChange = {
                            //search = it
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = null
                            )
                        },
                        placeholder = {
                            Text(text = "Search", fontSize = 12.sp)
                        }
                    )

                    Spacer(modifier = Modifier.padding(start = 7.dp))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.padding(top = 10.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_message_24),
                            contentDescription = null
                        )
                    }
                }
                Column {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Column {
                            Text(text = "Recent")
                            LazyRow() {
                                items(20) {
                                    Card(modifier = Modifier.padding(5.dp)) {
                                        Column {
                                            Image(
                                                painter = painterResource(id = R.drawable.ic_launcher_background),
                                                contentDescription = "icon"
                                            )
                                            Text(
                                                text = "Recent",
                                                modifier = Modifier.padding(start = 10.dp),
                                                fontSize = 12.sp
                                            )
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.padding(5.dp))
//                            Box(modifier = Modifier.fillMaxWidth()) {
//                                Column {
//                                    Text(text = "Latest Chats")
//                                    LazyColumn() {
//                                        items(30) {
//                                            Row {
//                                                Image(
//                                                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                                                    contentDescription = null,
//                                                    modifier = Modifier.clip(CircleShape).size(0.dp)
//                                                )
//                                                Text(text = "The new message is incoming")
//                                                Text(text = "19:00 pm", fontSize = 9.sp)
//                                            }
//                                        }
//                                    }
//                                }
//                            }
                        }
                        Spacer(modifier = Modifier.padding(10.dp))
                        // bottom navigation bar
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)
                        ) {
                            Row(verticalAlignment = Alignment.Bottom, modifier = Modifier.padding(top = 570.dp)) {
                                //home icon
                                Column {
                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier.padding(start= 1.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Home,
                                            contentDescription = null,
                                            tint = Color.Blue
                                        )
                                    }
                                    Text(
                                        text = "Home",
                                        fontSize = 12.sp,
                                        color = Color.Blue,
                                        modifier = Modifier
                                            .padding(start = 7.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.padding(start = 10.dp))
                                // group icon
                                Column {
                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier.padding(start = 10.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.baseline_group_24),
                                            contentDescription = "group"
                                        )
                                    }
                                    Text(
                                        text = "Network",
                                        fontSize = 12.sp,
                                        color = Color.Black,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.padding(start = 10.dp))
                                // add box
                                Column {
                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier.padding(start = 10.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.baseline_add_box_24),
                                            contentDescription = "add box"
                                        )
                                    }
                                    Text(
                                        text = "Post",
                                        fontSize = 12.sp,
                                        color = Color.Black,
                                        modifier = Modifier
                                            .padding(start = 20.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.padding(start = 10.dp))
                                //  notification icon
                                Column {
                                    IconButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier.padding(start = 10.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Notifications,
                                            contentDescription = null
                                        )
                                    }
                                    Text(
                                        text = "Notifications",
                                        fontSize = 12.sp,
                                        color = Color.Black,
                                        modifier = Modifier
                                            .padding(start = 1.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.padding(start = 10.dp))
                                // jobs icon
                                Column {
                                    IconButton(
                                        onClick = { /*TODO*/ }
                                    ) {
                                        Icon(
                                            painter =  painterResource(id = R.drawable.baseline_work_24),
                                            contentDescription = null
                                        )
                                    }
                                    Text(
                                        text = "Jobs",
                                        fontSize = 12.sp,
                                        color = Color.Black,
                                        modifier = Modifier
                                            .padding(start = 9.dp)
                                    )
                                }
                            }
                        }
                    }
                }



            }
        }
    }
}