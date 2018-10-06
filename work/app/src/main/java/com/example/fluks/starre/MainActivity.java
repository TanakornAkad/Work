package com.example.fluks.starre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "STAR";
    StringBuilder starshow = new StringBuilder("*****");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workshop();
    }
    public void workshop(){
        for (int i = 5; i > 0&& i <= 5 ; i-- ){
            starshow.deleteCharAt(i-1);
            Log.w(TAG, String.valueOf(starshow));
        }
    }
}
