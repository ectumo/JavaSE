/**
 * @������������ϰ��Ʒ�۸�
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��14�� ����3:57:21
 */
import java.util.Scanner;

public class GoodsPrice {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ  > �������");
		String menuchoice = "y";
		while (!menuchoice.equals ("n")){
//			System.out.println(menuchoice.equals ("n"));
			System.out.println("*******************************************");
			System.out.print("��ǰ��Ʒ�ı�ţ�");
			System.out.println("1.T��\t2.����Ь\t3.������");
			System.out.println("*******************************************");
			System.out.print("��ѡ������Ʒ�ı�ţ�");
			int goodchoice = input.nextInt();
			System.out.println("ѡ�����Ʒ�ı�ţ�"+goodchoice);
			switch(goodchoice){
			case 1:
				System.out.println("1.T��\t��245.00");
				break;
			case 2:
				System.out.println("2.����Ь\t��1245.00");
				break;
			case 3:
				System.out.println("3.������\t��3245.00");
				break;
			default:
				System.out.println("��ѡ�����Ʒ������");	
			}
			System.out.println("�Ƿ����(y/n)");
			menuchoice = input.next();	
//			System.out.println("menchoice="+menuchoice);
//			System.out.println(menuchoice.equals ("n"));
		}
		System.out.println("���������");
		
		
		
	}
}
