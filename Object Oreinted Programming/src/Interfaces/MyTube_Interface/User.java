package Interfaces.MyTube_Interface;

public class User {
    private String email;
    private int number;

    public User(int number) {
        //this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
