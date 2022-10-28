package com.gb.alkhelm.calculator_kh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView mainTextView;
    Button buttonZero;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonDot;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonDivide;
    Button buttonMultiply;
    Button buttonEqually;
    Button buttonClear;

    int answer;
    int firstNumber;
    int secondNumber;
    int numberOfPosition;
    char[] solution;
    String number = "";
    String actionSpy = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        //addListeners();


       /* if (Objects.equals(actionSpy, "+")){
            firstNumber = Integer.parseInt(number);
            number = "";
        }else{

        }*/

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //actionSpy = String.valueOf(buttonOne.getText());
                number = number + buttonOne.getText();
                mainTextView.setText(number);

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionSpy = String.valueOf(buttonTwo.getText());
                number = number + buttonTwo.getText();
                mainTextView.setText(number);

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    /*private void addListeners() {

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case (R.id._0):{
                    String number = String.valueOf(buttonZero.getText());
                    mainTextView.setText("1");
                    break;
                }
            }
        }
    };*/

    private void initButton() {

        mainTextView = findViewById(R.id.mainView);

        buttonZero = findViewById(R.id._0);
        buttonOne = findViewById(R.id._1);
        buttonTwo = findViewById(R.id._2);
        buttonThree = findViewById(R.id._3);
        buttonFour = findViewById(R.id._4);
        buttonFive = findViewById(R.id._5);
        buttonSix = findViewById(R.id._6);
        buttonSeven = findViewById(R.id._7);
        buttonEight = findViewById(R.id._8);
        buttonNine = findViewById(R.id._9);
        buttonDot = findViewById(R.id.dot);
        buttonPlus = findViewById(R.id.plus);
        buttonMinus = findViewById(R.id.minus);
        buttonDivide = findViewById(R.id.divide);
        buttonMultiply = findViewById(R.id.multiply);
        buttonEqually = findViewById(R.id.equally);
        buttonClear = findViewById(R.id.clear);

    }


}