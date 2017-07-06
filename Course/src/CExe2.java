/**
 * 
 */

/**
 *TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 下午2:59:21
 */
public class CExe2 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		int count = 1;
		for (i = 1; i <= 10; i++){
			sum+=i;	
			if(sum > 20){
				System.out.println("第"+count+"个\t当前数为："+sum);
				count++;
			}
		}
		System.out.println("总数为："+(count-1));
	}	
}
