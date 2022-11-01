package at.fh.mappdev.loggingviewsandactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView

class RatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        findViewById<Button>(R.id.save_rating).setOnClickListener {
           saveRating(it)
        }
    }

    private val rating = Rating("android_lesson_01")

    fun saveRating(v: View) {
        rating.feedback = findViewById<EditText>(R.id.feedback_input).text.toString()
        rating.rating = findViewById<RatingBar>(R.id.rating_bar).rating.toDouble()

        findViewById<TextView>(R.id.lesson).text = rating.lesson
        findViewById<TextView>(R.id.rating_value).text = rating.rating.toString()
        findViewById<TextView>(R.id.feedback).text = rating.feedback
        //How do we show the values in the textfields we created?
    }
}