import java.util.Scanner;
/////피보나치 메인 
public class MyTest {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int T, n;
		T = keyIn.nextInt();
		
		Fibonacci f = new Fibonacci();
		f.fiboArray();
		
		for(int i = 0; i < T; i++){
			n = keyIn.nextInt();
			f.fiboCal(n);
		}
	}
}
