package com.example.my3application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    private EditText editTextYear;
    private EditText editTextName;
    private Button btnOblicz;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextYear = findViewById(R.id.editTextYear);
        editTextName = findViewById(R.id.editViewName);
        btnOblicz = findViewById(R.id.btnOblicz);
        textViewResult = findViewById(R.id.txtViewResult);

        btnOblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int year = Integer.parseInt(editTextYear.getText().toString());

                    String name = editTextName.getText().toString();
                    String nameResult = name.isEmpty()?"(brak danych)" :name;
                    int age = Calendar.getInstance().get(Calendar.YEAR)-year;
                    String result = "Twoje zwierzątko o imieniu: "+nameResult+" ma wiek: "
                            +age;
                    textViewResult.setText(result);
                }catch (NumberFormatException nfe){
                    editTextYear.setError(getString(R.string.error_year));
                }

            }
        });

    }
}