
public class Rectangle {

	private int width;
	private int height;
	private Point origin;
	
	public Rectangle(Point origin){
		this.origin = origin;
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle(Point origin, int width, int height){
		this.origin = origin;
		this.width = width;
		this.height = height;
	}
	
	public int getArea(){
		return width * height;
	}
}