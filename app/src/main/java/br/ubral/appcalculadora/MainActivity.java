package br.ubral.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtValor1;
    EditText edtValor2;
    TextView TVResultado;
    Button btnSoma, btnSubtrai, btnMultiplica, btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincularComponentes();
        criarListeners();
    }
    private void vincularComponentes() {
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        TVResultado = findViewById(R.id.TVResultado);
        btnSoma = findViewById(R.id.btnSoma);
        btnSubtrai = findViewById(R.id.btnSubtrai);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnDivide = findViewById(R.id.btnDivide);
    }
    private void criarListeners() {
        btnSoma.setOnClickListener(evt -> adicionar());
        btnSubtrai.setOnClickListener(evt -> subtrair());
        btnMultiplica.setOnClickListener(evt -> multiplicar());
        btnDivide.setOnClickListener(evt -> dividir());
    }
    private void adicionar() {

        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }

        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);

        double resultado = valor1 + valor2;

        TVResultado.setText(String.valueOf(resultado));
    }
    private void subtrair() {
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }

        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);

        double resultado = valor1 - valor2;

        TVResultado.setText(String.valueOf(resultado));
    }
    private void multiplicar() {
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }

        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);

        double resultado = valor1 * valor2;

        TVResultado.setText(String.valueOf(resultado));
    }
    private void dividir() {
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);
        if (valor2 == 0) {
            Toast.makeText(this, "Não é possível dividir por 0",
                    Toast.LENGTH_LONG).show();
            return;
        }

        double resultado = valor1 / valor2;
        TVResultado.setText(String.valueOf(resultado));
    }
}

