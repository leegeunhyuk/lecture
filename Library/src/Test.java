import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		String str = new String();
		BookManage bm = new BookManage();
		Book [] book = new Book[100];
		book[0] = new Book("채식주의자", "B0001", "한강", "소설   ");
		book[1] = new Book("도깨비", "B0002", "김은숙", "소설   ");
		book[2] = new Book("공터에서", "B0003", "김훈", "소설   ");
		book[3] = new Book("소년이 온다", "B0004", "한강", "소설   ");
		book[4] = new Book("어쩌면 별들이 너의 슬픔을 가져갈지도 몰라","B0005", "김용택", "에세이");
		book[5] = new Book("절대고독", "B0006", "고도원", "에세이");
		book[6] = new Book("빨강머리 앤이 하는 말", "B0007", "백영옥", "에세이");
		book[7] = new Book("나에게 고맙다", "B0008", "전승환", "에세이");
		book[8] = new Book("매거진 B", "B0009", "제이오에이치", "잡지   ");
		book[9] = new Book("물가정보 세트", "B0010", "한국물가정보", "잡지   ");
		book[10] = new Book("맥스무비 매거진", "B0011", "케이앤그룹", "잡지   ");
		book[11] = new Book("싱글즈", "B0012", "더북컴퍼니", "잡지   ");
		book[12] = new Book("너의 이름은", "B0013", "신카이 마코토", "만화   ");
		book[13] = new Book("원피스83", "B0014", "오다 에이치로", "만화   ");
		book[14] = new Book("커피 한잔 할까요?", "B0015", "허영만", "만화   ");
		book[15] = new Book("헬퍼", "B0016", "삯", "만화   ");
		book[16] = new Book();
		System.out.println(book[0].toString());
		while(true){
			System.out.println("==============================");
			System.out.println("        나무소리 도서관  v1.0       ");
			System.out.println("==============================");
			System.out.println("[메뉴]");
			System.out.println("1.      도서 검색(도서명)");
			System.out.println("2.      도서 검색(카테고리)");
			System.out.println("3.      도서 대여");
			System.out.println("4.      도서 반납");
			System.out.println("5.      가장 인기있는 도서");
			System.out.println("e.      종료");
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
				System.out.println("[종료]");
				System.out.println("===========================");
				System.out.println("이용해주셔서 감사합니다. -The End-");
				return;
			}
		}
	}
}
