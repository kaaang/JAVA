package day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		String q = "Q.오늘은 당신의 생일입니다.\n"
				+ "친구에게 상자를선무로 받았습니다.\n"
				+ "이 상자 안에는 무엇이 들어 있었을까요?\n"
				+ "1.꽃\n"
				+ "2.손수건\n"
				+ "3.깜짝 상자\n"
				+ "4.보석\n";
		
		int choice = 0;
		
		String ans1 = "꽃 : 당신은 것짓말을 못해서 안합니다.\n";
		String ans2 = "손수건 : 당신은 너무 정직한 사람입니다.\n";
		String ans3 = "깜짝 상자 : 당신은 눈 하나 깜짝 안하고 거짓말을 하는 사람입니다.\n";
		String ans4 = "보석 : 당신은 때에 따라 가끔씩은 거짓말을 합니다.\n";
		
		
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
			System.out.println("잘못 입력하셨습니다");
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
