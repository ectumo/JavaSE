/**
 * @Description:DVD租赁非完美版
 * 				未做任何输入验证
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月17日 下午4:40:27
 */
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class DVDRent {
		/**
		 * 全局变量
		 */
		//DVD仓库最大数量
		final static int DVDMAX = 10; 	//数据数量(行) 数组的最大条数
		final static int DATAS = 5; 	//数据类别(列) 数组的最大类别
		final static int ID = 0;		//DVD编号字段 下标
		final static int NAME = 1;		//DVD名字字段 下标
		final static int STATUS = 2;	//DVD外借状态字段 下标
		final static int DATE = 3;		//DVD外借时间字段 下标
		final static int TIMES = 4;		//DVD外借次数字段 下标
		
		
		//DVD仓库当前数量
		static int dvdcount = 0;
		static int[][] dvds = new int [DVDMAX][DATAS];		//用于存放DVD的信息
		static String[] dvdnames = new String[DVDMAX];			//用于存放DVD名字字符串 长度预设40		
		static Date[] rentdate = new Date[DVDMAX];			//用于存放日期类型
		static String[] title = new String[] {"编号","DVD名字","状态","借出日期","借出次数"}; 	//标题
		static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		//日期类型数据格式化
		static Scanner input = new Scanner (System.in);
		static int addid;		//增加DVD时临时ID
		static String addnames;	//增加DVD时临时名字
		
		
		/**
		 * 程序入口
		 */
		public static void main(String[] args){
			/**
			 * 进入菜单选项
			 */
			int choice=0; //菜单选项
			InitDVD();	//调用方法初始化DVD仓库数据;
			System.out.println("欢迎使用DVD租赁系统，请根据提示做出你的选择\n");
			while (choice != 6){	//只要不选择退出(输入6)一直循环
				DVDMenu();
				System.out.println("请根据菜单进行选择(1-6)");
				choice = input.nextInt();
				//输入错误退出 并打印输入错误，谢谢使用，再见！
				switch (choice){
				case 1:		//新增
					//System.out.println("新增DVD");
					AddDVD();
					break;
				case 2:		//查看
					//System.out.println("查看DVD");
					ShowDVD();
					break;
				case 3:		//删除
					//System.out.println("删除DVD");
					DelDVD();
					break;
				case 4:		//借出
					//System.out.println("借出DVD");
					RentDVD();
					break;
				case 5:		//归还
					//System.out.println("归还DVD");
					ReturnDVD();
					break;
				case 6:		//退出
					//System.out.println("退出系统");
					exit();
					break;	
				default:
					System.out.println("输入选项不存在请重新输入");
					break;
				}
			}
		}


/**
 * 打印菜单
 */
	static void DVDMenu(){
		System.out.println();
		System.out.println("  DVD租借菜单");
		System.out.println("****************");
		System.out.println("* 1.新增DVD   **");
		System.out.println("* 2.查看DVD   **");
		System.out.println("* 3.删除DVD   **");
		System.out.println("* 4.借出DVD   **");
		System.out.println("* 5.归还DVD   **");
		System.out.println("* 6.退出系统  **");
		System.out.println("****************");	
	};

/**
 * 初始化DVD仓库
 */
	static void InitDVD(){
		int [] data1 = {1,0,0,0,4};
		int [] data2 = {2,1,0,1,5};
		int [] data3 = {3,2,0,2,6};
		int [] data4 = {4,3,1,3,7};
		int [] data5 = {5,4,1,4,8};
		int [] data6 = {6,5,1,5,9};
		int [] data7 = {7,6,1,6,10};
		dvds[0] = data1;
		dvds[1] = data2;
		dvds[2] = data3;
		dvds[3] = data4;
		dvds[4] = data5;
		dvds[5] = data6;
		dvds[6] = data7;
		dvdnames[0] = "神秘幻影";
		dvdnames[1] = "网络惊魂";
		dvdnames[2] = "战争游戏";
		dvdnames[3] = "天才除草人";
		dvdnames[4] = "网络上身";
		dvdnames[5] = "硅谷传奇";
		dvdnames[6] = "第十三层";
		try {
			rentdate[0] = dateFormat.parse("2017-06-11 11:11:11");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[1] = dateFormat.parse("2017-06-12 12:12:12");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[2] = dateFormat.parse("2017-06-13 13:13:13");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[3] = dateFormat.parse("2017-06-14 14:14:14");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[4] = dateFormat.parse("2017-06-15 15:15:15");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[5] = dateFormat.parse("2017-06-16 16:16:16");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			rentdate[6] = dateFormat.parse("2017-06-17 17:17:17");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		dvdcount = 7;
	};

/**
 * 格式化标题及数据
 */
	//格式化标题
	static void FormatTitle(){
		for (int i = 0; i < DATAS; i++){	//调用方法打印标题
			if(i==ID)
				System.out.format("%-5s\t",title[i]);	
			else if(i==NAME)
				System.out.format("%-14s\t",title[i]);	
			else if(i==STATUS)
				System.out.format("%-8s\t",title[i]);	
			else if(i==DATE)
				System.out.format("%-19s\t",title[i]);
			else 
				System.out.format("%-6s\t",title[i]);				
		}
		System.out.println();	
	};

	//格式化数据
	static void FormatData(int i){
		for (int j = 0; j < DATAS; j++ ){
			if(j == ID)
				System.out.format("%-5d\t",dvds[i][j]);	//打印int类型数据 借出次数
			else if(j == NAME)
				System.out.format("%-14s\t",dvdnames[dvds[i][j]]);	//打印String类型 DVD名字
			else if (j== STATUS){
				if (dvds[i][j] == 0)
					System.out.format("%-8s\t","在库中");
				else
					System.out.format("%-8s\t","已借出");
			}
			else if(j == DATE)	
				if(dvds[i][2] != 0)
					try{
						System.out.format("[%19s]\t ",dateFormat.format(rentdate[dvds[i][j]]));	//打印日期类型数据 借出日期
						}
					catch(Exception e){
					}
				else
					System.out.format("[%19s]\t ","yyyy-MM-dd HH:mm:ss");
			else
				System.out.format("  %-6d\t",dvds[i][j]);	//打印int类型数据 借出次数
		}
	};
	
/**
 * 查看DVD数据库中的全部信息
 */
	static void ShowDVD(){
		/**
		 * 判断库中是否存在DVD
		 */
		if (dvdcount == 0){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("当前仓库DVD数量为0,请先增加!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;	
		}
		/**
		 * 存在DVD 打印DVD信息
		 */
		System.out.println("#################################################################################");
			FormatTitle();	//调用方法打印格式化后的标题
	
		for (int i = 0; i < dvdcount; i++){ 
			FormatData(i);	//调用方法打印格式化后的每一列数据
		System.out.println();	
		}
		System.out.println("#################################################################################");
		System.out.println("仓库当前状态"+dvdcount+"/"+DVDMAX+"\t使用率："+((double)dvdcount/DVDMAX*100.00)+"%");
		return;	
	};

/**
 * 增加DVD信息到DVD数据库
 */
	static void AddDVD(){
		//DVD数据库已达上限
		if (dvdcount >= DVDMAX){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("当前仓库DVD数量已达到上限,无法增加请先删除！");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		//DVD数据库未达上限
		System.out.println("请输入要增加的DVD数据信息");
		//录入id
		System.out.print("请输入DVD的编号(整数)");
		addid = input.nextInt();
		//判断是否存在DVD数据库中
		for (int i = 0; i < dvdcount; i++){
		//编号存在
			if(dvds[i][ID] == addid){
				System.out.println("编号为【"+addid+"】的DVD已存在");
				//打印与输入ID相关的DVD信息
				System.out.println("#################################################################################");
				FormatTitle();
				FormatData(i);
				System.out.println();
				System.out.println("#################################################################################");
				System.out.println();
				return;
			}
		}
		//编号不存在
			//录入编号
				dvds[dvdcount][ID] = addid;	//数据增加在末尾
			//录入名字
				System.out.println("请输入DVD的名字(字符串)");
				addnames = input.next();
				dvdnames[dvdcount] = addnames;		//name增加进name数组
			dvds[dvdcount][NAME] = dvdcount;		//在dvds数组中存入对应的index编号
			//初始化外借状态
				dvds[dvdcount][STATUS] = 0;
			//初始化外借日期 
				rentdate[dvdcount] = new Date();
				//System.out.println(rentdate[dvdcount+1]);
				dvds[dvdcount][DATE] = dvdcount;
			//初始化借出次数	
				dvds[dvdcount][TIMES] = 0;
			//DVD数量加1
				dvdcount++;
	};
		
/**
 * 从DVD数据库中删除符合要求的DVD信息
 */
	static void DelDVD(){
		//DVD数据库为空
		if (dvdcount == 0){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("当前仓库DVD数量为0,请先增加!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		//DVD数据库有数据
		System.out.println("请选择要操作的DVD编号");{
			int id = input.nextInt();
			int i,j;
			int index =-1; //用于存放临时交换用的二维数组DVDS的下标。
		
			for (i = 0; i < dvdcount; i++){
				if (id == dvds[i][ID]){
					index = i;
					break;
				}
			}
			if (index != -1 ){
				if (dvds[index][STATUS] == 1){
					System.out.println("编号为["+id+"]的DVD已借出,请核对后再操作！");
					//打印与输入ID相关的DVD信息
					System.out.println("#################################################################################");
					FormatTitle();
					FormatData(index);
					System.out.println();
					System.out.println("#################################################################################");
					System.out.println();
				}
				else{	
					System.out.println("找到并删除了编号为【"+id+"】的DVD");
					//打印与输入ID相关的DVD信息
					System.out.println("#################################################################################");
					FormatTitle();
					FormatData(index);
					System.out.println();
					System.out.println("#################################################################################");
					System.out.println();
					//将对应ID下标的DVD信息换为该DVD后一个DVD的信息 并将DVD数减去1
					for(j = index; j < dvdcount-1;j++){
						//System.out.format("%s,%s\n",dvds[j],dvds[j+1]); //测试代码
						dvdnames[j] = dvdnames[(j+1)];
						rentdate[j] = rentdate[(j+1)];
						dvds[j] = dvds[(j+1)];
						dvds[j][NAME] = j;
						dvds[j][DATE] = j;
						//System.out.format("%s,%s\n",dvds[j],dvds[j+1]); //测试代码
					}
					dvdcount--;	//当前DVD数减1
					System.out.println("删除后的DVD信息表如下");
					ShowDVD();
				}
			}			
			else
				System.out.println("未找到编号为["+id+"]的DVD,请核对后再操作！");
		}	
	};

/**
 * 借出DVD	
 */
	static void RentDVD(){
		int count = dvdcount;
		int rentid;
		int rentindex = -1;
		for (int i = 0; i < dvdcount; i++){
			if(dvds[i][STATUS] == 1)
				count--;
		}
		if (count < 1){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("所有DVD均已借出,请等待归还或新增DVD！");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		System.out.println("当前可外借数为("+count+")请输入要外借的DVD编号:");
			rentid = input.nextInt();
		for (int i = 0; i < dvdcount; i++){
			if (rentid == dvds[i][ID]){	//找到id
				rentindex = i;			//找到后记录下标
				break;
			}
		}
		if(rentindex == -1){	//没找到
			System.out.println("输入的DVD编号:【"+rentid+"】未查询到,请核对后再继续操作！");
			return;
		}
		if (dvds[rentindex][STATUS] == 0){			//找到了可外借	
		dvds[rentindex][STATUS] = 1;				//更新状态为已借出
			dvds[rentindex][TIMES]++;				//外借次数加1	
			rentdate[rentindex] = new Date();		//更新外借时间
			return;
		}
		System.out.println("编号为：【"+rentid+"】的DVD已经外借,无法外借！");
		//打印与输入ID相关的DVD信息
		System.out.println("#################################################################################");
		FormatTitle();
		FormatData(rentindex);
		System.out.println();
		System.out.println("#################################################################################");
		System.out.println();
	};
	
/**
 * 归还DVD	
 */
	static void ReturnDVD(){
		int count = dvdcount;
		int returnid;
		int rentindex = -1;
		for (int i = 0; i < dvdcount; i++){
			if(dvds[i][STATUS] == 0)
				count--;
		}
		if (count < 1){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("所有DVD在库中,无法归还请核对后再操作！");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		System.out.println("当前可归还数为("+count+")请输入要归还的DVD编号:");
		returnid = input.nextInt();
		for (int i = 0; i < dvdcount; i++){
			if (returnid == dvds[i][ID]){	//找到id
				rentindex = i;				//找到后记录下标
				break;
			}
		}
		if(rentindex == -1){	//没找到
			System.out.println("输入的DVD编号:【"+returnid+"】未查询到,请核对后再继续操作！");
			return;
		}
		if (dvds[rentindex][STATUS] == 1){			//找到了可归还
			dvds[rentindex][STATUS] = 0;			//更新状态为在库中
			return;
		}
		System.out.println("编号为：【"+returnid+"】的DVD已在库中,无法归还！");
		//打印与输入ID相关的DVD信息
		System.out.println("#################################################################################");
		FormatTitle();
		FormatData(rentindex);
		System.out.println();
		System.out.println("#################################################################################");
		System.out.println();
	};

/**
 * 退出DVD系统	
 */
	static void exit(){	
		System.out.println("感谢使用,程序退出");	
	};

}//class结尾
	


