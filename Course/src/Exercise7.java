/**
 * 
 */

/**
 * @Description�����м���ͬ������֪��24��ͷ��60ֻ�ţ��ʣ��ж���ֻ��������ֻ�ã���ӡ��
 * ���еĿ��ܣ����û�У���ӡ�޽�
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����10:08:11
 */
public class Exercise7 {
	public static void main(String[] args) {
		int RabbitsNums = 0;
		int ChickenNums = 0;
		int MatchedCount = 0;
		final int TatolNums = 24;
		final int TotalLegs = 60;
		
		for (RabbitsNums = 0; RabbitsNums <= TatolNums; RabbitsNums++){
			for (ChickenNums =TatolNums-RabbitsNums; ChickenNums <=TatolNums-RabbitsNums;ChickenNums++){
//				System.out.println("����һ\t����������"+RabbitsNums+"��������"+ChickenNums+"��������"
//						+(RabbitsNums+ChickenNums));
//				System.out.println("������\t����������"+RabbitsNums*4+"����������"+ChickenNums*2+"����������"
//						+(RabbitsNums*4+ChickenNums*2));
//				System.out.println("#########################################################");
				if(RabbitsNums*4+ChickenNums*2==TotalLegs){
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("ƥ��ɹ�������"+RabbitsNums+"������"+ChickenNums);
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					MatchedCount++;
				}
			}		
		}
		if (MatchedCount == 0)
			System.out.println("�����Ĳ����޽�");
		else
			System.out.println("�����Ĳ�����"+MatchedCount+"����");		
	}
}
