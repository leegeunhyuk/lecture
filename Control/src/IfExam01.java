import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력 받아서 그 수가 0~10 사이의 정수 이면
		// 입력 받은 값을 출력하고, 그 이외의 수이면 "범위에 포함된 수가 아닙니다."
		// 를 출력하는 프로그램
		Scanner inData = new Scanner(System.in);
		int number;
		
		System.out.println("정수 입력 : " );
		number = inData.nextInt();
		
		if(number >= 0 && number <=10){
			System.out.println("입력 정수는 " + number + "입니다.");
		}else{
			System.out.println("범위에 포함된 수가 아닙니다.");
		}
	}
}
