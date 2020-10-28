public class BankAccount{
  //Instance Variables
  private double balance;
  private int accountID;
  private String password;
  //constructor
  public BankAccount(int aID, String p){
  balance = 0;
  accountID = aID;
  password = p;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
  password = newPass;
  }

  public boolean deposit(double amount){
    if(amount < 0){
      return false;
    }
    else
    balance += amount;
    return true;
  }

  public boolean withdraw(double amount){
    if((balance - amount) < 0 || amount < 0){
      return false;
    }
    else
    balance -= amount;
    return true;
  }

  public String toString(){
    return accountID + "\t" + balance;
  }
}
