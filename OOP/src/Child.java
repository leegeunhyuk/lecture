
public class Child extends Parent{

	private int childNum;
	
	public Child(){}
	
//	public void setChildNum(int childNum){
//		this.childNum = this.num + childNum;
//	}
//	
	@Override
	public void print() {
		System.out.println("Child�� print()");
	}
	
	public void myPrint(){}
}