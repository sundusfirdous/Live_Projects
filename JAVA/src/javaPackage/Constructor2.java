package javaPackage;

public class Constructor2 {
//constructor cannot be overriden
	
		int id;
		String name;
		String address;
		
		//Default Constructor
		Constructor2()
		{
			System.out.println("Hello Default Constructor");
		}
		
//Parametrised Constructor
Constructor2(int a , String b, String c)

{
this.id = a;
name = b;
address = c;
}

//Non Static 
public void displayInfo()	
{
System.out.println(id + " " + name + " " + address);	
}
public static void main(String[] args) {
	//default Constructor
	Constructor2 c2 = new Constructor2();
	
	//Prametrized Constructor
	Constructor2 c3 = new Constructor2(1, "Peter", "London");
	c3.displayInfo();
	Constructor2 c4 = new Constructor2(2, "John", "London");
	c4.displayInfo();
}


	
}
