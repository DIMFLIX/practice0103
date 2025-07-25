package com.example.education_practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OutdoorPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_page);
    }

    public void goMain(View view) {
        Intent intent = new Intent(OutdoorPageActivity.this, MainPage.class);
        startActivity(intent);
    }

    public void goProductCard(View view) {
        Intent intent = new Intent(OutdoorPageActivity.this, ProductCardActivity.class);
        startActivity(intent);
    }
}