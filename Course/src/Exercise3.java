/**
 * @Description：输入一个正整数，将该数的各位左右反转输出，即输入123，输出321
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月14日 下午5:44:52
 */
import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		char letter;
		int i;
		int Strlength;
		System.out.println("请输入你需要逆序打印的字符串：");
		Scanner input = new Scanner(System.in);
		String Num = input.next();
		System.out.println("你输入的字符串为："+Num);
		Strlength = Num.length();
		System.out.println("字符串长度："+Strlength);
		System.out.print("逆序打印结果为：");
		for (i=Strlength-1;i>=0;i--){
			 letter = Num.charAt(i); 
			System.out.print(letter);			
		}
		System.out.print("\n打印结束\n");	
	}
}
