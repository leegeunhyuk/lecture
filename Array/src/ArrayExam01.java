import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		
		int [] ary;
		int num, index;
		
		System.out.print("�迭 ���� �Է��Ͻÿ� : ");
		num = keyIn.nextInt();
		ary = new int[num];
		
		index = ary.length;
		for(int i = 0; i < index; i++){
			System.out.print(i + "��° ��� : ");
			ary[i] = keyIn.nextInt();
		}
//		for(int i = 0; i < index; i++){
//			System.out.print(ary[i] + "\t"); //tap��ŭ ����
//		}
		for(int data : ary){
			System.out.print(data + "\t");
		}
		
		
		keyIn.close();
	}
}