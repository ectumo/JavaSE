/**
 * 
 */

/**
 * @Descripion��������1-100���ۼ�ֵ����Ҫ���������и�λ��Ϊ3����
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��14�� ����5:44:42
 */
public class Exercise2 {
	public static void main(String[] args) {
		int NumsSum = 0;
		int i;
		for (i = 1; i <= 100; i++){
			if(i%10 != 3){
				NumsSum+=i;	
				System.out.println("��ǰ"+i+"�ڸ���Ϊ��"+i+"�ۼӺ�ֵΪ��"+NumsSum);
			}		
		}
		System.out.println("������Ϊ��"+NumsSum);
		
	}
}
