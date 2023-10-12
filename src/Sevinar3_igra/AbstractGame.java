package Sevinar3_igra;

import java.util.*;

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;

    String computerWord;

    GameStatus gameStatus = GameStatus.INIT;

    public AbstractGame() {
        super();
    }

    abstract ArrayList<String> generateCharList();

    abstract ArrayList<String> generateCharList2();

    abstract ArrayList<String> generateCharList3();


    ArrayList<String> list = new ArrayList<>();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        gameStatus = GameStatus.START;

        System.out.println("Вам нужно показать загаданное слово? \n 1 - Да \n Если вы введете любое другое значение, то слово не покажем догадайтесь сами");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (Objects.equals(num, "1")) {
            System.out.println("Загаданное слово -> " + computerWord);
            System.out.println("Введите не более 5 символов, иначе придется начинать заново");
        } else {
            System.out.println("Вы выбрали нет, догадайтесь сами");
            System.out.println("Введите не более 5 символов, иначе придется начинать заново");
        }
    }

    private String generateWord() { // метод на основе generateCharList(); будет генерировать алфавит из списка, создавать слово
        System.out.println("Введите вариант игры: \n 1 - угадываем цифры, \n 2 - английский алфавит, \n 3 - русский алфавит");

        Scanner scanner = new Scanner(System.in);
        String num2 = scanner.nextLine();

        if (Objects.equals(num2, "1")) {
            List<String> alphabet = generateCharList();
            Random random = new Random();
            String res = "";
            for (int i = 0; i < sizeWord; i++) {
                int randomIndex = random.nextInt(alphabet.size());
                res += alphabet.get(randomIndex);
                alphabet.remove(randomIndex);
            }
            return res;
        }

        if (Objects.equals(num2, "2")) {
            List<String> alphabet2 = generateCharList2();
            Random random = new Random();
            String res = "";
            for (int i = 0; i < sizeWord; i++) {
                int randomIndex2 = random.nextInt(alphabet2.size());
                res += alphabet2.get(randomIndex2);
                alphabet2.remove(randomIndex2);
            }
            return res;
        }

        if (Objects.equals(num2, "3")) {
            List<String> alphabet3 = generateCharList3();
            Random random = new Random();
            String res = "";
            for (int i = 0; i < sizeWord; i++) {
                int randomIndex3 = random.nextInt(alphabet3.size());
                res += alphabet3.get(randomIndex3);
                alphabet3.remove(randomIndex3);
            }
            return res;
        } else {
            System.out.println("Это не верный вариант, попробуйте еще раз");
            System.exit(1);
        }
        return num2;
    }

    @Override
    public Answer inputValue(String value) {
        list.add(value);

        int bull = 0;
        int cow = 0;


        if (value.length() > sizeWord) {
            System.out.println("А мы вас предупреждали");
            System.exit(1);
        } else {

            for (int i = 0; i < value.length(); i++) {

                if (value.charAt(i) == computerWord.charAt(i)) {
                    bull++;
                    cow++;
                } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                    cow++;
                }
            }
            if (bull == computerWord.length()) {
                gameStatus = GameStatus.WIN;
            }
            maxTry--;
            if (maxTry == 0 && gameStatus != GameStatus.WIN) {
                gameStatus = GameStatus.LOSE;
            }
        }

        System.out.println("Распечатать ваш ответ?  \n 1 - да \n любое другое значение это нет ");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (Objects.equals(num, "1")) {
            System.out.println("Ваш ответ -> " + list.toString().replaceAll("^\\[|\\]$", ""));
        } else {
            System.out.println("Не покажем раз не хотите");

        }

        return new Answer(bull, cow, maxTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

}
