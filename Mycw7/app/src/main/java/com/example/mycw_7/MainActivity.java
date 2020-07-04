package com.example.mycw_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> myPokemon = new ArrayList<>();

        pokemon p1 = new pokemon("Bualbasaur",R.drawable.Bulbasaur,49,49,318);
        pokemon p2 = new pokemon("Charrizard",R.drawable.Bulbasaur,49,49,318);
        pokemon p3 = new pokemon("Pikachu",R.drawable.Bulbasaur,49,49,318);
        pokemon p4 = new pokemon("Clefable",R.drawable.Bulbasaur,49,49,318);

        myPokemon.add(p1);
        myPokemon.add(p2);
        myPokemon.add(p3);
        myPokemon.add(p4);
    }
}