import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int year;
		System.out.print("년도를 입력하시오 : ");
		year = inData.nextInt();
		if(year%4 == 0) {
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println(year + "년은 윤년(Leap year)입니다.");
				}
				else System.out.println(year + "년은 평년(Common year)입니다.");
			}
			else System.out.println(year + "년은 윤년(Leap year)입니다.");
		}
		else System.out.println(year + "년은 평년(Common year)입니다.");
		inData.close();
	}
}
