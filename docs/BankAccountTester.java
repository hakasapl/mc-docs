public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount cameronsChecking = new BankAccount(0);
		cameronsChecking.deposit(1000);
		cameronsChecking.withdraw(1500);
		cameronsChecking.withdraw(-30);
		System.out.println("Cameron's balance is $" + cameronsChecking.getBalance());
		System.out.println("Expected balance is $1000.00");
	}
}