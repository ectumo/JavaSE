/**
 * 
 */

/**
 * @Description：实现人机猜拳的效果，用户输入“石头”，“剪刀”，“布”，并随机产生电脑出的拳
 *				 并做比较，判断用户的输赢或者打成平手
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 上午10:08:04
 */
import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		int RanNum = -1;
		int ManNum = -2;
		int Result = 1;
		Scanner input = new Scanner(System.in);
		
		while (Result != 2){
			RanNum = ((int)(Math.random()*100))%3+1;
			//System.out.println("随机数为："+RanNum);
			System.out.println("请输入你的选择1:剪刀\t2:石头\t3:布!");
			ManNum = input.nextInt();
			while (ManNum < 1 || ManNum > 3){
				System.out.println("输入的数值不符合要求请重新输入(1-3)");
				System.out.println("请输入你的选择1:剪刀\t2:石头\t3:布!");
				ManNum = input.nextInt();
			}
			if (ManNum == RanNum){
				Result = 1;	//平局
			}	
			else if (ManNum>RanNum){
				if(ManNum-RanNum == 1)
					Result = 2; //你赢了
				else
					Result = 3; //你输了	
			}
			else{
				if(RanNum-ManNum == 1)
					Result = 2; //你输了
				else
					Result = 3; //你赢了
			}
			switch (Result){
			case 1:
				System.out.println("打成平局");
				break;
			case 2:
				System.out.println("恭喜你,赢了！");
				break;
			case 3:
				System.out.println("你输了,请继续 ！");
				break;	
			}
		}
	}
}
