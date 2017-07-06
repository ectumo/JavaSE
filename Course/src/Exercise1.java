/**
 * 
 */

/**
 *TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月14日 下午5:44:31
 */
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("请输入你需要打印的菱形高度多少行(>=3的奇数)：");
		Scanner input = new Scanner(System.in);
		int level = input.nextInt();
		/**
		 *让用户输入菱形的级别(行高)并判断直至用户输入的是>=3的奇数
		 */
		while (!(level%2!=0) || level < 3){
			System.out.println("输入错误请重新输入(>=3的奇数)：");
			level = input.nextInt();
		}
		System.out.println("请输入你打印时需要使用的图案符号:(可以是字母数字和可显符号)");
		String stars = input.next();
		char symbol = stars.charAt(0);
		System.out.println("你选择的级别是："+level+"你选择的打印图形的符号是："+symbol);
		/**
		 *根据输入的level级别打印菱形
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
		System.out.println("\t\t打印结束\n");
	}
}
