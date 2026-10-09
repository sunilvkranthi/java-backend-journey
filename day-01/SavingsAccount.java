
import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

    private static final BigDecimal ANNUAL_RATE =
        new BigDecimal("0.02");

    public SavingsAccount(long accountNumber, String name) {
        super(accountNumber, name);
    }

    public BigDecimal calculateAnnualInterest() {
        return getBalance().multiply(ANNUAL_RATE);
    }
}