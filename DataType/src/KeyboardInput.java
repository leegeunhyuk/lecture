import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		
		Scanner inData = new Scanner(System.in);
		 
		double dist, ve, temp, hour, minute, second;
		System.out.println("�Ÿ��� �Է��Ͻÿ�(km����) : ");
		dist = inData.nextInt();
		System.out.println("�ü��� �Է��Ͻÿ�(km/h����) : ");
		ve = inData.nextInt();
		temp = dist;
		hour = temp / ve;
		temp -= (int)hour * ve;
		minute = temp / ve * 60;
		temp = minute;
		temp = minute - (int)minute;
		second = temp * 60;
		System.out.println(dist + "km=> " + (int)hour + "�ð� " + (int)minute + "�� " + second + "�� �ҿ��");
	}
}
