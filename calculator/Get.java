package calculator;

import java.util.Scanner;

public class Get
{
    
    int firstNumber, secondNumber;
    String type;
    int[] numbers = new int[3];
    
    Scanner sc = new Scanner(System.in);

    void getNumber()
    {

        System.out.println("Enter First Number");
        this.firstNumber = sc.nextInt();

        System.out.println("Enter Second Number");
        this.secondNumber = sc.nextInt();

        System.out.println("Enter the Type");
        this.type = sc.next();

        sc.close();

    }

}