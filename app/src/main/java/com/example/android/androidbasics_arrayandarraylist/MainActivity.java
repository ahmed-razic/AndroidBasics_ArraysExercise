package com.example.android.androidbasics_arrayandarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] intArray = new int[10];
;
        for( int i = 0; i < 10; i++) {
            intArray[i] = i;
        }

        Toast.makeText(this, String.valueOf(intArray[5]), Toast.LENGTH_SHORT).show();
    }
}