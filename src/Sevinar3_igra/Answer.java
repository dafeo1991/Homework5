package Sevinar3_igra;

public class Answer {

    int bull;
    int cow;

    int maxTry;

    public Answer(int bull, int cow, int maxTry) {
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }

    @Override
    public String toString() {
        return "У вас есть -> " +
                "быков " + bull +
                ", коров " + cow +
                ", осталось попыток " + maxTry;
    }
}
