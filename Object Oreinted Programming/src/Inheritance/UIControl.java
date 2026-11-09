package Inheritance;

public class UIControl
{
    private boolean isEnabled =  true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public UIControl(boolean b) {
        System.out.println("\nUIControl");
    }
    public UIControl()
    {
        System.out.println("\nCheckBox");
    }

    public void render() {

    }
    /*
    //Constructor has parameter
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("\nUIControl");
    }
     */

}
