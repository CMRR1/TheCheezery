package ceciliarios.TheCheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class concoact : AppCompatActivity() {

    var combo = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotdrink)

        cargarProductos()

        var adaptador = productosActivity.AdaptadorProductos(this, combo)
        listview.adapter = adaptador
    }


    fun cargarProductos(){
        combo.add(producto("hamburguesa", R.drawable.combohamburguesa, "Hamburguesa bien bonita y hecha con amor uwu", 6))
        combo.add(producto("Palomitas", R.drawable.combopalomitas, "Palomitas con su dogito como de que no", 4))
        combo.add(producto("Papas", R.drawable.combopapas, "Papitas bien bonitas desde Francia", 2))

    }

    }

