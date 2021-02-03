package calculatorPackage;


import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MagicCalculator extends Calculator {
    //Finding the Square Root of a Number
    public static double squareRootOf(int inputNumber) {
        return (float) Math.sqrt(inputNumber);

    }
    //Finding the Sine of a number:
    public static double sinOfNumber(int inputNumber) {
        return (float) Math.sin(inputNumber);
    }
    //Finding the Cosine of a number:
    public static double coSinOfNumber(int inputNumber) {
        return (float) Math.cos(inputNumber);
    }
    //Finding the Tangent of a number:
    public static double tanOfNumber(int inputNumber) {
        return (float) Math.tan(inputNumber);
    }
    //Finding the Factorial of a number:
    public static int factorialOfNumber(int inputNumber) {
        int answer = inputNumber;
        for(int i=inputNumber-1; i>0; --i) {
            answer = answer * i;
        }
        return answer;
    }
    //Rounding an answer to n decimal places:
    public static String roundThisAnswer(float inputNumber, int spacesDesired) {
        String spacesToAdd = "#.";
        for( int i=0;i<spacesDesired; i++) {
            spacesToAdd = spacesToAdd + "#";
        }
        DecimalFormat df = new DecimalFormat(spacesToAdd);
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(inputNumber);
    }
}
