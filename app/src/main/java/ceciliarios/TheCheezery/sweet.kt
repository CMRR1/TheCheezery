package ceciliarios.TheCheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos.*

class sweet : AppCompatActivity() {

    var product = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotdrink)

        cargarProductos()

        var adaptador = productosActivity.AdaptadorProductos(this, product)
        listview.adapter = adaptador
    }

    fun cargarProductos(){
        product.add(producto("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with chees topping and blueberries.", 6))
        product.add(producto("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcake topped with butter cream and cherries", 3))
        product.add(producto("Lemon tartalette", R.drawable.lemontartalette, "Pasty shell with lemon flavored filing", 4))
        product.add(producto("Red velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 7))
        product.add(producto("Cherry cheesecake", R.drawable.strawberrycheesecake, "Cheesecake with cherry.", 7))
        product.add(producto("Tiramisu", R.drawable.tiramisu, "Coffe flavored italian dessert.", 6))

    }
}