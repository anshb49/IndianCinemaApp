package com.example.indianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MovieLinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_links);

        //this whole section is to embed movie links into the name of the movie
        //that takes you to the media space page where the movies are shown

        //First Story is based on Sholay
        TextView sholay = findViewById(R.id.Sholay);
        sholay.setClickable(true);
        sholay.setMovementMethod(LinkMovementMethod.getInstance());
        String sholayText = "<a href='https://mediaspace.illinois.edu/media/t/1_84f2dp5z/154364361'> Sholay </a>";
        sholay.setText(Html.fromHtml(sholayText, Html.FROM_HTML_MODE_COMPACT));

        //Second Story is based on DDLJ
        TextView ddlj = findViewById(R.id.DDLJ);
        ddlj.setClickable(true);
        ddlj.setMovementMethod(LinkMovementMethod.getInstance());
        String ddljText = "<a href='https://mediaspace.illinois.edu/media/t/1_ovjhpxw9/154364361'> DDLJ </a>";
        ddlj.setText(Html.fromHtml(ddljText, Html.FROM_HTML_MODE_COMPACT));


        TextView shree420 = findViewById(R.id.Shree420);
        shree420.setClickable(true);
        shree420.setMovementMethod(LinkMovementMethod.getInstance());
        String shreeText = "<a href='https://mediaspace.illinois.edu/media/t/1_ao2nqu3e/154364361'> Shree 420 </a>";
        shree420.setText(Html.fromHtml(shreeText, Html.FROM_HTML_MODE_COMPACT));

        //Fourth Story is based on Ghajini
        TextView ghajini = findViewById(R.id.Ghajini);
        ghajini.setClickable(true);
        ghajini.setMovementMethod(LinkMovementMethod.getInstance());
        String ghajiniText = "<a href='https://mediaspace.illinois.edu/media/t/1_ahi6t467/154364361'> Ghajini </a>";
        ghajini.setText(Html.fromHtml(ghajiniText, Html.FROM_HTML_MODE_COMPACT));

        //Rest of the Movies we watched this semester
        TextView awara = findViewById(R.id.Awara);
        awara.setClickable(true);
        awara.setMovementMethod(LinkMovementMethod.getInstance());
        String awaraText = "<a href='https://mediaspace.illinois.edu/media/t/1_5xh4d2kz/154364361'> Awara </a>";
        awara.setText(Html.fromHtml(awaraText, Html.FROM_HTML_MODE_COMPACT));

        TextView kati = findViewById(R.id.KatiPatang);
        kati.setClickable(true);
        kati.setMovementMethod(LinkMovementMethod.getInstance());
        String katiText = "<a href='https://mediaspace.illinois.edu/media/t/1_ztz6sr1x/154364361'> Kati Patang </a>";
        kati.setText(Html.fromHtml(katiText, Html.FROM_HTML_MODE_COMPACT));

        TextView qsqt = findViewById(R.id.QSQT);
        qsqt.setClickable(true);
        qsqt.setMovementMethod(LinkMovementMethod.getInstance());
        String qsqtText = "<a href='https://mediaspace.illinois.edu/media/t/1_epp827sg/154364361'> QSQT </a>";
        qsqt.setText(Html.fromHtml(qsqtText, Html.FROM_HTML_MODE_COMPACT));

        TextView roja = findViewById(R.id.Roja);
        roja.setClickable(true);
        roja.setMovementMethod(LinkMovementMethod.getInstance());
        String rojaText = "<a href='https://mediaspace.illinois.edu/media/t/1_77gzfzuw/154364361'> Roja </a>";
        roja.setText(Html.fromHtml(rojaText, Html.FROM_HTML_MODE_COMPACT));

        TextView guru = findViewById(R.id.Guru);
        guru.setClickable(true);
        guru.setMovementMethod(LinkMovementMethod.getInstance());
        String guruText = "<a href='https://mediaspace.illinois.edu/media/t/1_3o5hbt2a/154364361'> Guru </a>";
        guru.setText(Html.fromHtml(guruText, Html.FROM_HTML_MODE_COMPACT));

        TextView k3g = findViewById(R.id.K3G);
        k3g.setClickable(true);
        k3g.setMovementMethod(LinkMovementMethod.getInstance());
        String k3gText = "<a href='https://mediaspace.illinois.edu/media/t/1_zh9hqitz/154364361'> K3G </a>";
        k3g.setText(Html.fromHtml(k3gText, Html.FROM_HTML_MODE_COMPACT));

        TextView lagaan = findViewById(R.id.Lagaan);
        lagaan.setClickable(true);
        lagaan.setMovementMethod(LinkMovementMethod.getInstance());
        String lagaanText = "<a href='https://mediaspace.illinois.edu/media/t/1_s9xs40d9/154364361'> Lagaan </a>";
        lagaan.setText(Html.fromHtml(lagaanText, Html.FROM_HTML_MODE_COMPACT));

        TextView chak = findViewById(R.id.ChakDeIndia);
        chak.setClickable(true);
        chak.setMovementMethod(LinkMovementMethod.getInstance());
        String chakText = "<a href='https://mediaspace.illinois.edu/media/t/1_lcntl2uj/154364361'> Chak De India </a>";
        chak.setText(Html.fromHtml(chakText, Html.FROM_HTML_MODE_COMPACT));

        TextView slumdog = findViewById(R.id.Slumdog);
        slumdog.setClickable(true);
        slumdog.setMovementMethod(LinkMovementMethod.getInstance());
        String slumText = "<a href='https://mediaspace.illinois.edu/media/t/1_x5t9gf51/154364361'> Slumdog Millionaire </a>";
        slumdog.setText(Html.fromHtml(slumText, Html.FROM_HTML_MODE_COMPACT));

        TextView gully = findViewById(R.id.GullyBoy);
        gully.setClickable(true);
        gully.setMovementMethod(LinkMovementMethod.getInstance());
        String gullyText = "<a href='https://mediaspace.illinois.edu/media/t/1_pfdo3h9p/154364361'> Gully Boy </a>";
        gully.setText(Html.fromHtml(gullyText, Html.FROM_HTML_MODE_COMPACT));
    }
}
