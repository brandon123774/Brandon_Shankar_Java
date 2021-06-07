package com.company;

public class CalculatorApp {
    public static void main(String[] args) {

        CalculatorObject calc = new CalculatorObject();

        //int
        System.out.println("1 + 1 = " + calc.add(1,1));
        System.out.println("23 - 52 = " + calc.subtract(23,52));
        System.out.println("34 * 2 = " + calc.multiply(34,2));
        System.out.println("12 / 3 = " + calc.divide(12, 3));

        //double
        System.out.println("12 / 7" + calc.divideDouble(12,7));
        System.out.println("3.4 + 2.3 = " + calc.addDouble(3.4,2.3));
        System.out.println("6.7 * 4.4 = " + calc.multiplyDouble(6.7,4.4));
        System.out.println("5.5 - 0.5 = " + calc.subtractDouble(5.5,0.5));
        System.out.println("10.8 / 2.2 = " + calc.divideDouble(10.8,2.2));

    }
}



