/**
 * 
 */

/**
 *TODO
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����2:59:21
 */
public class CExe2 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		int count = 1;
		for (i = 1; i <= 10; i++){
			sum+=i;	
			if(sum > 20){
				System.out.println("��"+count+"��\t��ǰ��Ϊ��"+sum);
				count++;
			}
		}
		System.out.println("����Ϊ��"+(count-1));
	}	
}
