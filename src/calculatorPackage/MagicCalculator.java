package calculatorPackage;


public class MagicCalculator extends Calculator {
    //Finding the Square Root of a Number
    public static double squareRootOf(int inputNumber) {
        int answer = (int)Math.sqrt(inputNumber);
        System.out.println("The square root of " + inputNumber + " is: " + answer + ".");
        return answer;
    }
    //Finding the Sine of a number:
    public static double sinOfNumber(int inputNumber) {
        float answer = (float) Math.sin(inputNumber);
        System.out.println("The sine of " + inputNumber + " is: " + answer + ".");
        return answer;
    }
    //Finding the Cosine of a number:
    public static double coSinOfNumber(int inputNumber) {
        float answer = (float) Math.cos(inputNumber);
        System.out.println("The cosine of " + inputNumber + " is: " + answer + ".");
        return answer;
    }
    //Finding the Tangent of a number:
    public static double tanOfNumber(int inputNumber) {
        float answer = (float) Math.tan(inputNumber);
        System.out.println("The tangent of " + inputNumber + " is: " + answer + ".");
        return answer;
    }
    //Finding the Factorial of a number:
    public static int factorialOfNumber(int inputNumber) {
        int answer = inputNumber;
        for(int i=inputNumber-1; i>0; --i) {
            answer = answer * i;
        }
        System.out.println("The factorial of " + inputNumber + " is: " + answer + ".");
        return answer;
    }
}
