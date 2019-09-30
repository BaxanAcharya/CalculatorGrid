package com.biplav.calculatorgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText etText;
    double first, second;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAddition, btnSubtraction, btnDivision, btnMultiplication, btnclear, btnequals;
    boolean executeifAddition, executeifSubtract, executeifMultiplication, executeifDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnclear = findViewById(R.id.btnclear);
        btnequals = findViewById(R.id.btnequal);

        btn0.setOnClickListener(this);
        btnequals.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                etText.setText("1");
                break;

            case R.id.btn2:
                etText.setText("2");
                break;

            case R.id.btn3:
                etText.setText("3");
                break;

            case R.id.btn4:
                etText.setText("4");
                break;

            case R.id.btn5:
                etText.setText("5");
                break;

            case R.id.btn6:
                etText.setText("6");
                break;


            case R.id.btn7:
                etText.setText("7");
                break;

            case R.id.btn8:
                etText.setText("8");
                break;

            case R.id.btn9:
                etText.setText("9");
                break;

            case R.id.btn0:
                etText.setText("0");
                break;

            case R.id.btnclear:
                etText.setText("");
                break;

            case R.id.btnAddition:
                if (etText == null) {
                    etText.setText("");
                } else {
                    first = Double.parseDouble(etText.getText().toString());
                    executeifAddition = true;
                    etText.setText(null);
                }
                break;

            case R.id.btnSubtraction:
                if (etText == null) {
                    etText.setText("");
                } else {
                    first = Double.parseDouble(etText.getText().toString());
                    executeifSubtract = true;
                    etText.setText(null);
                }
                break;

            case R.id.btnDivision:
                if (etText == null) {
                    etText.setText("");
                } else {
                    first = Double.parseDouble(etText.getText().toString());
                    executeifSubtract = true;
                    etText.setText(null);
                }
                break;

            case R.id.btnMultiplication:
                if (etText == null) {
                    etText.setText("");
                } else {
                    first = Double.parseDouble(etText.getText().toString());
                    executeifSubtract = true;
                    etText.setText(null);
                }
                break;

            //logic for add,sub,mul or div
            case R.id.btnequal:
                second = Double.parseDouble(etText.getText().toString());

                if (executeifAddition == true) {
                    etText.setText(first + second + "");
                    executeifAddition = false;
                }

                if (executeifSubtract == true) {
                    etText.setText(first - second + "");
                    executeifSubtract = false;
                }

                if (executeifMultiplication == true) {
                    etText.setText(first * second + "");
                    executeifMultiplication = false;
                }

                if (executeifDivision == true) {
                    etText.setText(first / second + "");
                    executeifDivision = false;
                }

        }

    }
    }

