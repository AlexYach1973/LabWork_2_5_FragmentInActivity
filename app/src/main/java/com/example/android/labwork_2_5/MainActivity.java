package com.example.android.labwork_2_5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {

        TextView textFr = findViewById(R.id.text_view_fr);
        ImageView imageFr = findViewById(R.id.image_view_fr);
        switch (v.getId()) {

            case R.id.button_text:
                textFr.setVisibility(View.VISIBLE);
                imageFr.setVisibility(View.GONE);
                break;

            case R.id.button_image:
                textFr.setVisibility(View.GONE);
                imageFr.setVisibility(View.VISIBLE);
                break;

            case R.id.button_clear:
                textFr.setVisibility(View.GONE);
                imageFr.setVisibility(View.GONE);
                break;

            default: break;
        }
    }
}