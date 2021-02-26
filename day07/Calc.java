package day07;

import java.util.Scanner;

/*
 * 
 * 1+1
 * 2
 * 
 * 
 * 
 * 1-1
 * 0
 * 
 * 
 */
public class Calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int start = 0;
		int num1 = 0;
		String oper = "";
		int num2 = 0;
		int ans = 0;
		int other = 0;
		
		
		while(true)
		{
			
			System.out.println("1.계산하기 : \n"
					+ "2.나가기 : ");
			
			start = sc.nextInt();
			
			if(start == 2)
			{
				System.out.println("종료되었습니다.");
				break;
			}
			if(start != 1) continue;
			
			
			
			
			
			else
			{
				num1 = sc.nextInt();
				oper = sc.next();
				num2 = sc.nextInt();
				
				if(oper.equals("+"))
				{
					ans = num1 + num2;
					
					System.out.println(num1 + oper + num2 + "=" + ans);
				}
				else if(oper.equals("-"))
				{
					ans = num1 - num2;
					
					System.out.println(num1 + oper + num2 + "=" + ans);
				}
				else if(oper.equals("*"))
				{
					ans = num1 * num2;
					
					System.out.println(num1 + oper + num2 + "=" + ans);
				}
				else if(oper.equals("/"))
				{
					ans = num1 / num2;
					other = num1%num2;
					System.out.println(num1 + oper + num2 + "=" + ans);
					System.out.println("나머지 : " + other);
				}
				else
				{
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
}
