
public class ThisConsExam {
	private String str;
	private int num;
	
	public ThisConsExam(){
		this("test");
		System.out.println("1�� ������");
	}
	public ThisConsExam(String str){
		this(5);
		System.out.println("2�� ������");
	}
	public ThisConsExam(int num){
		System.out.println("3�� ������");
	}
}
