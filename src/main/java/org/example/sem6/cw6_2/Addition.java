package org.example.sem6.cw6_2;
public class Addition implements CalculatorOperation{
    private double left;
    private double right;
    private double result = 0.0;


    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public Addition(double result) {
        this.result = result;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
