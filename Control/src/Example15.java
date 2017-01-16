import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		
		System.out.print("1 이상의 정수 입력: ");
		num = inData.nextInt();
		int fac = num;
		while(true){
			if(num-1 <= 0) break;
			fac = fac * (num-1);
			num--;
		}
		System.out.println("factorial = " + fac);
		inData.close();
	}
}
