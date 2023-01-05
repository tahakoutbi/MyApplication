package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        int somme = Integer.parseInt(value);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to open the new activity here
                Intent intent = new Intent(MainActivity.this, Check.class);
                startActivity(intent);
            }
        });
        button2 = findViewById(R.id.button2);
        EditText editText1 = (EditText) findViewById(R.id.editchallenge1);
        EditText editText2 = (EditText) findViewById(R.id.editchallenge2);
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to open the new activity here

                Intent intent = new Intent(MainActivity.this, Check.class);
                intent.putExtra("key1", input1);
                intent.putExtra("key2", input2);
                startActivity(intent);
            }
        });

    }

    /*public void onImageButtonClick(View view) {

    }
    public void onChallenge(View view){

    }
    public void onCall(View view){

    }*/
}