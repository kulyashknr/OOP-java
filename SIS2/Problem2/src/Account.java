
public class Account {
	public double balance; 
	public int accNumber; 
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		if (sum > 0)
			balance += sum;
	}
	
	public void withdraw(double sum) {
		if ((sum > 0) && (balance > 0))
			balance -= sum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		other.deposit(amount);
		withdraw(amount);
	}
	
	public String toString() {
		return "Account number is " + accNumber + "/nBalance is " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Account))
			return false;
		
		Account a = (Account)o;
		return a.balance == balance && a.accNumber == accNumber;
	}
	//public abstract void addInterest();
}
