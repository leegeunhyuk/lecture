import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int outp, ii, jj;
		System.out.print("출력할 숫자를 입력 : ");
		outp = inData.nextInt();
		System.out.print("한 줄에 반복할 횟수 입력 : ");
		jj = inData.nextInt();
		System.out.print("반복 출력할 라인수 입력 : ");
		ii = inData.nextInt();
		for(int i = 0; i<ii; i++){
			for(int j = 0 ;j<jj; j++){
				System.out.print(outp);
			}
			System.out.println();
		}
	}
}
