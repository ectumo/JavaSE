/**
 * @Description��  ���˲²²£����һ��0-99�����֣�Ȼ�����û���������֣��û��������Ϸ
 *               ����ʾ̫����̫С���Ӷ���С�����Χ���������β²����ʾ�������Ƴ���
 *               ����Ϸ�����У���¼���ղ¶�ʱ��ʹ�õĴ�������Ϸ�����󹫲����
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����10:07:55
 */
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		int RanNum;
		int GuessNum;
		int Count = 1;
		System.out.println("����һ�������ֵ���Ϸ,������һ��0-99��������������ʾ");
		RanNum = (int)(Math.random()*100);
		System.out.println("������ǣ�"+RanNum);
		Scanner input = new Scanner(System.in);
		System.out.println("��ǰ��"+Count+"�β²�,");
		System.out.print("��������Ҫ�²������");
		GuessNum = input.nextInt();
		
		while (GuessNum != RanNum){
			if(GuessNum > RanNum)
				System.out.println("�������"+GuessNum+"���ˣ�");
			else if (GuessNum < RanNum)
				System.out.println("�������"+GuessNum+"С�ˣ�");
			else
				break;
			Count++;
			System.out.print("������²�,");
			System.out.println("��ǰ��"+Count+"�β²�");
			GuessNum = input.nextInt();
		}
		System.out.println("��ϲ���¶���!�ܹ�����"+Count+"��");
	}
}
