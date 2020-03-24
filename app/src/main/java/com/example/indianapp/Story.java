package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //make a random number generating method(numbers 1-4) to determine which of the 4 stories to use

    public void findViewsByIds() {

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

    public void makeEditTextToString() {

        heroName = hero.getText().toString();
        heroineName = heroine.getText().toString();
        villainName = villain.getText().toString();
        animalName = animal.getText().toString();
        adj = adjective.getText().toString();
        action = verb.getText().toString();
        weaponName = weapon.getText().toString();
        cityName = city.getText().toString();
    }

    public void createStory() {

        findViewsByIds();
        makeEditTextToString();
        //if random number = 1 use chan's story and concatenate the strings
        // if = 2 then ansh's story
        //if = 3 then muhil's
        //if = 4 then sarish's


    }
}
