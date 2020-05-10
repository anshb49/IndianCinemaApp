package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ActorRanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actor_rank);

        //Creating new list of entries for Pie Chart (MPAndroidChart)
        //data on actors and number of total releases from https://www.imdb.com/list/ls020280202/

        ArrayList<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(111, "Akshay Kumar"));
        pieEntries.add(new PieEntry(96, "Ajay Devgn"));
        pieEntries.add(new PieEntry(77, "Salman Khan"));
        pieEntries.add(new PieEntry(62, "Shah Rukh Khan"));
        pieEntries.add(new PieEntry(101, "Sanjay Dutt"));
        pieEntries.add(new PieEntry(134, "Jakie Shroff"));
        pieEntries.add(new PieEntry(96, "Sunil Shetty"));
        pieEntries.add(new PieEntry(68, "Amitabh Bachchan"));
        pieEntries.add(new PieEntry(34, "Aamir Khan"));
        pieEntries.add(new PieEntry(67, "Anil Kapoor"));

        //changing color and label of data
        PieDataSet dataSet = new PieDataSet(pieEntries, "KEY");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);


        //creating a new pie chart with actor data
        PieData data = new PieData(dataSet);
        PieChart chart = findViewById(R.id.pieChart);
        chart.setData(data);


        //customizing chart labels, colors, and animation
        data.setValueTextSize(14);
        chart.animateY(1000);
        chart.setEntryLabelTextSize(15);
        chart.setEntryLabelColor(Color.BLACK);
        chart.setCenterTextSizePixels(30);
        chart.setTransparentCircleRadius(60f);

        // setting description blank to remove default description
        Description desc = new Description();
        desc.setText("");
        chart.setDescription(desc);
        chart.invalidate();

        //button to return to main menu
        Button retMain = findViewById(R.id.cancel);
        retMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToMain();
            }
        });

        //button to start next chart activity
        Button nextChart = findViewById(R.id.nextChart);
        nextChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextChart();
            }
        });

    }

    //changing current activity to main activity
    public void returnToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //changing current activity to next chart activity (film ranks visualization)
    public void showNextChart() {
        Intent intent = new Intent(this, FilmRanks.class);
        startActivity(intent);
        finish();
    }
}
