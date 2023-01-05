package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Check extends AppCompatActivity {
    private Button button_cancel;
    private Button button_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("key1");
        String value2 = intent.getStringExtra("key2");
        TextView textView1 = (TextView) findViewById(R.id.text_view_1);
        textView1.setText(value1);
        TextView textView2 = (TextView) findViewById(R.id.text_view_2);
        textView2.setText(value2);

        button_cancel = findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to open the new activity here
                Intent intent = new Intent(Check.this, MainActivity.class);
                startActivity(intent);
            }
        });


        button_ok = findViewById(R.id.button_ok);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        TextView textView = (TextView) findViewById(R.id.text_view_3);
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add code to open the new activity here
                String input = editText.getText().toString();
                //textView.setText(input);
                Intent intent = new Intent(Check.this, MainActivity.class);
                intent.putExtra("key", input);
                startActivity(intent);
            }
        });
    }
}