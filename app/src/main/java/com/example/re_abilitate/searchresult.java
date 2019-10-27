package com.example.re_abilitate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;

public class searchresult extends AppCompatActivity {
    private CardView cardView;
    private CardView cardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchresult);
        cardView=(CardView) findViewById(R.id.cardView);
        cardView2=(CardView) findViewById(R.id.cardView2);
    }
}
