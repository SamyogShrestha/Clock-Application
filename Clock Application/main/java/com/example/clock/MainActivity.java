package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public Button stopwatchbtn;
    public Button alarmbtn;
    public Button timerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar= Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.text_view_date);
        textViewDate.setText(currentDate);

        alarm();
        stopwatch();
        timer();
    }

    public void stopwatch() {
        stopwatchbtn = (Button) findViewById(R.id.stopwatchbtn);
        stopwatchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Stopwatch.class);
                startActivity(intent2);
            }
        });
    }

    public void alarm() {
        alarmbtn = (Button) findViewById(R.id.alarmbtn);
        alarmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Alarm.class);
                startActivity(intent);
            }
        });
    }

    public void timer() {
        timerbtn = (Button) findViewById(R.id.timerbtn);
        timerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Timer.class);
                startActivity(intent4);
            }
        });
    }
}