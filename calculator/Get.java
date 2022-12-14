package calculator;

import java.util.Scanner;

public class Get
{
    
    int firstNumber, secondNumber;
    String type;
    int[] numbers = new int[3];

    void getNumber()
    {

        Scanner sc = new Scanner(System.in);
        this.firstNumber = sc.nextInt();
        this.secondNumber = sc.nextInt();
        this.type = sc.next();
        sc.close();

    }

}