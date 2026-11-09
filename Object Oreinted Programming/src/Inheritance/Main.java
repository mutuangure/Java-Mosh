package Inheritance;

public class Main {

    static void main(String[] args) {
        //Inheritance.

        var control = new UIControl(true);  //Calling the default constructor.
        control.disable();
        System.out.println(control.isEnabled());

        //Object class.
        var box1 = new TextBox(); //Calling the default constructor.
        var box2 = box1;
        System.out.println(box1); //box1.toString()
        System.out.println(box2.hashCode());
        System.out.println(box2.equals(box1));

        //@Overriding Changing the method declared in the base class.
        var textBox1 = new TextBox();
        textBox1.setText("Overriding the method");
        System.out.println(textBox1);

        //Upcasting & DownCasting.
        var control1 = new UIControl(true);
        var textBox3 = new TextBox();
        show(control1);


        //Comparing Object.
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1 == point2);//false because there 2 reference types.
        System.out.println(point1.equals(point2));

        System.out.println(point1.equals(new TextBox()));

        //Optimization technique
        System.out.println(point1.equals(point1));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        //Polymorphism
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control2 : controls) {
            control.render();
        }
    }
        /*
        show(textBox3);
    }

    public static void show(UIControl control1) { //This is upcasting.
        var textBox3 = (TextBox)control1; //DownCasting -> Try to cast to a specialize time
        textBox3.setText("TextBox Hello");
        System.out.println(control1);
    }
      */

    //Upcasting & DownCasting.
    public static void show(UIControl control1) { //This is upcasting.
        if (control1 instanceof TextBox) { //We don't get error by casting to a specialized type.
            var textBox3 = (TextBox) control1; //DownCasting -> Try to cast to a specialize time
            textBox3.setText("TextBox Hello");
        }
        System.out.println(control1);
    }
}
