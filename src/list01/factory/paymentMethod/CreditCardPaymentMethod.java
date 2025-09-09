package list01.factory.paymentMethod;

public class CreditCardPaymentMethod implements PaymentMethod {
    @Override
    public void makePayment(double value) {
        System.out.println("Payment done with CreditCard");
    }
}
