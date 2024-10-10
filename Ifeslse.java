package pavan;

import java.util.Scanner;

public class Ifeslse {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		 if(a<35){
				System.out.println("Fail");
				
			}
				
		 else if (a==35) {
			 System.out.println("Pass");
			 
		 }
		 else if (a>35 && a<=70) {
			 System.out.println("Third class");
		 }
		 else if (a>70 && a<80) {
			 System.out.println("Second class");
		 }
		 else {
			 System.out.println("First class");
		 }
	}

}
