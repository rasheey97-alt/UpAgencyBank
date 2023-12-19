package com.example.upagencybank.deposit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.upagencybank.R;
import com.poovam.pinedittextfield.PinField;
import com.poovam.pinedittextfield.SquarePinField;

public class EnterPinActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin);
        ImageView imageView3 = findViewById(R.id.back_button2);
        imageView3.setOnClickListener(this);
        final SquarePinField linePinField1 = findViewById(R.id.squareField);
        linePinField1.setOnTextCompleteListener(new PinField.OnTextCompleteListener() {
            @Override
            public boolean onTextComplete(@NonNull String s) {
                return false;
            }
        });


    }


    public void onClick(View v) {
        if (v.getId() == R.id.back_button2) {
            finish();

        }}
}
