package com.example.android.androidbasics_arrayandarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;


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

        doArrays();

        doArrayList();
    }

    private void doArrayList() {
        ArrayList<String> restaurantsToTry = new ArrayList<String>();

        restaurantsToTry.add("Morning Cafe");
        restaurantsToTry.add("BBQ Time");
        restaurantsToTry.add(2, "Fine Eats");
        restaurantsToTry.add("Sweet pause");

        Log.i("doArrayList()", restaurantsToTry.get(0));
        Log.i("doArrayList()", restaurantsToTry.get(1));
        Log.i("doArrayList()", restaurantsToTry.get(2));
        Log.i("doArrayList()", restaurantsToTry.get(3));
        Log.i("doArrayList()", String.valueOf(restaurantsToTry.size()));
        restaurantsToTry.remove("Fine Eats");
        restaurantsToTry.size();
        Log.i("doArrayList()", String.valueOf(restaurantsToTry.size()));


    }

    public void doArrays() {
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.i("Main Activity", "Value on index 0: " + words[0]);
        Log.v("Main Activity", "Value on index 1: " + words[1]);
        Log.d("Main Activity", "Value on index 2: " + words[2]);
        Log.w("Main Activity", "Value on index 3: " + words[3]);
        Log.e("Main Activity", "Value on index 4: " + words[4]);
        Log.i("Main Activity", "Value on index 5: " + words[5]);
        Log.v("Main Activity", "Value on index 6: " + words[6]);
        Log.d("Main Activity", "Value on index 7: " + words[7]);
        Log.w("Main Activity", "Value on index 8: " + words[8]);
        Log.e("Main Activity", "Value on index 9: " + words[9]);


    }
}