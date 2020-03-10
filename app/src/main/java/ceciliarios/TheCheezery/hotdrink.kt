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

class hotdrink : AppCompatActivity() {

    var hotDrinks = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotdrink)

        cargarProductos()

        var adaptador = productosActivity.AdaptadorProductos(this, hotDrinks)
        listview.adapter = adaptador
    }

    fun cargarProductos(){
        hotDrinks.add(producto("Latte", R.drawable.latte, "Coffe drink made with espresso and steamed milk.", 6))
        hotDrinks.add(producto("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate topped with marshmallows", 5))
        hotDrinks.add(producto("Espresso", R.drawable.espresso, "Full-flavored, concentrated from of coffe", 4))
        hotDrinks.add(producto("Chai latte", R.drawable.chailatte, "Spaced tea concentrate with milk.", 6))
        hotDrinks.add(producto("Capuccino", R.drawable.capuccino, "A capuccino is an espresso based coffee drink.", 7))
        hotDrinks.add(producto("American coffe", R.drawable.americano, "Espresso with hot water.", 2))

    }
}