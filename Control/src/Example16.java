import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = inData.nextInt();
		while(true){
			if(num==0)break;
			System.out.println("������!!");
			num--;
		}
		inData.close();
	}
}
