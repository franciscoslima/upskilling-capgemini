package list01.factory.paymentMethod;

public class BankSplipPaymentMethod implements PaymentMethod {
    @Override
    public void makePayment(double value) {
        System.out.println("Payment done with BankSplip");
    }
}
