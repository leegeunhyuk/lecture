import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		String str = new String();
		BookManage bm = new BookManage();
		Book [] book = new Book[100];
		book[0] = new Book("ä��������", "B0001", "�Ѱ�", "�Ҽ�   ");
		book[1] = new Book("������", "B0002", "������", "�Ҽ�   ");
		book[2] = new Book("���Ϳ���", "B0003", "����", "�Ҽ�   ");
		book[3] = new Book("�ҳ��� �´�", "B0004", "�Ѱ�", "�Ҽ�   ");
		book[4] = new Book("��¼�� ������ ���� ������ ���������� ����","B0005", "�����", "������");
		book[5] = new Book("�������", "B0006", "������", "������");
		book[6] = new Book("�����Ӹ� ���� �ϴ� ��", "B0007", "�鿵��", "������");
		book[7] = new Book("������ ������", "B0008", "����ȯ", "������");
		book[8] = new Book("�Ű��� B", "B0009", "���̿�����ġ", "����   ");
		book[9] = new Book("�������� ��Ʈ", "B0010", "�ѱ���������", "����   ");
		book[10] = new Book("�ƽ����� �Ű���", "B0011", "���̾ر׷�", "����   ");
		book[11] = new Book("�̱���", "B0012", "�������۴�", "����   ");
		book[12] = new Book("���� �̸���", "B0013", "��ī�� ������", "��ȭ   ");
		book[13] = new Book("���ǽ�83", "B0014", "���� ����ġ��", "��ȭ   ");
		book[14] = new Book("Ŀ�� ���� �ұ��?", "B0015", "�㿵��", "��ȭ   ");
		book[15] = new Book("����", "B0016", "��", "��ȭ   ");
		book[16] = new Book();
		System.out.println(book[0].toString());
		while(true){
			System.out.println("==============================");
			System.out.println("        �����Ҹ� ������  v1.0       ");
			System.out.println("==============================");
			System.out.println("[�޴�]");
			System.out.println("1.      ���� �˻�(������)");
			System.out.println("2.      ���� �˻�(ī�װ���)");
			System.out.println("3.      ���� �뿩");
			System.out.println("4.      ���� �ݳ�");
			System.out.println("5.      ���� �α��ִ� ����");
			System.out.println("e.      ����");
			System.out.print("> ");
			str = keyIn.next();
			switch(str){
			case "1" :
				bm.searchBookName(book);
				break;
			case "2" :
				bm.searchBookCategory(book);
				break;
			case "3" :
				bm.rentBook(book);
				break;
			case "4" :
				bm.returnBook(book);
				break;
			case "5" :
				bm.popularBook(book);
				break;
			case "e" :
				System.out.println("---------------------------");
				System.out.println("[����]");
				System.out.println("===========================");
				System.out.println("�̿����ּż� �����մϴ�. -The End-");
				return;
			}
		}
	}
}