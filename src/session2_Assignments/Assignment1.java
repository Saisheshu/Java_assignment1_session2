package session2_Assignments;

import java.util.Scanner;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		
		if(age>=18){
			System.out.println("Congrats! You are eligible to Vote.");
		}else{
			System.out.println("Sorry! You are not eligible to Vote.");
		}
		
		
		
		
	}

}
