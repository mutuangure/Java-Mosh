//PROJECT MORTGAGE CALCULATOR

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise2
{
    static void main(String[] args)
    {
        final  byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        float annualInterest = 0;
        int numberOfPayments = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("\nPrincipal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1,000,000");
        }

        while(true)
        {
            System.out.print("Annual Interest Rate(0< Rate <= 30): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) 
            {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true)
        {
            System.out.print("Period (0< Years <= 20): ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 20)
            {
                numberOfPayments = PERCENT * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 20");
        }

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("\nMortgage: " + mortgageFormatted);

    }
}