package com.systemdesigning.aquaguard;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    TextView tv;
    Button b,b1,b2;
    Calendar c;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Spinner spinner =findViewById(R.id.spinner1);
        tv=(TextView) findViewById(R.id.textView5);
        b=(Button) findViewById(R.id.button);
        b1=(Button) findViewById(R.id.button2);
        b2=(Button) findViewById(R.id.button4);
        Spinner spi=findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.product, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.complaint, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spi.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(this);
        spi.setOnItemSelectedListener(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);

                dpd=new DatePickerDialog(Main4Activity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int myear, int mmonth, int mdayOfMonth) {
                        tv.setText(mdayOfMonth + "/" + (mmonth + 1) + "/" + myear);
                    }
                    }, day, month, year);
                    dpd.show();
                }
            });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(in);

            }
        });
        }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString() ;

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
