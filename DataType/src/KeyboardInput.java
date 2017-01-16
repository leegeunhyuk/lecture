import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		
		Scanner inData = new Scanner(System.in);
		 
		double dist, ve, temp, hour, minute, second;
		System.out.println("거리를 입력하시오(km단위) : ");
		dist = inData.nextInt();
		System.out.println("시속을 입력하시오(km/h단위) : ");
		ve = inData.nextInt();
		temp = dist;
		hour = temp / ve;
		temp -= (int)hour * ve;
		minute = temp / ve * 60;
		temp = minute;
		temp = minute - (int)minute;
		second = temp * 60;
		System.out.println(dist + "km=> " + (int)hour + "시간 " + (int)minute + "분 " + second + "초 소요됨");
	}
}
