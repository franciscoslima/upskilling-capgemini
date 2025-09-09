package list01.factory.paymentMethod;

public class DebitCardPaymentMethodFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new DebitCardPaymentMethod();
    }
}
