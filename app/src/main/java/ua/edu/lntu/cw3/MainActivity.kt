package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw3.ui.theme.IPZ_KR_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_KR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyContent("Android")
                }
            }
        }
    }
}

@Composable
fun MyContent() {
    Box(contentAlignment = Alignment.Center) {
        VerticalList()
    }


}

@Composable
fun VerticalList() {
    Column() {

    }
}

@Composable
fun Rows() {

}

@Composable
fun ListElement(title: String, desc: String) {
    Column {
        Text(text = "title")
        Text(text = "desc")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContentPreview() {
    IPZ_KR_3Theme {
        MyContent()
    }
}