package Pay;

public class CashPayment implements Payment{

    public boolean process(double price) {
        System.out.println("Paid with cash...\n Total price: " + price);
        return true;
    }

}