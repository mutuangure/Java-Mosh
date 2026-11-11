package Interfaces;

public class Main {
    static void main() {
        /*
        //Tightly coupled.
        var report = new TaxReport();
        report.show();
         */

        var calculator = new TaxCalculator2018(20_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}