import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double accountsTotalBalance = 0;
    private String setAccountNumber() {
		Random r = new Random();
		String accountNum = "";
		for (int i = 0; i < 9; i++) {
			accountNum += String.valueOf(r.nextInt(10 - 1 + 1) + 1);
		}
        return accountNum;
    }
    public BankAccount() {
        this.accountNumber = setAccountNumber();
        numberOfAccounts++;
    }
	public String getAccountNumber() {
		return "Account Number: " + accountNumber;
	}
	public String getCheckingBalance() {
		return "Checking Account Balance: $" + checkingBalance;
	}
	public void depositCheckings(double amount) {
		this.checkingBalance += amount;
		accountsTotalBalance += amount;
	}
	public void depositSavings(double amount) {
		this.savingsBalance += amount;
		accountsTotalBalance += amount;
	}
	public String getSavingsBalance() {
		return "Savings Account Balance: $" + savingsBalance;
	}
	public static String getNumberOfAccounts() {
		return "Number of Accounts: " + numberOfAccounts;
	}
	public static String getAccountsTotalBalance() {
		return "Accounts Total Balance: $" + accountsTotalBalance;
	}
	public void withdrawalCheckings(double amount) {
		if (amount > this.checkingBalance) {
			System.out.println("Insufficient Funds!");
		} else {
			this.checkingBalance -= amount;
			accountsTotalBalance -= amount;
		}
	}
	public void withdrawalSavings(double amount) {
		if (amount > this.savingsBalance) {
			System.out.println("Insufficient Funds!");
		} else {
			this.savingsBalance -= amount;
			accountsTotalBalance -= amount;
		}
	}
    public String totalAmount() {
		return "Total Account Balance: $" + (checkingBalance + savingsBalance);
	}
}