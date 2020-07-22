
import java.util.Vector;
public class Bank {
	Vector <Account> acc = new Vector<>();

	public void openAccount(Account a) {
		acc.addElement(a);
	}
	
	public void closeAccount(Account a) {
		
		acc.remove(a);
	}
	
	public void update() {
		for (Account a : acc)
		{
			if (a instanceof SavingAccount)
				((SavingAccount) a).addInterest();
			if (a instanceof CheckingAccount)
				((CheckingAccount) a).deductFee();
		}
	}
}
