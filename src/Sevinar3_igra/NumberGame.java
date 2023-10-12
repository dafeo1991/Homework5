package Sevinar3_igra;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberGame extends AbstractGame {


    @Override
    ArrayList<String> generateCharList() {

        return new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));

    }

    @Override
    ArrayList<String> generateCharList2() {

        return new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));

    }

    @Override
    ArrayList<String> generateCharList3() {

        return new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "е", "ж", "з", "и", "к"));

    }
}
