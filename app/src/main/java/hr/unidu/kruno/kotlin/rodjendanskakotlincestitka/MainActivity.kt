package hr.unidu.kruno.kotlin.rodjendanskakotlincestitka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pozdrav(view: View) {
        Toast.makeText(getApplicationContext(), "Sretan ti rođendan!", Toast.LENGTH_SHORT).show();
    }
}