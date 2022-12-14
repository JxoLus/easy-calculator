package calculator;

public class Operator
{

    boolean error = false;

    public int operation()
    {

        Get get = new Get();
        Calculation calc = new Calculation();

        get.getNumber();

        switch (get.type)
        {

            case "+":
                return calc.addition(get.firstNumber, get.secondNumber);
            
            case "-":
                return calc.subtraction(get.firstNumber, get.secondNumber);

            case "*":
                return calc.multiplication(get.firstNumber, get.secondNumber);

            case "/":
            try
                {

                    return calc.division(get.firstNumber, get.secondNumber);

                } catch (ArithmeticException e)
                    {

                        this.error = true;
                        return 0;

                    }
                

            default :
                this.error = true;
                return 0;
        }

    }

}