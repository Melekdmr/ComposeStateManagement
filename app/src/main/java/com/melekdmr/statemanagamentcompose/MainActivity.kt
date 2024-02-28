package com.melekdmr.statemanagamentcompose

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.melekdmr.statemanagamentcompose.ui.theme.StatemanagamentComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
          MainScreen()

        }
    }
}
  @Composable
  fun MainScreen(){
      //State Hosting
      var myString= remember {
          mutableStateOf("")
      }
      Surface(modifier = Modifier.fillMaxSize(), color = Color.DarkGray) {

          Column(verticalArrangement = Arrangement.Center,
              horizontalAlignment = Alignment.CenterHorizontally

          ) {
              SpecialText(string = "Test")
              Spacer(modifier = Modifier.padding(5.dp))
              SpecialText(string = "Android")
              Spacer(modifier = Modifier.padding(5.dp))
              SpecialTextField(myString.value){
                  myString.value=it
              }


      }


      }

  }

@Composable
fun SpecialText(string:String){

    Text(text = string,
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.SansSerif
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpecialTextField( string: String,function:(String)->Unit){


   TextField(value =string , onValueChange =function)

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  MainScreen()
}