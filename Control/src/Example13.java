import java.util.Scanner;

public class Example13 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num1, num2, select;
		
		System.out.print("num1 : ");
		num1 = inData.nextInt();
		System.out.print("num2 : ");
		num2 = inData.nextInt();
		System.out.print("1.µ¡¼À 2.»¬¼À 3.°ö¼À 4.³ª´°¼À (1~4Áß ¼±ÅÃ) :" );
		select = inData.nextInt();
		switch(select){
		case 1:
			System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2));
			break;
			
		}
		inData.close();
	}
}
