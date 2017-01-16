import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int total = 0;
		int num;
		while(true){
			System.out.print("정수 입력(음수 입력시 종료): ");
			num = inData.nextInt();
			if(num<0) break;
			total += num;
			
		}
		System.out.println("결과 = " + total);
	}
}
