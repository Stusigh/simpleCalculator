package calculatorPackage;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        int num3 = 5;
        int decimalPlacesToRoundTo = 3;
        //I can use MagicCalculator or Calculator because MagicCalculator extends Calculator! Which is pretty cool.
        System.out.println(num1 + " added to " + num2 +" equals: " + MagicCalculator.add(10,2));

        System.out.println(num1 + " subtracted from " + num2 +" equals: " + Calculator.subtract(10,2));

        System.out.println(num1 + " multiplied by " + num2 +" equals: " + Calculator.multiply(10,2));

        System.out.println(num1 + " divided by " + num2 +" equals: " + Calculator.divide(10,2));

        System.out.println(num1 + " squared equals: " + Calculator.square(10));

        System.out.println("The square root of " + num3 + " is: " + MagicCalculator.roundThisAnswer((float) MagicCalculator.squareRootOf(num3), decimalPlacesToRoundTo) + ", rounded to " + decimalPlacesToRoundTo + " decimal places.");

        System.out.println("The sine of " + num3 + " is: " + MagicCalculator.roundThisAnswer((float) MagicCalculator.sinOfNumber(num3), decimalPlacesToRoundTo) + ", rounded to " + decimalPlacesToRoundTo + " decimal places.");

        System.out.println("The cosine of " + num3 + " is: " + MagicCalculator.roundThisAnswer((float) MagicCalculator.coSinOfNumber(num3), decimalPlacesToRoundTo) + ", rounded to " + decimalPlacesToRoundTo + " decimal places.");

        System.out.println("The tangent of " + num3 + " is: " + MagicCalculator.roundThisAnswer((float) MagicCalculator.tanOfNumber(num3), decimalPlacesToRoundTo) + ", rounded to " + decimalPlacesToRoundTo + " decimal places.");

        System.out.println("The factorial of " + num3 + " is: " + MagicCalculator.factorialOfNumber(num3) + ".");
    }
}
