package Homework5;

import Homework5.controll.Controll;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Controll controll = new Controll();

        System.out.println("Напишите кого вы хотите добавить: \n 1 - директор\n 2 - менеджер \n 3 - продавец");
        String num = scanner.nextLine();
        if (Objects.equals(num, "1")) {
            System.out.println("Введите данные директора: имя, возраст, рабочий стаж, семейное положение, заработная плата");
            controll.sendReq1(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());


        }
        if (Objects.equals(num, "2")) {
            System.out.println("Введите данные менеджера: имя, возраст, рабочий стаж, семейное положение, заработная плата");
            controll.sendReq2(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());


        }
        if (Objects.equals(num, "3")) {
            System.out.println("Введите данные продавца: имя, возраст, рабочий стаж, семейное положение, заработная плата");
            controll.sendReq3(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

        }


        System.out.println("Хотите увидеть данные этого работника? \n 1 - Да \n Если вы введете любое другое значение, то это нет");

        String num2 = scanner.nextLine();

        if (Objects.equals(num2, "1")) {
            controll.sendReq1();
        }


        System.out.println("Хотите выйти из программы? \n 1 - Да \n Если вы введете любое другое значение, то это нет?");
        String num3 = scanner.nextLine();
        if (Objects.equals(num3, "1")) {
            System.out.println("До свидания!");

        } else{
            main(args);
        }


    }
}

