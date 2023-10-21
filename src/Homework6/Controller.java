package Homework6;

public class Controller {

    private Calculator calculator;
    private Print print;

    public Controller(Calculator calculator, Print print) {
        this.calculator = calculator;
        this.print = print;
    }

    public void performOperation (String operation, Double num1, Double num2) {
        switch (operation) {
            case "+":
                calculator.calculator(new Addition());
                break;
            case "-":
                calculator.calculator(new Subtraction());
                break;
            case "*":
                calculator.calculator(new Multiplication());
                break;
            case "/":
                calculator.calculator(new Division());
                break;
            default:
                System.out.println("Такой операции нет, попробуйте еще раз");
                System.exit(1);
        }
        calculator.performOperation(num1, num2);
        print.result(calculator.getRes());
    }
}
