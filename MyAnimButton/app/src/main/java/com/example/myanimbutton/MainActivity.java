package com.example.myanimbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void BlueTapped(View view)
    {
        ImageView blue= (ImageView) requireViewById(R.id.BlueBulb);
        blue.animate().alpha(0).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
