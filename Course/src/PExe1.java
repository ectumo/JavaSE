/**
 * 
 */

/**
 * @Description ����������
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��16�� ����1:17:37
 */
public class PExe1 {
	public static void main(String[] args) {
		int i,j,k;
		long sum = 0;
		/**
		 * ��������
		 */
//		for (i = 0; i <= 1000000; i++){
//			for(j = 0; j <= 1000; j++){
//				for(k = 0; k <= 100; k++){
//					sum+=i+j+k;
//				}
//			}
//		}
		/**
		 * ������С
		 */
		for (i = 0; i <= 100; i++){
			for(j = 0; j <= 1000; j++){
				for(k = 0; k <= 100000; k++){
					sum+=i+j+k;
				}
			}
		}
	System.out.print("���Ϊ��"+sum);
	}
}
	
