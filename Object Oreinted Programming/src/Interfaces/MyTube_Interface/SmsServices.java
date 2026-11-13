package Interfaces.MyTube_Interface;

public class SmsServices implements NotificationService
{
    @Override
    public void notify(User user) {
        System.out.println("Sending SMS...");
        System.out.println("To " + user.getNumber() + "***789");
        System.out.println("Done!\n");
    }
}
