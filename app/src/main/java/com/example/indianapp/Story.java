package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
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
        //button for taking user back to the home screen
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openMain();
            }
        });
        //button for using the values the user inputted for creating mad lib stories
        fill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                createStory();
            }
        });
        //button for allowing user to edit their inputs
        Button edit = findViewById(R.id.edit);
        //if edit is clicked, the story goes away and the inputs become available to fill again
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView title = findViewById(R.id.Directions);
                title.setVisibility(View.VISIBLE);
                hero.setVisibility(View.VISIBLE);
                heroine.setVisibility(View.VISIBLE);
                villain.setVisibility(View.VISIBLE);
                animal.setVisibility(View.VISIBLE);
                adjective.setVisibility(View.VISIBLE);
                verb.setVisibility(View.VISIBLE);
                weapon.setVisibility(View.VISIBLE);
                city.setVisibility(View.VISIBLE);
                story.setVisibility(View.GONE);
            }
        });
    }

    //launches main menu/home screen
    private void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //returns a random number between 1 and 4 inclusive
    private int generateRandomNumber() {

        Random rand = new Random();
        int randomNum = rand.nextInt(4) + 1;
        return randomNum;
    }


    //finds each of the text view ids and stores them into a variable
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

    //makes each text view input into a string
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

    //creates the mad lib story using user inputs
    private void createStory() {

        findViewsByIds();
        makeEditTextToString();


        //if the story is created, this makes the inputs invisible since they are filled out already
        TextView title = findViewById(R.id.Directions);
        title.setVisibility(View.GONE);
        hero.setVisibility(View.GONE);
        heroine.setVisibility(View.GONE);
        villain.setVisibility(View.GONE);
        animal.setVisibility(View.GONE);
        adjective.setVisibility(View.GONE);
        verb.setVisibility(View.GONE);
        weapon.setVisibility(View.GONE);
        city.setVisibility(View.GONE);
        story.setVisibility(View.VISIBLE);


        //depending on the random number generated, a story is created
        //these stories are based on movies from the CWL/MACS 207 class
        if (generateRandomNumber() == 1) {
            String madlib = "In this movie which takes place in " + cityName + ", " + adj + " " + heroName +
                    " is enlisted by an ex-police officer. " + "He and his friend were once " +
                    "fleeing this cop and actually handcuffed. But ironically, " + "the ex-cop needs" +
                    " their help against the evil " + villainName + "! This villain killed the cop's " +
                    "entire family and cut off his arm for arresting him. " + heroName + " falls in love with " + heroineName + ". "
                    + heroName + " " + "and his friend decide to take on this mission and bring " + villainName + " alive. "
                    + "They take their " + weaponName + "s and " + animalName + "s to find " + villainName + ". " +
                    "At some point " + heroName + "'s friend is taken by " + villainName + ", so he takes " +
                    "his " + weaponName + " and goes to to save him. He " + action + " and saves his friend, but he " +
                    "dies due to a gun wound. However, at the end, " + villainName + " is given to the police.";
            story.setText(madlib);
        } else if (generateRandomNumber() == 2) {
            String madLib2 = "There is a " + adj + " man named " + heroName + " who decides to travel to " + cityName +
                    " where he's about to find the girl of his dreams, " + heroineName + ". " +
                    "At first they are bickering with each other, but suddenly " + heroineName +
                    " and " + heroName + " fall in love. " + "The man standing in their " +
                    "way is her father, " + villainName + " who desires that " + heroineName + " marry someone else. " + heroName +
                    " comes to the marriage ceremony and wins everyone's hearts " + "." + "When " + villainName +
                    " finds out what " + heroName + " is doing, " + villainName + " shouts at and slaps him. " +
                    heroName + " decides not to use " + weaponName + " and instead uses his special" +
                    " skill of " + action + " which wins over " + villainName + ". ";
            story.setText(madLib2);
        } else if (generateRandomNumber() == 3) {
            story.setText("In 1967, it was rumored that " + cityName + " was plundered by a gang of thieves who raided people's " +
                    "homes, robbed businesses, and set fire to the city. Many years later an adult man " + heroName + " is the only " +
                    "surviving member of this massacre. After a long time of mourning his parents death, he became " + adj + " to a fault. " +
                    "He was also wealthy, inheriting his father's land which included three " + animalName + "s. After many months, his depression had turned into rage, " +
                    "a rage determined to find the last living members of the gang that raided his family and bring justice to everyone who died in " + cityName + " that " +
                    "night. " + heroName + " researched evry part of the attack, until he realized that the gang acted under " + villainName + " an infamous criminal, wanted " +
                    "for dozens of crimes. " + heroName + " was scouting out a compound he believed to house this fugitive, when he was suddenly approached by " + heroineName + " " +
                    "who inquired on why he was scouting out this compound. " + heroName + " told " + heroineName + " that they wouldn't understand, however " + heroineName + " reassur" +
                    "ed \"I understand everything, you aren't the only survivor of the attack \". Soon they both grabbed their " + weaponName + "s and " + action + " toward the compound to bring justice for the people of " + cityName);
        } else if (generateRandomNumber() == 4) {
            String madLib4 = "In this movie, the main character, " + heroName + " who has amnesia due to the actions of "
                    + villainName + ". Because of his condition, he has to take pictures of everything so he remembers it " +
                    "as he forgets things every 15 minutes. " + "Eventually, he starts to form very little memories of " + villainName
                    + " and how he " + action + "ed " + heroineName + ". He begins to plot his revenge by " + action + "ing " + villainName + "'s gang member until he can find out who "
                    + villainName + " actually is. Initially, " + villainName + " does not know he is being targeted until a couple of " +
                    "his gang members are " + action + "ed. This worries him and causes him to begin searching for everyone he has wronged in " +
                    "the past to " + action + " them first. He eventually finds out " + heroName + " is trying to " + action + "him, and decides to "
                    + action + " all of " + heroName + "'s photos and tattoos that help him remember. However, once " + heroName + "'s friend" +
                    " finds out about what " + villainName + "did, she helps " + heroName + "by reminding him of all his memories. Once he relearns" +
                    " this information, he immediately goes to " + action + " " + villainName + ", but he is met by all of " + villainName + "'s goons." +
                    " Regardless, he " + action + "s all the goons and starts to fight " + villainName + " when he forgets who " + villainName + "is." +
                    heroName + " is then tricked by " + villainName + " and " + villainName + " impales him and is about to " + action + " his friend " +
                    "when " + heroName + " remembers " + villainName + " " + action + "ing " + heroineName + " which gives him the strength to "
                    + action + " " + villainName + ".";
            story.setText(madLib4);
        }
    }
}
