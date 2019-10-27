package com.example.re_abilitate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CardDesign extends AppCompatActivity {

    private ImageButton imageButton;
    private ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_design);
        imageButton=(ImageButton) findViewById(R.id.imageButton);
        imageButton2=(ImageButton) findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openvocab();}
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { opensearch();}
        });

    }
    public void openvocab(){
        Intent intent=new Intent(this, vocab.class);
        startActivity(intent);
    }

    public void opensearch(){
        Intent intent=new Intent(this, search.class);
        startActivity(intent);
    }
}
