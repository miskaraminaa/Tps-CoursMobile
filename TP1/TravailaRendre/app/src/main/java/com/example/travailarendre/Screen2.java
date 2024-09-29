package com.example.travailarendre;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nom = findViewById(R.id.nom);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView adresse = findViewById(R.id.adresse);
        TextView ville = findViewById(R.id.ville);

        String nompre = getIntent().getStringExtra("nom");
        String emaill = getIntent().getStringExtra("email");
        String phonee = getIntent().getStringExtra("phone");
        String adress = getIntent().getStringExtra("adresse");
        String villes = getIntent().getStringExtra("ville");

        nom.setText(getString(R.string.nom) + ": " + nompre);
        email.setText(getString(R.string.email) + ": " + emaill);
        phone.setText(getString(R.string.phone) + ": " + phonee);
        adresse.setText(getString(R.string.adresse) + ": " + adress);
        ville.setText(getString(R.string.ville) + ": " + villes);
    }
}