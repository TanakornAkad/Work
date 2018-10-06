package com.example.fluks.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView showname = findViewById(R.id.tv_showname);
        final TextView showsurname = findViewById(R.id.tv_showsurname);
        final EditText inputName = findViewById(R.id.et_inputname);
        final EditText inputSurname = findViewById(R.id.et_inputsurname);
        Button btnameset = findViewById(R.id.bt_setname);

        btnameset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showname.setText(inputName.getText());
                showsurname.setText(inputSurname.getText());
            }
        });
    }
    }

