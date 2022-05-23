package id.co.riyan.challenge4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

        val batu = 0
        val kertas = 1
        val gunting = 2

        val pemenang = findViewById<View>(R.id.view_result)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iconbatu = findViewById<ImageView>(R.id.view_batu)
        val iconbatu2 = findViewById<ImageView>(R.id.view_batu2)
        val iconkertas = findViewById<ImageView>(R.id.view_kertas)
        val iconkertas2 = findViewById<ImageView>(R.id.view_kertas2)
        val icongunting = findViewById<ImageView>(R.id.view_gunting)
        val icongunting2 = findViewById<ImageView>(R.id.view_gunting2)

        val pemenang = findViewById<View>(R.id.view_result)

        // -1 kosong, 0 batu, 1 kertas, 2 gunting
        var iconterpilih1 = -1
        var iconterpilih2 = -1

        val batu = 0
        val kertas = 1
        val gunting = 2

        iconbatu.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "batu terpilih")
            iconterpilih1 = 0

        }

        iconkertas.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "kertas terpilih")
            iconterpilih1 = 1

        }

        icongunting.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "gunting terpilih")
            iconterpilih1 = 2

        }

        iconbatu2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "batu2 terpilih")
            iconterpilih2 = 0

        }

        iconkertas2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "kertas2 terpilih")
            iconterpilih2 = 1

        }

        icongunting2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "gunting2 terpilih")
            iconterpilih2 = 2

        }

    }

    private fun perlombaan(){
        if(batu >=0 && kertas >=0 ){
            pemenang.setBackgroundColor(R.id.view_kertas)
        }
}