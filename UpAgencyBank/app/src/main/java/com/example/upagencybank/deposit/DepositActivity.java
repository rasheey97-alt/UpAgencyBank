package com.example.upagencybank.deposit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.upagencybank.R;




public class DepositActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        ImageView imageView1 = findViewById(R.id.back_button);
        ImageView button1 = findViewById(R.id.proceed);
        imageView1.setOnClickListener(this);
        button1.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button) {
            finish();
        } else if (v.getId() == R.id.proceed) {
            Intent intent = new Intent(this, TransactionActivity.class);

            startActivity(intent);
        }
    }
        }





