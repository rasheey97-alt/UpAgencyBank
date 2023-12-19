package com.example.upagencybank.Electricity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

public class Electricity_Rev_TActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_rev_tactivity);
        ImageView imageView5 = findViewById(R.id.back_button2);
        ImageView button5 = findViewById(R.id.proceed2);
        imageView5.setOnClickListener(this);
        button5.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();
        } else if (v.getId() == R.id.proceed2) {
            Intent intent = new Intent(this, ElectrictyPinActivity.class);

            startActivity(intent);
        }
    }
}