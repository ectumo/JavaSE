/**
 * @Description������һ�����������������ĸ�λ���ҷ�ת�����������123�����321
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��14�� ����5:44:52
 */
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		char letter;
		int i;
		int Strlength;
		System.out.println("����������Ҫ�����ӡ���ַ�����");
		Scanner input = new Scanner(System.in);
		String Num = input.next();
		System.out.println("��������ַ���Ϊ��"+Num);
		Strlength = Num.length();
		System.out.println("�ַ������ȣ�"+Strlength);
		System.out.print("�����ӡ���Ϊ��");
		for (i=Strlength-1;i>=0;i--){
			 letter = Num.charAt(i); 
			System.out.print(letter);			
		}
		System.out.print("\n��ӡ����\n");	
	}
}
