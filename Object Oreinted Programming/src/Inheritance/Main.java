package Inheritance;

public class Main {

    static void main(String[] args) {
        //Inheritance.
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());

        //Object class.
        var box1 = new TextBox();
        var box2 = box1;
        var box3 = new TextBox();
        System.out.println(box1); //box1.toString()
        System.out.println(box2.hashCode());
        System.out.println(box3.equals(box1));

        //Constructors & Inheritance
        var textBox = new TextBox();

        //@Overriding Changing the method declared in the base class.
        var textBox1 = new TextBox();
        textBox1.setText("Overriding the method");
        System.out.println(textBox1);

        /*
        //Upcasting & Down_casting.
        var control1 = new UIControl( true);
        var textBox3 = new TextBox();
        show(textBox3);
    }

    public static void show(UIControl control1) {
        System.out.println(control1);
    }
    */
    }
}
