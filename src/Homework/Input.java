package Homework;

import java.util.Scanner;

public class Input {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Напишите через пробел следующие данные -> ФИО, дата рождения - dd.mm.yyyy, номер телефона, пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Ошибка! Данные введены не полностью");
            } else System.out.println("Ошибка! Вы ввели больше информации чем запрашивали");
        }

    }
}