package day04;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Age : ");
//		sc.nextInt();
//		System.out.print("name : ");
//		sc.next();
// nextLine은 엔터를 인식해서 먹어버림 엔터는 Age를 입력하면서 사용해버림
		
		
		
		System.out.print("Age : ");
		sc.nextInt();
		System.out.print("name : ");
		sc.next();	
//next는 공백을 구분점으로 사용함
//nextLine을 사용할려면 두번 사용해야함		
		
	}

}
