package payment;

public interface PaymentProviderInterface {
    boolean isAvailable();

    boolean deposit(int id, int amount);
}
