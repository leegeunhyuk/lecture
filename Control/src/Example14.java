import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int m1, m2, m3, sum, select;
		double ave;
		System.out.print("국어 점수");
		m1 = inData.nextInt();
		System.out.print("영어 점수");
		m2 = inData.nextInt();
		System.out.print("수학 점수");
		m3 = inData.nextInt();
		sum = m1 + m2 + m3;
		ave = sum/3.0;
		System.out.println("평균 : " + ave);
		System.out.print("1.90점이상 2.80점이상 3.70점이상 4.60점이상 5.60점이하");
		select = inData.nextInt();
		switch(select){
		case 1:
			System.out.println("A학점");
			break;
		case 2:
			System.out.println("B학점");
			break;
		case 3:
			System.out.println("C학점");
			break;
		case 4:
			System.out.println("D학점");
			break;
		case 5:
			System.out.println("F학점");
			break;
		}
		inData.close();
	}
}
