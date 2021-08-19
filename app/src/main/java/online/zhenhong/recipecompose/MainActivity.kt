package online.zhenhong.recipecompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()  // should set a layout's size at first
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFF2F2F2))
    ) {
        Image(
            painter = painterResource(id = R.drawable.happy_meal_small),
            contentDescription = "Happy Meal",
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Happy Meal",
                style = TextStyle(fontSize = 26.sp)
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "800 Calories",
                style = TextStyle(fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.padding(top = 8.dp))
            Text(
                text = "$5.99",
                style = TextStyle(
                    color = Color(0xFF85bb65), fontSize = 18.sp
                )
            )
        }
    }
}