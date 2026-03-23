package br.com.emilygomesmiranda.cadastroaluno

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.widget.Button
import android.content.Intent
class SucessoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)
        window.statusBarColor = Color.parseColor("#639922")

        findViewById<TextView>(R.id.sucesso_nome).text = intent.getStringExtra("nome")
        findViewById<TextView>(R.id.sucesso_curso).text = intent.getStringExtra("curso")

        findViewById<Button>(R.id.botao_novo_cadastro).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}