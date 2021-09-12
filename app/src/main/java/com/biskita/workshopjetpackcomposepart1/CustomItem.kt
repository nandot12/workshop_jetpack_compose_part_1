package com.biskita.workshopjetpackcomposepart1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.biskita.workshopjetpackcomposepart1.data.User


@Composable
fun customItem(user : User){

    Column(modifier = Modifier.fillMaxWidth()) {

        Text(text = user.name)
        Text(text = user.address)
        Text(text = user.phone)
    }

}

@Composable
fun setlistCustom(data  :ArrayList<User>){

    LazyColumn{

        items(data){user ->
            customItem(user = user)
        }
    }
}