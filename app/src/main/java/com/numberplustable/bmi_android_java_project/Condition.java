package com.numberplustable.bmi_android_java_project;

public class Condition {


    public String getCategory (float result) {
        String category;
        if (result < 18.5) {
            category = "저체중 단계";
        } else if (result >= 18.5 && result <23) {
            category = "적정 체중 단계";
        } else if (result >= 23 && result < 25) {
            category = "비만 전단계";
        } else if (result >=25 && result < 30) {
            category = "1단계 비만";
        } else if (result >= 30 && result < 35) {
            category = "2단계 비만";
        } else  {
            category = "3단계 비만";
        }
        return category;
    }
}
