package com.numberplustable.bmi_android_java_project;

public class RiskTextCalculator {

    public String getResult (float result,float waist,String gender ) {
        String category = "";

        if (result < 18.5) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "낮음";
                } else {
                    category = "보통";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "낮음";
                } else {
                    category = "보통";
                }
            }
        }
        else if (result >= 18.5 && result <23) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "보통";
                } else {
                    category = "약간 높음";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "보통";
                } else {
                    category = "약간 높음";
                }
            }

        } else if (result >= 23 && result < 25) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "약간 높음";
                } else {
                    category = "높음";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "약간 높음";
                } else {
                    category = "높음";
                }
            }

        } else if (result >=25 && result < 30) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "높음";
                } else {
                    category = "매우 높음";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "높음";
                } else {
                    category = "매우 높음";
                }
            }

        } else if (result >=30 && result < 35) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "매우 높음";
                } else {
                    category = "가장 위험";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "매우 높음";
                } else {
                    category = "가장 위험";
                }
            }
        } else  {
            category = "가장 위험";
        }
        return category;
    }
}
