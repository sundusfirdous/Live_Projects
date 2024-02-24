package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		//logical operator
		System.out.println(a > b && a++ < c); //10,11   //if first statement is true then increment will takes place
		System.out.println(a);
		
		System.out.println(a > b && a++ > c); //11,12
		System.out.println(a);
		
		System.out.println(a < b && a++ < c);//12,12
		System.out.println(a);
		
		System.out.println(a < b && a++ > c);//12,12
		System.out.println(a);
		
		System.out.println(a < b && ++a > c);//12,12
		System.out.println(a);
		
		System.out.println(a > b && ++a < c);//12,13
		System.out.println(a);
		
		//Bitwise operator
		System.out.println(a > b & a++ < c);//13,14  //either any statement is true then increment will takes place
		System.out.println(a);                       //it will check both the conditions
		
		System.out.println(a > b & a++ > c);//14,15
		System.out.println(a);
		
		System.out.println(a < b & a++ < c);//15,16
		System.out.println(a);
		
		System.out.println(a < b & a++ > c);//16,17
		System.out.println(a);
		
		System.out.println(a < b & ++a > c);//17,18
		System.out.println(a);
		
		System.out.println(a > b & ++a < c);//18,19
		System.out.println(a);
	}

}

/*
		int a = 1;
		
		System.out.println(a++);//1,2
		System.out.println(a);//2
		System.out.println(a++);//2,3
		System.out.println(++a);//4,4
		System.out.println(a);//4
	}

}

*/