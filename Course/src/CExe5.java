/**
 * 
 */

/**
 *TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月17日 下午1:56:05
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
					System.out.println("请输入第"+(i+1)+"个数字");
					num = input.nextInt();
					repeat = false;
				} 
				catch (Exception e) {
					System.out.println("输入非法请重新输入！");
					input = new Scanner(System.in);
					
				}					
			}
		}
		System.out.println("输入完毕！");
		System.out.println("输入的数组如下！");	
	}
}
