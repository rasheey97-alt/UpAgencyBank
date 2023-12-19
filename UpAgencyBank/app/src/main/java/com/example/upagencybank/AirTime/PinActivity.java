package com.example.upagencybank.AirTime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

public class PinActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        ImageView imageView1 = findViewById(R.id.back_button);
        ImageView button1 = findViewById(R.id.enter);
        imageView1.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button) {
            finish();
        } else if (v.getId() == R.id.enter) {
            Intent intent = new Intent(this, PinActivity.class);

            startActivity(intent);
        }
    }
}



