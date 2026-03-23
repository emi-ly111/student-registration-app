package br.com.emilygomesmiranda.cadastroaluno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.widget.TextView
import android.widget.Button
import android.content.Intent
class ConfirmacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_confirmacao)

        val botaoEditar = findViewById<Button>(R.id.botao_editar_dados)

        botaoEditar.setOnClickListener {
            finish()
        }

        window.statusBarColor = Color.parseColor("#639922")

        findViewById<TextView>(R.id.texto_nome).text = intent.getStringExtra("nome")
        findViewById<TextView>(R.id.texto_email).text = intent.getStringExtra("email")
        findViewById<TextView>(R.id.texto_idade).text = intent.getStringExtra("idade")
        findViewById<TextView>(R.id.texto_curso).text = intent.getStringExtra("curso")
        findViewById<TextView>(R.id.texto_endereco).text = intent.getStringExtra("endereco")

        findViewById<Button>(R.id.botao_confirmar_cadastro).setOnClickListener {
            val intent = Intent(this, SucessoActivity::class.java)
            intent.putExtra("nome", getIntent().getStringExtra("nome"))
            intent.putExtra("curso", getIntent().getStringExtra("curso"))
            startActivity(intent)
        }
    }
}