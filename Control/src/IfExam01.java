import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// ����ڷκ��� ������ �Է� �޾Ƽ� �� ���� 0~10 ������ ���� �̸�
		// �Է� ���� ���� ����ϰ�, �� �̿��� ���̸� "������ ���Ե� ���� �ƴմϴ�."
		// �� ����ϴ� ���α׷�
		Scanner inData = new Scanner(System.in);
		int number;
		
		System.out.println("���� �Է� : " );
		number = inData.nextInt();
		
		if(number >= 0 && number <=10){
			System.out.println("�Է� ������ " + number + "�Դϴ�.");
		}else{
			System.out.println("������ ���Ե� ���� �ƴմϴ�.");
		}
	}
}
