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

        TextView category = findViewById(R.id.category);
        Category category1 = new Category();
        category.setText(category1.getCategory(BMI));

        TextView condition = findViewById(R.id.condition);
        Condition condition1 = new Condition();
        condition.setText(condition1.getCategory(BMI));

        TextView risk = findViewById(R.id.risk);
        RiskCalculate risk1 = new RiskCalculate();
        risk.setText(risk1.getResult(BMI, intwaist,gender_value));

        TextView riskcategory = findViewById(R.id.riskcategory);
        RiskTextCalculate riskcategory1 = new RiskTextCalculate();
        riskcategory.setText(riskcategory1.getResult(BMI, intwaist,gender_value));

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
