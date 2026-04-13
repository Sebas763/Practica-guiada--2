package Factory;

public class PaypalCreator implements Creator{

    @Override
    public Payment createProduct() {
        return new Paypal(); 
    }
    
}
