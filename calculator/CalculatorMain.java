package calculator;

public class CalculatorMain
{

    public static void main(String[] args)
    {

        System.out.println("-----xoLus-----\nEasy Calculator")

        Operator operator = new Operator();
        
        int result = operator.operation();

        if (operator.error == true)
        {

            System.out.println("Try Again (Error)");

        }
        else
        {

            System.out.println("ANSWER : " + result);

        }

    }

}