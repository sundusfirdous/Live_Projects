package javaPackage;
import java.util.*;
public class CountWithoutSpace {


	        public static void main(String arg[]){
	        int sum=0;
	        Scanner s=new Scanner(System.in);
	        System.out.println("please enter string");
	        String val=s.nextLine();
	        int len=val.length();
	            for(int i=0;i<len;i++){
	                if(val.charAt(i)==' ')
	                    {
	                        continue;
	                    }
	                    sum++;
	                    }
	                    System.out.println(sum);
	                    }
}
