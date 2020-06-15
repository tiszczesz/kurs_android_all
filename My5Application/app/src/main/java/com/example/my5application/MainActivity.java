package com.example.my5application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = findViewById(R.id.imageView1);
        textView1 = findViewById(R.id.textView1);

        imageView1.setOnClickListener(imageOnClickListener);
    }
    private View.OnClickListener imageOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(),"Kliknięto obrazek",Toast.LENGTH_LONG)
//                    .show();
            Sayings s = new Sayings(getResources().getStringArray(R.array.przyslowie));
            textView1.setText(s.getRandom());
        }
    };
}