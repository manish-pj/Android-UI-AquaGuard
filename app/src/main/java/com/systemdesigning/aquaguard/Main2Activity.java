package com.systemdesigning.aquaguard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b1;
    EditText mn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.button);
        mn = (EditText) findViewById(R.id.et1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(i);
                }
            }
        );
    }
}