package com.bitscoder.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bitscoder.happybirthday.ui.theme.ContentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            HappyBirthdayTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Surface {
//
//                    }
//                    GreetingImage(message = getString(R.string.happy_thursday_text) +
//                            "Victor Oyeks!", from = getString(R.string.signature_text))
//                }
//            }
            ContentTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Surface {

                    }
                    LearnTogetherText(topic = getString(R.string.topic),
                            body1 = getString(R.string.body1), body2 = getString(R.string.body2))
                }
            }
        }
    }
}

@Composable
fun LearnTogetherText(topic: String, body1: String, body2: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column (
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.height(200.dp))
        Spacer(modifier = Modifier.height(1.dp)
        )
        Text(
            text = topic,
            fontSize = 24.sp,
            modifier = Modifier
                .align(CenterHorizontally))
        Spacer(modifier = Modifier.height(10.dp)
        )
        Text(
            text = body1,
            textAlign = TextAlign.Justify,
            fontSize = 15.sp,
            modifier = Modifier
                .align(CenterHorizontally))
        Spacer(modifier = Modifier.height(10.dp)
        )
        Text(
            text = body2,
            fontSize = 15.sp,
            modifier = Modifier
                .align(CenterHorizontally)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 50.sp,
            modifier = Modifier
                .align(CenterHorizontally)
        )
        Text(
            text = from,
            fontSize = 12.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = CenterHorizontally)
        )
    }
}

//@Composable
//fun ContentImage(modifier: Modifier = Modifier) {
//
//}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale  = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview() {
//    HappyBirthdayTheme {
//        GreetingImage(message = "Happy Birthday our wife!", from = "From Abiola")
//    }
//}

@Preview(showBackground = true)
@Composable
fun ContentPreview(){
    ContentTheme {
        LearnTogetherText(topic = "Insert topic here", body1 = "Insert first text body here",
            body2 = "Insert second body text here")
    }
}