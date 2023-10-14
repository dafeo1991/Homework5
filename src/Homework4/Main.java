package Homework4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calcul calcul = new Calcul();
        System.out.println("Сложение чисел 2 -> " + calcul.numSum(new ArrayList<>(Arrays.asList(2, 2))));
        System.out.println("Умножение чисел 2 -> " + calcul.numMult(2, 2));
        System.out.println("Деление чисел 2 -> " + calcul.numDiv(2, 2));
        System.out.println("Бинарный код числа 2 -> " + calcul.numBin(2));


    }
}
