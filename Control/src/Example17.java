import java.util.Scanner;

public class Example17 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		int total = 0;
		
		while(true){
			System.out.println("양수 입력 : ");
			num = inData.nextInt();
			if(num>0) break;
		}
		
		while(num > 0){
			total += num;
			num--;
		}
		System.out.println("결과 : " + total);
		inData.close();
	}
}
