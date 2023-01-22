package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RecommenderActivity extends AppCompatActivity {
    Button button;
    Spinner spinnerWeight;
    Spinner spinnerHeight;
    Spinner spinnerAbility;
    Spinner spinnerGender;
    RecommendSQLiteHelper recommendSQLiteHelper;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.homeButton){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }else if (id == R.id.sizeChart){
            Intent intent = new Intent(getApplicationContext(),SizeChartActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommender);
        button = findViewById(R.id.recommendButton);
        spinnerHeight = findViewById(R.id.spinnerHeight);
        spinnerWeight = findViewById(R.id.spinnerWeight);
        spinnerAbility = findViewById(R.id.spinnerAbility);
        spinnerGender = findViewById(R.id.spinnerGender);
        recommendSQLiteHelper = new RecommendSQLiteHelper(getApplicationContext());
        recommendSQLiteHelper.getReadableDatabase();

    }

    public void onClick(View view) {
        int query = -1;

        String [] weightOptions = getResources().getStringArray(R.array.weightOptions);
        int weightIndex = spinnerWeight.getSelectedItemPosition();
        String weight = weightOptions[weightIndex];

        String [] heightOptions = getResources().getStringArray(R.array.heightOptions);
        int heightIndex = spinnerHeight.getSelectedItemPosition();
        String height = heightOptions[heightIndex];

        String [] abilityOptions = getResources().getStringArray(R.array.abilityOptions);
        int abilityIndex = spinnerAbility.getSelectedItemPosition();
        String ability = abilityOptions[abilityIndex];

        String [] genderOptions = getResources().getStringArray(R.array.genderOptions);
        int genderIndex = spinnerGender.getSelectedItemPosition();
        String gender = genderOptions[genderIndex];


        if (gender.equals("Female")) {
            if (height.equals("152")) {
                query = 1;
            } else if (height.equals("158")) {
                query = 2;
            }else if (height.equals("163")){
                query = 3;
            }else if (height.equals("168")){
                query = 4;
            }else if (height.equals("173")){
                query = 5;
            }else if (height.equals("178")){
                query = 6;
            }
        }else if (gender.equals("Male")){
            if (height.equals("168")) {
                query = 7;
            } else if (height.equals("173")) {
                query = 8;
            }else if (height.equals("178")){
                query = 9;
            }else if (height.equals("183")){
                query = 10;
            }else if (height.equals("188")){
                query = 11;
            }else if (height.equals("193")){
                query = 12;
            }
        }
        Intent intent = new Intent(getApplicationContext(),RecommendDetailActivity.class);
        intent.putExtra("QUERY",query);
        startActivity(intent);
    }
}