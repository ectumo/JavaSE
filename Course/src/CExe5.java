/**
 * 
 */

/**
 *TODO
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��17�� ����1:56:05
 */
import java.util.Scanner;

public class CExe5 {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++){
			boolean repeat = true;
			
			while (repeat){
				try {
					System.out.println("�������"+(i+1)+"������");
					num = input.nextInt();
					repeat = false;
				} 
				catch (Exception e) {
					System.out.println("����Ƿ����������룡");
					input = new Scanner(System.in);
					
				}					
			}
		}
		System.out.println("������ϣ�");
		System.out.println("������������£�");	
	}
}
