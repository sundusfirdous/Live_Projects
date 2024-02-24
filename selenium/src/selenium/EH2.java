package selenium;

public class EH2 {

	public static void main(String[] args) {
		
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
System.out.println("Exception Hnadled");
	}

}
