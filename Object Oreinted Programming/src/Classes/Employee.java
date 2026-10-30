package Classes;

public class Employee {
    /*
    //ENCAPSULATION.

    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours)
    {
        return baseSalary + (hourlyRate * extraHours);
    }

    //GETTERS & SETTERS.
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours)
    {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    //Coupling & Abstraction
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
     */

    //CONSTRUCTORS & //STATIC METHOD
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees; //static or class member.

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    //Static Method.
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    /*
    //Constructor Overloading.
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
    }
     */

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    /*
    //Method Overloading.
    public int calculateWage() {
        return baseSalary;
    }
     */

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
        //if (hourlyRate < 0) -> Constructor Overloading.
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}

