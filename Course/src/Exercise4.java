import java.util.Scanner;

/**
 * 
 */

/**
 * @Description:ʹ��forѭ���ڿ���̨��ӡ����ͼ��
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��15�� ����10:07:44
 */
public class Exercise4 {
	public static void main(String[] args) {
		System.out.println("����������Ҫ��ӡ��ͼ�θ߶ȶ�����(>=2����)��");
		Scanner input = new Scanner(System.in);
		int level = input.nextInt();
		/**
		 *���û������ӡ��ͼ�θ߶Ȳ��ж�ֱ���û��������>=2����
		 */
		while (level < 2){
			System.out.println("�����������������(>=2����)��");
			level = input.nextInt();
		}
		System.out.println("���������ӡʱ��Ҫʹ�õ�ͼ������:(��������ĸ���ֺͿ��Է���)");
		String stars = input.next();
		char symbol = stars.charAt(0);
		System.out.println("��ѡ��ļ����ǣ�"+level+"��ѡ��Ĵ�ӡͼ�εķ����ǣ�"+symbol);
		/**
		 *���������level�����ӡͼ��
		 */
		int i,j;
		for (i = 0; i < level; i++ ){
			System.out.print("\t\t");
			for (j = 0; j <= i; j++){
					System.out.print(symbol);
			}
			System.out.print("\n");
		}
		System.out.println("\t\t��ӡ����!\n");
	}
}