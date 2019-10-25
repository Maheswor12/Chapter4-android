package com.maheswor.chapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class capitalActivity extends AppCompatActivity {
private TextView capitalview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        capitalview= findViewById(R.id.capitalview);
        Bundle intent = getIntent().getExtras();
        if(intent!=null) {
            String message  = intent.getString("capital");
            capitalview.setText(message);

        }else{
            Toast.makeText(this, "No message", Toast.LENGTH_SHORT).show();
        }
    }
}
