import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		System.out.print("*날 수를 입력하시오 : ");
		int num = inData.nextInt();
		System.out.println(num + "일은" + (num/7) + "주 " + (num%7) + "일 입니다.");
	}
}
