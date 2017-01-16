import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = inData.nextInt();
		if(num%3 == 0 && num%5 == 0) 
			System.out.println("3과 5의 공배수");
		else if(num%3 == 0)
			System.out.println("3의 배수");
		else if(num%5 ==0)
			System.out.println("5의 배수");
		else System.out.println("기타 숫자");
		inData.close();
	}
}
