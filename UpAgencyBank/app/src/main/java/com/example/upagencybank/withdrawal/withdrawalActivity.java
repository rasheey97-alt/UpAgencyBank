package com.example.upagencybank.withdrawal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;
import com.example.upagencybank.deposit.TransactionActivity;

public class withdrawalActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdrawal);

        ImageView imageView1 = findViewById(R.id.back_button2);
        ImageView button1 = findViewById(R.id.proceed2);
        imageView1.setOnClickListener(this);
       button1.setOnClickListener(this);
    }
        @Override
        public void onClick (View v){
            if (v.getId() == R.id.back_button2) {
                finish();
            } else if (v.getId() == R.id.proceed2) {
                Intent intent = new Intent(this,PayCodeActivity.class);

               startActivity(intent);
            }


        }
    }
