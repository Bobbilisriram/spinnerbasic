package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Spinner s;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        s=findViewById(R.id.spinner);
        b=findViewById(R.id.button3);

      s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String a=s.getSelectedItem().toString();
              Log.i("selected",a);
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });


      //  b.setOnClickListener(new View.OnClickListener() {
        //    @Override
          //  public void onClick(View v) {
            //    String a=s.getSelectedItem().toString();
              //  Log.i("selected",a);
            //}
        //});








    }

    }




