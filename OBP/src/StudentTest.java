import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int schoolNumber, kor, eng, math;
		
		Student s2 = new Student();
		System.out.println(s2.getName());
		Student s3 = new Student("김정호");
		System.out.println(s3.getName());
		Student s4 = new Student("이연철", 111111);
		System.out.println(s4.getName() + s4.getSchoolNumber());
		
		Student s1 = new Student();
		System.out.print("이름 입력 : ");
//		name = keyIn.nextLine();
		s1.setName(keyIn.nextLine());
		
		System.out.print("학번 입력 : ");
		schoolNumber = keyIn.nextInt();
		s1.setSchoolNumber(schoolNumber);
		System.out.print("국어 점수 입력 :");
		kor = keyIn.nextInt();
		s1.setKor(kor);
		System.out.print("영어 점수 입력 :");
		eng = keyIn.nextInt();
		s1.setEng(eng);
		System.out.print("수학 점수 입력 :");
		math = keyIn.nextInt();
		s1.setMath(math);
		System.out.print(s1.getName() + "의 학번은 " + s1.getSchoolNumber() + "이고 국어 영어 수학 점수는 각각 " + s1.getKor() + "점, " + s1.getEng() + "점, " + s1.getMath() + "점이다.");
		keyIn.close();
	}
}
