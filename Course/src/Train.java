/**
 * @Description��������ϰһ
 * @author ���� ectumo
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��14�� ����9:08:59
 */
import java.util.Scanner;

public class Train {


	public static void main (String[] args){
//		System.out.println("��������Ļ�Ա����");
//
//	Scanner Input1 = new Scanner(System.in);
//	int VipNo = Input1.nextInt ();
//	System.out.println("���Ļ�Ա����Ϊ:"+VipNo);
//	int Numbit1 = VipNo%10;
//	int Numbit2 = VipNo/10%10;
//	int Numbit3 = VipNo/100%10;
//	int Numbit4 = VipNo/1000%(10+1);
//	System.out.print("ǧλ����"+Numbit4+"��λ����"+Numbit3+"ʮλ����"+Numbit2+"��λ����"+Numbit1+"\n");
//	System.out.print("��Ա���ţ�"+VipNo+"����λ��֮��Ϊ��"+(Numbit4+Numbit3+Numbit2+Numbit1));
	
//	
	
		System.out.println("��������Ļ�Ա����");
		Scanner InputVIPCardNo = new Scanner(System.in);
		int VIPCardNo = InputVIPCardNo.nextInt();
		System.out.println("��Ļ�Ա�����ǣ�"+VIPCardNo);
		int PrizeCode = (int)(Math.random()*10);
		int Numbit3 = VIPCardNo%1000/100;
		int i = 1;
		while (Numbit3 != PrizeCode){

				System.out.println("��"+i+"���н���Ϊ��"+PrizeCode);
				System.out.println("���ź�����û���н� ��л��Ĳ��룡");
				PrizeCode = (int)(Math.random()*10);
				i++;
		}
		System.out.println("��"+i+"���н���Ϊ��"+PrizeCode);
		System.out.println("��ϲ���Ϊ"+VIPCardNo+"���û������н��ˣ�");
		if(i == 1){
			System.out.println("��������,һ�ξ��н��ˣ�");
		}else if(i <= 3){
			System.out.println("��������");
		}else if (i <= 10){
			System.out.println("����һ�㣡");
		}
		else{
			System.out.println("��鶹��ײ���ɣ�");
		}
	}
}
