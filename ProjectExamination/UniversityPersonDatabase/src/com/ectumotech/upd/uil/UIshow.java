package com.ectumotech.upd.uil;

public class UIshow implements UI {

	private static Menu main;
	private static Menu subView;
	private static Menu subModify;
	private static Menu subSearch;
	private static Menu subOptionIndex;
	private static Menu subFunction;
	private static Menu subDownload;
	
	public Menu getMain() {
		return main;
	}
	public Menu getSubView() {
		return subView;
	}
	public Menu getSubModify() {
		return subModify;
	}
	public Menu getSubSearch() {
		return subSearch;
	}
	public Menu getSubOptionIndex() {
		return subOptionIndex;
	}
	public Menu getSubFunction() {
		return subFunction;
	}
	public Menu getSubDownload() {
		return subDownload;
	}
	public void showWelcome() {
		System.out.println("欢迎使用JAVA培训学员信息查询系统");
	}
	public void showUniversityInfo() {

	}

	public void showLogin() {

	}

	public void showLoginSuccess() {

	}
	public void shwoLoginFailure() {

	}

	public void showOperSuccess() {
		System.out.println("操作成功");
	}
	public void showOperFailure() {
		System.out.println("操作失败");
	}
	public void showExit() {
		System.out.println("感谢使用，2017ECTUMO-TECH");

	}

	public void showMenu(Menu menu) {
		menu.show();
	}

	public void showStuTitle() {
		System.out.format("%-5s\t%-10.10s\t%-20.20s\t%-8s\n", "学号", "学生姓名", "      所在班级", "状态");
	}

	public void showTeaTitle() {
		System.out.format("%-5s\t%-10.5s\t%-10.5s\n", "职工编号", "教师姓名", "状态");
	}

	public void showClassroomTitle() {
		System.out.format("%-12.12s\n", "班级名称");
	}

	public void showInputSID() {
		System.out.println("请输入学生学号");
	}
	public void showInputTID() {
		System.out.println("请输入教师工号");
	}
	public void showInputSName() {
		System.out.println("请输入学生姓名");
	}
	public void showInputTName() {
		System.out.println("请输入教师姓名");
	}
	public void showInputCID() {
		System.out.println("请输入班级编号");
	}
	
	
	public void showExistNoticeStuID(int ID) {
		System.out.println("输入的学生编号["+ID+"]已经存在！");
	}
	public void showExistNoticeTeaID(int ID) {
		System.out.println("输入的教师编号["+ID+"]已经存在！");
	}
	public void showExistNoticeCID(String ID) {
		System.out.println("输入的班级编号["+ID+"]已经存在！");
	}
	
	public void showMatchedID(String ID,int count) {
		System.out.println("找到编号为["+ID+"]的信息共"+count+"条记录");
	}
	public void showMatchedID(int ID,int count) {
		System.out.println("找到编号为["+ID+"]的信息共"+count+"条记录");
	}
	public void showUnMatchedID(String ID) {
		System.out.println("没有找编号["+ID+"]的信息,请核对后在操作");
	}
	public void showUnMatchedID(int ID) {
		System.out.println("没有找到编号["+ID+"]的信息,请核对后在操作");
	}
	public void showMatchedName(String name,int count) {
		System.out.println("找到姓名为["+name+"]的信息共"+count+"条记录");
	}
	public void showUnMatchedName(String name) {
		System.out.println("没有找到姓名为["+name+"]的信息,请核对后在操作");
	}
	public void showMatchedCID(String classRoomID,int count) {
		System.out.println("找到班级编号为["+classRoomID+"]的信息共"+count+"条记录");
	}
	public void showUnMatchedCID(String classRoomID) {
		System.out.println("没有找到班级编号为["+classRoomID+"]的信息,请核对后在操作");
	}

