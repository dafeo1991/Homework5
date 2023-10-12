package Sevinar3_igra;

public interface Game {

    /*
    3) Разработка игры “быки - коровы” (игрок против компьютера)
    a) Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus)
    b) Абстрактный класс AbstractGame (который предзаполняет слово компьютера - generateWord(), на основе generateCharList() - который является абстрактным методом)
    c) Статусная модель с помощью перечислений(GameStatus)
    d) Класс ответа Answer
    e) Классы реализующие AbstractGame(предполагается игра на числах,англ буквах, русских буквах)
     */


    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus(); // возвращает статус игры

}
