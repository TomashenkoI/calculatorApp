package ua.goit.java;

/**
 * Created by 7 on 26.07.2016.
 */
public class DivideOperation implements BinaryOperation {

    public double init(double a, double b) {
        double result = a * b;
        return result;
    }

    public char getOperationChar() {
        return '*';
    }
}
