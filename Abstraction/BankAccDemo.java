abstract class BankAccount
{
  
  public abstract void deposit(int money);
  public abstract void withdraw(int money);
   public void accountOpen(String firstName,String lastName,String mobNo){
	   System.out.println("First name="+firstName+" "+"LastName="+lastName+" "+"MobileNo="+mobNo);
   }
  //Missing concrete Method and missing parameterized constructor.
}
class SavingsAccount extends BankAccount
{
//Overloading Method
public void regularAcc(int balance){ 
	 System.out.println("The Balance ="+balance);
}
public void regularAcc(String bankName,int balance){
	 System.out.println("The Bank Name and the balance is"+bankName+" "+balance); 
}

  public void deposit(int money)
  {
    System.out.println("This is the concrete deposit method of SavingsAccount"+money);
	
  }
  public void withdraw(int money)
  {
    System.out.println("This is the concrete withdraw method of SavingsAccount"+money);
  } 
}

class CurrentAccount extends BankAccount
{
  public void deposit(int money)
  {
    System.out.println("This is the concrete deposit method of CurrentAccount"+money);
  }
  public void withdraw(int money)
  {
    System.out.println("This is the concrete withdraw method of CurrentAccount"+money);
  }
}

class FixedDepositAccount extends BankAccount
{
  public void deposit(int money)
  {
    System.out.println("This is the concrete deposit method of FixedDepositAccount"+money);
  }
  public void withdraw(int money)
  {
    System.out.println("This is the concrete withdraw method of FixedDepositAccount"+money);
  }
}
class BankAccDemo
{
  public static void main(String args[])
  {
    BankAccount obj = new SavingsAccount();
	obj.accountOpen("Hitesh","Mali","8367803290");// all error 
    obj.deposit(200);
    obj.withdraw(50);
    BankAccount obj1 = new CurrentAccount();
	obj1.accountOpen("Bhushan","Mahajan","8367803200");
    obj1.deposit(300);
    obj1.withdraw(30);
    BankAccount obj2 = new FixedDepositAccount();
	obj2.accountOpen("Piyush","More","8367803211");
    obj2.deposit(500);
    obj2.withdraw(500);
  }
}