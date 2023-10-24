package DZ.Controller;

import DZ.Servise.Factory;
import DZ.Servise.Number;
import DZ.Servise.OutputOnDisplay;
import DZ.View.UserInformation;
import DZ.View.View;

public class Controller {

    public void performOperation () {

        View view = new View();
        Calculator calculator = new Calculator();

        int transactionNumber = 0;

        while (transactionNumber != 2) {

            view.enteredValue(UserInformation.START);
            transactionNumber = view.menu(UserInformation.OPERATION);

            switch (transactionNumber) {
                case 1:

                    Number num1 = view.getNumber(UserInformation.REAL_PART, UserInformation.IMAGINARY_PART);
                    Number num2 = view.getNumber(UserInformation.REAL_PART, UserInformation.IMAGINARY_PART);
                    calculator.setOperation(new OutputOnDisplay(Factory.create("сумма чисел")));
                    Number sum = calculator.execute(num1, num2);
                    break;
                case 2:

                    view.enteredValue(UserInformation.EXIT);
                    break;
                default:
                    view.enteredValue(UserInformation.ERROR);
            }
            System.exit(1);
        }
    }
}
