
public class CheckPassAndFail {
	
public static void checkgrade (int mark){
		
		
		if(mark >=50)
			System.out.println("PASS");
			else
				System.out.println("FAIL");
	}
	
	public static void main(String[] args) {
		
//		CheckPassFail checkMark = new CheckPassFail();
//		checkMark.checkgrade(0);
		
		CheckPassAndFail.checkgrade(54);
	}


}
