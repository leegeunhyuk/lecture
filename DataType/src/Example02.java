
public class Example02 {

	public static void main(String [] args){
		int realTime = 54321;
		int time = realTime;
		int hour, minute, second;
		hour = time/3600;
		time = time - hour * 3600;
		minute = time /60;
		second = time - minute * 60;
		System.out.println(realTime + "초는" + hour + "시간 " + minute + "분 " + second + "초 입니다.");
	}
}
