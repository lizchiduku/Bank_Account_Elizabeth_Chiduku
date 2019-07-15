public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount a = new BankAccount();
    BankAccount b = new BankAccount();
    

        a.depositCheckings(400);
        a.withdrawalCheckings(150);
        a.depositSavings(300);
        b.depositSavings(200);
        b.depositCheckings(380);
        b.withdrawalSavings(120);

        System.out.println(a.getCheckingBalance());
        System.out.println(a.getAccountNumber());
        System.out.println(b.totalAmount());
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getAccountsTotalBalance());
  }
}