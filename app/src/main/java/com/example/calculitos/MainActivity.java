package com.example.calculitos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private Button equal;

    float numero1 = 0.0f;
    float numero2 = 0.0f;

    String operacion = "";

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
        equal=findViewById(R.id.equal);


    }


    public void EscribirSiete(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("7");
        }else{
            answ.setText(answ.getText()+"7");
        }
    }

    public void EscribirOcho(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("8");
        }else{
            answ.setText(answ.getText()+"8");
        }
    }
    public void EscribirNueve(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("9");
        }else{
            answ.setText(answ.getText()+"9");
        }
    }
    public void EscribirCuatro(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("4");
        }else{
            answ.setText(answ.getText()+"4");
        }
    }
    public void EscribirCinco(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("5");
        }else{
            answ.setText(answ.getText()+"5");
        }
    }
    public void EscribirSeis(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("6");
        }else{
            answ.setText(answ.getText()+"6");
        }
    }
    public void EscribirTres(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("3");
        }else{
            answ.setText(answ.getText()+"3");
        }
    }
    public void EscribirDos(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("2");
        }else{
            answ.setText(answ.getText()+"2");
        }
    }public void EscribirUno(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("1");
        }else{
            answ.setText(answ.getText()+"1");
        }
    }public void EscribirCero(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        if(numero1== 0.0f){
            answ.setText("0");
        }else{
            answ.setText(answ.getText()+"0");
        }
    }

    public void Clearall(View view){
        answ.setText(0);
        numero1=0.0f;
        numero2=0.0f;
        operacion="";
    }

    public void Dividir(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        operacion="/";
        answ.setText("0");
    }

    public void Sumar(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        operacion="+";
        answ.setText("0");
    }
    public void Restar(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        operacion="-";
        answ.setText("0");
    }
    public void Multiplicar(View view){
        numero1= Float.parseFloat(answ.getText().toString());
        operacion="*";
        answ.setText("0");
    }

    public void Mostrar(View view) {
        numero2=Float.parseFloat(answ.getText().toString());
        if(operacion.equals("/")){
            if(numero2==0.0f){
                answ.setText("0");
                Toast.makeText(this, "No se vale la operacion, no sea menso",Toast.LENGTH_LONG).show();
            }else{
                float result= numero1/numero2;
                answ.setText(result + "");
            } 
        } else if (operacion.equals("*")) {
            float result= numero1*numero2;
            answ.setText(result + "");
        }else if (operacion.equals("+")) {
            float result= numero1+numero2;
            answ.setText(result + "");
        }else if (operacion.equals("-")) {
            float result= numero1*numero2;
            answ.setText(result + "");

        }
        numero1=0.0f;
        numero2=0.0f;
        operacion="";
    }

}