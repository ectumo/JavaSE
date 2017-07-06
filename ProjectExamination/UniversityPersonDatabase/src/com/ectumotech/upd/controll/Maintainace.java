package com.ectumotech.upd.controll;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.ectumotech.upd.modell.Checked;
import com.ectumotech.upd.modell.ClassRoom;
import com.ectumotech.upd.modell.Datum;
import com.ectumotech.upd.modell.FileOperForDatum;
import com.ectumotech.upd.modell.Student;
import com.ectumotech.upd.modell.Teacher;
import com.ectumotech.upd.uil.UIshow;



public class Maintainace {
	Datum database;
	UIshow UI;
	
	public Datum getDatum() {
		return database;
	}
	public Maintainace() {
		super();
	}
	public void setDatum(Datum datum) {
		this.database = datum;
	}
	public UIshow getuIshow() {
		return UI;
	}
	public void setuIshow(UIshow uIshow) {
		this.UI = uIshow;
	}
	
	/**
	 * 增加学生 
	 */
	public void addStuData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		boolean status = true;
		if (database.CheckedSID(id)!=-1) {	//ID限制不能重复
			UI.showOperFailure(); 
			UI.showExistNoticeStuID(id);	 
		}else {
			UI.showInputSName();
			String name = input.next();
			ClassRoom room = new ClassRoom();
			Student student = new Student(id,name,true);
			database.addStu(student);
		}	
	}
	/**
	 * 增加老师
	 */
	public void addTeaData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		boolean status = true;
		if (database.CheckedTID(id)!=-1) {	//ID限制不能重复
			UI.showOperFailure(); 
			UI.showExistNoticeTeaID(id);	 
		}else {
			UI.showInputTName();
			String name = input.next();
			Teacher teacher = new Teacher(id,name,true);
			database.addTea(teacher);
		}
	}	
	/**
	 * 增加班级
	 */
	public void addClassRoomData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String ID = input.next();
		boolean status = true;
		if (database.CheckedCID(ID)!=-1) {	//ID限制不能重复
			UI.showOperFailure(); 
			UI.showExistNoticeCID(ID);	 
		}else {
			ClassRoom room = new ClassRoom(ID);
			database.addClassRoom(room);
		}
	}
	
	/**
	 * 查找学生按学生编号
	 */
	public void searchStuByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
	
		ArrayList<Student> tempID;
		tempID = database.searchSId(id);
		if (tempID == null) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedID(id, tempID.size());
			database.showStudent(tempID);
		}
	}
	/**
	 * 查找学生按学生姓名
	 */	
	public void searchStuByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSName();
		String name = input.next();
		ArrayList<Student> tempName;
		tempName = database.searchSName(name);
		if (tempName == null) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedName(name, tempName.size());
			database.showStudent(tempName);
		}
	}
	/**
	 *查找学生按班级编号 	
	 */
	public void searchStuByCroom() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String room = input.next();
		ArrayList<Student> tempRoom;
		tempRoom = database.searchSClassRoom(room);
		if (tempRoom == null) {
			UI.showOperFailure();
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedCID(room, tempRoom.size());
			database.showStudent(tempRoom);
		}
	}
	/**
	 * 查找教师按教师编号
	 */	
	public void searchTeaByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		ArrayList<Teacher> tempTID;
		tempTID = database.searchTId(id);
		if (tempTID == null) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedID(id, tempTID.size());
			database.showTeacher(tempTID);
		}
	}
	/**
	 * 查找教师按教师姓名
	 */	
	public void searchTeaByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTName();
		String name = input.next();
		ArrayList<Teacher> tempTName;
		tempTName = database.searchTName(name);
		if (tempTName == null) {
			UI.showUnMatchedName(name);
		}
		else {
			UI.showMatchedName(name, tempTName.size());
			database.showTeacher(tempTName);
		}
	}
	/**
	 * 查询班级 按编号
	 */
	public void searchClassRoomByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String room = input.next();
		ArrayList<Student> tempSRoom;
		ArrayList<Teacher> tempTRoom;
		//打印和班级有关的学生信息
		tempSRoom = database.searchSClassRoom(room);
		if (tempSRoom == null) {
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showMatchedCID(room, tempSRoom.size());
			//database.showStudent(tempSRoom);//打印全部信息
		}
		//打印和班级有关的老师信息
		tempTRoom = database.searchTClassRoom(room);
		if (tempSRoom == null) {
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showMatchedCID(room, tempTRoom.size());
			//database.showTeacher(tempTRoom);//打印全部信息
			//
		}
	}

	
	
	/**
	 * 删除学生 按学生编号 人工录入
	 */
	public void delStuByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		int count = database.delSID(id);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledID(id, count);	
		}
	}
	/**
	 * 删除学生 按学生姓名 人工录入
	 */
	public void delStuByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSName();
		String name = input.next();
		int count = database.delSName(name);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledName(name, count);
		}
	}
	
	/**
	 * 删除教师 按教师编号 人工录入
	 */
	public void delTeaDataByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		int count = database.delTID(id);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledID(id, count);	
		}
	}
	/**
	 * 删除教师 按教师姓名 人工录入
	 */
	public void delTeaDataByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTName();
		String name = input.next();
		int count = database.delTName(name);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledName(name, count);
		}
	}
	
	/**
	 * 删除班级 按班级班级编号 人工录入
	 */
	public void delClassRoomData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String ID = input.next();
		int count = database.delCID(ID);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedCID(ID);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledCID(ID, count);
		}
		
	}

	
	
	/**
	 * 学生分配班级 按学生编号 根据学生编号和教室 人工录入
	 */
	public void arrangeStuByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexS = database.CheckedSID(id);
		if (indexS == -1)
				UI.showUnMatchedID(id);
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
				
			else {
				database.getStudents().get(indexS).setRoom(database.getClassRooms().get(indexC));
				UI.showOperSuccess();
			}
		}
	}	
	/**
	 * 学生分配班级 按学生名字 根据 学生名字和教室 人工录入
	 */
	public void arrangeStuByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexS = database.CheckedSName(name);
		if (indexS == -1)
				UI.showUnMatchedName(name);
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				database.getStudents().get(indexS).setRoom(database.getClassRooms().get(indexC));
				UI.showOperSuccess();
			}
		}
	}
	
	/**
	 * 增加教师授课班级 按教师编号  根据 教师编号和教室 人工录入
	 */
	public void arrangeAddTeaByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexT = database.CheckedTID(id);
		if (indexT == -1) {
				UI.showUnMatchedID(id);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				boolean result = true;
				for (int i = 0; i < database.getTeachers().get(indexT).getClassroom().size();i++) {
					if(database.getTeachers().get(indexT).getClassroom().get(i).getID().equals(ID)) {
						UI.showOperFailure();
						System.out.println("要安排的班级已存在该教师的安排表中");
						result = false;
						break;
					}
				}
				if(result) {
				ClassRoom temproom = database.getClassRooms().get(indexC);
				database.getTeachers().get(indexT).getClassroom().add(temproom);
				UI.showOperSuccess();
				}	
			}
		}
	}
	/**
	 * 增加教师授课班级 按教师名字  根据 教师名字和教室 人工录入
	 */
	public void arrangeAddTeaByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexT = database.CheckedTName(name);
		if (indexT == -1) {
				UI.showUnMatchedName(name);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				boolean result = true;
				for (int i = 0; i < database.getTeachers().get(indexT).getClassroom().size();i++) {
					if(database.getTeachers().get(indexT).getClassroom().get(i).getID().equals(ID)) {
						UI.showOperFailure();
						System.out.println("要安排的班级已存在该教师的安排表中");
						result = false;
						break;
					}
				}
				if(result) {
				ClassRoom temproom = database.getClassRooms().get(indexC);
				database.getTeachers().get(indexT).getClassroom().add(temproom);
				UI.showOperSuccess();
				}	
			}
		}
	}
	
	/**
	 * 删除教师授课班级 按教师编号  根据 教师编号和教室 人工录入
	 */
	public void arrangeDelTeaByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexT = database.CheckedTID(id);
		if (indexT == -1) {
				UI.showUnMatchedID(id);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			int count = 0;
			String ID = input.next();
			for (int i = 0; i < database.getTeachers().size(); i++) {
				for (int j = 0; j < database.getTeachers().get(i).getClassroom().size();j++) {
					if(database.getTeachers().get(i).getClassroom().get(j).getID().equals(ID)) {
						database.getTeachers().get(i).getClassroom().remove(j);
						count++;
					}
				}
			}
			if(count == 0){
				UI.showOperFailure();
				UI.showUnMatchedCID(ID);
			}
			else {
				UI.showMatchedCID(ID, count);
				UI.showOperSuccess();
			}
		}
	}
	/**
	 * 删除教师授课班级 按教师名字  根据 教师名字和教室 人工录入
	 */
	public void arrangeDelTeaByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexT = database.CheckedTName(name);
		if (indexT == -1) {
				UI.showUnMatchedName(name);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			int count = 0;
			String ID = input.next();
			for (int i = 0; i < database.getTeachers().size(); i++) {
				for (int j = 0; j < database.getTeachers().get(i).getClassroom().size();j++) {
					if(database.getTeachers().get(i).getClassroom().get(j).getID().equals(ID)) {
						database.getTeachers().get(i).getClassroom().remove(j);
						count++;
					}
				}
			}
			if(count == 0){
				UI.showOperFailure();
				UI.showUnMatchedCID(ID);
			}
			else {
				UI.showMatchedCID(ID, count);
				UI.showOperSuccess();
			}
		}
	}

	
	/**
	 * 主菜单选择跳转控制
	 */
	public void choiceMain() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getMain());	//显示主菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//退出数据库
				UI.showExit();
				choice = false;
				break;
			case 1:					//查看数据库信息
				choiceSubview();
				break;
			case 2:					//查询数据库信息
				choiceSubSearch();
				break;
			case 3:					//修改数据库信息
				choiceSubModify();
				break;
			case 4:					//保存数据库信息
				anyKeytoContinue();
				break;
			case 5:					//清空数据库信息
				anyKeytoContinue();
				break;
			case 6:					//下载数据库信息
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-6");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 查看子菜单选择跳转控制
	 */
	public void choiceSubview() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) {
			UI.showMenu(UI.getSubView());	//显示查看子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:							//返回上一层
				choice = false;
				break;
			case 1:							//查看所有教师
				 database.showTeacher();;
				 anyKeytoContinue();
				break;
			case 2:							//查看所有学生
				database.showStudent();
				anyKeytoContinue();
				break;
			case 3:							//查看所有班级
				database.showClassRoom();
				anyKeytoContinue();
				break;
			default:		
				System.out.println("输入范围超限请重新输入0-3");
				anyKeytoContinue();
			
			}
		}
	}
	/**
	 * 修改子菜单选择跳转控制
	 */
	public void choiceSubModify() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubModify());	//显示修改子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回上一层
				choice = false;
				break;
			case 1:					//新增教师
				addTeaData();
				anyKeytoContinue();
				break;
			case 2:					//辞退教师
				choiceSubOptionIndexdelTea();
				break;
			case 3:					//为教师增加或减少授课班级
				choiceSubFunction();
				break;
			case 4:					//新增学生
				addStuData();	
				anyKeytoContinue();
				break;
			case 5:					//劝退学生
				choiceSubOptionIndexdelStu();
				break;
			case 6:					//为学生分配班级
				choiceSubOptionIndexArrangeStu();
				break;
			case 7:					//新增班级
				addClassRoomData();
				anyKeytoContinue();
				break;
			case 8:					//解散班级
				delClassRoomData();
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-8");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 查询子菜单选择跳转控制
	 */
	public void choiceSubSearch() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubSearch());	//显示查询子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:
				choice = false;
				break;
			case 1:					//按学生编号查询学生
				searchStuByID();
				anyKeytoContinue();
				break;
			case 2:
				searchStuByName();	//按学生姓名查询学生
				anyKeytoContinue();
				break;
			case 3:
				searchStuByCroom(); //按班级查询学生
				anyKeytoContinue();
				break;
			case 4:
				searchTeaByID();	//按老师编号
				anyKeytoContinue();
				break;
			case 5:
				searchTeaByName();	//按老师姓名
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-5");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 删除学生 索引子菜单选择跳转控制 
	 */
	public void choiceSubOptionIndexdelStu() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				UI.showExit();
				choice = false;
				break;
			case 1:					//按编号
				delStuByID();
				anyKeytoContinue();
				break;
			case 2:					//按名字
				delStuByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 为学生分配班级 索引子菜单选择跳转控制 安排班级
	 */
	public void choiceSubOptionIndexArrangeStu() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//按编号
				UI.showInputSID();
				arrangeStuByID();
				anyKeytoContinue();
				break;
			case 2:					//按名字
				UI.showInputSName();
				arrangeStuByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 删除老师 索引子菜单选择跳转控制
	 */
	public void choiceSubOptionIndexdelTea() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//按编号
				delTeaDataByID();
				anyKeytoContinue();
				break;
			case 2:					//按名字
				delTeaDataByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 为老师安排班级增加 索引子菜单选择跳转控制
	 */
	public void choiceSubOptionIndexArrangeTeaAdd() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//按编号
				UI.showInputTID();
				arrangeAddTeaByID();
				anyKeytoContinue();
				break;
			case 2:					//按名字
				UI.showInputTName();
				arrangeAddTeaByName();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 为老师安排班级删除 索引子菜单选择跳转控制
	 */
	public void choiceSubOptionIndexArrangeTeaDel() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//按编号
				UI.showInputTID();
				arrangeDelTeaByID();
				anyKeytoContinue();
				break;
			case 2:					//按名字
				UI.showInputTName();
				arrangeDelTeaByName();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * 增加或减少老师带班子菜单
	 */
	public void choiceSubFunction() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubFunction());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//增加授课班级
				choiceSubOptionIndexArrangeTeaAdd();
				anyKeytoContinue();
				break;
			case 2:					//减少授课班级
				choiceSubOptionIndexArrangeTeaDel();
				anyKeytoContinue();
				break;
			default:
				System.out.println("输入范围超限请重新输入0-2");
				anyKeytoContinue();
			}
		}
	}
	
	/**
	 * 下载学生信息
	 */
	public void downloadStuAllInfo() {
		boolean result = false;
		File tempfile = new File("D:/学生信息.txt");
		FileOperForDatum datumFOper  = new FileOperForDatum(database,tempfile);
		result = datumFOper.downloadInfoStu();
		if(result)
			UI.showOperSuccess();
		else
			UI.showOperFailure();
	}
	
	/**
	 * 下载信息子菜单
	 */
	public void choiceSubDownload() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubDownload());	//显示索引选项子菜单
			System.out.println("请根据菜单进行选择：");
			switch(check.checkInt()) {
			case 0:					//返回
				choice = false;
				break;
			case 1:					//下载老师信息
				//
				anyKeytoContinue();
				break;
			case 2:					//下载学生信息
				//
				anyKeytoContinue();
				break;
			case 3:					//下载班级信息
				//
				anyKeytoContinue();
				break;	
			default:
				System.out.println("输入范围超限请重新输入0-3");
				anyKeytoContinue();
			}
		}
	}
	
	public void readDBFromFile() {
		
	}

	public void saveDBToFile() {
		
	}
	
	public void anyKeytoContinue() {
		System.out.println("按Y键后按回车键继续");
		Scanner input = new Scanner(System.in);
		String str = input.next();
	}
}
