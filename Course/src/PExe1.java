/**
 * 
 */

/**
 * @Description 运算量差异
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月16日 下午1:17:37
 */
public class PExe1 {
	public static void main(String[] args) {
		int i,j,k;
		long sum = 0;
		/**
		 * 运算量大
		 */
//		for (i = 0; i <= 1000000; i++){
//			for(j = 0; j <= 1000; j++){
//				for(k = 0; k <= 100; k++){
//					sum+=i+j+k;
//				}
//			}
//		}
		/**
		 * 运算量小
		 */
		for (i = 0; i <= 100; i++){
			for(j = 0; j <= 1000; j++){
				for(k = 0; k <= 100000; k++){
					sum+=i+j+k;
				}
			}
		}
	System.out.print("结果为："+sum);
	}
}
	
