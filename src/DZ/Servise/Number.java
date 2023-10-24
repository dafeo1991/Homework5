package DZ.Servise;


public class Number {
    private double realNumber;
    private double imaginaryUnit;


    public Number(double realNumber, double imaginaryUnit) {
        this.realNumber = realNumber;
        this.imaginaryUnit = imaginaryUnit;
    }


    @Override
    public String toString() {
        if (imaginaryUnit >= 0) {
            return " вещественная часть " + realNumber + " + " + " мнимая единица " + imaginaryUnit + "i";
        } else {
            return realNumber + " - " + (-imaginaryUnit) + "i";
        }
    }


    public double getRealNum(){
        return realNumber;
    }


    public double getImaginary() {
        return imaginaryUnit;
    }
}