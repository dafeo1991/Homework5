package Homework6;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input();
        Print print = new Print();
        Controller controller = new Controller(calculator, print);

        String operation = input.operat();
        Double num1 = input.number();
        Double num2 = input.number();

        controller.performOperation(operation, num1, num2);
    }
}
