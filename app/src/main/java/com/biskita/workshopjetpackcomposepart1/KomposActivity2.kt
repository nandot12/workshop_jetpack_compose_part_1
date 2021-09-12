package com.biskita.workshopjetpackcomposepart1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biskita.workshopjetpackcomposepart1.ui.theme.WorkshopJetpackComposePart1Theme

class KomposActivity2 : ComponentActivity() {

    private var dataArraylist = arrayOf("Jakarta","Bandung","Semarang")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkshopJetpackComposePart1Theme {


                setList()
            }
        }
    }

    @Composable
    fun setList(){

        dataArraylist.forEach {


            onBinView(name = it)

        }



    }

    @Composable
    fun onBinView(name  :String){
        Card(shape = RoundedCornerShape(10.dp),elevation = 5.dp) {
            Column(modifier = Modifier.fillMaxWidth()) {

                Text(text = name )
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}