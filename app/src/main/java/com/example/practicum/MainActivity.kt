package com.example.practicum

import android.content.Intent
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    // Arrays of songs
    val songs = arrayOf(
        "moment for life-nicki minaj",
        "slippery-migos",
        "the motto-drake",
        "John-lil wayne"
    )





    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        val addButton =
            findViewById<Button>(R.id.addButton)
        val viewButton =
            findViewById<Button>(R.id.viewButton)
        val exitButton =
            findViewById<Button>(R.id.+exitbuttton)
        val titleInput =
            findViewById<Button>(R.id.+titleinput)
        val artistInput =
            findViewById<Button>(R.id.+artistinput)
        val ratingsInput =
            findViewById<Button>(R.id.+ratingsinput)
        val commentInput =
            findViewById<Button>(R.id.+commentInput)

        //Add to playlist Button
        // click handler
        addButton.setOnClickListener {
            // Get user input
            val title =
                titleInput.text.toString()
            val artist =
                artistInput.text.toString()
            val ratingsInput =
                ratingsInput.text.toString()
            val comment =
                commentInput.text.toString()


            // Validate Input
                        if (title.isEmpty() ||
                artist.isEmpty() ||
                ratingText.isEmpty()) {
                            Toast.makeText(this, "Please fill required fields ,")
                            Toast.LENGTH_SHORT.show()

                            return@setOnClickListener
                        }
            val rating =
                ratingText.isEmpty(
                    if(rating<1 ||
                        rating > 5) {

                        Toast.makeText(
                            this, "Rating must be between 1 and 5",
                            Toast.LENGTH_SHORT
                        ).show()

                        return@setOnClickListener
                    }

                    //Add song details to arrays




                // Clear input fields

            titleInput.text.clear()
            artistInput.text.clear()
            ratingInput.text.clear()
            commentInput.text.clear()

                                    Toast.makeText(this,"Song added to playlist!" ,
                    Toast.LENGTH_SHORT).show()

        }
        NumberFormatException)  {
                    Toast.makeText(this,"Please enter valid number for rating", Toast.LENGTH_SHORT).show())
        }
    }
                   //View playlist button click handler






        }



    }
}

}

