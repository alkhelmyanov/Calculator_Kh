package com.gb.alkhelm.calculator_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double answer = 0.0;
    double [] solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTextView = findViewById(R.id.mainView);

        Button buttonZero = findViewById(R.id._0);
        Button buttonOne = findViewById(R.id._1);
        Button buttonTwo = findViewById(R.id._2);
        Button buttonThree = findViewById(R.id._3);
        Button buttonFour = findViewById(R.id._4);
        Button buttonFive = findViewById(R.id._5);
        Button buttonSix = findViewById(R.id._6);
        Button buttonSeven = findViewById(R.id._7);
        Button buttonEight = findViewById(R.id._8);
        Button buttonNine = findViewById(R.id._9);
        Button buttonDot = findViewById(R.id.dot);
        Button buttonPlus = findViewById(R.id.plus);
        Button buttonMinus = findViewById(R.id.minus);
        Button buttonDivide = findViewById(R.id.divide);
        Button buttonMultiply = findViewById(R.id.multiply);
        Button buttonEqually = findViewById(R.id.equally);
        Button buttonClear = findViewById(R.id.clear);
    }
}