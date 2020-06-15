package com.example.my4application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextLimit;
    private Button btnOblicz;
    private TextView textViewResult;
    private final String TAG = "ONSTATE";
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
        Log.i(TAG,"Wywołano onCreate");
        Toast.makeText(getApplicationContext(),"Wywołano onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Wywołano onStart");
        Toast.makeText(getApplicationContext(),"Wywołano onStart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Wywołano onResume");
        Toast.makeText(getApplicationContext(),"Wywołano onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Wywołano onPause");
        Toast.makeText(getApplicationContext(),"Wywołano onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Wywołano onStop");
        Toast.makeText(getApplicationContext(),"Wywołano onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Wywołano onDestroy");
        Toast.makeText(getApplicationContext(),"Wywołano onDestroy",Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        final TextView textViewResult = findViewById(R.id.textViewResult);
        CharSequence userText = textViewResult.getText();
        bundle.putCharSequence("savedText",userText);
        Log.i(TAG,"Wywołano onSaveInstanceState");
        Toast.makeText(getApplicationContext(),"Wywołano onSaveInstanceState",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);
        final TextView textViewResult = findViewById(R.id.textViewResult);
        CharSequence userText = bundle.getCharSequence("savedText");
        textViewResult.setText(userText);
        Log.i(TAG,"Wywołano onRestoreInstanceState");
        Toast.makeText(getApplicationContext(),"Wywołano onRestoreInstanceState",Toast.LENGTH_SHORT).show();
    }
}