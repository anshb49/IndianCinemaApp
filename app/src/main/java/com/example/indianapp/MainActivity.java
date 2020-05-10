package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button insert;
    private Button movieLinks;
    private Button charts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button to launch Mad Libs screen
        insert = findViewById(R.id.Insert);
        insert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openInsert();
            }
        });

        //button to launch the page with movie links
        movieLinks = findViewById(R.id.insertMovie);
        movieLinks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openMovieLinks();
            }
        });

        //button to launch first chart activity (actor ranks)
        charts = findViewById(R.id.charts);
        charts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openActorRanks();
            }
        });


    }

    //launching Mad Libs page to fill out stories
    private void openInsert() {
        Intent intent = new Intent(this, Story.class);
        startActivity(intent);
    }

    //launching page with movie links
    private void openMovieLinks() {
        Intent intent = new Intent(this, MovieLinks.class);
        startActivity(intent);
    }

    //launching actor rank activity
    private void openActorRanks() {
        Intent intent = new Intent(this, ActorRanks.class);
        startActivity(intent);
    }

}
