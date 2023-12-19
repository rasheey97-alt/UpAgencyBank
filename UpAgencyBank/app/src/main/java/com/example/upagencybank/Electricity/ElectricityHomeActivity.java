package com.example.upagencybank.Electricity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;
import com.example.upagencybank.deposit.TransactionActivity;

public class ElectricityHomeActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_home);
        ImageView imageView4 = findViewById(R.id.back_button4);
        ImageView button4 = findViewById(R.id.proceed4);
        imageView4.setOnClickListener(this);
        button4.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button4) {
            finish();
        } else if (v.getId() == R.id.proceed4) {
            Intent intent = new Intent(this, Electricity_Rev_TActivity.class);

            startActivity(intent);
        }
    }
}
