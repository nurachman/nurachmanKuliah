import java.util.Scanner;

public class leapYearCalculator {
	public static void main (String args[]) {
	
	Scanner in = new Scanner (System.in);
	System.out.print(" Year = ");
	int year = in.nextInt();
	System.out.print(" Input month (1 - 12) = ");
	int month = in.nextInt();
	switch (month) {
	
	case 1:
		System.out.print(" 30 Days");
		break;
		
	case 2:
		if(year%4==0) {
			System.out.print(" 29 Days");
			System.out.print(" Leap Year ");
		} else
			System.out.print(" 31 Days");
		break;
		
	case 3:
		System.out.print(" 31 Days");
		break;
		
	case 4:
		System.out.print(" 30 Days");
		break;
		
	case 5:
		System.out.print(" 31 Days");
		break;
		
	case 6:
		System.out.print(" 30 Days");
		break;
		
	case 7:
		System.out.print(" 31 Days");
		break;
	
	case 8:
		System.out.print(" 30 Days");
		break;
		
	case 9:
		System.out.print(" 31 Days");
		break;
		
	case 10:
		System.out.print(" 30 Days");
		break;
		
	case 11:
		System.out.print(" 31 Days");
		break;
		
	case 12:
		System.out.print(" 30 Days");
		break;
	
	}

	String answer = (month%2==0) ? "\n Even Month" : "\n Odd Month";
	System.out.println(answer);
	
	}
}
