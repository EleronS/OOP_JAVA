package org.example.sem6.cw6_2;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculator(CalculatorOperation operation){
        if(operation == null){
            throw new InvalidParameterException("Can not perform operation");
        }
        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        }
        else if(operation instanceof Subtraction){
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
    public void calculatorCorrector(CalculatorOperation operation){
        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        }
        else if(operation instanceof Subtraction){
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else {
            throw new InvalidParameterException("Can not perform operation");
        }
    }
}
