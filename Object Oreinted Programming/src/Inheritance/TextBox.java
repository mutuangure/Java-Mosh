package Inheritance;

public class TextBox extends UIControl
{
    private String text = "Hello TextBox"; //Field uses private access modifiers to hide the implementation details of a class

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    /*
    public TextBox() {
//        super(true); //Use when there is no default constructor in UI control
        //Calling the constructor of the base class
        System.out.println("TextBox");
    }
     */

    @Override //Overriding method
    public String toString() {
        return text;
    }

    //Polymorphism.
    @Override
    public void render() {
        System.out.println("Render TextBox");
    }
}
