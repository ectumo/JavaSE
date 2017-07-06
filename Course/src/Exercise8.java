/**
 * 
 */

/**
 * @Description:
 * 	古典问题：有一对兔子，从出生后的3个月起，每个月生一对兔子，小兔子长到
 *	第三个月后又生了一对兔子，假如兔子都不死，每次生下来的兔子都是不同性别的
 *	问，一年中每个月的兔子个数是多少对？
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 下午1:21:42
 */
public class Exercise8 {
	public static void main (String[] args) {
		final int totalmonths = 12;
		
		long totalRibbits = 0;
		RibbitNums RNums = new RibbitNums();
		for (int i=1; i<=totalmonths; i++){
			totalRibbits = RNums.RibbitNums(i);
			System.out.println("第"+(i)+"个月的兔子总对数为："+totalRibbits);	
		}
	}
}
class RibbitNums {
	public long RibbitNums (long num){
		long result;
		result = num;
		if (result==0)
			return 0;
		if (result<=3)
			return 1;
		if (result > 3);
//			System.out.println("调用前result="+result);	
			result	= RibbitNums(result-1)+RibbitNums(result-3);
//			System.out.println("调用后result="+result);
			return result;
	}
}

	
