import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("정수 입력 : ");
		num = inData.nextInt();
		
		if(num>0){
			System.out.println("양수 입니다.");
		}else if(num<0){
			System.out.println("음수 입니다.");
		}else
			System.out.println("0입니다.");
	}
}
