package Sevinar3_igra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Game game = new NumberGame();
        game.start(5, 2);


        while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {

            NumberGame numberGame = new NumberGame();

            Scanner scanner = new Scanner(System.in);
            Answer answer = game.inputValue(scanner.nextLine());
            System.out.println("Итоги: " + answer);

            if (game.getGameStatus() == GameStatus.WIN) {
                System.out.println("Вы победили!");
            } else {
                System.out.println("Вы проиграли в этот раз!");

            }

        }
    }

}
