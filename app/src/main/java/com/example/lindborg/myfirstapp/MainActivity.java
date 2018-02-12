package com.example.lindborg.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView text1 = findViewById(R.id.textView0);
        final String names[] = {"Bäst i fotboll","Parkernas stad","Markus Rosenberg","20 guld","Vacker dialekt"};


        button.setOnClickListener(new View.OnClickListener() {
            int i = 0;
            public void onClick(View v) {


                if(i > 4) {
                    i = 0;
                }
                text1.setText(names[i]);
                i++;
            }
        });

    }

}
