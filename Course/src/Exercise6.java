/**
 * 
 */

/**
 * @Description��ʵ���˻���ȭ��Ч�����û����롰ʯͷ����������������������������������Գ���ȭ
 *				 �����Ƚϣ��ж��û�����Ӯ���ߴ��ƽ��
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����10:08:04
 */
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		int RanNum = -1;
		int ManNum = -2;
		int Result = 1;
		Scanner input = new Scanner(System.in);
		
		while (Result != 2){
			RanNum = ((int)(Math.random()*100))%3+1;
			//System.out.println("�����Ϊ��"+RanNum);
			System.out.println("���������ѡ��1:����\t2:ʯͷ\t3:��!");
			ManNum = input.nextInt();
			while (ManNum < 1 || ManNum > 3){
				System.out.println("�������ֵ������Ҫ������������(1-3)");
				System.out.println("���������ѡ��1:����\t2:ʯͷ\t3:��!");
				ManNum = input.nextInt();
			}
			if (ManNum == RanNum){
				Result = 1;	//ƽ��
			}	
			else if (ManNum>RanNum){
				if(ManNum-RanNum == 1)
					Result = 2; //��Ӯ��
				else
					Result = 3; //������	
			}
			else{
				if(RanNum-ManNum == 1)
					Result = 2; //������
				else
					Result = 3; //��Ӯ��
			}
			switch (Result){
			case 1:
				System.out.println("���ƽ��");
				break;
			case 2:
				System.out.println("��ϲ��,Ӯ�ˣ�");
				break;
			case 3:
				System.out.println("������,����� ��");
				break;	
			}
		}
	}
}
