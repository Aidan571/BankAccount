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
  System.out.println(b1.toString());
  BankAccount b2 = new BankAccount(654321,"hi");
  BankAccount b3 = new BankAccount(112233,"really");
  b2.deposit(100.00);
  b3.deposit(100.00);
  System.out.println(b2.getBalance());
  System.out.println(b3.getBalance());
  System.out.println(b2.transferTo(b3, 150.00, "hi"));
  System.out.println(b2.getBalance());
  System.out.println(b3.getBalance());
  System.out.println(b2.transferTo(b3, 50.00, "hello"));
  System.out.println(b2.getBalance());
  System.out.println(b3.getBalance());
  System.out.println(b2.transferTo(b3, 50.00, "hi"));
  System.out.println(b2.getBalance());
  System.out.println(b3.getBalance());
  }
}
