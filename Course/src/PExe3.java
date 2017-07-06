/**
 * 
 */

/**
 *TODO
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月16日 下午3:10:36
 */
public class PExe3 {
	public static void main(String[] args) {
		String stra = "aa@qq.com";
		String strb = "aa";
		String strc = ".com";
		String strd = "@";
//		System.out.println(stra.matches(strd));
//		System.out.println(stra.equals(strb));
		System.out.println(stra.endsWith(strc));
		System.out.println(stra.startsWith(strb));
		System.out.println(stra.contains(strd));


		
		
	}
}
