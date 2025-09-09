package list01.factory.paymentMethod;

public class BankSplipPaymentMethodFactory extends PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new BankSplipPaymentMethod();
    }
}