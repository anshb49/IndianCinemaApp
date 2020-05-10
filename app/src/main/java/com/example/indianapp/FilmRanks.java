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

public class FilmRanks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_rank);

        ArrayList<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(1957, "Dangal (2016)"));
        pieEntries.add(new PieEntry(1807, "Baahubali 2 (2017)"));
        pieEntries.add(new PieEntry(872, "Bajrangi Bhaijaan (2015)"));
        pieEntries.add(new PieEntry(834, "Secret Superstar (2017)"));
        pieEntries.add(new PieEntry(742, "PK (2014)"));
        pieEntries.add(new PieEntry(680, "2.0 (2018)"));
        pieEntries.add(new PieEntry(615, "Sultan (2016)"));
        pieEntries.add(new PieEntry(602, "Baahubali (2015)"));
        pieEntries.add(new PieEntry(587, "Sanju (2018)"));
        pieEntries.add(new PieEntry(569, "Padmaavat (2018)"));

        PieDataSet dataSet = new PieDataSet(pieEntries, "KEY");
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data = new PieData(dataSet);
        PieChart chart = findViewById(R.id.pieChart);
        chart.setData(data);


        data.setValueTextSize(14);
        chart.animateY(1000);
        chart.setEntryLabelTextSize(15);
        chart.setEntryLabelColor(Color.BLACK);
        chart.setCenterTextSizePixels(30);
        chart.setTransparentCircleRadius(60f);

        // setting description blank and using TextView to label graph instead
        Description desc = new Description();
        desc.setText("");
        chart.setDescription(desc);
        chart.invalidate();

        Button retMain = findViewById(R.id.cancel);
        retMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToMain();
            }
        });

        Button nextChart = findViewById(R.id.nextChart);
        nextChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextChart();
            }
        });

    }

    public void returnToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void showNextChart() {
        Intent intent = new Intent(this, ActorRanks.class);
        startActivity(intent);
        finish();
    }
}
