package com.example.upagencybank.Electricity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

public class ElectrictyPinActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricty_pin);
        ImageView imageView2 = findViewById(R.id.back_button2);
        ImageView button4 = findViewById(R.id.proceed6);
        imageView2.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();
        } else if (v.getId() == R.id.proceed6) {
            Intent intent = new Intent(this, Electricity_Rev_TActivity.class);

            startActivity(intent);
        }
    }
}
