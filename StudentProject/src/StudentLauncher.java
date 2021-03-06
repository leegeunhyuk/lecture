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
			System.out.println("1.학생 등록");
			System.out.println("2.학생 검색");
			System.out.println("3.학생 삭제");
			System.out.println("4.학생 출력");
			System.out.println("5.종료");
			System.out.print("# 메뉴 : ");
			
			n = keyIn.nextInt();
			if(n == 1){
				ms.addStudent();
			}
			
			else if(n == 2){
				System.out.println("1.이름 검색");
				System.out.println("2.학번 검색");
				System.out.print("메뉴 : ");
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
				System.out.println("1.학번순 전체 출력");
				System.out.println("2.성적순 출력");
				num = keyIn.nextInt();
				if(num == 1){
					ms.printStudent();
				}else if(num == 2){
					ms.printRank();
				}
				
			}
			
			else if(n == 5){ 
				System.out.println("프로그램을 종료합니다.");
				return ;
			}

			else{
				System.out.println("다시 입력하시오.");
				System.out.println();
				continue;
			}
		}
	}
}
