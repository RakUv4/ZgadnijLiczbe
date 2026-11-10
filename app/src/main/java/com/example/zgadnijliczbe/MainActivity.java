package com.example.zgadnijliczbe;
import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Button> WszystkiePrzyciski = new ArrayList<>();

    private int WylosowanaLiczba;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);


        WszystkiePrzyciski.add(button1);
        WszystkiePrzyciski.add(button2);
        WszystkiePrzyciski.add(button3);
        WszystkiePrzyciski.add(button4);
        WszystkiePrzyciski.add(button5);
        WszystkiePrzyciski.add(button6);
        WszystkiePrzyciski.add(button7);
        WszystkiePrzyciski.add(button8);
        WszystkiePrzyciski.add(button9);
        WszystkiePrzyciski.add(button10);
        WszystkiePrzyciski.add(button11);
        WszystkiePrzyciski.add(button12);

        Random rand = new Random();

        WylosowanaLiczba = rand.nextInt(12)+1;

        for(int i = 0; i< WszystkiePrzyciski.size(); i++){
            if(i+1 == WylosowanaLiczba){
                int finalI = i;
                WszystkiePrzyciski.get(i).setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,
                                        "Poprawne", Toast.LENGTH_SHORT).show();
                                WszystkiePrzyciski.get(finalI).setBackgroundColor(Color.GREEN);
                            }
                        }
                );


            } else{
                int finalI1 = i;
                WszystkiePrzyciski.get(i).setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,
                                        "Niepoprawne", Toast.LENGTH_SHORT).show();
                                WszystkiePrzyciski.get(finalI1).setBackgroundColor(Color.RED);
                            }
                        }
                );
            }
        }




    }
}