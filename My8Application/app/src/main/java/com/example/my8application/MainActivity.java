package com.example.my8application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerPlayer1;
    private Spinner spinnerPlayer2;
    private Game game;
    private List<Player> players;
    TextView textViewInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerPlayer1 = findViewById(R.id.spinnerPlayer1);
        spinnerPlayer2 = findViewById(R.id.spinnerPlayer2);
        textViewInfo = findViewById(R.id.textViewInfo);
        game = new Game();
        players = game.getAll();
        ArrayAdapter<CharSequence> adapterPlayer1 =
                ArrayAdapter.createFromResource(MainActivity.this,R.array.my_items,android.R.layout.simple_spinner_item);
        adapterPlayer1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlayer1.setAdapter(adapterPlayer1);
        ArrayAdapter<CharSequence> adapterPlayer2 =
                ArrayAdapter.createFromResource(MainActivity.this,R.array.items2,android.R.layout.simple_spinner_item);
        adapterPlayer2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPlayer2.setAdapter(adapterPlayer2);
        spinnerPlayer1.setOnItemSelectedListener(listener1);
        spinnerPlayer2.setOnItemSelectedListener(listener2);
    }
        AdapterView.OnItemSelectedListener listener1 =  new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,
//                        "Wybrno element: "+(String)parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
//                Log.i("INFO","Position: "+position+" "+getResources().getStringArray(R.array.my_items)[position]);
            String action = (String)parent.getItemAtPosition(position);
            IDamage dd = null;
            IHealing hh = null;
            switch(action){
                case "Wspaniały miecz dwuręczny":

                    dd = (IDamage)players.get(0).getItems().get(0);
                    textViewInfo.setText(textViewInfo.getText()+"\n"+dd.makeDps(players.get(1)));
                    break;
                case "Miecz jednoręczny":

                    dd = (IDamage)players.get(0).getItems().get(1);
                    textViewInfo.setText(textViewInfo.getText()+"\n"+dd.makeDps(players.get(1)));
                    break;
                case "mikstura lecząca mała":
                    hh = (IHealing)players.get(0).getItems().get(2);
                    textViewInfo.setText(textViewInfo.getText()+"\n"+hh.makeHealing(players.get(1)));
                    break;
                case "mikstura lecząca duża":
                    hh = (IHealing)players.get(0).getItems().get(3);
                    textViewInfo.setText(textViewInfo.getText()+"\n"+hh.makeHealing(players.get(1)));
                    break;
                case "miecz dwuręczny BB":
                    dd = (IDamage)players.get(0).getItems().get(4);
                    textViewInfo.setText(textViewInfo.getText()+"\n"+dd.makeDps(players.get(1)));
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            Toast.makeText(MainActivity.this,"Brak wybranego elementu",Toast.LENGTH_SHORT).show();
        }
    };

        AdapterView.OnItemSelectedListener listener2 = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
}