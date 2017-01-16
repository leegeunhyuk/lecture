import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
	private Student[] student;
	private List<Student> list;
	private int id;
	private Scanner keyIn;

	public ManageStudent() {
		list = new ArrayList<Student>();
		student = new Student[100];
		keyIn = new Scanner(System.in);
		id = 0;
	}

	public void addStudent() { ////// �л� �߰�
		String name;
		int schoolNum, kor, eng, math;

		System.out.print("#�̸� : ");
		name = keyIn.next();

		System.out.print("#�й� : ");
		schoolNum = keyIn.nextInt();

		System.out.print("#���� : ");
		kor = keyIn.nextInt();

		System.out.print("#���� : ");
		eng = keyIn.nextInt();

		System.out.print("#���� : ");
		math = keyIn.nextInt();
		student[id] = new Student(name, schoolNum, kor, eng, math);
		Student std;
		list.add(std = new Student(name, schoolNum, kor, eng, math));
		student[id + 1] = new Student();
		id++;
		System.out.println("��ϿϷ� ^^");
	}

	public void searchName() { ///// �̸����� �˻�
		String name;
		System.out.print("�̸� �Է� : ");
		name = keyIn.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i));
			}
		}

	}

	public void searchSchoolNumber() { ///// �й����� �˻�
		int number;
		System.out.println("�й� �Է� : ");
		number = keyIn.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSchoolNum() == number) {
				System.out.println(list.get(i));
				return;
			}
		}
		System.out.println("�������� �ʴ� �й��̿���");
	}

	public void deleteStudent() { ///// �л� ����
		int number; // �й��� �Է¹޾Ҵ�.

		System.out.print("�Է�(�й�) : ");
		number = keyIn.nextInt(); // �й��� �Է� �޾Ҵ�.

		for (int i = 0; i < list.size(); i++) {
			if (number == list.get(i).getSchoolNum()) {
				list.remove(i);
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�������� �ʴ� �й��̿���");

	}

	public void printStudent() { ///// �й���
		StudentComparatorNumber comp = new StudentComparatorNumber();
		Collections.sort(list, comp);
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i).toString());
		}
	}

	public void printRank() { ///// ������
		StudentComparatorRank comp = new StudentComparatorRank();
		Collections.sort(list, comp);
		for(int i = 0; i < list.size();i++){
			System.out.println(list.get(i).toString());
		}
	}

}