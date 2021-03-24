package payment;

import javax.persistence.criteria.CriteriaBuilder;

public class PaymentBroker {

    private final WalletInterface wallet;
    private final PaymentProviderInterface provider;

    public PaymentBroker(WalletInterface wallet, PaymentProviderInterface provider) {
        this.wallet = wallet;
        this.provider = provider;
    }


    public boolean pay(int amount) throws InsufficientFundsException, ProviderNotAvailableException {
        if (wallet.getBalance() < amount) {
            throw new InsufficientFundsException();
        }

        if (!provider.isAvailable()) {
            throw new ProviderNotAvailableException();
        }

        return provider.deposit(wallet.getId(), amount);
    }
}

