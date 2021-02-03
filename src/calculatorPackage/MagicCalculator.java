package calculatorPackage;


public class MagicCalculator extends Calculator {
    //Finding the Square Root of a Number
    public static double squareRootOf(int inputNumber) {
        int answer = (int)Math.sqrt(inputNumber);
        return answer;
    }
    //Finding the Sine of a number:
    public static double sinOfNumber(int inputNumber) {
        float answer = (float) Math.sin(inputNumber);
        return answer;
    }
    //Finding the Cosine of a number:
    public static double coSinOfNumber(int inputNumber) {
        float answer = (float) Math.cos(inputNumber);

        return answer;
    }
    //Finding the Tangent of a number:
    public static double tanOfNumber(int inputNumber) {
        float answer = (float) Math.tan(inputNumber);
        return answer;
    }
    //Finding the Factorial of a number:
    public static int factorialOfNumber(int inputNumber) {
        int answer = inputNumber;
        for(int i=inputNumber-1; i>0; --i) {
            answer = answer * i;
        }
        return answer;
    }
}
