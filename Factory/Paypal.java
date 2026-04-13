package Factory;

public class Paypal implements Payment{
    private int amount = 10;

    @Override
    public void pay() {
        System.out.println("Amount whit paypal: " + amount);
    }
    
}
