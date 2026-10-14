import java.text.NumberFormat;
import java.util.Scanner;

public class ATypes
{
    public static void main()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.789);
        System.out.println(result);

        NumberFormat percent =  NumberFormat.getPercentInstance();
        String result2 = percent.format(123456.789);
        System.out.println(result2);

        //Simplify
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

        //READING INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name =  scanner.nextLine();
        System.out.print("Age: ");
        double age = scanner.nextDouble();
        System.out.println("Welcome " + name);
        System.out.println(age + " years old");
    }
}