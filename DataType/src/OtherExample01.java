import java.util.Scanner;


public class OtherExample01 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		System.out.print("정수 입력 횟수 : ");
		int T = inData.nextInt();
		int[] arr = new int[T];
		int max = 0, min = 100000000, temp;
		for(int i = 0; i<T; i++){
			System.out.print(i+1 + "번째 입력 정수 : ");
			arr[i] = inData.nextInt();
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		inData.close();
	}
}
