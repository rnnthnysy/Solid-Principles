package SolidPrinciple;

public class Calculator implements TotalCalculator{
    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order Total: $" + total);
    }
}
