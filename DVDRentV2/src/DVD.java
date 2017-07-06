import java.util.Date;
import java.text.SimpleDateFormat;

public class DVD {
	int ID;				//编号
	String Name;		//名字
	String Category;	//类别
	String Nation;		//国家
	boolean Status;		//出租状态
	int Price;			//租金
	Date Cdate;			//创建时间
	Date Odate;			//出库时间
	Date Idate;			//入库时间	
	int Times;			//出库次数
	/**
	 * 正常初始化,根据编号来创建数据
	 * @param dvdid DVD类型数据的ID
	 */
	
	void initnormal(int dvdid){
		ID = dvdid;
		Name = "未命名";
		Category = "未分类";
		Nation = "未确定";
		Status = true;
		Price = 0;
		Cdate = new Date();
		Odate = Cdate;
		Idate = Cdate;
		Times = 0;
	}
	
	/**
	 * 随机初始化,根据编号来创建随机数据
	 * @param dvdid DVD类型数据的ID
	 */
	void initrandom(int dvdid){	
		String [] str1 = {
				"骇客帝国全","潜艇风暴","绿野仙踪","指环王全","魔兽世界","变形金刚全",
				"霍比特人全","冰河世纪全","蓝精灵全","阿凡达","生死时速","蝴蝶效应",
				"速度与激情全","碟中谍全","银翼杀手","虎胆龙威全","007系列全","傲慢与偏见",
				"X战警全","金刚狼全","钢铁侠全","复仇者联盟全","教父","肖申克的救赎","辛德勒的名单",
				"公民凯恩","教父续集","卡萨布兰卡","七武士","星球大战全","美国美人","飞跃疯人院",
				"奇爱博士","卧虎藏龙","后窗","夺宝奇兵","非常嫌疑犯","记忆碎片","沉默的羔羊",
				"拯救大兵瑞恩","马耳他之鹰","阿甘正传","勇敢的心","角斗士","地心历险记",
				"异形系列全","宫崎骏系列全","机器人总动员","玩具总动员系列全","名侦探柯南剧场版全",
				"新海诚系列全","怪物史瑞克全","星际穿越","盗梦空间","蝙蝠侠系列","地球停转之日","泰坦尼克"};
		String [] str2 = {
				"武侠","犯罪","科幻","战争","恐怖","惊悚","记录片","西部","冒险","奇幻",
				"悬疑","动作","动画","喜剧","爱情","剧情","运动","战争","历史","其他"};
		String [] str3 = {
				"大陆","香港","台湾","美国","日本","韩国","法国","英国","德国","意大利",
				"加拿大","印度","俄罗斯","泰国","其他"};
		final int MAXPRICE = 10; 
		int index1,index2,index3,num1;
		index1 = (int) (Math.random()*str1.length);
		index2 = (int) (Math.random()*str2.length);
		index3 = (int) (Math.random()*str3.length);
		num1 = ((int) (Math.random()*MAXPRICE))*100;
		ID = dvdid;
		Name = str1[index1];
		Category = str2[index2];
		Nation = str3[index3];
		Status = true;
		Price = num1;
		Cdate = new Date();
		Odate = Cdate;
		Idate = Cdate;
		Times = 0;
	}
	
	/**
	 * 出库
	 */
	void Out(){ 
		Status = false;
		Odate = new Date();
		Times++;
	}
	
	/**
	 * 入库
	 */
	void In(){	
		Status = true;
		Idate = new Date();	
	}
	
	/**
	 * 打印标题
	 */
	static void ShowTitle(){	
		final String[] title = new String[] {
				"编号","名字","类别","国家","状态","租金",
				"创建日期","借出日期","归还日期","借出次数"}; 	//标题
		System.out.format("%-5s\t",title[0]);		//编号
		System.out.format("%-20s\t",title[1]);		//名字
		System.out.format("%-10s\t",title[2]);		//类别
		System.out.format("%-8s\t",title[3]);		//国家
		System.out.format("%-8s\t",title[4]);		//状态
		System.out.format("%-10s\t",title[5]);		//租金
		System.out.format("%-14s\t",title[6]);		//创建时间
		System.out.format("%-14s\t",title[7]);		//借出时间
		System.out.format("%-14s\t",title[8]);		//归还时间
		System.out.format("%-6s\n",title[9]);		//借出次数
	}
	
	/**
	 * 打印DVD数据
	 */
	void ShowData(){	
		final SimpleDateFormat DateFormat = 
				new SimpleDateFormat("yyyy-MM-dd"); //日期类型数据格式化 ("yyyy-MM-dd HH:mm:ss")
			System.out.format("%-5d\t",ID);			//打印编号
			System.out.format("%-20.10s\t",Name);	//打印名字
			System.out.format("%-10s\t",Category);	//打印类别
			System.out.format("%-8s\t",Nation);		//打印国家
		
		if (Status){
			System.out.format("%-8s\t","在库中");						//打印状态 库中
			if(Price==0)
				System.out.format("%-6.4s\t","免费");				//打印免费 租金为0
			else
				System.out.format("￥%-3.2f\t",(Price/100.00));		//打印租金
			System.out.format("[%10s]\t",DateFormat.format(Cdate));	//打印创建时间
			System.out.format("[%10s]\t","yyyy-MM-dd");				//打印外借为 格式化字符
			System.out.format("[%10s]\t",DateFormat.format(Idate));	//打印归还时间
		}	
		else{
			System.out.format("%-8s\t","已借出");						//打印状态 外借
			if(Price==0)
				System.out.format("%-6.4s\t","免费");				//打印免费 租金为0
			else
				System.out.format("￥%-3.2f\t",(Price/100.00));		//打印租金
			System.out.format("[%10s]\t",DateFormat.format(Cdate));	//打印创建时间
			System.out.format("[%10s]\t",DateFormat.format(Odate));	//打印外借时间
			System.out.format("[%10s]\t","yyyy-MM-dd");				//打印归还为 格式化字符
		}
		System.out.format("%-6d\n",Times);
	}
}
	
