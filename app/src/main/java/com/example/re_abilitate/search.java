package com.example.re_abilitate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class search extends AppCompatActivity {

    private Button button3;
    private EditText editText5;
    private EditText editText;
    private EditText editText6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        button3=(Button) findViewById(R.id.button3);
        editText5=(EditText) findViewById(R.id.editText5);
        editText=(EditText) findViewById(R.id.editText);
        editText6=(EditText) findViewById(R.id.editText6);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensearchresult();
            }
        });
    }
    public void opensearchresult(){
        Intent intent=new Intent(this, searchresult.class);
        startActivity(intent);
    }
}
