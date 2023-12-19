package com.example.upagencybank.AirTime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;
import com.example.upagencybank.deposit.TransactionActivity;

public class AirTimeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_time);
        ImageView imageView1 = findViewById(R.id.back_button);
        ImageView button1 = findViewById(R.id.proceed1);
        imageView1.setOnClickListener(this);
        button1.setOnClickListener(this);






    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button) {
            finish();
        } else if (v.getId() == R.id.proceed1) {
            Intent intent = new Intent(this, PinActivity.class);

            startActivity(intent);
        }
    }
}
