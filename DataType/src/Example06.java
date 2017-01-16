import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		int num;
		Scanner inData = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		num = inData.nextInt();
		System.out.println(num + "의 2배수 => " + (num * 2));
		System.out.println(num + "의 제곱 => " + (num * num));
	}
}
