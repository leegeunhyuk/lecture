import java.util.Arrays;
import java.util.Scanner;

import javafx.scene.layout.Priority;

public class Example30 {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int [] arr = new int[5];
		int index = arr.length;
		int temp;
		for(int i = 0; i < index; i++){
			System.out.print("정수 입력 : ");
			arr[i] = keyIn.nextInt();
		}
		// Selection 정렬
//		for(int i = 0; i < index; i++){
//			for(int j = i; j < index; j++){
//				if(arr[i] < arr[j]){
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		for(int i = 0; i < index; i++){
			System.out.println(arr[i] + "\t");
		}
	}
}
