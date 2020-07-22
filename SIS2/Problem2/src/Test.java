
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Account acc = new SavingAccount(1, 20);
		bank.openAccount(acc);
		acc.deposit(50);
		//acc.addInterest();
		System.out.println(acc.getBalance());
	}
}
