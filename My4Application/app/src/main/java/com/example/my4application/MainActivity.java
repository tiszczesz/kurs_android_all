package com.example.my4application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextLimit;
    private Button btnOblicz;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextLimit = findViewById(R.id.editTextLimit);
        textViewResult = findViewById(R.id.textViewResult);
        btnOblicz = findViewById(R.id.btnOblicz);
        btnOblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int limit = Integer.parseInt(editTextLimit.getText().toString());
                    MyFirst mf =new MyFirst(limit);
                    textViewResult.setText(mf.getNumbers());
                }catch (NumberFormatException nfe){
                    editTextLimit.setError("Błędna wartość");
                }

            }
        });
    }
}