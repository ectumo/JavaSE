/**
 * 
 */

/**
 * @Description:
 * 	�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ������һ�����ӣ�С���ӳ���
 *	�������º�������һ�����ӣ��������Ӷ�������ÿ�������������Ӷ��ǲ�ͬ�Ա��
 *	�ʣ�һ����ÿ���µ����Ӹ����Ƕ��ٶԣ�
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����1:21:42
 */
public class Exercise8 {
	public static void main (String[] args) {
		final int totalmonths = 12;
		
		long totalRibbits = 0;
		RibbitNums RNums = new RibbitNums();
		for (int i=1; i<=totalmonths; i++){
			totalRibbits = RNums.RibbitNums(i);
			System.out.println("��"+(i)+"���µ������ܶ���Ϊ��"+totalRibbits);	
		}
	}
}
class RibbitNums {
	public long RibbitNums (long num){
		long result;
		result = num;
		if (result==0)
			return 0;
		if (result<=3)
			return 1;
		if (result > 3);
//			System.out.println("����ǰresult="+result);	
			result	= RibbitNums(result-1)+RibbitNums(result-3);
//			System.out.println("���ú�result="+result);
			return result;
	}
}

	
