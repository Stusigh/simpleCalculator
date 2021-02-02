package calculatorPackage;

public class Calculator {
    //Addition Method
    public static Integer add(int num1, int num2) {
        Integer answer = num1 + num2;
        System.out.println(num1 + " added to " + num2 +" equals: " + answer);
        return answer;
    }
    //Subtraction Method
    public static Integer subtract( int num1, int num2) {
        Integer answer = num1 - num2;
        System.out.println(num1 + " subtracted from " + num2 +" equals: " + answer);
        return answer;
    }
    //Multiplication Method
    public static Integer multiply(int num1, int num2) {
        Integer answer = num1 * num2;
        System.out.println(num1 + " multiplied by " + num2 +" equals: " + answer);
        return answer;
    }
    //Division Method
    public static float divide(int num1, int num2) {
        float answer = num1/num2;
        System.out.println(num1 + " divided by " + num2 +" equals: " + answer);
        return answer;
    }
    //Square Method
    public static Integer square(int num1) {
        Integer answer = num1*num1;
        System.out.println(num1 + " squared equals: " + answer);
        return answer;
    }
}


