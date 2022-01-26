package com.numberplustable.bmi_android_java_project;

public class RiskCalculator {
    public String getResult (float result,float waist,String gender ) {
        String category = "";

        if (result < 18.5) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 낮습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 보통 수준입니다.";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 낮습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 보통 수준입니다.";
                }
            }
        }
        else if (result >= 18.5 && result <23) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 보통 수준입니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 약간 높습니다.";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 보통 수준입니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 약간 높습니다.";
                }
            }

        } else if (result >= 23 && result < 25) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 약간 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 높습니다.";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 약간 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 높습니다.";
                }
            }

        } else if (result >=25 && result < 30) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 매우 높습니다.";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 매우 높습니다.";
                }
            }

        } else if (result >=30 && result < 35) {
            if (gender.equals("여성")){
                if (waist < 85) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 매우 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 가장 위험합니다.";
                }
            }
            else if (gender.equals("남성")) {
                if (waist < 90) {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 매우 높습니다.";
                } else {
                    category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 가장 위험합니다.";
                }
            }
        } else  {
            category = "허리둘레와 체질량지수에 따른 비만 합병증 위험도가 가장 위험합니다.";
        }
        return category;
    }

}
