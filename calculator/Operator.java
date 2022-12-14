package calculator;

public class Operator
{

    public void operation()
    {

        Get operator = new Get();
        Calculation calc = new Calculation();

        operator.getNumber();

        switch (operator.type)
        {

            case "+":
                calc.addition(operator.firstNumber, operator.secondNumber);
            
            case "-":
                calc.subtraction(operator.firstNumber, operator.secondNumber);

            case "*":
                calc.multiplication(operator.firstNumber, operator.secondNumber);

            case "/":
                calc.division(operator.firstNumber, operator.secondNumber);

            break;

        }

    }

}