/**
 * @Description：课堂练习一
 * @author 朱林 ectumo
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月14日 上午9:08:59
 */
import java.util.Scanner;

public class Train {


	public static void main (String[] args){
//		System.out.println("请输入你的会员卡号");
//
//	Scanner Input1 = new Scanner(System.in);
//	int VipNo = Input1.nextInt ();
//	System.out.println("您的会员卡号为:"+VipNo);
//	int Numbit1 = VipNo%10;
//	int Numbit2 = VipNo/10%10;
//	int Numbit3 = VipNo/100%10;
//	int Numbit4 = VipNo/1000%(10+1);
//	System.out.print("千位数："+Numbit4+"百位数："+Numbit3+"十位数："+Numbit2+"个位数："+Numbit1+"\n");
//	System.out.print("会员卡号："+VipNo+"所有位数之和为："+(Numbit4+Numbit3+Numbit2+Numbit1));
	
//	
	
		System.out.println("请输入你的会员卡号");
		Scanner InputVIPCardNo = new Scanner(System.in);
		int VIPCardNo = InputVIPCardNo.nextInt();
		System.out.println("你的会员卡号是："+VIPCardNo);
		int PrizeCode = (int)(Math.random()*10);
		int Numbit3 = VIPCardNo%1000/100;
		int i = 1;
		while (Numbit3 != PrizeCode){

				System.out.println("第"+i+"个中奖号为："+PrizeCode);
				System.out.println("很遗憾本次没有中奖 感谢你的参与！");
				PrizeCode = (int)(Math.random()*10);
				i++;
		}
		System.out.println("第"+i+"个中奖号为："+PrizeCode);
		System.out.println("恭喜编号为"+VIPCardNo+"的用户，你中奖了！");
		if(i == 1){
			System.out.println("运气逆天,一次就中奖了！");
		}else if(i <= 3){
			System.out.println("运气不错！");
		}else if (i <= 10){
			System.out.println("运气一般！");
		}
		else{
			System.out.println("买块豆腐撞死吧！");
		}
	}
}
