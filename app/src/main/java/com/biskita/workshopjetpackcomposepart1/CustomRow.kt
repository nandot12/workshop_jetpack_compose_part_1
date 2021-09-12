package com.biskita.workshopjetpackcomposepart1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun customRow(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color(0xFF2196F3)),horizontalArrangement = Arrangement.SpaceBetween) {

        Text(text = "ini contoh row 1")
        Text(text = "ini contoh row 2")
        Text(text = "ini contoh row 3")

    }
}


@Preview(showBackground = true)
@Composable
fun previewItem(){

    customRow()

}
