package list01.factory.paymentMethod;

public class App {
    public static void main(String[] args) {
        PaymentMethodFactory factory1 = new BankSplipPaymentMethodFactory();
        PaymentMethod bankSplipPaymentMethod = factory1.createPaymentMethod();
        bankSplipPaymentMethod.makePayment(10);

        PaymentMethodFactory factory2 = new CreditCardPaymentMethodFactory();
        PaymentMethod creditCardPaymentMethod = factory2.createPaymentMethod();
        creditCardPaymentMethod.makePayment(20);

        PaymentMethodFactory factory3 = new DebitCardPaymentMethodFactory();
        PaymentMethod deditCardPaymentMethod = factory3.createPaymentMethod();
        deditCardPaymentMethod.makePayment(30);
    }
}
