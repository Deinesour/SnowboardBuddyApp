package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherActivity extends AppCompatActivity {
    Button button;
    EditText editTextNumberZip;
    Thread thread;
    Handler handler;
    String zipcode;
    TextView textViewFaren;
    TextView textViewInfo;
    MediaPlayer mp;

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
        }else if (id == R.id.sizeChart) {
            Intent intent = new Intent(getApplicationContext(),SizeChartActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        editTextNumberZip = findViewById(R.id.editTextNumberZip);
        button = findViewById(R.id.button);
        mp = MediaPlayer.create(this,R.raw.snow);
        textViewFaren = findViewById(R.id.textViewFaren);
        textViewInfo = findViewById(R.id.textViewInfo);


        handler = new Handler(getMainLooper()){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
            }
        };

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        thread.quit();
    }

    public void go(View view) {
        mp.start();
        zipcode = editTextNumberZip.getText().toString();
        thread = new Thread(getApplicationContext(),handler);
        thread.start();
    }

    public class Thread  extends HandlerThread {
        private Context context;
        private Handler handler;
        public Thread(Context context, Handler handler) {
            super("Thread");
            this.context = context;
            this.handler = handler;
        }

        @Override
        public void run() {
            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            String url = "https://api.interzoid.com/getweatherzipcode?license=9625c208894a33815d9fc64b121ce44b&zip=" + zipcode;
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String temp = jsonObject.getString("TempF");
                        String weather = jsonObject.getString("Weather");
                        textViewFaren.setText(temp);
                        textViewInfo.setText(weather);
                        Log.v("HERE",temp);
                        Log.v("HERE",zipcode);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, null);
            queue.add(stringRequest);
        }
    }

}