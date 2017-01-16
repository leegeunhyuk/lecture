
public class ShortCircuitTest {
	public static void main(String [] args){
		int a = 100;
		int b = 200;
		
		boolean result = false;
		/*
		int cnt = 0;
		for(int i = 0; i<=100; i++){
			result = ++a > b;
			if (result == true) cnt++; 
		}
		System.out.println(cnt);
		*/
		result = ++ a > b & a < ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
	}
}
