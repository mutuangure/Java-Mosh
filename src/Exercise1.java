import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise1
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal =  scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Period (Years): ");
        double period = scanner.nextDouble();

        double monthlyRate = (rate / 100) / 12;
        double numberOfPayments = period * 12;

        double mortgage = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.println("Mortgage: " + mortgage);

        //MOSH CODE.
        final  byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("\nPrincipal: ");
        int principal2 = scanner2.nextInt();

        System.out.print("Annual Interest Rate: ");
        float rate2 = scanner2.nextFloat();
        float monthlyRate2 = rate2 / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte period2 = scanner2.nextByte();
        int numberOfPayments2 = period2 * MONTHS_IN_YEAR;

        double mortgage2 = principal2 *
                (monthlyRate2 * Math.pow(1 + monthlyRate2, numberOfPayments2)) /
                (Math.pow(1 + monthlyRate2, numberOfPayments2) -1);
        String mortgage2Formatted = NumberFormat.getCurrencyInstance().format(mortgage2);

        System.out.println("\nMortgage: " + mortgage2Formatted);

    }
}