package com.example.ecertificates;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecertificates.R;
import com.example.ecertificates.ResultActivity;

public class MainActivity extends AppCompatActivity {

    private Button quitter;
    private Button suivant;
    private CheckBox A, B, C, D;
    private RadioButton ouiButton, nonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quitter = findViewById(R.id.quitter);
        suivant = findViewById(R.id.suivant);

        A = findViewById(R.id.A);
        B = findViewById(R.id.B);
        C = findViewById(R.id.C);
        D = findViewById(R.id.D);
        ouiButton = findViewById(R.id.oui);
        nonButton = findViewById(R.id.non);

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder selections = new StringBuilder("Le pattern MVC signifie  :\n");

                if (A.isChecked()) selections.append("Multiple Versions Combined\n \n");
                if (B.isChecked()) selections.append("Model View Controller\n \n");
                if (C.isChecked()) selections.append("Main Value Compiled\n \n");
                if (D.isChecked()) selections.append("Mandatory Validated Controls\n \n");

                if (ouiButton.isChecked()) {
                    selections.append("La syntaxe $[x] est permise dans une JSP : OUI\n");
                } else if (nonButton.isChecked()) {
                    selections.append("La syntaxe $[x] est permise dans une JSP : NON\n");
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("selections", selections.toString());
                startActivity(intent);
            }
        });
    }
}