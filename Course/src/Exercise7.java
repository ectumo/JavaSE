/**
 * 
 */

/**
 * @Description：现有鸡兔同笼，已知有24个头，60只脚，问，有多少只鸡，多少只兔，打印出
 * 所有的可能，如果没有，打印无解
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 上午10:08:11
 */
public class Exercise7 {
	public static void main(String[] args) {
		int RabbitsNums = 0;
		int ChickenNums = 0;
		int MatchedCount = 0;
		final int TatolNums = 24;
		final int TotalLegs = 60;
		
		for (RabbitsNums = 0; RabbitsNums <= TatolNums; RabbitsNums++){
			for (ChickenNums =TatolNums-RabbitsNums; ChickenNums <=TatolNums-RabbitsNums;ChickenNums++){
//				System.out.println("条件一\t兔子数量："+RabbitsNums+"鸡数量："+ChickenNums+"总数量："
//						+(RabbitsNums+ChickenNums));
//				System.out.println("条件二\t兔腿数量："+RabbitsNums*4+"鸡腿数量："+ChickenNums*2+"总腿数量："
//						+(RabbitsNums*4+ChickenNums*2));
//				System.out.println("#########################################################");
				if(RabbitsNums*4+ChickenNums*2==TotalLegs){
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("匹配成功：兔子"+RabbitsNums+"个鸡个"+ChickenNums);
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					MatchedCount++;
				}
			}		
		}
		if (MatchedCount == 0)
			System.out.println("给出的参数无解");
		else
			System.out.println("给出的参数有"+MatchedCount+"个解");		
	}
}
