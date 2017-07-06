/**
 * 
 */

/**
 * TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月16日 下午1:38:29
 */
import java.util.Scanner;

public class Pexe2 {
	public static void main(String[] args) {
		
		String quit;
		char exit = 'q';
		int nums;
		int i;
		Scanner input = new Scanner (System.in);
		nums = input.nextInt();
		quit = input.next();
//		while (quit.charAt(0)==exit)

		System.out.println(quit);
		System.out.println(nums);
		System.out.println(exit==quit.charAt(0));
		
	}
}
