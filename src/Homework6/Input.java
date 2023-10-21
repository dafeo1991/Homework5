package Homework6;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String operat() {
        System.out.println("Какую операцию вы хотите произвести? ");
        return scanner.nextLine();
    }

    public Double number() {
        System.out.println("Введите нужное число: ");
        return Double.parseDouble(scanner.nextLine());
    }
}
