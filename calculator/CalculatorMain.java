package calculator;

public class CalculatorMain
{

    public static void main(String[] args)
    {

        Get operator1 = new Get();
        operator1.getNumber();
        System.out.println(operator1.number);
    }

}