package com.numberplustable.ibmcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    android.widget.Button mbutton1;

    TextView mcurrentheight;
    TextView mcurrentwaist,mcurrentweight;
    ImageView mincrementwaist,mincrementweight,mdecrementweight, mdecrementwaist;

    RelativeLayout mmale,mfemale;


    int intweight=55;
    int intwaist=85;
    int currentprogress;
    String mintprogress="170";
    String typeofuser="0";
    String weight2="55";
    String waist2="85";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        mbutton1=findViewById(R.id.button1);
        mcurrentwaist=findViewById(R.id.currentwaist);
        mcurrentweight=findViewById(R.id.currentweight);
        mcurrentheight=findViewById(R.id.currentheight);
        mincrementwaist=findViewById(R.id.incrementwaist);
        mdecrementwaist=findViewById(R.id.decrementwaist);
        mincrementweight=findViewById(R.id.incrementweight);
        mdecrementweight=findViewById(R.id.decrementweight);

        mmale=findViewById(R.id.male);
        mfemale=findViewById(R.id.female);


        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.focus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfocus));
                typeofuser="남성";
            }
        });


        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.focus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfocus));
                typeofuser="여성";
            }
        });







        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight=intweight-1;
                weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);

            }
        });


        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight=intweight+1;
                weight2=String.valueOf(intweight);
                mcurrentweight.setText(weight2);

            }
        });

        mdecrementwaist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intwaist=intwaist-1;
                waist2=String.valueOf(intwaist);
                mcurrentwaist.setText(waist2);

            }
        });

        mincrementwaist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intwaist=intwaist+1;
                waist2=String.valueOf(intwaist);
                mcurrentwaist.setText(waist2);

            }
        });



        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(typeofuser.equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"성별을 골라주세요.", Toast.LENGTH_SHORT).show();
                }

                else if(intwaist==0 || intwaist<0) {
                    Toast.makeText(getApplicationContext(),"허리 둘레를 유효한 숫자로 다시 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else if(intweight==0 || intweight<0) {
                    Toast.makeText(getApplicationContext(),"몸무를 유효한 숫자로 다시 입력해주세요.", Toast.LENGTH_SHORT).show();
                }
                else
                { Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("gender",typeofuser);
                    intent.putExtra("weight",weight2);
                    intent.putExtra("waist",waist2);

                    startActivity(intent);
                }



                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);

            }
        });



        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });



    }
}