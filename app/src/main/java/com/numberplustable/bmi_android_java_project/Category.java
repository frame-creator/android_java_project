package com.numberplustable.bmi_android_java_project;

public class Category {


    public String getCategory (float result) {
        String category;
        if (result < 18.5) {
            category = "저체중입니다.";
        } else if (result >= 18.5 && result <23) {
            category = "적정 체중입니다.";
        } else if (result >= 23 && result < 25) {
            category = "적정 체중보다 과체중입니다. 비만 체중이 되기 직전 단계입니다.";
        } else if (result >=25 && result < 30) {
            category = "비만입니다.";
        } else if (result >=30 && result < 35) {
            category = "고도 비만입니다.";
        } else  {
            category = "중증 고도 비만입니다.";
        }
        return category;
    }

}
}
