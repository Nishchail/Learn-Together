package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                GreetingMessage("Message")
            }
        }
    }
}

@Composable
fun GreetingMessage(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        modifier = modifier
            .padding(4.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.text_1),
            fontSize = 24.sp,
            lineHeight = 20.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
        )
        Text(
            text = stringResource(R.string.text_2),
            fontSize = 14.sp,
            modifier = modifier
                .padding(start = 16.dp , end = 16.dp),
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify
        )

        Text(
            text = stringResource(R.string.text_3),
            fontSize = 14.sp,
            modifier = modifier
                .padding(16.dp),
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingMessage("message")
    }
}