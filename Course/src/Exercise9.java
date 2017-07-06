/**
 * 
 */

/**
 *@Description：	求s=a+aa+aaa+aaaa+aa....aaa的值，其中a是用户输入的数字，例如2+22
 *				输入的数字必须是1-9
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 下午1:21:57
 */
import java.util.Scanner;
public class Exercise9 {
	public static void main(String[] args) {
		int InputNum;
		int OutputNum = 0;
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要进行累加的数字(1-9)中的一个我来负责累加打印");
		InputNum = input.nextInt();
		while (InputNum < 1 || InputNum > 9){
			System.out.println("输入错误请重新输入数字(1-9)中的一个");
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
