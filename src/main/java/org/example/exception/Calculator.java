package org.example.exception;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();
       // System.out.println(calculator.divide(2,0));

        try {
            System.out.println(calculator.divide(2.0f, 0.0f));
        } catch (DivideByZeroException e) {
            e.printStackTrace();
           // throw new RuntimeException(e);
        }

    }

    public int divide(int a, int b){
        int returnValue = 0;

        try{
            returnValue = a/b;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException");
        }
        return returnValue;
    }
    public float divide(float a, float b) throws DivideByZeroException{
        if(b == 0.0f){
            throw new DivideByZeroException("Divide by zero");
        }
        return a/b;
    }
}
