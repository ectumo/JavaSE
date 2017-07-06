import java.util.Scanner;
public class DVDRentDepotStart {
	static Scanner input1 = new Scanner(System.in);
	public static void main(String[] args) {
		/**
		 * 进入DVD租赁系统
		 */
		System.out.println("欢迎使用DVD租赁系统@_@");
		/**
		 * 初始化仓库数据
		 */
		initDepot();	//调用方法初始化数据
		/**
		 * 进入DVD租赁系统操作菜单
		 */
		OperMenu();		//调用方法进入操作菜单
			
	}//main end

	
	/**
	 * 初始化仓库数据
	 */
	static void initDepot(){
		DVDDepot Depot = new DVDDepot();
		System.out.print("1.请输入DVD仓库的大小:");
		int DepotMAX = input1.nextInt();
		DVDDepot.DVDMAX = DepotMAX;
		DVDDepot.DVDarray = new DVD [DVDDepot.DVDMAX];
		System.out.print("2.请输入初始化DVD起始ID编号:");
		int StartID = input1.nextInt();
		System.out.print("3.请输入DVD仓库初始化的DVD数量:");
		int Amount = input1.nextInt();
		System.out.println("DVD仓库初始化完毕信息如下:");
		Depot.initrandomdvds(StartID, Amount); 		//调用方法初始化DVD仓库数据;
		Depot.ShowDepotALL();						//调用方法显示DVD仓库数据;	
	}
	
	/**
	 * 打印操作菜单
	 */
		 static void ShowOperMenu(){
			System.out.println();
			System.out.println("  DVD租借菜单");
			System.out.println("****************");
			System.out.println("* 1.初始化DVD库");
			System.out.println("* 2.查看库中DVD");
			System.out.println("* 3.删除库中DVD");
			System.out.println("* 4.借出库中DVD");
			System.out.println("* 5.归还DVD到库中");
			System.out.println("* 7.管理模式");
			System.out.println("* 0.退出系统 ");
			System.out.println("****************");
			System.out.println("请根据菜单进行选择(1-6)");
		}//ShowOperMenu end	
	
	/**
	 * 根据菜单操作仓库和数据
	 */
		static void OperMenu(){
			int choice = 1;
			
			
			System.out.println("请根据提示做出你的选择\n");
			while (choice != 0){	//只要不选择退出(输入0)一直循环
				ShowOperMenu();
				choice = input1.nextInt(); //菜单选项
				//输入错误退出 并打印输入错误，谢谢使用，再见！
				switch (choice){
				case 0:		//退出
					System.out.println("退出系统");
					break;
				case 1:
					System.out.println("重新初始化数据");
					initDepot();
					break;
				case 2:		//新增
					System.out.println("新增DVD");
					DVDDepot.AddDVD();
					break;
				case 3:		//查看
					System.out.println("查看DVD");
					//ShowDVD();
					break;
				case 4:		//删除
					System.out.println("删除DVD");
					//DelDVD();
					break;
				case 5:		//借出
					System.out.println("借出DVD");
					//RentDVD();
					break;
				case 6:		//归还
					System.out.println("归还DVD");
					//ReturnDVD();
					break;
				case 7:		//退出
					System.out.println("退出系统");
					//exit();
					break;	
				default:
					System.out.println("输入选项不存在请重新输入");
					break;
				}//switch end				
			}//while end			
		}//OperMenu end
	
	
}//DVDRentDepotStart end
