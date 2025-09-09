package list01.factory.paymentMethod;

public class DebitCardPaymentMethod implements PaymentMethod {
    @Override
    public void makePayment(double value) {
        System.out.println("Payment done with DebitCard");
    }
}
