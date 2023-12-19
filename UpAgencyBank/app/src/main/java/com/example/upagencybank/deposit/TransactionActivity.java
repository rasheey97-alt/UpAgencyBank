package com.example.upagencybank.deposit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

public class TransactionActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        ImageView imageView2 = findViewById(R.id.back_button2);
        ImageView button2 = findViewById(R.id.proceed2);
        imageView2.setOnClickListener(this);
        button2.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();
        } else if (v.getId() == R.id.proceed2) {
            Intent intent = new Intent(this, EnterPinActivity.class);

            startActivity(intent);
        }}
}