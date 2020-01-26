package com.example.b_fit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public TextView textView, DisplayDateTime;
    public StepDetector simpleStepDetector;
    public SensorManager sensorManager;
    public Sensor accel;
    public static final String TEXT_NUM_STEPS = "Number of Steps: ";
    public int numSteps;
    Button BtnStop, BtnStart, BtnPause, btn1, btn2, forwt;
    TextView TvSteps;

    Button bmb, wb;
    Button qbtn;

    Button blogbt, contact;
    VideoView videoView;

    TextView timer;
    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L;
    Handler handler;
    int Seconds, Minutes, MilliSeconds;
    public SharedPreferences sharedPreferencesObj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();

        btn1 = (Button) findViewById(R.id.btn1);
        forwt = (Button) findViewById(R.id.forwt);
        bmb = (Button) findViewById(R.id.bmb);
        contact = (Button) findViewById(R.id.contact);
        blogbt = (Button) findViewById(R.id.blogbt);

        qbtn = (Button) findViewById(R.id.qbtn);



        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                videoView.start();
            }
        });

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.main);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        CalendarView calendarView = findViewById(R.id.calendarView);
        if (calendarView != null) {
            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                    // Note that months are indexed from 0. So, 0 means January, 1 means february, 2 means march etc.
                    String msg = "Selected date is " + dayOfMonth + "/" + (month + 1) + "/" + year;
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                }
            });


            qbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent qintent = new Intent(MainActivity.this, Qrcode.class);
                    startActivity(qintent);
                }
            });

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(MainActivity.this, Count.class);
                    startActivity(myIntent);

                }
            });


            forwt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent wtintent = new Intent(MainActivity.this, Water.class);
                    startActivity(wtintent);
                }
            });

            bmb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bmintent = new Intent(MainActivity.this, Bmi.class);
                    startActivity(bmintent);
                }
            });

            contact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent cintent=new Intent(MainActivity.this,Contact.class);
                    startActivity(cintent);
                }
            });
            blogbt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bllint = new Intent(MainActivity.this, Blogs.class);
                    startActivity(bllint);
                }
            });
        }
    }
    @Override
    protected  void onResume(){
        super.onResume();
        videoView.start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


}