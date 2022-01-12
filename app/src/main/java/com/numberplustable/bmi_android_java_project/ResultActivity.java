package com.numberplustable.ibmcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    android.widget.Button mbutton2;

    TextView mbmidisplay,mbmicategory,mgender;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    float intbmi;


    String height;
    String weight;
    float intheight, intweight;
    RelativeLayout mbackground;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
        getSupportActionBar().setTitle("Result");
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#1E1D1D"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);



        intent=getIntent();

        mbmidisplay=findViewById(R.id.bmidisplay);
        mgender=findViewById(R.id.genderdisplay);
        mbackground=findViewById(R.id.contentlayout);
        mbmicategory=findViewById(R.id.bmicategory);
        mimageview=findViewById(R.id.imageview);
        mbutton2=findViewById(R.id.button2);

        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");


        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;

        intbmi=intweight/(intheight*intheight);

        mbmi=Float.toString(intbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("극심한 저체중");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.crosss);
        }
        else if(intbmi<16.9 && intbmi>16)
        {
            mbmicategory.setText("중간 저체중");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if(intbmi<18.4 && intbmi>17)
        {
            mbmicategory.setText("저체중");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if(intbmi<25 && intbmi>18.4)
        {
            mbmicategory.setText("정상체중");
            mbackground.setBackgroundColor(Color.YELLOW);
            mimageview.setImageResource(R.drawable.ok);
        }
        else if(intbmi<29.4 && intbmi>25)
        {
            mbmicategory.setText("과체중");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else
        {
            mbmicategory.setText("고도 비만");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }



        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);










        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }


        });


    }
}
