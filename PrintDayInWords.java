
public class PrintDayInWords {
	
	
static int dayNumber = 2;
	
	public static void main(String[] args) {
		
		if(dayNumber == 0) {
			System.out.println("SUNDAY");
		} else if(dayNumber == 1) {
			System.out.println("MONDAY");

		}else if(dayNumber == 2) {
			System.out.println("TUESDAY");

		}else if(dayNumber == 3) {
			System.out.println("WENDSDAY");

		}else if(dayNumber == 4) {
			System.out.println("THURSDAY");

		}else if(dayNumber == 5) {
			System.out.println("FRIDAY");

		}else if(dayNumber == 6) {
			System.out.println("SATURDAY");

		} else {
			System.out.println("Not a Valid day");

		}
		
		
		System.out.println("***************//*****************");
		
		
		switch (dayNumber) {
		case 0: System.out.println("SUNDAY"); break;
		case 1:	System.out.println("MONDAY"); break;
		case 2: System.out.println("TUESDAY"); break;
		case 3: System.out.println("WENDSDAY"); break;
		case 4: System.out.println("THURSDAY"); break;
		case 5: System.out.println("FRIDAY"); break;
		case 6: System.out.println("SATURDAY"); break;
		default: System.out.println("Not  a valid day"); break;





		
		}
	}
	

}
