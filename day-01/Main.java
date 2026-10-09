
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(
            1234567123L,
            "Sample Customer"
        );

        System.out.println(
            "Account holder: " + account.getHolderName()
        );

        System.out.println(
            "Opening balance: " + account.getBalance()
        );

        account.deposit(new BigDecimal("10000.00"));

        System.out.println(
            "After deposit: " + account.getBalance()
        );

        try {
            account.withdraw(new BigDecimal("11000.00"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        account.withdraw(new BigDecimal("5000.00"));

        System.out.println(
            "Final balance: " + account.getBalance()
        );

        System.out.println(
            "Annual interest at 2%: "
                + account.calculateAnnualInterest()
        );
    }
}