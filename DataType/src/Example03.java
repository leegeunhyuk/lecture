
public class Example03 {

	public static void main(String [] args){
		double year = 365.2422;
		double temp = year;
		double day, hour, minute, second;
		day = (int)year;
		temp = temp - day;
		
		hour = (int)((year - day) * 24);
		temp = temp - hour / 24;
		
		minute = (int)((temp) * 24 * 60);
		temp = temp - minute / (24 *60); 
		
		second = ((temp) * 24 * 60 * 60);
		System.out.println(year + "���� " + (int)day + "�� " + (int)hour + "�ð� " + (int)minute + "�� " + (float)second + "�� �Դϴ�.");
		
	}
}
