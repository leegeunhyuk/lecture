import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int total = 0;
		int num;
		while(true){
			System.out.print("���� �Է�(���� �Է½� ����): ");
			num = inData.nextInt();
			if(num<0) break;
			total += num;
			
		}
		System.out.println("��� = " + total);
	}
}
