package Factory;

public class CardCreator implements Creator {

    @Override
    public Payment createProduct() {
        return new CardPayment();
    }
    
}
