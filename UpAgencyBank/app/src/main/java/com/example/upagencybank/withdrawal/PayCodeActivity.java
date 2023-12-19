package com.example.upagencybank.withdrawal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

public class PayCodeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_code);


        ImageView imageView2 = findViewById(R.id.back_button2);
        ImageView button1 = findViewById(R.id.proceed3);
        imageView2.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();
        } else if (v.getId() == R.id.proceed3) {
            Intent intent = new Intent(this, WithdrawMoneyActivity.class);

            startActivity(intent);
        }


    }


}