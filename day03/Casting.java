package day03;

public class Casting {
	public static void main(String[] args) {
		
		//�ڵ� �� ��ȯ
		System.out.println(11/9);
		System.out.println(11/9.0);
		
		
		//���� ����ȯ(Casting)
		System.out.println((double)11/9);
		System.out.println((int)8.43+2.59);
		System.out.println((int)(8.43+2.59));
		System.out.println((int)8.43+(int)2.59);
		
		//���ڿ� ����ȯ
		
		String num1 = "1";
		String num2 = "2";
		
		System.out.println(num1+num2);
		//����
		//System.out.println((int)num1+(int)num2);
		
		//���ڿ� ����ȯ
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		
		int num3=3;
		System.out.println(""+num3);
		System.out.println(""+num3+9);
	}
}