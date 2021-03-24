package payment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PaymentBrokerTest {

    private WalletInterface wallet;
    private PaymentProviderInterface provider;
    private PaymentBroker broker;

    @Before
    public void setUp() {
        wallet = mock(WalletInterface.class);
        provider = mock(PaymentProviderInterface.class);
        broker = new PaymentBroker(wallet, provider);
    }

    @Test
    public void testPay_WalletHasFundsAndProviderIsAvailableAndDepositSuccededReturnTrue() throws InsufficientFundsException, ProviderNotAvailableException {
        int amount = 10;
        int balance = 20;

        when(wallet.getBalance()).thenReturn(balance);
        when(provider.isAvailable()).thenReturn(true);
        when(provider.deposit(wallet.getId(), amount)).thenReturn(true);

        Assert.assertTrue(broker.pay(amount));
    }


    @Test(expected = InsufficientFundsException.class)
    public void testPay_WalletNotHaveFundsThrowInsufficientFundsException() throws InsufficientFundsException, ProviderNotAvailableException {
        int amount = 10;
        int balance = 9;

        when(wallet.getBalance()).thenReturn(balance);
        when(provider.isAvailable()).thenReturn(false);
        when(provider.deposit(wallet.getId(), amount)).thenReturn(true);

        broker.pay(amount);

    }

    @Test(expected = ProviderNotAvailableException.class)
    public void testPay_ProviderIsNotAvailableThrowInsufficientFundsException() throws InsufficientFundsException, ProviderNotAvailableException {
        int amount = 10;
        int balance = 20;

        when(wallet.getBalance()).thenReturn(balance);
        when(provider.isAvailable()).thenReturn(false);
        when(provider.deposit(wallet.getId(), amount)).thenReturn(true);

        broker.pay(amount);

    }

}
