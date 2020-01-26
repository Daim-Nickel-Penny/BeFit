package com.example.b_fit;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.b_fit.MainActivity;
import com.example.b_fit.R;


public class Water extends MainActivity {

    Button wp, wn, rs;
    TextView tw1;

  TextView txt;

    VideoView videoVieww;
    int counter = 0;

            @Override

            protected void onCreate (@Nullable Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.water_lyt);
                wp = (Button) findViewById(R.id.wp);
                wn = (Button) findViewById(R.id.wn);
                rs = (Button) findViewById(R.id.rs);
                tw1 = (TextView) findViewById(R.id.tw1);
                txt = (TextView) findViewById(R.id.txt);
                Intent intent2 = getIntent();


                videoVieww = (VideoView) findViewById(R.id.videoView);
               videoVieww.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                   @Override
                   public void onCompletion(MediaPlayer mp) {
                       videoVieww.start();
                   }
               });
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wet);
                videoVieww.setVideoURI(uri);
                videoVieww.requestFocus();
                videoVieww.start();

                tw1.setText("0");
                wp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counter++;
                        tw1.setText(String.valueOf(counter));
                    }
                });

                wn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counter--;
                        tw1.setText(String.valueOf(counter));
                    }
                });

                rs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counter = 0;
                        tw1.setText(String.valueOf(counter));
                    }
                });


            }
            @Override
            protected void onStart () {
                super.onStart();
                videoVieww.start();

            }




        }