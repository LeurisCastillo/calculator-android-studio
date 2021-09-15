package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView calculusObj, prevValueInputted, txtUsername;
    Boolean numberWasInputed = false;
    Integer prevValue, actualValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Bundle usernameGiven = getIntent().getExtras();

        calculusObj = (TextView) findViewById(R.id.tv_calculus);
        prevValueInputted = (TextView) findViewById(R.id.prev_value_inputed);
        txtUsername = (TextView) findViewById(R.id.txt_username);

        Button btnSum = findViewById(R.id.btn_sum);
        Button btnSubstraction = findViewById(R.id.btn_substraction);
        Button btnMultiply = findViewById(R.id.btn_multiply);
        Button btnDivision = findViewById(R.id.btn_division);
        Button btnCompute = findViewById(R.id.btn_compute);
        Button btnAustralianCurrency = findViewById(R.id.btn_australian_currency);
        Button btnUsaCurrency = findViewById(R.id.btn_usa_currency);
        Button btnEuroCurrency = findViewById(R.id.btn_euro_currency);
        Button btnInglanCurrency = findViewById(R.id.btn_inglan_currency);

        btnSum.setOnClickListener(this);
        btnSubstraction.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnCompute.setOnClickListener(this);
        btnAustralianCurrency.setOnClickListener(this);
        btnUsaCurrency.setOnClickListener(this);
        btnEuroCurrency.setOnClickListener(this);
        btnInglanCurrency.setOnClickListener(this);
        
        if (usernameGiven != null){
            txtUsername.setText(usernameGiven.getString("username"));
        }
    }


    public void inputNumber(View view){
        switch (view.getId()){
            case R.id.btn1:
                numberWasInputed = true;
                Button btn1 = findViewById(R.id.btn1);
                calculusObj.append(btn1.getText().toString());
                break;
            case R.id.btn2:
                numberWasInputed = true;
                Button btn2 = findViewById(R.id.btn2);
                calculusObj.append(btn2.getText().toString());
                break;
            case R.id.btn3:
                numberWasInputed = true;
                Button btn3 = findViewById(R.id.btn3);
                calculusObj.append(btn3.getText().toString());
                break;
            case R.id.btn4:
                numberWasInputed = true;
                Button btn4 = findViewById(R.id.btn4);
                calculusObj.append(btn4.getText().toString());
                break;
            case R.id.btn5:
                numberWasInputed = true;
                Button btn5 = findViewById(R.id.btn5);
                calculusObj.append(btn5.getText().toString());
                break;
            case R.id.btn6:
                numberWasInputed = true;
                Button btn6 = findViewById(R.id.btn6);
                calculusObj.append(btn6.getText().toString());
                break;
            case R.id.btn7:
                numberWasInputed = true;
                Button btn7 = findViewById(R.id.btn7);
                calculusObj.append(btn7.getText().toString());
                break;
            case R.id.btn8:
                numberWasInputed = true;
                Button btn8 = findViewById(R.id.btn8);
                calculusObj.append(btn8.getText().toString());
                break;
            case R.id.btn9:
                numberWasInputed = true;
                Button btn9 = findViewById(R.id.btn9);
                calculusObj.append(btn9.getText().toString());
                break;
            case R.id.btn0:
                numberWasInputed = true;
                Button btn0 = findViewById(R.id.btn0);
                calculusObj.append(btn0.getText().toString());
                break;
        }
    }

    public void clear(View view){
        switch(view.getId()){
            case R.id.clear_all:
                calculusObj.setText("");
                prevValueInputted.setText("");
                actualValue = null;
                prevValue = null;
                break;

            case R.id.delete_value:
                if (calculusObj.getText() != null) {
                    calculusObj.setText(calculusObj.getText().subSequence(0, calculusObj.getText().length() - 1));
                }
                break;
        }
    }

    @Override
    public void onClick(View view) {

        boolean wasComputed = false;

        switch (view.getId()){
            case R.id.btn_sum:
                wasComputed = false;
                if (numberWasInputed && prevValue == null){
                prevValue = Integer.parseInt(calculusObj.getText().toString());
                calculusObj.setText("");
                prevValueInputted.setText(prevValue.toString());
                numberWasInputed = false;
                } else if (prevValue != null && numberWasInputed){
                    actualValue = Integer.parseInt(calculusObj.getText().toString());
                    actualValue = prevValue + actualValue;
                    prevValue = actualValue;
                    prevValueInputted.setText(prevValue.toString());
                    calculusObj.setText("");
                    actualValue = 0;
                }
                break;
            case R.id.btn_substraction:
                wasComputed = false;
                if (numberWasInputed && prevValue == null){
                    prevValue = Integer.parseInt(calculusObj.getText().toString());
                    calculusObj.setText("");
                    prevValueInputted.setText(prevValue.toString());
                    numberWasInputed = false;
                } else if (prevValue != null && numberWasInputed){
                    actualValue = Integer.parseInt(calculusObj.getText().toString());
                    actualValue = prevValue - actualValue;
                    prevValue = actualValue;
                    prevValueInputted.setText(prevValue.toString());
                    calculusObj.setText("");
                    actualValue = 0;
                }
                break;
            case R.id.btn_multiply:
                wasComputed = false;
                if (numberWasInputed && prevValue == null){
                    prevValue = Integer.parseInt(calculusObj.getText().toString());
                    calculusObj.setText("");
                    prevValueInputted.setText(prevValue.toString());
                    numberWasInputed = false;
                } else if (prevValue != null && numberWasInputed){
                    actualValue = Integer.parseInt(calculusObj.getText().toString());
                    actualValue = prevValue * actualValue;
                    prevValue = actualValue;
                    prevValueInputted.setText(prevValue.toString());
                    calculusObj.setText("");
                    actualValue = 0;
                }
                break;
            case R.id.btn_division:
                wasComputed = false;
                if (numberWasInputed && prevValue == null){
                    prevValue = Integer.parseInt(calculusObj.getText().toString());
                    calculusObj.setText("");
                    prevValueInputted.setText(prevValue.toString());
                    numberWasInputed = false;
                } else if (prevValue != null && numberWasInputed){
                    actualValue = Integer.parseInt(calculusObj.getText().toString());
                    actualValue = prevValue / actualValue;
                    prevValue = actualValue;
                    prevValueInputted.setText(prevValue.toString());
                    calculusObj.setText("");
                    actualValue = 0;
                    Log.i("Value", "prevValue = " + prevValue + " & " + "actualValue = " + actualValue);
                }
                break;
            case R.id.btn_compute:
                if (prevValue != null) {
                    wasComputed = true;
                    calculusObj.setText(prevValue.toString());
                    prevValueInputted.setText("");
                    actualValue = Integer.parseInt(calculusObj.getText().toString());
                    prevValue = null;
                    Log.i("Value", "prevValue = " + prevValue + " & " + "actualValue = " + actualValue);
                } else if(numberWasInputed){
                actualValue = Integer.parseInt(calculusObj.getText().toString());
            }
                break;
            case R.id.btn_australian_currency:
                showCurrencyToast("Australia", 41);
                break;

            case R.id.btn_usa_currency:
                showCurrencyToast("USA", 56);
                break;

            case R.id.btn_inglan_currency:
                showCurrencyToast("INGLATERA", 78);
                break;

            case R.id.btn_euro_currency:
                showCurrencyToast("Europe", 67);
                break;
        }
    }

    public void showCurrencyToast(String message, int currency){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_currency_layout, findViewById(R.id.toast_root));

        TextView toastText = layout.findViewById(R.id.toast_text);

        toastText.setText("This currency from RD in " + message + " is equal to " + (currency*actualValue));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0,0 );
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}