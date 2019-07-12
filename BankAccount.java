import java.util.*;

public class BankAccount{
  protected String accountNumber;
  protected long checkingBalance;
  protected long savingsBalance;
  protected static int numAccounts;
  protected static long totalMoney;

  private String getAccountNumber(){
    Random rand = new Random();
    ArrayList<Integer> digits = new ArrayList<Integer>();
    for(int i = 1; i < 11; i++){
      int randomNum = rand.nextInt(9) + 1;
      digits.add(randomNum);
    }
    this.accountNumber = String.valueOf(digits.get(0));
    for(int i = 1; i < digits.size(); i++){
      this.accountNumber += digits.get(i);
    }
    System.out.println(this.accountNumber);
    return this.accountNumber;
  }

  public BankAccount(){
     numAccounts ++;
     this.getAccountNumber();
  }

  public long getChecking(){
    return this.checkingBalance;
  }

  public long getSaving(){
    return this.savingsBalance;
  }

  public void depositMoney(int checking, int saving){
    this.checkingBalance += checking;
    this.savingsBalance += saving;
    totalMoney += checking;
    totalMoney += saving;
    System.out.println("Your balance is now $"+ this.checkingBalance + " in checking and $"+ this.savingsBalance + " in savings." );
  }

  public void withdrawMoney(int checking, int saving){
    if(this.checkingBalance > 0){
      this.checkingBalance -= checking;
      totalMoney -= checking;
      System.out.println("Your checking balance is now $" + this.checkingBalance);
    }
    else{
      System.out.println("Your checking account is empty.");
    }

    if(this.savingsBalance > 0){
      this.savingsBalance -= saving;
      totalMoney -= saving;
      System.out.println("Your savings balance is now $" + this.savingsBalance);
    }
    else{
      System.out.println("Your savings account is empty.");
    }
  }

  public static long getTotalMoney(){
    return totalMoney;
  }
}