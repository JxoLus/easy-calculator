package calculator;

public class Operator
{

    boolean error = false;

    public int operation()
    {

        Get operator = new Get();
        Calculation calc = new Calculation();

        operator.getNumber();

        switch (operator.type)
        {

            case "+":
                return calc.addition(operator.firstNumber, operator.secondNumber);
            
            case "-":
                return calc.subtraction(operator.firstNumber, operator.secondNumber);

            case "*":
                return calc.multiplication(operator.firstNumber, operator.secondNumber);

            case "/":
            try
            {

                return calc.division(operator.firstNumber, operator.secondNumber);

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