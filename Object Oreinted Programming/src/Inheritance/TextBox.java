package Inheritance;

public class TextBox extends UIControl
{
    private String text = ""; //Field uses private access modifiers to hide the implementation details of a class

    public TextBox() {
        //super(true); //Calling the constructor of the base class
        System.out.println("TextBox");
    }

    @Override //Overiding method
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
