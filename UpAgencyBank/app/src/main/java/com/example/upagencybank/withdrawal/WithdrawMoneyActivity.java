package com.example.upagencybank.withdrawal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;

import net.glxn.qrgen.android.QRCode;

public class WithdrawMoneyActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_money);

        ImageView imageView3 = findViewById(R.id.back_button2);

        imageView3.setOnClickListener(this);




        Bitmap myBitmap = QRCode.from("www.example.org").bitmap();
        ImageView myImage =  findViewById(R.id.qr_code);
        myImage.setImageBitmap(myBitmap);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();

    } else if (v.getId() == R.id.qr_code) {
        Intent intent = new Intent(this, WithdrawMoneyActivity.class);

        startActivity(intent);
    }
    }
}