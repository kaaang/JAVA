package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "�ھ������ CGV�Դϴ�.��\n";
		String menuMsg = "�翹���ϱ�\n"
				+ "�豸���ϱ�\n"
				+ "������Ʈ ��ȸ\n"
				+ "�곪����\n";
		
		String films = "����̿�ŷ(08:00)\n"
				+ "�轺���̴���(12:00)\n"
				+ "����Ϸ���(23:00)[û�ҳ� ���� �Ұ�]\n"
				+ "��ڷΰ���\n";
		
		String buy = "������\n"
				+ "���ݶ�\n"
				+ "�����\n"
				+ "��ڷΰ���\n";
		
		String ageMsg = "[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���.\n";
		
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
			//�߸� �Է������� ��Ƽ��
			if(!(choice >=1 && choice <=3)) continue;
			
			
			switch(choice)
			{
			
			//�����ϱ� ����
			case 1:
				if(money - t_price < 0)
				{
					JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�.");
					continue;
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1)
				{
					JOptionPane.showMessageDialog(null, "���̿�ŷ ���� �Ϸ�(08:00)");
					
				}
				else if(choice == 2)
				{
					JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�(12:00)");
				}
				else if(choice == 3)
				{
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age > 19)
					{
						JOptionPane.showMessageDialog(null, "���Ϸ��� ���� �Ϸ�(23:00)");						
					}
					else
					{
						t_check = false;
						JOptionPane.showMessageDialog(null, "�ٽ� �õ��� �ּ���.");
					}
				}
				
				
				
				
				else
				{
					JOptionPane.showMessageDialog(null,"���� �޴��� �̵��մϴ�.");
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
					JOptionPane.showMessageDialog(null, "���� �ܾ� : " + money + "��");
				}
				break;
				
				
				
				
			//�����ϱ� ����	
			case 2:
				
				choice = Integer.parseInt(JOptionPane.showInputDialog(buy));
				if(choice == 1)
				{
					JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");	
				}
				else if(choice == 2)
				{
					JOptionPane.showMessageDialog(null, "�ݶ� ���� �Ϸ�");	
				}
				else if(choice == 3)
				{
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19)
					{
						JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");						
					}
					else
					{
						t_check = false;
						JOptionPane.showMessageDialog(null, "�ٽ� �õ��� �ּ���.");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "���� �޴��� �̵��մϴ�.");
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
					JOptionPane.showMessageDialog(null, "���� �ܾ� : " + money + "��");
				}
				
				
				break;
			
				
				
				
				
				//����Ʈ ��ȸ ����
			case 3:
				JOptionPane.showMessageDialog(null, "�ܿ� ����Ʈ : " + point + "��");
				break;
				
				
				
				
				
				
				
			}
		}
	}

}
