package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ���α׷��� �� �ƴѰ���?
		 * 1.JAVA
		 * 2.Python
		 * 3.C���
		 * 4.���վ�
		 */
		
		String q = "���� �� ���α׷��� �� �ƴ� ����?\n"
				+ "1.JAVA\n"
				+ "2.Python\n"
				+ "3.C���\n"
				+ "4.���վ�";
				
				
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int ans = 4;
		String result = "";
		
		
		System.out.println(q);
		choice = sc.nextInt();
		
		
		
		
		
		
		
		
		result = choice == ans ? "�����Դϴ�.": choice >=1 && choice <=4? "�����Դϴ�." : "�߸� �Է� �ϼ̽��ϴ�.";
		
		System.out.println(result);
		
		
	}
}