	public void showDeledID(String ID,int count) {
		System.out.println("删除了编号为["+ID+"]的信息共"+count+"条记录");
	}
	public void showDeledID(int ID,int count) {
		System.out.println("删除了编号为["+ID+"]的信息共"+count+"条记录");
	}
	public void showDeledName(String name,int count) {
		System.out.println("删除了姓名为["+name+"]的信息共"+count+"条记录");
	}
	public void showDeledCID(String classRoomID,int count) {
		System.out.println("删除了班级编号为["+classRoomID+"]的信息共"+count+"条记录");
	}

	
	
	
	
	public void initMenu() {
		MenuOption opback = new MenuOption(0, "返回上一层");
		MenuOption opexit = new MenuOption(0, "退出数据库");
		MenuOption opm1 = new MenuOption(1, "查看数据库信息");
		MenuOption opm2 = new MenuOption(2, "查询数据库信息");
		MenuOption opm3 = new MenuOption(3, "修改数据库信息");
		MenuOption opm4 = new MenuOption(4, "保存数据库信息");
		MenuOption opm5 = new MenuOption(5, "清空数据库信息");
		MenuOption opm6 = new MenuOption(6, "下载数据库信息");
		/**
		 * 主菜单
		 */
		main = new Menu(opm1, opm2, opm3, opm4, opm5, opm6, opexit);
		/**
		 * 查看子菜单
		 */
		MenuOption opsv1 = new MenuOption(1, "查看所有教师");
		MenuOption opsv2 = new MenuOption(2, "查看所有学生");
		MenuOption opsv3 = new MenuOption(3, "查看所有班级");
		subView = new Menu(opsv1, opsv2, opsv3, opback);
		
		/**
		 * 修改子菜单
		 */
		MenuOption opsm1 = new MenuOption(1, "新增教师");
		MenuOption opsm2 = new MenuOption(2, "辞退教师");
		MenuOption opsm3 = new MenuOption(3, "为教师指定授课班级");
		MenuOption opsm4 = new MenuOption(4, "新增学生");
		MenuOption opsm5 = new MenuOption(5, "劝退学生");
		MenuOption opsm6 = new MenuOption(6, "为学生分配班级");
		MenuOption opsm7 = new MenuOption(7, "新增班级");
		MenuOption opsm8 = new MenuOption(8, "解散班级");
		subModify = new Menu(opsm1, opsm2, opsm3, opsm4, opsm5, 
			opsm6, opsm7, opsm8, opback);
		/**
		 * 查询子菜单
		 */
		MenuOption opss1 = new MenuOption(1, "查询学生按编号");
		MenuOption opss2 = new MenuOption(2, "查询学生按名字");
		MenuOption opss3 = new MenuOption(3, "查询学生按班级");
		MenuOption opss4 = new MenuOption(4, "查询教师按编号");
		MenuOption opss5 = new MenuOption(5, "查询教师按名字");
	  //MenuOption opss6 = new MenuOption(6, "查询班级按编号");
		subSearch = new Menu(opss1, opss2, opss3, opss4, opss5, opback);
		
		/**
		 * 修改项目子菜单
		 */
		MenuOption opsoi1 = new MenuOption(1, "按编号");
		MenuOption opsoi2 = new MenuOption(2, "按名字");
		subOptionIndex = new Menu(opsoi1,opsoi2, opback);
		
		/**
		 * 指派班级功能子菜单
		 */
		MenuOption opsf1 = new MenuOption(1, "增加授课班级");
		MenuOption opsf2 = new MenuOption(2, "减少授课班级");
		subFunction = new Menu(opsf1,opsf2, opback);
		
		/**
		 * 下载子菜单
		 */
		MenuOption opsd1 = new MenuOption(1, "下载所有教师");
		MenuOption opsd2 = new MenuOption(2, "下载所有学生");
		MenuOption opsd3 = new MenuOption(3, "下载所有班级");
		subDownload = new Menu(opsd1, opsd2, opsd3, opback);
		
	}

}
