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
                    "for dozens of crimes. " + heroName + " was scouting out a compond he believed to house this fugative, when he was suddenly approached by " + heroineName + " " +
                    "who inquired on why he was scouting out this compound. " + heroName + " told " + heroineName + " that they wouldn't understand, however " + heroineName + " reassur" +
                    "ded \"I understand everything, you aren't the only survivor of the attack \". Soon they both grabbed their" + weaponName + "s and " + action + " toward the compound to bring justice for the people of " + cityName);
        } else if (generateRandomNumber() == 4) {
            String madLib4 = "In this movie, the main character, " + heroName + " who has amnesia due to the actions of "
                    + villainName + ". Because of his condition, he has to take pictures of everything so he remembers it " +
                    "as he forgets things every 15 minutes. " +  "Eventually, he starts to form very little memories of " + villainName
                    + " and how he " + action + "ed " + heroineName + ". He begins to plot his revenge by " + action + "ing " + villainName + "'s gang member until he can find out who "
                    + villainName + " actually is. Initially, " + villainName + "does not know he is being targeted until a couple of " +
                    "his gang members are " + action + "ed. This worries him and causes him to begin searching for everyone he has wronged in " +
                    "the past to " + action + " them first. He eventually finds out " + heroName + " is trying to " + action + "him, and decides to "
                    + action + " all of " + heroName + "'s photos and tattoos that help him remember. However, once " + heroName + "'s friend" +
                    " finds out about what " + villainName + "did, she helps " + heroName + "by reminding him of all his memories. Once he relearns" +
                    " this information, he immediately goes to " + action + " " + villainName + ", but he is met by all of " + villainName + "'s goons." +
                    "Regardless, he " + action + "s all the goons and starts to fight " + villainName + " when he forgets who " + villainName + "is." +
                    heroName + " is then tricked by " + villainName + " and " + villainName + " impales him and is about to " + action + " his friend " +
                    "when " + heroName + " remembers " + villainName + " " + action + "ing " + heroineName + " which gives him the strength to "
                    + action + " " + villainName + ".";
            story.setText(madLib4);
        }
        //if random number = 1 use chan's story and concatenate the strings
        // if = 2 then ansh's story
        //if = 3 then muhil's
        //if = 4 then sarish's
    }


}
