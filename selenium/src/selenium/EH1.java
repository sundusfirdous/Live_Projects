package selenium;

public class EH1 {

	public static void main(String[] args) {
		
		try {
			int a = 5/0; // Arithmetic Exception
			
		}catch (ArithmeticException a)
		{
			a.printStackTrace(); //Give complete exception info
			System.out.println(a); //Only Exception info
			
		}catch (NullPointerException n)
		{
			System.out.println(n);
		}
		
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	System.out.println("Exception Hnadled");
	}

}
