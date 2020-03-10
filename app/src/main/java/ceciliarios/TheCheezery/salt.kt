package ceciliarios.TheCheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos.*

class salt : AppCompatActivity() {

    var product = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotdrink)

        cargarProductos()

        var adaptador = productosActivity.AdaptadorProductos(this, product)
        listview.adapter = adaptador
    }

    fun cargarProductos(){
        product.add(producto("Chicken crepes", R.drawable.chickencrepes, "Is a crepe with chicken, yumi yumi.", 6))
        product.add(producto("Club sandwish", R.drawable.clubsandwich, "A sandwish, tasty", 5))
        product.add(producto("Panini", R.drawable.hampanini, "Sandwich but italian", 4))
        product.add(producto("Philly cheese steak", R.drawable.phillycheesesteak, "Something with cheese.", 6))
        product.add(producto("Nachos", R.drawable.nachos, "Totopos with cheese and hopefuly meat desmenusada.", 7))


    }
}