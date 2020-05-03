package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button insert;
    private Button movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insert = findViewById(R.id.Insert);
        insert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                openInsert();
            }
        });



    }

    private void openInsert() {
        Intent intent = new Intent(this, Story.class);
        startActivity(intent);
    }

}
