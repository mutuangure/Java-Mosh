package Interfaces;

public class TaxReport
{
    /*
    //Tightly coupled.
    private TaxCalculator2018 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
     */
    //Setter Injection
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    //Creating an Interface.
    //Dependency injection.
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
        //OR
        System.out.println(calculator.calculateTax());
    }

}
