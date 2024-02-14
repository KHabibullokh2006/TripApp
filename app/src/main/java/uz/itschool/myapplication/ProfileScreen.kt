package uz.itschool.myapplication

import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import uz.itschool.myapplication.ui.theme.MyApplicationTheme

class ProfileScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier.padding(10.dp)
                    ){
                        Text(text = "Your Profile", fontWeight = FontWeight.Black, fontSize = 32.sp)
                        Row {
//                            AsyncImage(model = "", contentDescription = null)
                            Column {
                                Text(text = "Hello, Nigga", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                                Text(text = "Tashkent, Uzbekistan", color = Color.Gray)
                            }
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(text = "Personal Information", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(text = "Notification", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(text = "FAQ", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(text = "Dark Mode", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(text = "Language", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                        Card(
                            modifier = Modifier.padding(10.dp),
                            border = BorderStroke(0.05.dp, color = Color.Black)
                        ) {
                            Text(modifier = Modifier.clickable {  }, text = "Logout", fontSize = 20.sp, fontWeight = FontWeight.Black)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApplicationTheme {
        Greeting2("Android")
    }
}