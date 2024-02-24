package javaPackage;

public class MethodOverride7 {
public static void main(String[] args) {
	 MethodOverride5 mo5 = new MethodOverride6(); //Dynamic object dispatch
	                                             //Creating refrence for parent class but passing object of child class
	 mo5.cook();                    
	 mo5.eat();
	 mo5.handwash();
	System.out.println(mo5.speedlimit);
	 //mo5.angry(); //undefined 
	 //child class unique value will not get printed but parent class unique value will get printed
}
}
