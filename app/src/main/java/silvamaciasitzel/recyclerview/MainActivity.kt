package silvamaciasitzel.recyclerview


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personas = ArrayList<Persona>()
        personas.add(Persona("Nay","url_ala_foto.jpg",123.0,123.0,"Hombre"))
        personas.add(Persona("Nay","url_ala_foto.jpg",123.0,123.0,"Hombre"))
        personas.add(Persona("Nay","url_ala_foto.jpg",123.0,123.0,"Hombre"))
        personas.add(Persona("Nay","url_ala_foto.jpg",123.0,123.0,"Hombre"))
        personas.add(Persona("Nay","url_ala_foto.jpg",123.0,123.0,"Hombre"))
        recyclerPersonas.layoutManager = GridLayoutManager(applicationContext,1)!!
        recyclerPersonas.setHasFixedSize(true)
        recyclerPersonas.adapter = PersonaAdapter(personas,this)

    }
}
