package com.android.touchevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //NumberActivity
        TextView numberText = (TextView) findViewById(R.id.numbers);
        numberText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberActivity = new Intent(MainActivity.this,NumberActivity.class);
                startActivity(numberActivity);
            }
        });

        //FamilyActivity
        TextView familyText = (TextView) findViewById(R.id.family);
        familyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActivity = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyActivity);
            }
        });

        //ColorsActivity
        TextView colorText = (TextView) findViewById(R.id.colors);
        colorText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorActivity = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorActivity);
            }
        });
    }
}
