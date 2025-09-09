package list01.factory.paymentMethod;

public class CreditCardPaymentMethodFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPaymentMethod();
    }
}