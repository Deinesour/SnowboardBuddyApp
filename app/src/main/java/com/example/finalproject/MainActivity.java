package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listViewHome;
    ImageView imageViewHome;

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

        }else if (id == R.id.sizeChart){
            Intent intent = new Intent(getApplicationContext(),SizeChartActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecommendSQLiteHelper recommendSQLiteHelper = new RecommendSQLiteHelper(getApplicationContext());
        SQLiteDatabase sqLiteDatabase = recommendSQLiteHelper.getReadableDatabase();

        listViewHome = findViewById(R.id.listViewHome);
        imageViewHome = findViewById(R.id.imageViewHome);

        listViewHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(getApplicationContext(),RecommenderActivity.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(getApplicationContext(),WeatherActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}