package Homework;

public class DataEx extends Exception{
    public DataEx() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Не верный формат даты %s", i);
        System.out.println();
    }
}