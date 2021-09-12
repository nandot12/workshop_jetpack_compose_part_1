package com.biskita.workshopjetpackcomposepart1

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biskita.workshopjetpackcomposepart1.ui.theme.WorkshopJetpackComposePart1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {




        }
    }

    @Composable
    fun showJetpack(){

        Column(modifier = Modifier.fillMaxSize()) {

            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Belajar jetpack Compose",color = Color.Black,modifier = Modifier.clickable {  } )
                Text(text = "Belajar jetpack Compose x12",color = Color.White)

                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp))


                //build textfild
                var textfield by remember {
                    mutableStateOf("")
                }

                OutlinedTextField(value = textfield, onValueChange = {textfield = it}
                    , placeholder = { Text(text = "Entry Email")},modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 10.dp, end = 10.dp))

                val context = LocalContext.current
                Button(onClick = {


                    Toast.makeText(context,textfield,Toast.LENGTH_SHORT).show()
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 5.dp, start = 10.dp,
                        end = 10.dp
                    ),shape = RoundedCornerShape(15.dp)) {

                    Text(text = "Submit")
                }

                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "sample",modifier = Modifier
                        .clip(CircleShape)
                        .clipToBounds() )


            }
            customRow()
        }




    }

    @Preview(name = "ini testing preview",showBackground = true)
    @Composable
    fun previewJetpack(){

        showJetpack()
    }

}


