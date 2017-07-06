import java.util.Date;
import java.util.Scanner;

public class DVDDepot {
	static int DVDMAX; 						//最大DVD数量 仓库DVD总数
	private static int DVDsCount = 0; 		//当前DVD数量 当前DVD数量
	static DVD[] DVDarray;					//DVD类型数组 仓库全部DVD数据
	static int Index = 0;					//匹配ID下标
	
	/**
	 * 初始化正常模式DVD类型数组中的元素
	 * @param DVDarray 	DVD类型 数组名
	 * @param StartID 	开始的ID编号
	 * @param Amount 	需要初始化的元素数量
	 */
		 void initnormaldvds(int StartID, int Amount){

			for (int i = 0; i < Amount; i++){
				DVDarray[DVDsCount] = new DVD();
				//调用方法判断ID是否重复
				while(MatchID(StartID)){
					StartID++;
				}//while end
				DVDarray[DVDsCount].initnormal(StartID);
				StartID++;
				DVDsCount++;
				if (DVDsCount >= (DVDMAX))
					break;
			}//for end
		}//initnormaldvds end
	
	/**	
	 * 初始化随机模式DVD类型数组中的元素
	 * @param StartID 	开始的ID编号
	 * @param Amount 	需要初始化的元素数量
	 */
		 void initrandomdvds(int StartID, int Amount){
			for (int i = 0; i < Amount; i++){
				DVDarray[DVDsCount] = new DVD();
				//调用方法判断ID是否重复
				while(MatchID(StartID)){
					StartID++;
				}//while end
					DVDarray[DVDsCount].initrandom(StartID);
					StartID++;
				DVDsCount++;
				if (DVDsCount >= (DVDMAX))
					break;
			}//for end
		}//initrandomdvds end	
	
	/**
	 * 核对输入的ID参数是否与于DVD类型数组中元素的ID相同
	 * @param dvdid     要核对的ID编号
	 * @return 相同true 没有相同false
	 */
		 static boolean MatchID(int dvdid){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].ID == dvdid){
					result = true;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchID end
	
	/**
	 * 核对输入的Name参数是否与于DVD类型数组中元素的Name相同
	 * @param dvdid     要核对的Name名字
	 * @return 相同true 没有相同false
	 */
		 static boolean MatchName(String dvdname){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Name.equals(dvdname)){
					Index = i;
					result = true;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchName end
	
	/**
	 * 核对输入的Category参数是否与于DVD类型数组中元素的Name相同
	 * @param dvdcategory 	要核对的Category类别
	 * @return 相同true 没有相同false
	 */
		 static boolean MatchCategory(String dvdcategory){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Category.equals(dvdcategory)){
					result = true;
					Index = i;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchCategory end
		
	/**
	 * 核对输入的Nation参数是否与于DVD类型数组中元素的Name相同
	 * @param dvdnation 	要核对的Nation国家
	 * @return 相同true 没有相同false
	 */
		 static boolean MatchNation(String dvdnation){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Nation.equals(dvdnation)){
					result = true;
					Index = i;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchNation end
		
	/**
	 * 打印仓库标题
	 */
		 void ShowTitle(){
			DVD.ShowTitle();
		}//ShowTitle end
		
	/**
	 * 打印仓库内所有DVD信息
	 */
		 void ShowData(){
			for (int i = 0; i < DVDsCount; i++){
				DVDarray[i].ShowData();
			}//for end
			System.out.println();
		}//ShowData end
	
	/**
	 * 打印仓库当前状态;
	 */
		 void ShowDepotStatus(){
			 System.out.println("仓库当前状态"+DVDsCount+"/"+DVDMAX+"\t使用率："+((double)DVDsCount/DVDMAX*100.00)+"%");
		 }//ShowDepotStatus end
	
	/**
	 * 打印仓库所有信息 标题 数据 状态
	 */
		 void ShowDepotALL(){
			 ShowTitle();
			 ShowData();
			 ShowDepotStatus();	 
		 }
		 

/**
 * 增加DVD信息到DVD数据库
 */
	 static void AddDVD(){
		//DVD数据库已达上限
		if (DVDsCount >= DVDMAX){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("当前仓库DVD数量已达到上限,无法增加请先删除！");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}//if end
		//DVD数据库未达上限
		System.out.println("请输入要增加的DVD数据信息");
		//录入id
		System.out.print("请输入DVD的编号(整数)");
		Scanner input = new Scanner(System.in);
		int addid = input.nextInt();
		
		//判断是否存在DVD数据库中
			//编号存在
			if(MatchID(addid)){		
				System.out.println("编号为【"+addid+"】的DVD已存在");
				//打印与输入ID相关的DVD信息
				System.out.println("#################################################################################");
				DVD.ShowTitle();
				DVDarray[Index].ShowData();
				System.out.println();
				System.out.println("#################################################################################");
				System.out.println();
				input.close();
				return;
			}//if end
			
			//编号不存在,数据增加在末尾
				DVDarray[DVDsCount].ID = addid;				//更新编号为符合要求的输入值
				System.out.println("请输入DVD的名字(字符串)");	//录入名字
				String addname = input.next();
				DVDarray[DVDsCount].Name = addname;						//更新Name为输入值
				System.out.println("请输入DVD的类别(字符串)");	//录入类别
				String addcategory = input.next();						
				DVDarray[DVDsCount].Category = addcategory;				//更新类别
				System.out.println("请输入DVD的国家(字符串)");	//录入国家
				String addnation = input.next();						
				DVDarray[DVDsCount].Nation = addnation;					//更新国家
				System.out.println("请输入DVD的价格(整型)");	//录入价格
				int addprice = input.nextInt();
				DVDarray[DVDsCount].Price = addprice;					//更新价格
				DVDarray[DVDsCount].Status = false;						//初始化外借状态
				DVDarray[DVDsCount].Cdate = new Date();					//初始化创建时间
				DVDarray[DVDsCount].Odate = DVDarray[DVDsCount].Cdate;	//初始化创建时间
				DVDarray[DVDsCount].Idate = DVDarray[DVDsCount].Cdate;	//初始化创建时间
				DVDarray[DVDsCount].Times = 0;//初始化借出次数
			//DVD数量加1
				DVDsCount++;
				input.close();
			
	};
	 
}//Class DVDTest end

