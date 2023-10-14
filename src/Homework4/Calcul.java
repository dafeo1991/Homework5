package Homework4;

import java.util.List;

public class Calcul {

    public double numSum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public double numMult(Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() * num2.doubleValue();
        return result;
    }

    public double numDiv(Number num1, Number num2) {
        double result = 0;
        result = num1.doubleValue() / num2.doubleValue();
        return result;
    }

    public String numBin(int num) {
        if (num == 0) return "";
        return numBin(num / 2) + (num % 2);
    }


}
