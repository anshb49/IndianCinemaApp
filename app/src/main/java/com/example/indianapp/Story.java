package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class Story extends AppCompatActivity {

    private Button fill;
    private Button cancel;
    private EditText hero;
    private EditText heroine;
    private EditText villain;
    private EditText animal;
    private EditText adjective;
    private EditText verb;
    private EditText weapon;
    private EditText city;
    private TextView story;

    private String heroName;
    private String heroineName;
    private String villainName;
    private String animalName;
    private String adj;
    private String action;
    private String weaponName;
    private String cityName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        cancel = findViewById(R.id.Cancel);
        fill = findViewById(R.id.Fill);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openMain();
            }
        });
        fill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                createStory();
            }
        });
    }

    private void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private int generateRandomNumber() {

        Random rand = new Random();
        int randomNum = rand.nextInt(4) + 1;
        return randomNum;
    }


    private void findViewsByIds() {

        hero = findViewById(R.id.Hero);
        heroine = findViewById(R.id.Heroine);
        villain = findViewById(R.id.Villain);
        animal = findViewById(R.id.Animal);
        adjective = findViewById(R.id.Adjective);
        verb = findViewById(R.id.Verb);
        weapon = findViewById(R.id.Weapon);
        city = findViewById(R.id.City);
        story = findViewById(R.id.Story);
    }

    private void makeEditTextToString() {

        heroName = hero.getText().toString();
        heroineName = heroine.getText().toString();
        villainName = villain.getText().toString();
        animalName = animal.getText().toString();
        adj = adjective.getText().toString();
        action = verb.getText().toString();
        weaponName = weapon.getText().toString();
        cityName = city.getText().toString();
    }

    private void createStory() {

        findViewsByIds();
        makeEditTextToString();
        if (generateRandomNumber() == 1) {
            String madLib = "In this movie, " + adj + " " + heroName + " walks to the local tea stand " +
                    "on the streets of " + cityName + " and buys his chai. He sips and sips and " +
                    "sees a woman get robbed of purse by a thief. He chases after him, but he can’t " +
                    "catch up. He sees a " + animalName + " and gets on top to ride it and resumes his " +
                    "chase to the robber. " + heroName + " then jumps off the " + animalName + " and " +
                    "tackles the villain. The villain is " + villainName + "! " +
                    "As " + heroName + " reaches for the purse, " + villainName + " pulls " +
                    "out a worn out " + weaponName + " but " + heroName + " slaps it away and grabs " +
                    "the purse. He then hops on the " + animalName + " again and rides away to the " +
                    "beautiful " + heroineName + " and they " + action + " through the streets " +
                    "of " + cityName + ".";
            story.setText(madLib);
        } else if (generateRandomNumber() == 2) {
            story.setText("2");
        } else if (generateRandomNumber() == 3) {
            story.setText("3");
        } else if (generateRandomNumber() == 4) {
            story.setText("4");
        }
        //if random number = 1 use chan's story and concatenate the strings
        // if = 2 then ansh's story
        //if = 3 then muhil's
        //if = 4 then sarish's
    }
}
