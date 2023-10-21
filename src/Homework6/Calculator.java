package Homework6;




public class Calculator {

    private Double res;
    private Operations operations;

    public void calculator(Operations operations) {
        this.operations = operations;
    }

    public void performOperation(Double num1, Double num2) {
        res = operations.operation(num1, num2);
    }

    public Double getRes() {
        return res;
    }
}
