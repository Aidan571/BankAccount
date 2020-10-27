public class BankAccountTester{
public static void main(String[]args){
  BankAccount b1 = new BankAccount(123456, "hello");
  System.out.println(b1.getAccountID());
  System.out.println(b1.getBalance());
  System.out.println(b1.deposit(10.75));
  System.out.println(b1.getBalance());
  System.out.println(b1.deposit(-5.50));
  System.out.println(b1.getBalance());
  System.out.println(b1.withdraw(11.50));
  System.out.println(b1.getBalance());
  System.out.println(b1.withdraw(5.75));
  System.out.println(b1.getBalance());
  System.out.println(b1.withdraw(-4.25));
  System.out.println(b1.getBalance());
  }
}
