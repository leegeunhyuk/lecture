import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = inData.nextInt();
		
		if(num>0){
			System.out.println("��� �Դϴ�.");
		}else if(num<0){
			System.out.println("���� �Դϴ�.");
		}else
			System.out.println("0�Դϴ�.");
	}
}
