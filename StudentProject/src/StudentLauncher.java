import java.util.PriorityQueue;
import java.util.Scanner;

public class StudentLauncher {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int n, num;
		String yesno;
		boolean flag;
		ManageStudent ms = new ManageStudent();
		
		
		
		
		while(true){
			System.out.println("1.�л� ���");
			System.out.println("2.�л� �˻�");
			System.out.println("3.�л� ����");
			System.out.println("4.�л� ���");
			System.out.println("5.����");
			System.out.print("# �޴� : ");
			
			n = keyIn.nextInt();
			if(n == 1){
				ms.addStudent();
			}
			
			else if(n == 2){
				System.out.println("1.�̸� �˻�");
				System.out.println("2.�й� �˻�");
				System.out.print("�޴� : ");
				num = keyIn.nextInt();
				if(num == 1){
					ms.searchName();
				}else if(num == 2){
					ms.searchSchoolNumber();
				}
			}

			else if(n == 3){
				ms.deleteStudent();
			}
			
			else if(n == 4){
				System.out.println("1.�й��� ��ü ���");
				System.out.println("2.������ ���");
				num = keyIn.nextInt();
				if(num == 1){
					ms.printStudent();
				}else if(num == 2){
					ms.printRank();
				}
				
			}
			
			else if(n == 5){ 
				System.out.println("���α׷��� �����մϴ�.");
				return ;
			}

			else{
				System.out.println("�ٽ� �Է��Ͻÿ�.");
				System.out.println();
				continue;
			}
		}
	}
}