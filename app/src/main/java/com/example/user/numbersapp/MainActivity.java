package com.example.user.numbersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.user.numbersapp.R.id.ed1;
import static com.example.user.numbersapp.R.id.ed3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
    }
    public void addNum(View v){
        EditText x = (EditText) findViewById(R.id.ed1);
        EditText y = (EditText) findViewById(R.id.ed2);
        EditText z = (EditText) findViewById(R.id.ed3);
        int a = Integer.parseInt(x.getText().toString());
        int b = Integer.parseInt(y.getText().toString());
        int c = a+b;
        z.setText(String.valueOf(c));
    }
    public void subNum(View v){
        EditText x = (EditText) findViewById(R.id.ed1);
        EditText y = (EditText) findViewById(R.id.ed2);
        EditText z = (EditText) findViewById(R.id.ed3);
        int a = Integer.parseInt(x.getText().toString());
        int b = Integer.parseInt(y.getText().toString());
        int c = a-b;
        z.setText(String.valueOf(c));
    }
    public void mulNum(View v){
        EditText x = (EditText) findViewById(R.id.ed1);
        EditText y = (EditText) findViewById(R.id.ed2);
        EditText z = (EditText) findViewById(R.id.ed3);
        int a = Integer.parseInt(x.getText().toString());
        int b = Integer.parseInt(y.getText().toString());
        int c = a*b;
        z.setText(String.valueOf(c));
    }
    public void divNum(View v){
        EditText x = (EditText) findViewById(R.id.ed1);
        EditText y = (EditText) findViewById(R.id.ed2);
        EditText z = (EditText) findViewById(R.id.ed3);
        int a = Integer.parseInt(x.getText().toString());
        int b = Integer.parseInt(y.getText().toString());
        double c = a/(double)b;
        z.setText(String.valueOf(c));
    }
}
