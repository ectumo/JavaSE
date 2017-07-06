/**
 * 
 */

/**
 * @Descripion：求整数1-100的累加值，但要求跳过所有个位数为3的数
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月14日 下午5:44:42
 */
public class Exercise2 {
	public static void main(String[] args) {
		int NumsSum = 0;
		int i;
		for (i = 1; i <= 100; i++){
			if(i%10 != 3){
				NumsSum+=i;	
				System.out.println("当前"+i+"第个数为："+i+"累加后值为："+NumsSum);
			}		
		}
		System.out.println("计算结果为："+NumsSum);
		
	}
}
