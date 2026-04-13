package Factory;

public class CardPayment implements Payment{
    private int amount = 20;

    @Override
    public void pay() {
        System.out.println("Amount whit card: " + amount);
    }
    
}
