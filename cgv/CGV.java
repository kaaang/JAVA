package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "★어서오세요 CGV입니다.★\n";
		String menuMsg = "①예매하기\n"
				+ "②구매하기\n"
				+ "③포인트 조회\n"
				+ "④나가기\n";
		
		String films = "①라이온킹(08:00)\n"
				+ "②스파이더맨(12:00)\n"
				+ "③사일런스(23:00)[청소년 관람 불가]\n"
				+ "④뒤로가기\n";
		
		String buy = "①팝콘\n"
				+ "②콜라\n"
				+ "③맥주\n"
				+ "④뒤로가기\n";
		
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요.\n";
		
		int choice = 0;
		int age = 0;
		
		int money = 50000;
		int point = 0;
		
		int t_price = 10000;
		
		boolean t_check;
		
		
		while(true)
		{
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg + menuMsg));
			
			if(choice == 4) break;
			//잘못 입력했을때 컨티뉴
			if(!(choice >=1 && choice <=3)) continue;
			
			
			switch(choice)
			{
			
			//예매하기 영역
			case 1:
				if(money - t_price < 0)
				{
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
					continue;
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1)
				{
					JOptionPane.showMessageDialog(null, "라이온킹 예매 완료(08:00)");
					
				}
				else if(choice == 2)
				{
					JOptionPane.showMessageDialog(null, "스파이더맨 예매 완료(12:00)");
				}
				else if(choice == 3)
				{
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age > 19)
					{
						JOptionPane.showMessageDialog(null, "사일런스 예매 완료(23:00)");						
					}
					else
					{
						t_check = false;
						JOptionPane.showMessageDialog(null, "다시 시도해 주세요.");
					}
				}
				
				
				
				
				else
				{
					JOptionPane.showMessageDialog(null,"메인 메뉴로 이동합니다.");
					continue;
				}
				
				
				if(t_check)
				{
					if(point > 0)
					{
						if(point - t_price >= 0 )
						{
						point -= t_price;
						}
						else
						{
							money -= (t_price - point);
							point =0;
						}
					}
					else 
					{
						money -=t_price;
						point +=(int)(t_price * 0.5);
						
					}
					JOptionPane.showMessageDialog(null, "현재 잔액 : " + money + "원");
				}
				break;
				
				
				
				
			//구매하기 영역	
			case 2:
				
				choice = Integer.parseInt(JOptionPane.showInputDialog(buy));
				if(choice == 1)
				{
					JOptionPane.showMessageDialog(null, "팝콘 구매 완료");	
				}
				else if(choice == 2)
				{
					JOptionPane.showMessageDialog(null, "콜라 구매 완료");	
				}
				else if(choice == 3)
				{
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19)
					{
						JOptionPane.showMessageDialog(null, "맥주 구매 완료");						
					}
					else
					{
						t_check = false;
						JOptionPane.showMessageDialog(null, "다시 시도해 주세요.");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "메인 메뉴로 이동합니다.");
					continue;
				}
				
				
				if(t_check)
				{
					if(point > 0)
					{
						if(point - t_price >= 0 )
						{
						point -= t_price;
						}
						else
						{
							money -= (t_price - point);
							point =0;
						}
					}
					else 
					{
						money -=t_price;
						point +=(int)(t_price * 0.5);
						
					}
					JOptionPane.showMessageDialog(null, "현재 잔액 : " + money + "원");
				}
				
				
				break;
			
				
				
				
				
				//포인트 조회 영역
			case 3:
				JOptionPane.showMessageDialog(null, "잔여 포인트 : " + point + "점");
				break;
				
				
				
				
				
				
				
			}
		}
	}

}
