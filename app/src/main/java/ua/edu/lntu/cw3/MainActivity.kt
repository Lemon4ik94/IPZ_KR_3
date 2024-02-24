package ua.edu.lntu.cw3

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw3.data.Datasource
import ua.edu.lntu.cw3.model.Information
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
                    MyContent()
                }
            }
        }
    }
}

@Composable
fun MyContent() {
    Box(contentAlignment = Alignment.Center) {

    }
}

@Composable
fun Content(information: Information, modifier: Modifier) {
    Card(modifier = modifier) {
        Column {
            Text(text = information.name)
            Spacer(modifier.height(5.dp))
            Text(text = information.desc)
        }
    }
}

@Composable
fun InfoList(informationList: List<Information>, modifier: Modifier) {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(informationList) {
            information -> Content(
                information = information,
                modifier = Modifier)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InfoPreview() {
    IPZ_KR_3Theme {
        InfoList(informationList = Datasource().loadInformation(), modifier = Modifier)
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun ContentPreview() {
//    IPZ_KR_3Theme {
//        MyContent()
//    }
//}