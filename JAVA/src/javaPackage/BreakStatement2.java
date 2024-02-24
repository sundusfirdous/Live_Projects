package javaPackage;

public class BreakStatement2 {

	public static void main(String[] args) {
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<3;j++)
			{
				if(i==2 & j==2) {
					continue;}
			
			System.out.println(i+" "+j);
		}
			System.out.println("control out from inner loop");
	}System.out.println("control out from outer loop");
	
	/*
	  if(i==2 & j==2)
	  break;
	  
	i=1 F  &  j=1 F //false
	i=1 F  &  j=2 T //false
	i=2 T  &  j=1 F //false
	i=2 T  &  i=2 T //true   break hojayega
	
	
	*/
	
	for(int i=1;i<3;i++)
	{
		for(int j=1;j<3;j++)
		{
			if(i==2 && j==2) {
				break;}
		
		System.out.println(i+" "+j);
	}
		System.out.println("control out from inner loop");
}System.out.println("control out from outer loop");

}
}

/*
if(i==2 & j==2)
break;

i=1 F  &&  j=1 F //false
i=1 F  &&  j=2 T //false
i=2 T  &&  j=1 F //false
i=2 T  &&  i=2 T //true   break hojayega


*/
