package Factory;

public class Main {
    public static void main(String[] args) {
        Creator paypalCreator = new PaypalCreator();
        Creator cardCreator = new CardCreator();

        Payment payment1 = paypalCreator.createProduct();
        payment1.pay();

        Payment payment2 = cardCreator.createProduct();
        payment2.pay();
        
    }
}
