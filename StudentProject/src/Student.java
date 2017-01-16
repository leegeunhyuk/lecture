import java.util.Comparator;

public class Student {
	private String name;
	private int schoolNum;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Student(){
		this.name = "미정";
		this.schoolNum = 0;
		this.kor = -1;
		this.eng = -1;
		this.math = -1;
	}
	public Student(String name, int schoolNum, int kor, int eng, int math){
		this.name = name;
		this.schoolNum = schoolNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = this.kor + this.eng + this.math;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setSchoolNum(int schoolNum){
		this.schoolNum = schoolNum;
	}
	public int getSchoolNum(){
		return schoolNum;
	}
	
	public void setKor(int kor){
		this.kor = kor;
		setSum();
		
	}
	public int getKor(){
		return kor;
	}
	
	public void setEng(int eng){
		this.eng = eng;
		setSum();
	}
	public int getEng(){
		return eng;
	}
	
	public void setMath(int math){
		this.math = math;
		setSum();
	}
	public int getMath(){
		return math;
	}
	
	public void setSum(){
		this.sum = this.kor + this.eng + this.math;
	}
	public int getSum(){
		return this.sum;
	}
	
	public String toString(){
		return "이름: " + getName() + " 학번: " + getSchoolNum() + "  국어 점수: " + getKor() + 
				"점 영어 점수: " + getEng() + "점 수학 점수: " + getMath() + "점  총점: " + getSum();
	}
	
}
