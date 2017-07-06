/**
 * @描述：课堂练习商品价格
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月14日 下午3:57:21
 */
import java.util.Scanner;

public class GoodsPrice {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统  > 购物结算");
		String menuchoice = "y";
		while (!menuchoice.equals ("n")){
//			System.out.println(menuchoice.equals ("n"));
			System.out.println("*******************************************");
			System.out.print("当前商品的编号：");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("*******************************************");
			System.out.print("请选择购买商品的编号：");
			int goodchoice = input.nextInt();
			System.out.println("选择的商品的编号："+goodchoice);
			switch(goodchoice){
			case 1:
				System.out.println("1.T恤\t￥245.00");
				break;
			case 2:
				System.out.println("2.网球鞋\t￥1245.00");
				break;
			case 3:
				System.out.println("3.网球拍\t￥3245.00");
				break;
			default:
				System.out.println("所选编号商品不存在");	
			}
			System.out.println("是否继续(y/n)");
			menuchoice = input.next();	
//			System.out.println("menchoice="+menuchoice);
//			System.out.println(menuchoice.equals ("n"));
		}
		System.out.println("程序结束！");
		
		
		
	}
}
