package br.com.emilygomesmiranda.cadastroaluno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.view.View
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = Color.parseColor("#639922")

        val botaoCadastrar = findViewById<Button>(R.id.botao_cadastrar)
        val botaoWarning = findViewById<Button>(R.id.botao_warning)

        botaoCadastrar.setOnClickListener {
            val nome = findViewById<EditText>(R.id.nome).text.toString().trim()
            val email = findViewById<EditText>(R.id.email).text.toString().trim()
            val idade = findViewById<EditText>(R.id.idade).text.toString().trim()
            val curso = findViewById<EditText>(R.id.curso).text.toString().trim()
            val endereco = findViewById<EditText>(R.id.endereco).text.toString().trim()

            if (nome.isEmpty() || email.isEmpty() || idade.isEmpty() || curso.isEmpty() || endereco.isEmpty()) {
                botaoWarning.visibility = View.VISIBLE
            } else {
                botaoWarning.visibility = View.GONE

                val intent = Intent(this, ConfirmacaoActivity::class.java)
                intent.putExtra("nome", nome)
                intent.putExtra("email", email)
                intent.putExtra("idade", idade)
                intent.putExtra("curso", curso)
                intent.putExtra("endereco", endereco)
                startActivity(intent)
            }
        }
    }
}