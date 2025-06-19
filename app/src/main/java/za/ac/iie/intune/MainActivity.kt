package za.ac.iie.intune

import android.annotation.SuppressLint
import android.hardware.biometrics.BiometricManager.Strings
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import za.ac.iie.intune.ui.theme.IntuneTheme

class MainActivity : ComponentActivity() {

    // Data Arrays
    var songs = ArrayList<Strings>()
    var artists = ArrayList<Strings>()
    var review = ArrayList<Strings>()
    var comment = ArrayList<Strings>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            //Show Splash Screen
            setContentView(R.layout.splash_screen)

            Handler(Looper.getMainLooper()).postDelayed({
                showMainScreen()
            }, 3000) //Splash Delay 3 Seconds
        } catch (e: Exception) {
            Toast.makeText(this, "Error loading Welcome Screen: ${e.message}", Toast.LENGTH_LONG)
                .show()
        }

    }

    @SuppressLint("MissingInflatedId")
    private fun showMainScreen() {
        try {
            setContentView(R.layout.activity_main)

            val addPlayListButton = findViewById<Button>(R.id.addPlayListButton)
            addPlayListButton.setOnClickListener {
                showAddtoPlaylist()
                val exitButton = findViewById<Button>(R.id.btnExit)
                exitButton.setOnClickListener {

                }
            }


        } catch (e: Exception) {
            Toast.makeText(this, "Main Screen Error: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }


    @SuppressLint("MissingInflatedId")
    private fun showAddtoPlaylist() {
        try {
            setContentView(R.layout.activity_second)

            val BackButton = findViewById<Button>(R.id.btnBack)
            BackButton.setOnClickListener {
                showMainScreen()

                val exitButton = findViewById<Button>(R.id.btnExit)
                exitButton.setOnClickListener {

                }

            }
        } catch (e: Exception) {
            Toast.makeText(this, "Adding to Playlist Error: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }

}













