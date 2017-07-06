/**
 * 
 */

/**
 * @Description:数组练习
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月16日 下午3:47:37
 */
import java.util.Scanner;

public class CExe4 {
	public static void main(String[] args) {
		final int ArrScoLen = 100;
		double ArrScores[] = new double[ArrScoLen];
		double SumNums = 0;
		int ArrLen = 0;
		boolean repeat = true;
		Scanner input = new Scanner(System.in); 
		while (repeat && ArrLen <= 100){
			
			try {
				System.out.print("请输入第"+(ArrLen+1)+"个分数");
				ArrScores[ArrLen] = input.nextDouble();
				ArrLen++;
			} catch (Exception e) {
				System.out.println("输入数据错误,录入结束！");// TODO: handle exception
				repeat = false;
			}
		}
		for (int i = 0; i<ArrLen-1;i++){	
			SumNums+=(ArrScores[i]*100.0); 
			System.out.println("分数数组["+i+"]元素值为"+ArrScores[i]+"总分为"+SumNums/100);
		}
	}
}
