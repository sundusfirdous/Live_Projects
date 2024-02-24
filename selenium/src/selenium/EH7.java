package selenium;

public class EH7 {
	public static void a(int age) {

	try {
		if (age < 18) {
			throw new ArithmeticException("Not Applicable");
		} else {
			System.out.println("Applicable");
		}
	}catch (Exception e){
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
		a(15);
		a(19);
		
		}

	}


