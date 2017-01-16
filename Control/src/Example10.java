import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int s1, s2, s3, sum;
		double ave;
		System.out.print("국어 점수 : ");
		s1 = inData.nextInt();
		System.out.print("영어 점수 : ");
		s2 = inData.nextInt();
		System.out.print("수학 점수 : ");
		s3 = inData.nextInt();
		sum = s1 + s2 + s3;
		ave = sum/3.0;
		System.out.println("총점 : " + sum);
		System.out.println("평균  : " + ave);
		
		if(ave >= 90) System.out.println("A학점");
		else if(ave >= 80) System.out.println("B학점");
		else if(ave >= 70) System.out.println("C학점");
		else if(ave >= 60) System.out.println("D학점");
		else System.out.println("F학점");
		inData.close();
	}
}
