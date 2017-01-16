
public class StaticExam {

	private int instanceVal;
	private static int classVal;
	
	public void instanceMethod(){
		this.instanceVal = 10;
		classVal = 20;
		
		this.classMethod();
	}
	
	public static void classMethod(){
		classVal = 30;
		
//		instanceVal = 100;
//		instanceMethid();
	}
}
