package DZ.Servise;

import DZ.Data.Sum;

import DZ.Controller.Operation;


public class Factory {

    /*
    todo создаем объект сложения
     */

    public static Operation create(String type) {
        switch (type) {
            case "сумма чисел":
                return (Operation) new Sum();
            default:
                throw new IllegalArgumentException("Такой операции нет: " + type);
        }
    }
}