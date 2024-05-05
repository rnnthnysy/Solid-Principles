package SolidPrinciple;

public class Main {
    public static  void main(String[] args){
        TotalCalculator calculator = new Calculator();
        OrderPlacer placer = new BasicPlacer();
        InvoiceGenerator generator = new SimpleInvoiceGenerator();
        EmailNotifier notifier = new SimpleEmailNotifier();

        calculator.calculateTotal(10.0, 2);
        placer.placeOrder("John Doe", "123 Main St");
        generator.generateInvoice("order_123.pdf");
        notifier.sendEmailNotification("johndoe@example.com");
    }
}
