import java.util.Scanner;


public class OtherExample01 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		System.out.print("���� �Է� Ƚ�� : ");
		int T = inData.nextInt();
		int[] arr = new int[T];
		int max = 0, min = 100000000, temp;
		for(int i = 0; i<T; i++){
			System.out.print(i+1 + "��° �Է� ���� : ");
			arr[i] = inData.nextInt();
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		inData.close();
	}
}
