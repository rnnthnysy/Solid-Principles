package SolidPrinciple;

public class SimpleEmailNotifier implements EmailNotifier{
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to " + email);
    }
}
