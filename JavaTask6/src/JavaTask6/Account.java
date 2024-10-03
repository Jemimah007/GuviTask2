package JavaTask6;

public class Account {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public Account() {
		this.accountNumber = "12345";
		this.accountHolderName = "Jemi";
		this.balance = 100.0;
	}

	public Account(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount. Must be greater than zero.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: $" + amount);
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount. Must be greater than zero.");
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}

	public double checkBalance() {
		return balance;
	}

	public void accountDetails() {
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Current Balance: $" + balance);
	}

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.accountDetails();

		Account acc2 = new Account("123456789", "Colleen");
		acc2.accountDetails();

		acc2.deposit(1000.0);
		acc2.withdraw(500.0);
		acc2.withdraw(2000.0);

		System.out.println("Updated Balance: $" + acc2.checkBalance());
	}
}
