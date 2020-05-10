package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ActorRanks extends AppCompatActivity {

    private final String[] FILMS = new String[]{"Awara", "Shree 420", "Kati Patang", "Sholay", "QSQT",
            "Roja", "Guru", "DDLJ", "K3G", "Ghajini", "Lagaan", "Chak De India",
            "Slumdog Millionaire", "Gully Boy"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_data);

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
        PieDataSet dataSet = new PieDataSet(pieEntries, "KEY");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

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

    }

    public void returnToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
