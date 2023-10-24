package DZ.Controller;

import DZ.Servise.Number;


public class Calculator {
    private Operation operation;

    /*
    todo выбираем операцию суммирования чисел
     */

    public void setOperation(Operation operation) {
        this.operation = operation;
    }


    /*
    todo складываем числа
     */
    public Number execute(Number num1, Number num2) {
        return operation.execute(num1, num2);
    }


}