
public class OtherExam03 {

	public static void main(String[] args) {
		int [] arr = new int[55];
		int num = 0;
		int cnt;
		for(int i = 0; i < 55; i++){
			arr[i] = i + 1;
		}
		for(int i = 0; i < 10; i++){
			
			cnt = 0;
			while(true){
				System.out.printf("%5d", arr[num]);
				num++;
				cnt++;
				if(cnt > i) { break; }
			}
			System.out.println();
		}
	}
}
