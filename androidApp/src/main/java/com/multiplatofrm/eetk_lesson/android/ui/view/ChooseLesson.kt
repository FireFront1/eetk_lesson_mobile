package com.multiplatofrm.eetk_lesson.android.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.multiplatofrm.eetk_lesson.android.ui.view.module.CustomTextField

@Preview(showBackground = true)
@Composable
fun ChooseLesson() {
    val searchText = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column() {
            SearchViewLesson(searchState = searchText)
        }

        LazyColumn(
            modifier = Modifier
            .padding(
                start = 10.dp,
                end = 10.dp,
                top = 40.dp
            ),
            verticalArrangement = Arrangement.spacedBy(10.dp))
        {
            items(listOf("first", "second", "three")) {
                ItemWidgetInfo(it)
            }
        }
    }
}

@Composable
fun ItemWidgetInfo(data: String="preview") {
    Box(modifier = Modifier
        .background(Color.Gray, shape = RoundedCornerShape(30))
        .height(45.dp)
        .fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = data, fontSize = 18.sp,
                style = TextStyle(fontStyle = FontStyle.Italic)
            )
        }
    }
}

@Composable
fun SearchViewLesson(searchState: MutableState<String>) {
    BoxWithConstraints() { // Имеет maxHeight, maxWeight для адаптации
        CustomTextField(
            leadingIcon = {
                Icon(
                    Icons.Filled.Search,
                    null,
                    tint = LocalContentColor.current.copy(alpha = 0.3f)
                )
            },
            searchState = searchState,
            modifier = Modifier
                .background(
                    Color.White,
                    RoundedCornerShape(30)
                )
                .padding(4.dp)
                .height(40.dp)
                .width(300.dp),
            fontSize = 18.sp,
            placeholderText = "поиск")
    }
}