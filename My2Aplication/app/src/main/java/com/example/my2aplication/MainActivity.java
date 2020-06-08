package com.example.my2aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    private TextView textViewAuthor;
    private  TextView textViewSzkola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewAuthor = findViewById(R.id.textViewAuthor);
        textViewSzkola = findViewById(R.id.texViewSzkola);
        textViewAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ONCLICK","Klinięto autora");
                Toast.makeText(getApplicationContext(),R.string.toast1_content,
                        Toast.LENGTH_SHORT).show();
            }
        });
        textViewSzkola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Teraz mamy rok: "
                                + Calendar.getInstance().get(Calendar.YEAR),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void imageClick(View view) {
        Log.i("ONCLICK","Kliknięto obrazek");
    }
}