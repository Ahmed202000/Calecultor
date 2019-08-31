package com.example.trust.calecultor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textDisplay = (EditText) findViewById(R.id.edtxt);


        textDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(textDisplay.getWindowToken(), 0);
            }
        });
        Button btn = (Button) findViewById(R.id.btn);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btnzero);
        Button btnequal = (Button) findViewById(R.id.btnequal);
        Button btnaddican = (Button) findViewById(R.id.btnaddican);
        Button btnal = (Button) findViewById(R.id.btnal);
        Button btnmainc = (Button) findViewById(R.id.btnmainc);
        Button btnplas = (Button) findViewById(R.id.btnplas);


        btn.setOnClickListener(this);
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
        btnequal.setOnClickListener(this);
        btnaddican.setOnClickListener(this);
        btnal.setOnClickListener(this);
        btnmainc.setOnClickListener(this);
        btnplas.setOnClickListener(this);

    }

    int clear_flag = 0;
    String sign_flag = "";
    Double total = 0.0;
    int last_button = 0;

    public void shownum(String num) {
        if (clear_flag == 1) {
            textDisplay.setText("");
            clear_flag = 0;
        } else if (textDisplay.getText().toString() == "0") {
            textDisplay.setText("");
        }
        textDisplay.setText(textDisplay.getText() + num);
    }



    public void showsing(String sing)
    {
        if(last_button==R.id.btnaddican||
                last_button==R.id.btnmainc||
                last_button==R.id.btnal||
                last_button==R.id.btnsection||
                last_button==R.id.btnplas)
        {
            //
        }
        else {
            clear_flag=1;
            Double newNumber=Double.parseDouble(textDisplay.getText().toString());
                    if(sign_flag==""||sign_flag=="=")
                    {
                        total=newNumber;
                        textDisplay.setText(total.toString());
                    }
                    else if(sign_flag=="+")
                    {
                        total=total+newNumber;
                        textDisplay.setText(total.toString());
                    }
                    else if(sign_flag=="-")
                    {
                        total=total-newNumber;
                        textDisplay.setText(total.toString());
                    }
                    else if(sign_flag=="*")
                    {
                        total=total*newNumber;
                        textDisplay.setText(total.toString());
                    }
                    else if(sign_flag=="/")
                    {
                        total=total/newNumber;
                        textDisplay.setText(total.toString());
                    }
                    else if(sign_flag=="%")
                    {
                        total=total%newNumber;
                        textDisplay.setText(total.toString());
                    }
        }

        sign_flag=sing;



    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn) {
            if (clear_flag == 1) {
                textDisplay.setText("");
                clear_flag = 0;
            }
            if (textDisplay.getText().toString().indexOf(".") <= 0) {
                textDisplay.setText(textDisplay.getText() + ".");
            }
        }
        else if(view.getId()==R.id.btnzero)
        {
            shownum("0");
        }
        else if(view.getId()==R.id.btn1)
        {
            shownum("1");
        }
        else if(view.getId()==R.id.btn2)
        {
            shownum("2");
        }
        else if(view.getId()==R.id.btn3)
        {
            shownum("3");
        }
        else if(view.getId()==R.id.btn4)
        {
            shownum("4");
        }
        else if(view.getId()==R.id.btn5)
        {
            shownum("5");
        }
        else if(view.getId()==R.id.btn6)
        {
            shownum("6");
        }
        else if(view.getId()==R.id.btn7)
        {
            shownum("7");
        }
        else if(view.getId()==R.id.btn8)
        {
            shownum("8");
        }
        else if(view.getId()==R.id.btn9)
        {
            shownum("9");
        }
        else if(view.getId()==R.id.btnaddican) {
            shownum("*");
        }
        else if(view.getId()==R.id.btnal) {
            shownum("/");
        }
        else if(view.getId()==R.id.btnmainc) {
            shownum("-");
        }
        else if(view.getId()==R.id.btnsection) {
            shownum("%");
        }
        else if(view.getId()==R.id.btnplas) {
            shownum("+");
        }
        else if(view.getId()==R.id.btnequal) {
            Double newNumber;
            String textd=textDisplay.getText().toString();
            if(textd.trim().equals(""))
            {
                newNumber=Double.parseDouble("0");
                total=total+newNumber;
                textDisplay.setText(total.toString());
            }
            newNumber=Double.parseDouble(textd.toString());
            if(sign_flag=="+"){
                total=total+newNumber;
                textDisplay.setText(total.toString());
            }
            if(sign_flag=="-"){
                total=total-newNumber;
                textDisplay.setText(total.toString());
            }
            if(sign_flag=="*"){
                total=total*newNumber;
                textDisplay.setText(total.toString());
            }
            if(sign_flag=="/"){
                total=total/newNumber;
                textDisplay.setText(total.toString());
            }
            if(sign_flag=="%"){
                total=total%newNumber;
                textDisplay.setText(total.toString());
            }
            sign_flag="=";
        }
        last_button= view.getId();
    }


}