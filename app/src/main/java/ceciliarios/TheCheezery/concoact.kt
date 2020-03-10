package ceciliarios.TheCheezery

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_concoact.*
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class concoact : AppCompatActivity() {

    var product = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotdrink)

        cargarProductos()

        var adaptador:AdaptadorCombos? =null


        gridview.adapter = adaptador
    }

    fun cargarProductos(){
        product.add(producto("Perrito Helado", R.drawable.perritohelado, "Un lindo perrito tomando un rico helado uwu", 10))
        product.add(producto("Perrito con Cosplay", R.drawable.perritocosplay, "Un lindo perrito con un lindo traje de Sailor", 8))
        product.add(producto("Perrito Sol", R.drawable.perritosol, "Perrito que toma el sol...y ya", 6))
        product.add(producto("Perrito Meme", R.drawable.perritojuguito, "Un perrito que toma su juguito, hagale caso al juguito", 4))
        product.add(producto("Perrito Coronavirus", R.drawable.perritocoronavirus, "Perrito que se protege ante la vida y también ante el coronavirus", 2))

    }

    class AdaptadorCombos: BaseAdapter {
        var productos = ArrayList<producto>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<producto>){
            this.contexto = contexto
            this.productos = productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod = productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            vista.producto_img.setImageResource(prod.image)
            vista.producto_nombre.setText(prod.name)
            vista.producto_desc.setText(prod.description)
            vista.producto_precio.setText("$${prod.price}")

            return vista
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }

    }
}

