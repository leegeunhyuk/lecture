import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int outp, ii, jj;
		System.out.print("����� ���ڸ� �Է� : ");
		outp = inData.nextInt();
		System.out.print("�� �ٿ� �ݺ��� Ƚ�� �Է� : ");
		jj = inData.nextInt();
		System.out.print("�ݺ� ����� ���μ� �Է� : ");
		ii = inData.nextInt();
		for(int i = 0; i<ii; i++){
			for(int j = 0 ;j<jj; j++){
				System.out.print(outp);
			}
			System.out.println();
		}
	}
}
