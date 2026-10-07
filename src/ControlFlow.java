import java.util.Scanner;

public class ControlFlow
{
    public static void main(String[] args)
    {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the temperature: ");
        double temperature = scan.nextDouble();

        if (temperature > 35)
        {
            System.out.print("The temperature is: " + temperature);
            System.out.println(" Its a hot day. \nDrink plenty of water");
        }
        else if (temperature > 20)
        {
            System.out.print("The temperature is: " + temperature);
            System.out.println(" The weather is nice and warm ");
        }
        else
        {
            System.out.print("The temperature is: " + temperature);
            System.out.println(" It a cold chilly day. \nCarry a jacket.");
        }

        int income = 90_000;
        String className = "Economy";
        if (income > 100_000)
            className = "First";
        System.out.println("The income is: " + className);

        //TERNARY OPERATOR
        int operator = 120_000;
        String operatorName = operator > 100_000 ? "Business" : "Premium";

        System.out.println("The operator is: " + operatorName);

        //Exercise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
         */

        //CLEAR CODE
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0)
        {
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);


        for (int i = 1; i < 5; i++) //Better when you know the number of time to execute a statement
            System.out.println("Hello " + i);
        //OR
        int j = 0;
        while (j < 0)//if you don't know the number of execution
        {
            System.out.println("Hello" + j);
            j++;
        }
        //Write the program until the user types quit
        //WHILE loop
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) //while(true);
            // Make sure there is a break statement
        {
            System.out.print("Input: ");
            input = scan.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        //DO WHILE loop
        do
        {
            System.out.print("INPUT: ");
            input = scanner.nextLine().toUpperCase();
            if (!input.equals("QUIT"))
                System.out.println(input);
        } while (!input.equals("QUIT"));

        //FOR EACH loop
        //Used to iterate over arrays
        String[] fruits = {"Apple", "Mango", "Orange", "Strawberry", "Pineapple"};

        for (int  i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        //OR
        for (String fruit : fruits)
            System.out.println(fruit);
        //FOR EACH loop is forward only(>) that cannot be iterate from the end.
        //Also you do not have access to the index of each item
    }
}