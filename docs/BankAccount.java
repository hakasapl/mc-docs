// Class to simulate a bank account
public class BankAccount
{
	private double balance;

	/* Default constructor that initializes the balance to 0.*/
	public BankAccount()
	{
		balance = 0.0;
	}

	/* Constructor that takes in an initial balance as a parameter.
	 * @param initial balance
	 */
	public BankAccount(double bal)
	{
		balance = bal;
	}

	/* Deposit method takes in a parameter that adds money to the balance.
	 * @param amount to be depostied
	 */
	public void deposit(double amount)
	{
		if(amount < 0){} else
			balance += amount;
	}

	/* Withdrawl method takes in a parameter and subtracts money from the balance.
	 * @param amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if(amount < 0 || amount > balance) {} else
			balance -= amount;


	}

	/* getBalance method is an accesor method that retrieves the current balance.
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}

	/* addInterest method adds interest to the balance of the bank account.
	 * @param rate of interest
	 */
	public void addInterest(double rate)
	{
		balance = balance * (rate/100 + 1);
	}
}

