//CREATING METHODS

import java.text.NumberFormat;
import java.util.Scanner;
/*
public class CCleanCode
{
    public static String greetUser(String firstName, String lastName)
    {
        //return "Hello " + firstName + " " + lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your firstname: ");
        String firstName = input.nextLine();
        System.out.print("What is your lastname: ");
        String lastName = input.nextLine();

        String name = greetUser(firstName, lastName);
        System.out.println("Hello " + name +"\nWelcome");
    }
}
*/

//REFACTORING. -The Mortgage Calculator.
//(Changing the structure of the code without changing its behavior)

public class CCleanCode
{
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years)
    {
        final  byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float numberOfPayments = PERCENT * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        return principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        //return mortgage
    }
    public static double readNumber(String prompt,double min,double max)
    {
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true)
        {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Years: ", 1, 20);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("\nMortgage: " + mortgageFormatted);

    }
}