
public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account(10000);
		try {

			acc.withdraw(5000);
			System.out.println(acc.getBalance());
			return;
			// acc.withdraw(60000);

		} catch (OverdraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("리턴될 때 불리나????");
		}
		
		
	}
}
