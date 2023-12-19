package com.example.upagencybank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.upagencybank.AirTime.AirTimeActivity;
import com.example.upagencybank.Electricity.ElectricityHomeActivity;
import com.example.upagencybank.deposit.DepositActivity;
import com.example.upagencybank.withdrawal.withdrawalActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout item1Layout, item2Layout, item3Layout,  airtime , home_elect; //withdraw_button;
    private ImageView deposit;
    private  ImageView withdraw_button;
    //private ImageView airtime;
    //private linearLayout item2Layout;
    private Intent intent;
    private boolean isLayout1Visible = false;
    private boolean isLayout2Visible = false;

    private boolean isLayout3Visible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout dropLinear = findViewById(R.id.drop1);
        item1Layout = findViewById(R.id.dropdownContainer);
        dropLinear.setOnClickListener(this);

        LinearLayout dropLinear2 = findViewById(R.id.drop2);
        item2Layout = findViewById(R.id.dropdownContainer2);
        dropLinear2.setOnClickListener(this);


        LinearLayout dropLinear3 = findViewById(R.id.drop3);
        item3Layout = findViewById(R.id.dropdownContainer3);
        dropLinear3.setOnClickListener(this);

        deposit = findViewById(R.id.deposit);
        deposit.setOnClickListener(this);

        withdraw_button = findViewById(R.id.withdraw_button);
        withdraw_button.setOnClickListener(this);

        airtime = findViewById(R.id.airtime);
        airtime.setOnClickListener(this);

        home_elect = findViewById(R.id.home_elect);
        home_elect.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.drop1) {
            if (isLayout1Visible) {
                item1Layout.setVisibility(View.GONE);
                isLayout1Visible = false;
            } else {
                item1Layout.setVisibility(View.VISIBLE);
                isLayout1Visible = true;
            }

        } else if (view.getId() == R.id.drop2) {
            //if (view.getId() == R.id.drop1) {
            if (isLayout2Visible) {
                item2Layout.setVisibility(View.GONE);
                isLayout2Visible = false;
            } else {
                item2Layout.setVisibility(View.VISIBLE);
                isLayout2Visible = true;
            }

        }
        else if (view.getId() == R.id.drop3) {
            //if (view.getId() == R.id.drop1) {
            if (isLayout3Visible) {
                item3Layout.setVisibility(View.GONE);
                isLayout3Visible = false;
            } else {
                item3Layout.setVisibility(View.VISIBLE);
                isLayout3Visible = true;





            }
        } else if (view.getId() == R.id.deposit) {
            try {
                intent = new Intent(this, DepositActivity.class);
                startActivity(intent);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (view.getId() == R.id.withdraw_button) {
            try {
                intent = new Intent(this, withdrawalActivity.class);
                startActivity(intent);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
             else if (view.getId() == R.id.airtime) {
                try {
                    intent = new Intent(this, AirTimeActivity.class);
                    startActivity(intent);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        else if (view.getId() == R.id.home_elect) {
            try {
                intent = new Intent(this, ElectricityHomeActivity.class);

                startActivity(intent);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        }
    }

