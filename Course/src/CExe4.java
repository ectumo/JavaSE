/**
 * 
 */

/**
 * @Description:������ϰ
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��16�� ����3:47:37
 */
import java.util.Scanner;

public class CExe4 {
	public static void main(String[] args) {
		final int ArrScoLen = 100;
		double ArrScores[] = new double[ArrScoLen];
		double SumNums = 0;
		int ArrLen = 0;
		boolean repeat = true;
		Scanner input = new Scanner(System.in); 
		while (repeat && ArrLen <= 100){
			
			try {
				System.out.print("�������"+(ArrLen+1)+"������");
				ArrScores[ArrLen] = input.nextDouble();
				ArrLen++;
			} catch (Exception e) {
				System.out.println("�������ݴ���,¼�������");// TODO: handle exception
				repeat = false;
			}
		}
		for (int i = 0; i<ArrLen-1;i++){	
			SumNums+=(ArrScores[i]*100.0); 
			System.out.println("��������["+i+"]Ԫ��ֵΪ"+ArrScores[i]+"�ܷ�Ϊ"+SumNums/100);
		}
	}
}
