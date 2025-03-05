package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //initiate view's
        ImageButton returnButton = (ImageButton)findViewById(R.id.returnButton);
        ImageButton chase = (ImageButton) findViewById(R.id.chaseButton);
        ImageButton citi = (ImageButton) findViewById(R.id.citiButton);
        ImageButton america = (ImageButton) findViewById(R.id.americaButton);
        ImageButton capital = (ImageButton) findViewById(R.id.captialButton);
        ImageButton pnc = (ImageButton) findViewById(R.id.pncButton);
        ImageButton us = (ImageButton) findViewById(R.id.usButton);
        ImageButton wells = (ImageButton) findViewById(R.id.wellsButton);

        //preform click on button
        returnButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToFirstActivity();
        }
        });
        chase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.chase.com/business/login-emob"));
                    startActivity(browserIntent);
            }
        });
        citi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.citi.com/"));
                startActivity(browserIntent);
            }
        });
        america.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go"));
                startActivity(browserIntent);
            }
        });
        capital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://verified.capitalone.com/auth/signin"));
                startActivity(browserIntent);
            }
        });
        pnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinebanking.pnc.com/"));
                startActivity(browserIntent);
            }
        });
        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://onboarding.usbank.com/consumer/cards/G8X4842GXR/8069/43728/login?icid=OTHI_49213"));
                startActivity(browserIntent);
            }
        });
        wells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://connect.secure.wellsfargo.com/auth/login/present?origin=cob&LOB=CONS"));
                startActivity(browserIntent);
            }
        });

    }
    private void goToFirstActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }