
public class ThisConsExam {
	private String str;
	private int num;
	
	public ThisConsExam(){
		this("test");
		System.out.println("1腰 持失切");
	}
	public ThisConsExam(String str){
		this(5);
		System.out.println("2腰 持失切");
	}
	public ThisConsExam(int num){
		System.out.println("3腰 持失切");
	}
}
