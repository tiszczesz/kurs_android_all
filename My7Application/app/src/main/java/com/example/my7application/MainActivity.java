package com.example.my7application;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private Button btn1;
    private Button btn2;
    private View.OnClickListener changeColor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // Toast.makeText(MainActivity.this,"GOGO!!",Toast.LENGTH_SHORT).show();
            AlertDialog.Builder colorPicker = new AlertDialog.Builder(MainActivity.this);
            colorPicker.setTitle("Wybierz kolor");
            colorPicker.setItems(R.array.colors, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Toast.makeText(MainActivity.this,Integer.toString(which),Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,
                            getResources().getStringArray(R.array.colors)[which],Toast.LENGTH_SHORT).show();
                    switch (which){
                        case 0:
                            myTextView.setTextColor(getResources().getColor(R.color.White));
                            break;
                        case 1:
                            myTextView.setTextColor(getResources().getColor(R.color.Yellow));
                            break;
                        case 2:
                            myTextView.setTextColor(getResources().getColor(R.color.Green));
                            break;
                        case 3:
                            myTextView.setTextColor(getResources().getColor(R.color.Blue));
                            break;
                    }
                }
            });
            colorPicker.show();
        }

    };
    private View.OnClickListener changeSize = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder changeSize = new AlertDialog.Builder(MainActivity.this);
            changeSize.setTitle("Zmień rozmiar tekstu");
            changeSize.setItems(R.array.textSize, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //Toast.makeText(MainActivity.this,Integer.toString(which),Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,
                            getResources().getStringArray(R.array.textSize)[which],Toast.LENGTH_SHORT).show();
                    switch (which){
                        case 0:
                            myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f);
                            break;
                        case 1:
                            myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f);
                            break;
                        case 2:
                            myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f);
                            break;
                        case 3:
                            myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 28f);
                            break;
                        case 4:
                            myTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 32f);
                            break;
                    }
                }
            });
            changeSize.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.txtView1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        myTextView.setText(MyContent.getContent());
        btn1.setOnClickListener(changeColor);
        btn2.setOnClickListener(changeSize);
    }
}