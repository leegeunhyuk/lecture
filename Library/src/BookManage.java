import java.util.Scanner;

public class BookManage {
	Scanner keyIn;

	public BookManage() {
		keyIn = new Scanner(System.in);
	}

	// 1. ���� �˻�(������)
	public void searchBookName(Book[] book) {
		int n = 0;
		String bookName = new String();
		System.out.println("[���� �˻�(������)]");
		System.out.println("[�˻�] �������� �Է��ϼ���.");
		System.out.print("> ");
		bookName = keyIn.next();
		System.out.println("�뿩         ID    �з�       ������"); /// ���⼭���� �ض�
		System.out.println("============================");
		while (true) {
			if (book[n].getName().contains(bookName) == true) {
				System.out.println(book[n].toString());
			}
			n++;
			if (book[n].getName() == null) {
				break;
			}
		}

	}

	// 2. �����˻�(ī�װ���)
	public void searchBookCategory(Book[] book) {
		int num;
		int index = book.length;
		System.out.println("[���� �˻�(ī�װ���)]");
		System.out.println("[�˻�] ī�װ����� ������ �ּ���.");
		System.out.println("1.    �Ҽ�");
		System.out.println("2.    ������");
		System.out.println("3.    ����");
		System.out.println("4.    ����");
		System.out.print("> ");
		while (true) {
			num = keyIn.nextInt();
			if (num != 1 && num != 2 && num != 3 && num != 4) {
				System.out.println("ī�װ����� �ٽ� Ȯ�����ּ���.");
				continue;
			} else {
				System.out.println("�뿩         ID    �з�       ������");
				System.out.println("============================");
				break;
			}
		}
		switch (num) {
		case 1:
			for (int i = 0; i < index - 1; i++) {
				if (book[i].getGroup() == null) {
					break;
				}
				if (book[i].getGroup().equals("�Ҽ�   ")) {
					System.out.println(book[i].toString());
				}
			}
			break;
		case 2:
			for (int i = 0; i < index - 1; i++) {
				if (book[i].getGroup() == null) {
					break;
				}
				if (book[i].getGroup().equals("������")) {
					System.out.println(book[i].toString());
				}
			}
			break;
		case 3:
			for (int i = 0; i < index - 1; i++) {
				if (book[i].getGroup() == null) {
					break;
				}
				if (book[i].getGroup().equals("����   ")) {
					System.out.println(book[i].toString());
				}
			}
			break;
		case 4:
			for (int i = 0; i < index - 1; i++) {
				if (book[i].getGroup() == null) {
					break;
				}
				if (book[i].getGroup().equals("��ȭ   ")) {
					System.out.println(book[i].toString());
				}
			}
			break;
		}

	}

	// 3. ���� �뿩
	// true = ���� ���� false = �뿩��
	public void rentBook(Book[] book) {
		String str = new String();
		int index = book.length;
		System.out.println("[���� �뿩]");
		System.out.println("[�뿩] ���� ID�� �Է��ϼ���.");
		System.out.print("> ");

		str = keyIn.next();
		for (int i = 0; i < index; i++) {
			if (book[i].getId() == null) {
				break;
			}
			if (book[i].getId().equals(str) && book[i].getRent() == true) {
				System.out.println("�뿩�� �Ϸ� �Ǿ����ϴ�.");
				book[i].setPoint(); //// Point 1�� �߰�!
				System.out.println(book[i].getPoint());
				book[i].setRent(false);
				break;
			} else if (book[i].getId().equals(str) && book[i].getRent() == false) {
				System.out.println("�뿩�� �� ���� �����Դϴ�. �ٽ� Ȯ���� �ּ���.");
			}
		}
	}

	// 4. ���� �ݳ�
	public void returnBook(Book[] book) {
		String str = new String();
		int index = book.length;
		System.out.println("[���� �ݳ�]");
		System.out.println("[�ݳ�] ���� ID�� �Է��ϼ���.");
		System.out.print("> ");
		str = keyIn.next();
		for (int i = 0; i < index; i++) {
			if (book[i].getId() == null) {
				break;
			}
			if (book[i].getId().equals(str) && book[i].getRent() == false) {
				System.out.println("�ݳ� �Ϸ� �Ǿ����ϴ�.");
				System.out.println("--------------------------------");
				book[i].setRent(true);
				break;
			} else if (book[i].getId().equals(str) && book[i].getRent() == true) {
				System.out.println("�ݳ��� �� ���� �����Դϴ�. �ٽ� Ȯ���� �ּ���.");
				System.out.println("--------------------------------");
			}
		}
	}

	// 5. ���� �α��ִ� ����
	public void popularBook(Book[] book) {
		int index = book.length;
		int max = 0;
		for (int i = 0; i < index; i++) {
			if (book[i].getId() == null) {
				break;
			}
			max = book[i].getPoint() > max ? book[i].getPoint() : max;
		}
		for (int i = 0; i < index; i++) {
			if (book[i].getId() == null) {
				break;
			}
			if(book[i].getPoint() == max){
				System.out.println("[���� �α��ִ� ����]");
				System.out.print("ID    | ");
				System.out.println(book[i].getId());
				System.out.print("�з�       | ");
				System.out.println(book[i].getGroup());
				System.out.print("������    | ");
				System.out.println(book[i].getName());
				System.out.print("����       | ");
				System.out.println(book[i].getAuthor());
				
			}
		}
	}
}