package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class RecommendDetailActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecommendSQLiteHelper recommendSQLiteHelper;
    RecommendAdapter recommendAdapter;

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
        setContentView(R.layout.activity_recommend_detail);
        recommendSQLiteHelper = new RecommendSQLiteHelper(getApplicationContext());
        recommendSQLiteHelper.getReadableDatabase();
        recommendAdapter = new RecommendAdapter(recommendSQLiteHelper);
        recyclerView = findViewById(R.id.recyclerViewRecommend);
        recyclerView.setAdapter(recommendAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Intent intent = getIntent();
        int query = intent.getIntExtra("QUERY",-1);

        if (query == 1){
            recommendSQLiteHelper.sortFemale152();
        }else if (query == 2){
            recommendSQLiteHelper.sortFemale158();
        }else if (query == 3){
            recommendSQLiteHelper.sortFemale163();
        }else if (query == 4){
            recommendSQLiteHelper.sortFemale168();
        }else if (query == 5){
            recommendSQLiteHelper.sortFemale173();
        }else if (query == 6){
            recommendSQLiteHelper.sortFemale178();
        }else if (query == 7){
            recommendSQLiteHelper.sortMale168();
        }else if (query == 8){
            recommendSQLiteHelper.sortMale173();
        }else if (query == 9){
            recommendSQLiteHelper.sortMale178();
        }else if (query == 10){
            recommendSQLiteHelper.sortMale183();
        }else if (query == 11){
            recommendSQLiteHelper.sortMale188();
        }else if (query == 12){
            recommendSQLiteHelper.sortMale193();
        }

        recommendAdapter.notifyDataSetChanged();
    }

}