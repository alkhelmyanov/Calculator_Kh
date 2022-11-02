package com.gb.alkhelm.calculator_kh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    String firstNumber; // хранит число для вычисления
    double result = 0.0;
    String actionFunctionButton;
    boolean isFully = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton(); // Инициализируем кнопки
        addListeners(); // Добавляем слушатели на кнопки

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putDouble("result", result);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result = savedInstanceState.getDouble("result");
        mainTextView.setText(String.valueOf(result));
    }

    // Добавляем слушатели на кнопки и действие на них
    private void addListeners() {

        // Реакция на действия нажатия цифровых кнопок

        View.OnClickListener numberButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case (R.id._1): {
                        firstNumber = mainTextView.getText() + "1";
                        break;
                    }
                    case (R.id._2): {
                        firstNumber = mainTextView.getText() + "2";
                        break;
                    }
                    case (R.id._3): {
                        firstNumber = mainTextView.getText() + "3";
                        break;
                    }
                    case (R.id._4): {
                        firstNumber = mainTextView.getText() + "4";
                        break;
                    }
                    case (R.id._5): {
                        firstNumber = mainTextView.getText() + "5";
                        break;
                    }
                    case (R.id._6): {
                        firstNumber = mainTextView.getText() + "6";
                        break;
                    }
                    case (R.id._7): {
                        firstNumber = mainTextView.getText() + "7";
                        break;
                    }
                    case (R.id._8): {
                        firstNumber = mainTextView.getText() + "8";
                        break;
                    }
                    case (R.id._9): {
                        firstNumber = mainTextView.getText() + "9";
                        break;
                    }
                    case (R.id._0): {
                        firstNumber = mainTextView.getText() + "0";
                        break;
                    }
                    case (R.id.dot): {
                        firstNumber = mainTextView.getText() + ".";
                    }
                }
                mainTextView.setText(firstNumber);
            }
        };


        // Реакция на действие функциональных кнопок

        View.OnClickListener actionButtonOnClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Затираем значения экрана
                if (isFully) {
                    mainTextView.setText("");

                    // обрабатываем действие функциональных кнопок
                    switch (view.getId()) {
                        case (R.id.plus): {
                            //mainTextView.setText(String.valueOf(result));
                            actionFunctionButton = "+";
                            break;
                        }
                        case (R.id.minus): {
                            //mainTextView.setText(String.valueOf(result));
                            actionFunctionButton = "-";
                            break;
                        }
                        case (R.id.divide): {
                            //mainTextView.setText(String.valueOf(result));
                            actionFunctionButton = "/";
                            break;
                        }
                        case (R.id.multiply): {
                            //mainTextView.setText(String.valueOf(result));
                            actionFunctionButton = "*";
                            break;
                        }
                        case (R.id.clear): {
                            mainTextView.setText("");
                            result = 0.0;
                        }
                    }
                }
            }
        };

        // Реакци на действия кнопки "Равно"
        buttonEqually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (actionFunctionButton) {
                    case ("+"): {
                        result = result + Double.parseDouble(firstNumber);
                        mainTextView.setText(String.valueOf(result));
                        break;
                    }
                    case ("-"): {
                        result = result - Double.parseDouble(firstNumber);
                        mainTextView.setText(String.valueOf(result));
                        break;
                    }
                    case ("/"): {
                        result = result / Double.parseDouble(firstNumber);
                        mainTextView.setText(String.valueOf(result));
                        break;
                    }
                    case ("*"): {
                        result = result * Double.parseDouble(firstNumber);
                        mainTextView.setText(String.valueOf(result));
                        break;
                    }
                }

            }
        });

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
        buttonDot.setOnClickListener(numberButtonOnClickListener);

        buttonPlus.setOnClickListener(actionButtonOnClickListener);
        buttonMinus.setOnClickListener(actionButtonOnClickListener);
        buttonDivide.setOnClickListener(actionButtonOnClickListener);
        buttonMultiply.setOnClickListener(actionButtonOnClickListener);
        buttonClear.setOnClickListener(actionButtonOnClickListener);

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