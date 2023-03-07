package com.example.calculitos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answ;
    private Button clra;
    private Button del;
    private Button num_7;
    private Button num_8;
    private Button num_9;
    private Button sum;
    private Button num_4;
    private Button num_5;
    private Button num_6;
    private Button res;
    private Button num_1;
    private Button num_2;
    private Button num_3;
    private Button mult;
    private Button num_0;
    private Button div;

    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answ=findViewById(R.id.answ);
        clra=findViewById(R.id.clra);
        del=findViewById(R.id.del);
        num_7=findViewById(R.id.num_7);
        num_8=findViewById(R.id.num_8);
        num_9=findViewById(R.id.num_9);
        sum=findViewById(R.id.sum);

        num_4=findViewById(R.id.num_4);
        num_5=findViewById(R.id.num_5);
        num_6=findViewById(R.id.num_6);
        res=findViewById(R.id.res);

        num_1=findViewById(R.id.num_1);
        num_2=findViewById(R.id.num_2);
        num_3=findViewById(R.id.num_3);
        mult=findViewById(R.id.mult);

        num_0=findViewById(R.id.num_0);
        div=findViewById(R.id.div);


    }

    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return a-b;
    }
    public int multiplicacion(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
}