package Homework;

public class SexEx extends Exception {
    public SexEx() {
    }

    public void sexException(String i) {
        System.out.println("Exception: wrong gender");
        System.out.printf("Ошибка! вы ввели не верный пол: %s", i);
        System.out.println();
    }
}