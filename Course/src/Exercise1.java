/**
 * 
 */

/**
 *TODO
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��14�� ����5:44:31
 */
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("����������Ҫ��ӡ�����θ߶ȶ�����(>=3������)��");
		Scanner input = new Scanner(System.in);
		int level = input.nextInt();
		/**
		 *���û��������εļ���(�и�)���ж�ֱ���û��������>=3������
		 */
		while (!(level%2!=0) || level < 3){
			System.out.println("�����������������(>=3������)��");
			level = input.nextInt();
		}
		System.out.println("���������ӡʱ��Ҫʹ�õ�ͼ������:(��������ĸ���ֺͿ��Է���)");
		String stars = input.next();
		char symbol = stars.charAt(0);
		System.out.println("��ѡ��ļ����ǣ�"+level+"��ѡ��Ĵ�ӡͼ�εķ����ǣ�"+symbol);
		/**
		 *���������level�����ӡ����
		 */
		int i,j;
		for (i = 0; i <= level; i++ ){
			System.out.print("\t\t");
			for (j = 0; j <= level; j++){
				if( i<=level/2 && j>=level/2-i && j<=level/2+i
						||i>=level/2 && j>=level/2+1+i-level && j<=level/2-1-i+level){
					System.out.print(symbol);
				}
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println("\t\t��ӡ����\n");
	}
}
