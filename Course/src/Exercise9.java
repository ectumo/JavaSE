/**
 * 
 */

/**
 *@Description��	��s=a+aa+aaa+aaaa+aa....aaa��ֵ������a���û���������֣�����2+22
 *				��������ֱ�����1-9
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����1:21:57
 */
import java.util.Scanner;
public class Exercise9 {
	public static void main(String[] args) {
		int InputNum;
		int OutputNum = 0;
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ�����ۼӵ�����(1-9)�е�һ�����������ۼӴ�ӡ");
		InputNum = input.nextInt();
		while (InputNum < 1 || InputNum > 9){
			System.out.println("���������������������(1-9)�е�һ��");
			InputNum = input.nextInt();
		}
		System.out.print("Sum=");
		for (i = 0; i < InputNum; i++){
			for (j = InputNum-i; j <= InputNum; j++)
				System.out.print(InputNum);
		if(i != InputNum-1)
		System.out.print("+");	
		}			
	}
}
