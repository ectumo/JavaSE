/**
 * @Description:DVD租赁非完美版
 * 				未做任何输入验证
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月17日 下午4:40:27
 */
import java.util.*;

public class DVDRent {
		//DVD仓库最大数量
		final static int MAX = 100;
		//DVD仓库当前数量
		static int dvdcount = 0;
		//DVD编号
		static int [] dvdid = new int [MAX];
		//DVD名字
		static String[] dvdname = new String[MAX];
		//出借状态
		static boolean[] rentstatus = new boolean[MAX];
		//出借日期
		static int[] rentdate = new int[MAX];
		//出借次数
		static int[] renttimes = new int[MAX];
		
		
	public static void main(String[] args) {
		int choice=0; //菜单选项
		/**
		 * 菜单选择
		 */
		Scanner input = new Scanner (System.in);
		/**
		 * 进入菜单选项只要不选择退出一直循环
		 */
		while (choice != 6){
			dvdmenu();
			System.out.println("请根据菜单进行选择(1-6)");
			choice = input.nextInt();
			//输入错误退出 并打印输入错误，谢谢使用，再见！
			switch (choice){
			case 1:		//新增
				System.out.println("新增DVD");
				break;
			case 2:		//查看
				System.out.println("查看DVD");
				break;
			case 3:		//删除
				System.out.println("删除DVD");
				break;
			case 4:		//借出
				System.out.println("借出DVD");
				break;
			case 5:		//归还
				System.out.println("归还DVD");
				break;
			case 6:		//退出
				System.out.println("退出系统");
				break;	
			}
		}

	}


//显示菜单
static void dvdmenu(){
	System.out.println("DVD租借菜单");
	System.out.println("**************");
	System.out.println("* 1.新增DVD  **");
	System.out.println("* 2.查看DVD  **");
	System.out.println("* 3.删除DVD  **");
	System.out.println("* 4.借出DVD  **");
	System.out.println("* 5.归还DVD  **");
	System.out.println("* 6.退出系统       **");
	System.out.println("**************");
	
};
//查看
static void showdvd (){
	if (dvdcount == 0){
		System.out.println("当前仓库DVD数量为0,请先增加");
		return;
	}
	for (int i = 0; i < dvdcount; i++){
		System.out.print("编号"+dvdid[i]+"\t");
		System.out.print("名字"+dvdname[i]+"\t");
		System.out.print("状态"+rentstatus[i]+"\t");
		System.out.print("出借日期"+rentdate[i]+"\t");
		System.out.print("出借次数"+renttimes[i]+"\n");
	}
	return;	
};
static void adddvd (){
	
};
static void deldvd(){
	if (dvdcount == 0){
		System.out.println("当前仓库DVD数量为0,请先增加");
		return;
	}
	System.out.println("请选择要操作的DVD编号");
	
};
static void returndvd(){
	
};
static void exit(){
	
	System.out.println("感谢使用,程序退出");	
};

}