package day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		String q = "Q.������ ����� �����Դϴ�.\n"
				+ "ģ������ ���ڸ������� �޾ҽ��ϴ�.\n"
				+ "�� ���� �ȿ��� ������ ��� �־������?\n"
				+ "1.��\n"
				+ "2.�ռ���\n"
				+ "3.��¦ ����\n"
				+ "4.����\n";
		
		int choice = 0;
		
		String ans1 = "�� : ����� �������� ���ؼ� ���մϴ�.\n";
		String ans2 = "�ռ��� : ����� �ʹ� ������ ����Դϴ�.\n";
		String ans3 = "��¦ ���� : ����� �� �ϳ� ��¦ ���ϰ� �������� �ϴ� ����Դϴ�.\n";
		String ans4 = "���� : ����� ���� ���� �������� �������� �մϴ�.\n";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.err.print(q);
		choice = sc.nextInt();
		
		
		/*
		if(choice == 1)
		{
			System.out.println(ans1);
		}
		else if (choice == 2)
		{
			System.out.println(ans2);
		}
		else if (choice == 3)
		{
			System.out.println(ans3);
		}
		else if (choice == 4)
		{
			System.out.println(ans4);
		}
		else
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		*/
		
		switch(choice)
		{
		case 1:
			System.out.println(ans1);
			break;
		case 2:
			System.out.println(ans2);
			break;
		case 3:
			System.out.println(ans3);
			break;
		case 4:
			System.out.println(ans4);
			break;
		default :
			System.out.println("?");
		}
		
		
	}

}
