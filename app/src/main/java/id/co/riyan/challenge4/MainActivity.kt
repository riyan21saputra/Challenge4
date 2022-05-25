package id.co.riyan.challenge4

import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

        lateinit var iconbatu : ImageView
        lateinit var iconbatu2 : ImageView
        lateinit var iconkertas : ImageView
        lateinit var iconkertas2 : ImageView
        lateinit var icongunting : ImageView
        lateinit var icongunting2 : ImageView
        lateinit var pemenang : ImageView

        // -1 kosong, 0 batu, 1 kertas, 2 gunting
        var iconterpilih1 = -1
        var iconterpilih2 = -1

        val batu = 0
        val kertas = 1
        val gunting = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iconbatu = findViewById<ImageView>(R.id.view_batu)
        iconbatu2 = findViewById<ImageView>(R.id.view_batu2)
        iconkertas = findViewById<ImageView>(R.id.view_kertas)
        iconkertas2 = findViewById<ImageView>(R.id.view_kertas2)
        icongunting = findViewById<ImageView>(R.id.view_gunting)
        icongunting2 = findViewById<ImageView>(R.id.view_gunting2)

        pemenang = findViewById<ImageView>(R.id.view_result)

        val reset = findViewById<ImageView>(R.id.view_reset)


        iconbatu.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "batu terpilih")
            selectViewPertama(iconbatu, pilihan = 0)

        }

        iconkertas.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "kertas terpilih")
            selectViewPertama(iconkertas, pilihan = 1)

        }

        icongunting.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "gunting terpilih")
            selectViewPertama(icongunting, pilihan = 2)

        }

        iconbatu2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "batu2 terpilih")
            selectViewKedua(iconbatu2, pilihan = 0)

        }

        iconkertas2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "kertas2 terpilih")
            selectViewKedua(iconkertas2, pilihan = 1)

        }

        icongunting2.setOnClickListener {
            Log.d(MainActivity::class.java.simpleName, "gunting2 terpilih")
            selectViewKedua(icongunting2, pilihan = 2)

        }
    }

    private fun selectViewPertama(view: ImageView, pilihan: Int){
        iconterpilih1 = pilihan
        clearVIewPertama()
        view.setImageResource(R.drawable.ic_baseline_check_24)
        hasil()
    }

    private fun selectViewKedua(view: ImageView, pilihan: Int){
        iconterpilih1 = pilihan
        clearVIewKedua()
        view.setImageResource(R.drawable.ic_baseline_check_24)
        hasil()
    }

    private fun clearVIewPertama(){
        iconbatu.setImageResource(0)
        icongunting.setImageResource(0)
        iconkertas.setImageResource(0)
    }
    private fun clearVIewKedua(){
        iconbatu2.setImageResource(0)
        icongunting2.setImageResource(0)
        iconkertas2.setImageResource(0)
    }

    private fun hasil(){
        if(iconterpilih1 >=0 && iconterpilih2 >=0){
            if(iconterpilih1 == batu && iconterpilih2 == kertas || iconterpilih1 == kertas && iconterpilih2 == gunting || iconterpilih1 == gunting && iconterpilih2 == batu){
                pemenang.setBackgroundResource(R.drawable.ic_pemain2);
            }else if(iconterpilih1 == batu && iconterpilih2 == gunting || iconterpilih1 == kertas && iconterpilih2 == batu || iconterpilih1 == gunting && iconterpilih2 == kertas){
                pemenang.setBackgroundResource(R.drawable.ic_pemain1);
            }else if(iconterpilih1 == batu && iconterpilih2 == batu || iconterpilih1 == kertas && iconterpilih2 == kertas || iconterpilih1 == gunting && iconterpilih2 == gunting){
                pemenang.setBackgroundResource(R.drawable.ic_draw);
            }
        }
    }

}