package com.example.calculadoragorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valorConta;
    private TextView totalporcentagem;
    private SeekBar gorjeta;
    private TextView totalGorjeta;
    private TextView totalPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorConta = findViewById(R.id.valorEditText);
        totalporcentagem = findViewById(R.id.porcentagemGorjetaTextView);
        gorjeta = findViewById(R.id.porcenetagemGorjetaSeekBar);
        totalGorjeta = findViewById(R.id.totalGorjetaTextView);
        totalPagar = findViewById(R.id.totalTextView);
    }
}
