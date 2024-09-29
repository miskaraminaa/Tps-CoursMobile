package com.example.travailarendre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Navigation extends AppCompatActivity {

    private EditText nom, adresse, email, phone;
    private Spinner villes;
    private Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        adresse = findViewById(R.id.adresse);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        envoyer = findViewById(R.id.envoyer);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.villes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        villes.setAdapter(adapter);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Navigation.this, Screen2.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adresse", adresse.getText().toString());
                intent.putExtra("ville", villes.getSelectedItem().toString());

                startActivity(intent);
                finish();
            }
        });
    }
}