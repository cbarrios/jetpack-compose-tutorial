package com.lalosapps.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lalosapps.composetutorial.domain.model.Message
import com.lalosapps.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MessageCard(
                        Message(
                            "Android",
                            "Jetpack Compose"
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = stringResource(id = R.string.contact_profile_picture)
        )
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        MessageCard(
            Message(
                "Colleague",
                "Hey, take a look at Jetpack Compose, it's great!"
            )
        )
    }
}