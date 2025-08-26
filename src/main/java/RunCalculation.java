import Service.CalculationStrategy;
import Service.impl.Addition;
import Service.impl.Division;
import Service.impl.Multiply;
import Service.impl.Subtraction;

import java.math.BigDecimal;

public class RunCalculation {


    public static void main(String[] args) throws Exception {



    /*You are given a story from Product Owner. He wants to integrate a calculator to the banking app. You may ask clarification quiestions in needed.

    You need to write a production-ready function public int calculate(int a, int b, char operator).
    This method should return the result of applying the operator to the two numbers.
    Supported operators are '+' for addition, '-' for subtraction, '*' for multiplication, and '/' for division.

    For example: calculate(4, 2, '+') should return 6, calculate(10, 3, '-') should return 7, calculate(3, 5, '*') should return 15,
    and calculate(8, 3, '/') should return 2.66666667.*/

        RunCalculation runCalculation = new RunCalculation();

        System.out.println("4, 2, '+' = "+runCalculation.returnResult(4, 2, '+'));
        System.out.println();

        System.out.println("10, 3, '-' = "+runCalculation.returnResult(10, 3, '-'));
        System.out.println();

        System.out.println("3, 5, '*' = "+runCalculation.returnResult(3, 5, '*'));
        System.out.println();

        System.out.println("8, 3, '/' = "+runCalculation.returnResult(8, 3, '/'));
        System.out.println();


    }

    public BigDecimal returnResult(int a, int b, char operator) throws Exception {

        //Todo: Add a logic to check the operator is valid to run , we can check this against a DB table which stores allowed/ active operator
        // if true then proceed else throw exception


        switch (operator) {
            case '+':
                return new CalculationStrategy(new Addition()).doCalculation(a, b);
            case '-':
                return new CalculationStrategy(new Subtraction()).doCalculation(a, b);
            case '*':
                return new CalculationStrategy(new Multiply()).doCalculation(a, b);
            case '/':
                return new CalculationStrategy(new Division()).doCalculation(a, b);
            default:
                throw new Exception("Ïnvalid Operator");

        }

    }

}
