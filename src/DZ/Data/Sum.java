package DZ.Data;


import DZ.Controller.Operation;
import DZ.Servise.Number;


    public class Sum implements Operation {

        /*
        todo получаем сумму комплесных чисел
         */
        public Number execute(Number a, Number b) {
            return new Number(a.getRealNum() + b.getRealNum(), a.getImaginary() + b.getImaginary());
        }
    }

