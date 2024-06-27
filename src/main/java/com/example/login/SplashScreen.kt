import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onClick: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000) // Delay selama 2 detik sebelum menavigasi ke login
        onClick()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .clickable(onClick = onClick), // Handle click event to dismiss SplashScreen
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.starbucklogo),
            contentDescription = "Starbuck Logo",
            modifier = Modifier.size(150.dp)
        )
        Text(
            text = "Starbuck",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
