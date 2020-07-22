
public class CheckingAccount extends Account {
	public int cnt;
	public int freeTr;
	public double commission = 0.02;
	
	public CheckingAccount(int a, int freeTr) {
		super(a);
		this.freeTr = freeTr;
		cnt = 0;
	}
	
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		cnt++;
	}
	
	public void deductFee() {
		if (freeTr > cnt)
			cnt = 0;
		else {
			int a = cnt - freeTr;
			withdraw(a*commission);
		}
			
	}
	
} 