import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		int num;
		Scanner keyIn = new Scanner(System.in);
		ManageHeight mh = new ManageHeight();
		while(true){
			System.out.println("1.Ű�Է�");
			System.out.println("2.�׷캰 Ű ���");
			System.out.println("3.�׷캰 ������");
			System.out.println("4.����");
			System.out.print("�޴� : ");
			num = keyIn.nextInt();
			switch(num){
			case 1:
				mh.addHeight();
				break;
			case 2:
				mh.printHeight();
				break;
			case 3:
				mh.aveHeight();
				break;
			case 4:
				return;
			}
		}
	}
}