
public class Example26 {

	public static void main(String[] args) {
		char ch = 'F';
	
		for(int i = 0; i<=ch-'A';i++ ){
			for(int j = 0; j<=i;j++){
				System.out.print((char)(ch-j));
			}
			System.out.println();
		}
		//System.out.println(ch-'A');
	}
}
