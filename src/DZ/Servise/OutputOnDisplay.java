package DZ.Servise;

import DZ.Controller.Operation;
import DZ.Controller.TransactionInformation;


public class OutputOnDisplay implements TransactionInformation {
    private Operation operation;


    public OutputOnDisplay(Operation operation) {
        this.operation = operation;
    }

    /*
    todo выполняем операцию и записываем ее
     */

    @Override
    public Number execute(Number a, Number b) {
        Number result = operation.execute(a, b);
        System.out.println();
        System.out.println("Выполняется операция сложения комплексных чисел -> " + a + " и " + b);
        System.out.println("Результат операции: " + result);
        System.out.println();
        return result;
    }


    @Override
    public String description() {
        return "Выполняем операцию сложения";
    }
}