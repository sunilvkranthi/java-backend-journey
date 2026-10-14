
import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {

    private final long accountNumber;
    private final String holderName;
    private BigDecimal balance;

    public BankAccount(long accountNumber, String holderName) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                "Account number must be positive"
            );
        }

        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException(
                "Holder name cannot be empty"
            );
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = BigDecimal.ZERO;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        Objects.requireNonNull(amount, "Amount is required");

        if (amount.signum() <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive"
            );
        }

        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        Objects.requireNonNull(amount, "Amount is required");

        if (amount.signum() <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive"
            );
        }

        if (amount.compareTo(balance) > 0) {
            throw new IllegalStateException(
                "Insufficient balance"
            );
        }

        balance = balance.subtract(amount);
    }
}