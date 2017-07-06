/**
 * 
 */

/**
 *TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月15日 下午2:20:51
 */
public class CExe1 {
	public static void main(String[] args) {
		int i,j;
		int level = 5;
		for (i = 1; i <= 9; i++){
			for (j = 1; j <=i ;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}	
		System.out.print("\n");
		}
		
		System.out.print("\n\t\t图形1\n");
		for (i = 0; i < level; i++){
			System.out.print("\t");
			for (j = 0; j < level*2-i;j++){
				if(j<level-i)
					System.out.print("#");
				else
				System.out.print("*");
			}	
		System.out.print("\n");
		}
		System.out.print("\n\t\t图形2\n");
		for (i = 0; i < level; i++){
			System.out.print("\t");
			for (j = 0; j < level+i;j++){
				if(j<level-i-1)
					System.out.print("#");
				else
				System.out.print("*");
			}	
		System.out.print("\n");
		}
		System.out.print("\n\t\t图形3\n");
		for (i = 0; i < level; i++){
			System.out.print("\t");
			for (j = 0; j <level+i;j++){
				if(j<i)
					System.out.print("#");
				else
					System.out.print("*");
			}	
		System.out.print("\n");
		}	
	}
}
