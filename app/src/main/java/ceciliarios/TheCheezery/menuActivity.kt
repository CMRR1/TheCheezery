package ceciliarios.TheCheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class menuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_colddrinks.setOnClickListener {
            var intent = Intent(this, productosActivity::class.java)
            startActivity(intent)
        }
        btn_hotdrinks.setOnClickListener {
            var intent = Intent(this, hotdrink::class.java)
            startActivity(intent)
        }

        btn_sweets.setOnClickListener {
            var intent = Intent(this, sweet::class.java)
            startActivity(intent)
        }

        btn_salties.setOnClickListener {
            var intent = Intent(this, salt::class.java)
            startActivity(intent)
        }

        btn_combos.setOnClickListener {
            var intent = Intent(this, concoact::class.java)
            startActivity(intent)
        }

    }
}


