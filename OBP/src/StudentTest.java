import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int schoolNumber, kor, eng, math;
		
		Student s2 = new Student();
		System.out.println(s2.getName());
		Student s3 = new Student("����ȣ");
		System.out.println(s3.getName());
		Student s4 = new Student("�̿�ö", 111111);
		System.out.println(s4.getName() + s4.getSchoolNumber());
		
		Student s1 = new Student();
		System.out.print("�̸� �Է� : ");
//		name = keyIn.nextLine();
		s1.setName(keyIn.nextLine());
		
		System.out.print("�й� �Է� : ");
		schoolNumber = keyIn.nextInt();
		s1.setSchoolNumber(schoolNumber);
		System.out.print("���� ���� �Է� :");
		kor = keyIn.nextInt();
		s1.setKor(kor);
		System.out.print("���� ���� �Է� :");
		eng = keyIn.nextInt();
		s1.setEng(eng);
		System.out.print("���� ���� �Է� :");
		math = keyIn.nextInt();
		s1.setMath(math);
		System.out.print(s1.getName() + "�� �й��� " + s1.getSchoolNumber() + "�̰� ���� ���� ���� ������ ���� " + s1.getKor() + "��, " + s1.getEng() + "��, " + s1.getMath() + "���̴�.");
		keyIn.close();
	}
}