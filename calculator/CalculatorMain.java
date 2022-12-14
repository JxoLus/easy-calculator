package calculator;

public class CalculatorMain
{

    public static void main(String[] args)
    {

        System.out.println("-----xoLus-----\nEasy Calculator");

        Get operator1 = new Get();
        operator1.getNumber();
        System.out.println(operator1.firstNumber);
        System.out.println(operator1.secondNumber);
        System.out.println(operator1.type);
        
    }

}