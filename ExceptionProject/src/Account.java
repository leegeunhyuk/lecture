
public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}

	public void withdraw(int money) throws OverdraftException {
		if (balance > money) {
			balance -= money;
		}else{
			throw new OverdraftException("ภÜพืบฮมท");
		}
	}

	public int getBalance() {
		return this.balance;
	}
}
