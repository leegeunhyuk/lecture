
public class Student {

	private String name;
	private int schoolNumber;
	private int kor, eng, math;
	
	public Student(){
		this.name = "기타누락자";
	}
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int schoolNumber){
		this.name = name;
		this.schoolNumber = schoolNumber;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setSchoolNumber(int schoolNumber){
		this.schoolNumber = schoolNumber;
	}
	public int getSchoolNumber(){
		return schoolNumber;
	}
	
	public void setKor(int kor){
		this.kor = kor;
	}
	public int getKor(){
		return kor;
	}
	
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getEng(){
		return eng;
	}
	
	public void setMath(int math){
		this.math = math;
	}
	public int getMath(){
		return math;
	}
	
}
