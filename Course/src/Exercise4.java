import java.util.Scanner;

/**
 * 
 */

/**
 * @Description:使用for循环在控制台打印以下图案
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 上午10:07:44
 */
public class Exercise4 {
	public static void main(String[] args) {
		System.out.println("请输入你需要打印的图形高度多少行(>=2的数)：");
		Scanner input = new Scanner(System.in);
		int level = input.nextInt();
		/**
		 *让用户输入打印的图形高度并判断直至用户输入的是>=2的数
		 */
		while (level < 2){
			System.out.println("输入错误请重新输入(>=2的数)：");
			level = input.nextInt();
		}
		System.out.println("请输入你打印时需要使用的图案符号:(可以是字母数字和可显符号)");
		String stars = input.next();
		char symbol = stars.charAt(0);
		System.out.println("你选择的级别是："+level+"你选择的打印图形的符号是："+symbol);
		/**
		 *根据输入的level级别打印图形
		 */
		int i,j;
		for (i = 0; i < level; i++ ){
			System.out.print("\t\t");
			for (j = 0; j <= i; j++){
					System.out.print(symbol);
			}
			System.out.print("\n");
		}
		System.out.println("\t\t打印结束!\n");
	}
}