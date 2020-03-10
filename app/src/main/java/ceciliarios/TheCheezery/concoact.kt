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
        combo.add(producto("Perrito Helado", R.drawable.perritohelado, "Un lindo perrito tomando un rico helado uwu", 10))
        combo.add(producto("Perrito con Cosplay", R.drawable.perritocosplay, "Un lindo perrito con un lindo traje de Sailor", 8))
        combo.add(producto("Perrito Sol", R.drawable.perritosol, "Perrito que toma el sol...y ya", 6))
        combo.add(producto("Perrito Meme", R.drawable.perritojuguito, "Un perrito que toma su juguito, hagale caso al juguito", 4))
        combo.add(producto("Perrito Coronavirus", R.drawable.perritocoronavirus, "Perrito que se protege ante la vida y también ante el coronavirus", 2))

    }

    }

