package br.com.fabriciocurvello.appcontadorcliques;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvNumero; //Objeto de TextView
    Button btClicar; //Objeto de Button
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // link entre java e o XML
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Link entre os objetos JAVA e XML
        tvNumero = findViewById(R.id.tv_numero);
        btClicar = findViewById(R.id.bt_clicar);
    }

    public void dispararContador(View view) {
        contador ++;
        tvNumero.setText(String.valueOf(contador));

        Toast.makeText(this, "CLICOU NO BOTÃO: " + contador, Toast.LENGTH_SHORT).show();
    }

}