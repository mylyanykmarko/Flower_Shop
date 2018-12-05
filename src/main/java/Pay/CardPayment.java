package Pay;

public class CardPayment implements Payment {

    public boolean process(double price){
        System.out.println("Paid with сard. Total price: "+ price);
        return true;
    }
}