
import java.util.Scanner;

public class Example04 {

	public static void main(String [] args){
		Scanner inData = new Scanner(System.in);
		
		double dist, ve, temp, hour, minute, second;
		System.out.print("�Ÿ��� �Է��Ͻÿ�(km����) : ");
		dist = inData.nextInt();
		System.out.print("�ü��� �Է��Ͻÿ�(km/h����) : ");
		ve = inData.nextInt();
		temp = dist;
		hour = temp / ve;
		temp -= (int)hour * ve;
		minute = temp / ve * 60;
		temp = minute;
		temp = minute - (int)minute;
		second = temp * 60;
		System.out.println(dist + "km=> " + (int)hour + "�ð� " + (int)minute + "�� " + second + "�� �ҿ��");
		inData.close();
	}
}
