package pt.ul.fc.di.aplicacaosmartphone.interfaceaplicacao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.tiasa.aplicacaosmartwatch.R;

public class Instrucoes extends AppCompatActivity {

    private TextView textoInstrucoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);
        getSupportActionBar().hide();
        TextView cabecalho = (TextView) findViewById(R.id.cabecalho);
        cabecalho.append("Instruções:");

        textoInstrucoes = (TextView) findViewById(R.id.textoinstrucoes);
        String texto = ("..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "..............................................................." +
                "");
        textoInstrucoes.setMovementMethod(new ScrollingMovementMethod());
        textoInstrucoes.setTextSize(20);
        textoInstrucoes.setText(texto);
    }
}