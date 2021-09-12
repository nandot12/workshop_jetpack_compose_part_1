package com.biskita.workshopjetpackcomposepart1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.biskita.workshopjetpackcomposepart1.data.User
import com.biskita.workshopjetpackcomposepart1.ui.theme.WorkshopJetpackComposePart1Theme

class MainActivity3 : ComponentActivity() {

    private var dataUser = ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initArray()
        setContent {
            WorkshopJetpackComposePart1Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    setlistCustom(data = dataUser)
                }
            }
        }
    }
    fun initArray(){

        var user = User("nando","jalan xx","08392839283")
        var user1 = User("nando 2","jalan xx2","08392839283")
        dataUser.add(user)
        dataUser.add(user1)
    }
}


