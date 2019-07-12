public class BankAccountTest {
  public static void main(String[] args) {
    BankAccount a = new BankAccount();
    BankAccount b = new BankAccount();
    BankAccount c = new BankAccount();

    a.depositMoney(200, 400);
    b.depositMoney(100, 450);
    c.depositMoney(300, 120);
    a.withdrawMoney(60, 80);
    b.withdrawMoney(40, 200);

    System.out.println(c.getChecking());
    System.out.println(a.getSaving());

    System.out.println(BankAccount.getTotalMoney());
  }
}