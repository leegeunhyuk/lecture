import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		int [] arr = new int[5];
		int index, temp;
		for(int i = 0; i < 5; i++){
			System.out.println("ют╥б : ");
			arr[i] = keyIn.nextInt();
		}
		index = arr.length;
		for(int i = 1; i < index; i++){
			for(int j = 0; j < i; i++){
				if(arr[j] > arr[i]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}	
		}
				
	}
}
