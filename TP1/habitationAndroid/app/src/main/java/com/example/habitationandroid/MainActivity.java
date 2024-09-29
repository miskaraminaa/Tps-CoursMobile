package com.example.habitationandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nom, adresse, surface, n;
    private CheckBox checkBox;
    private float impotbase, impotsup;
    private Button calcul;
    private TextView resultat;
    private float impotT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        nom = findViewById(R.id.nom);
        adresse = findViewById(R.id.adresse);
        surface = findViewById(R.id.surface);
        n = findViewById(R.id.n);
        checkBox = findViewById(R.id.checkBox);
        resultat = findViewById(R.id.resultat); // Initialize TextView for results
        calcul = findViewById(R.id.calcul);

        // Set up button click listener
        calcul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    float surfaceValue = Float.parseFloat(surface.getText().toString());
                    int piecesn = Integer.parseInt(n.getText().toString());
                    impotbase = surfaceValue*2;

                    if (checkBox.isChecked()) {
                        impotsup = piecesn * 50 + 100;
                    } else {
                        impotsup = piecesn * 50;
                    }

                    impotT = impotbase + impotsup;

                    // Set result to the TextView
                    resultat.setText("Impot de base : " + impotbase + "\n" +
                            "Impôt Supplémentaire : " + impotsup + "\n" +
                            "Impôt Total : " + impotT);

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Veuillez entrer une valeur valide", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
