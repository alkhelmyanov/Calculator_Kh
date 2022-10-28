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
    // firstNumber;
    String firstNumber;
    int secondNumber;
    String action;
    int numberOfPosition;
    char[] solution;
    String number = "";
    boolean isActionOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton(); // Инициализируем кнопки
        addListeners(); // Добавляем слушатели на кнопки



    }

    private void addListeners() {

        // Добавляем слушатели на кнопки
        View.OnClickListener numberButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id._1): {
                        number = number + buttonOne.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._2): {
                        number = number + buttonTwo.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._3): {
                        number = number + buttonThree.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._4): {
                        number = number + buttonFour.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._5): {
                        number = number + buttonFive.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._6): {
                        number = number + buttonSix.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._7): {
                        number = number + buttonSeven.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._8): {
                        number = number + buttonEight.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._9): {
                        number = number + buttonNine.getText();
                        mainTextView.setText(number);
                        break;
                    }
                    case (R.id._0): {
                        number = number + buttonZero.getText();
                        mainTextView.setText(number);
                        break;
                    }
                }
            }
        };

        buttonOne.setOnClickListener(numberButtonOnClickListener);
        buttonTwo.setOnClickListener(numberButtonOnClickListener);
        buttonThree.setOnClickListener(numberButtonOnClickListener);
        buttonFour.setOnClickListener(numberButtonOnClickListener);
        buttonFive.setOnClickListener(numberButtonOnClickListener);
        buttonSix.setOnClickListener(numberButtonOnClickListener);
        buttonSeven.setOnClickListener(numberButtonOnClickListener);
        buttonEight.setOnClickListener(numberButtonOnClickListener);
        buttonNine.setOnClickListener(numberButtonOnClickListener);
        buttonZero.setOnClickListener(numberButtonOnClickListener);


        View.OnClickListener actionButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                switch (view.getId()) {
                    case (R.id.plus): {
                        action = "+";
                        break;
                    }
                    case (R.id.minus): {
                        action = "-";
                        break;
                    }
                    case (R.id.divide): {
                        action = "/";
                        break;
                    }
                    case (R.id.multiply): {
                        action = "*";
                        break;
                    }

                }

                firstNumber = mainTextView.getText().toString();
                number = "";
                mainTextView.setText(number);


            }
        };

        buttonPlus.setOnClickListener(actionButtonOnClickListener);
        buttonMinus.setOnClickListener(actionButtonOnClickListener);
        buttonDivide.setOnClickListener(actionButtonOnClickListener);
        buttonMultiply.setOnClickListener(actionButtonOnClickListener);


    }


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