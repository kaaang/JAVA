package day04;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		
		
		int num1 = 0, num2 = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("frist : ");
		num1 = sc.nextInt();
		System.out.print("second : ");
		num2 = sc.nextInt();
		
		
		System.out.println("frist : "+num1);
		System.out.println("second : "+num2);
		
		System.out.println("sum : "+(num1+num2));
		
		
		
	}

}
