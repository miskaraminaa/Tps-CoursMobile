package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView nbr;
    private int counter = 0; // Counter variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button toast = findViewById(R.id.toast);
        nbr = findViewById(R.id.nbr);
        Button increment = findViewById(R.id.increment);
        Button decrement = findViewById(R.id.decrement);
        Button reset = findViewById(R.id.reset);

        // Show toast message when the button is clicked
        toast.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Hello toast!", Toast.LENGTH_SHORT).show()
        );


        increment.setOnClickListener(view -> {
            counter++;
            nbr.setText(String.valueOf(counter));
        });


        decrement.setOnClickListener(view -> {
            counter--;
            nbr.setText(String.valueOf(counter));
        });


        reset.setOnClickListener(view -> {
            counter = 0;
            nbr.setText(String.valueOf(counter));
        });
    }
}
