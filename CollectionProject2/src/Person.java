
public class Person {
	private int height;
	
	public Person(){
		
	}
	public Person(int height){
		this();
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "" + this.height;
	}
	
}