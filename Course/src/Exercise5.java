/**
 * @Description：  幸运猜猜猜：随机一个0-99的数字，然后让用户猜这个数字，用户输入后，游戏
 *               会提示太大还是太小，从而缩小结果范围，经过几次猜测和提示后，最终推出答案
 *               在游戏过程中，记录最终猜对时所使用的次数，游戏结束后公布结果
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 上午10:07:55
 */
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		int RanNum;
		int GuessNum;
		int Count = 1;
		System.out.println("这是一个猜数字的游戏,请输入一个0-99的数我来给出提示");
		RanNum = (int)(Math.random()*100);
		System.out.println("随机数是："+RanNum);
		Scanner input = new Scanner(System.in);
		System.out.println("当前第"+Count+"次猜测,");
		System.out.print("请输入你要猜测的数：");
		GuessNum = input.nextInt();
		
		while (GuessNum != RanNum){
			if(GuessNum > RanNum)
				System.out.println("输入的数"+GuessNum+"大了！");
			else if (GuessNum < RanNum)
				System.out.println("输入的数"+GuessNum+"小了！");
			else
				break;
			Count++;
			System.out.print("请继续猜测,");
			System.out.println("当前第"+Count+"次猜测");
			GuessNum = input.nextInt();
		}
		System.out.println("恭喜您猜对了!总共花了"+Count+"次");
	}
}
