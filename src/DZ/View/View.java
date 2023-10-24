package DZ.View;

import DZ.Servise.Number;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void enteredValue(String text) {
        System.out.println(text);
    }

    public int menu(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }

    public Number getNumber(String text1, String text2) {
        System.out.print(text1);
        double realPart = scanner.nextDouble();
        System.out.print(text2);
        double imaginaryPart = scanner.nextDouble();
        return new Number(realPart, imaginaryPart);
    }

    public void res(Number result) {
        System.out.println("Результат: " + result.toString());
    }


}