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
}
