import Classes.Browser;
import Classes.TextBox;
import Classes.Employee;

public class Main
{
    /*
    //PROCEDURAL PROGRAMMING.

    public static int calculateWage(
            int baseSalary,
            int hourlyRate,
            int extraHours
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
     */
    static void main(String[] args)
    {
        //CREATING OBJECT

        TextBox textBox1 = new TextBox(); //OR var textbox1 = new TextBox()
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        var textBox3 = textBox1;
        textBox3.setText("Changes to textBox 1");
        System.out.println(textBox3.text);

        /*
        //PROCEDURAL PROGRAMMING.
        int baseSalary = 50_000;
        int hourlyRate = 20;
        int extraHours = 10;

        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
        System.out.println(wage);

        //ENCAPSULATION.
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);

        System.out.println(wage);

        //GETTERS & SETTERS.
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        //employee.getBaseSalary();
        employee.setHourlyRate(20);
        //employee.getHourlyRate();
        int wage = employee.calculateWage(10);

        System.out.println(wage);
        */

        //REDUCING COUPLING.
        var browser = new Browser();
        browser.navigate("Address for browser");

        //CONSTRUCTORS & //STATIC METHOD
        var employee = new Employee(50_000, 20);
        System.out.println("\n" + Employee.numberOfEmployees); //static.
        Employee.printNumberOfEmployees(); //Static method.
        int wage = employee.calculateWage(10);
        System.out.println("\n" + wage);
    }
}