package com.entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<ClassInfo> classInfos = new ArrayList<ClassInfo>();
		Scanner input = new Scanner(System.in);
		//创建demo对象，调用初始化方法
		Demo demo = new Demo();
		demo.init(teachers, students, classInfos);
		boolean flag = true;//循环的标识 
		do {
			flag = demo.choose(input,teachers, students, classInfos,flag);
		} while (flag);
		
	}
	
	/**
	 * 菜单方法
	 */
	public void menu(){
		System.out.println("*************欢迎来到校园信息管理系统*************");
		System.out.println("1.查看所有老师");
		System.out.println("2.查看所有学生");
		System.out.println("3.新增老师");
		System.out.println("4.新增学生");
		System.out.println("5.删除老师");
		System.out.println("6.删除学生");
		System.out.println("7.指派老师带班");
		System.out.println("8.指派学生班级");
		System.out.println("9.授课");
		System.out.println("10.下载所有老师信息");
		System.out.println("11.下载所有学生信息");
		System.out.println("12.退出系统");
		System.out.println("*******************************************");
		System.out.println("请选择");
	}
	
	/**
	 * 初始化信息
	 * @param teachers 老师信息
	 * @param students 学生信息
	 * @param classInfos 班级信息
	 */
	public void init(ArrayList<Teacher> teachers,ArrayList<Student> students,ArrayList<ClassInfo> classInfos){
		//班级信息
		classInfos.add(new ClassInfo(1001, "java"));
		classInfos.add(new ClassInfo(1002, "html"));
		classInfos.add(new ClassInfo(1003, "oracle"));
		classInfos.add(new ClassInfo(1004, "JQuery"));
		classInfos.add(new ClassInfo(1005, "c#"));
		//学生信息
		students.add(new Student(1, "张三", classInfos.get(0)));
		students.add(new Student(2, "李四", classInfos.get(0)));
		students.add(new Student(3, "王五", classInfos.get(1)));
		students.add(new Student(4, "赵六", classInfos.get(1)));
		students.add(new Student(5, "麻七", classInfos.get(2)));
		students.add(new Student(6, "侯八", classInfos.get(2)));
		students.add(new Student(7, "旺财", classInfos.get(3)));
		students.add(new Student(8, "小强", classInfos.get(3)));
		//老师信息
		teachers.add(new Teacher(1, "奇大大",new ArrayList<ClassInfo>()));
		teachers.add(new Teacher(2, "老王",new ArrayList<ClassInfo>()));
		teachers.add(new Teacher(3, "老齐",new ArrayList<ClassInfo>()));
		teachers.get(0).getClassInfos().add(classInfos.get(0));
		teachers.get(0).getClassInfos().add(classInfos.get(1));
		teachers.get(1).getClassInfos().add(classInfos.get(2));
		teachers.get(1).getClassInfos().add(classInfos.get(3));
	}
	
	/**
	 * 输入0返回
	 * @param input 扫描仪
	 */
	public void byZero(Scanner input){
		System.out.println("输入0返回");
		input.next();
	}
	
	/**
	 * 选择方法
	 * @param input 扫描仪
	 * @param teachers 老师信息
	 * @param students 学生信息
	 * @param classInfos 班级信息
	 * @param flag 循环的标识
	 * @return 返回循环的标识，控制循环
	 */
	public boolean choose(Scanner input,ArrayList<Teacher> teachers,ArrayList<Student> students,ArrayList<ClassInfo> classInfos,boolean flag){
		menu();
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			//1.查看所有老师
			selectTeacher(teachers);
			byZero(input);
			break;
		case 2:
			//2.查看所有学生
			selectStudent(students);
			byZero(input);
			break;
		case 3:
			//3.新增老师
			addTeacher(teachers, input);
			byZero(input);
			break;
		case 4:
			addStudent(students, input);
			byZero(input);
			//4.新增学生
			break;
		case 5:
			//5.删除老师
			deleteTeacher(teachers, input);
			byZero(input);
			break;
		case 6:
			//6.删除学生
			deleteStudent(students, input);
			byZero(input);
			break;
		case 7:
			//7.指派老师带班
			updateTeacherClassInfos(teachers, classInfos, input);
			byZero(input);
			break;
		case 8:
			//8.指派学生班级
			updateStudentClassInfo(students, classInfos, input);
			byZero(input);
			break;
		case 9:
			//9.授课
			teach(teachers, input);
			byZero(input);
			break;
		case 10:
			//10.下载所有老师信息
			downloadTeacher(teachers);
			byZero(input);
			break;
		case 11:
			//11.下载所有学生信息
			downStudent(students);
			byZero(input);
			break;
		case 12:
			//12.退出系统
			System.out.println("谢谢使用，撒由啦啦");
			flag = false;
			break;
		default:
			System.out.println("输入错误，退出系统");
			flag = false;
			break;
		}
		return flag;
	}
	
	/**
	 * 查看所有老师
	 * @param teachers 老师信息
	 */
	public void selectTeacher(ArrayList<Teacher> teachers){
		System.out.println("教师编号\t教师姓名\t所带班级");
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(teachers.get(i).getTid()+"\t"+teachers.get(i).getName()+"\t");
			if(teachers.get(i).getClassInfos().size()>0){
				for (int j = 0; j < teachers.get(i).getClassInfos().size(); j++) {
					System.out.print(teachers.get(i).getClassInfos().get(j).getClassName()+" ");
				}
			}else{
				System.out.print("该教师没有带班");
			}
			System.out.println();
		}
	}
	
	/**
	 * 查看所有学生
	 * @param students 学生信息
	 */
	public void selectStudent(ArrayList<Student> students){
		System.out.println("学生编号\t学生姓名\t所属班级");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getSid()+"\t"+students.get(i).getName()+"\t"+students.get(i).getClassInfo().getClassName());
		}
	}
	
	/**
	 * 添加老师
	 * @param teachers 老师信息
	 * @param input 扫描仪
	 */
	public void addTeacher(ArrayList<Teacher> teachers,Scanner input){
		System.out.println("请输入老师的姓名");
		String name = input.next();
		Teacher t = new Teacher(teachers.size()+1, name, new ArrayList<ClassInfo>());
		teachers.add(t);
		System.out.println("添加成功!");
	}
	
	/**
	 * 添加学生
	 * @param students 学生信息
	 * @param input 扫描仪
	 */
	public void addStudent(ArrayList<Student> students,Scanner input){
		System.out.println("请输入学生姓名：");
		String name = input.next();
		Student s = new Student(students.size()+1, name, new ClassInfo());
		students.add(s);
		System.out.println("添加成功!");
	}
	
	/**
	 * 删除老师--删除老师时，需要判断该老师是否已代课，如果没有代课，可直接删除，如果代课，则需要
	 * 指派新的老师带课
	 * @param teachers 老师信息
	 * @param input 扫描仪
	 */
	public void deleteTeacher(ArrayList<Teacher> teachers,Scanner input){
		selectTeacher(teachers);
		System.out.println("请输入要删除的老师编号");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);//用于获取指定老师的下标
		if(index==-1){
			System.out.println("没有该老师，请确认后删除");
		}else{
			if(teachers.get(index).getClassInfos().size()>0){
				System.out.println("请输入新的代课老师编号");
				int newTid = input.nextInt();
				int newIndex = getTeacherIndex(teachers, newTid);
				ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
				ArrayList<ClassInfo> list2 = teachers.get(newIndex).getClassInfos();
				for (int i = 0; i < list.size(); i++) {
					list2.add(list.get(i));
				}
				teachers.get(newIndex).setClassInfos(list2);
				teachers.remove(index);
				System.out.println("删除成功");
			}else{
				teachers.remove(index);
				System.out.println("删除成功");
			}
		}
	}
	
	/**
	 * 根据输入的老师id获取其下标
	 * @param teachers 老师信息
	 * @param tid 输入的老师id
	 * @return 返回下标
	 */
	public int getTeacherIndex(ArrayList<Teacher> teachers,int tid){
		int index = -1;
		for (int i = 0; i < teachers.size(); i++) {
			if(teachers.get(i).getTid()==tid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 根据输入的学生id获取其下标
	 * @param students 学生信息
	 * @param sid 输入的学生编号
	 * @return 返回下标
	 */
	public int getStudentIndex(ArrayList<Student> students,int sid){
		int index = -1;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getSid()==sid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 根据输入的学生id获取其下标
	 * @param students 学生信息
	 * @param sid 输入的学生编号
	 * @return 返回下标
	 */
	public int getClassInfoIndex(ArrayList<ClassInfo> classInfos,int cid){
		int index = -1;
		for (int i = 0; i < classInfos.size(); i++) {
			if(classInfos.get(i).getClassId()==cid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 删除学生
	 * @param students 学生信息
	 * @param input 扫描仪
	 */
	public void deleteStudent(ArrayList<Student> students,Scanner input){
		selectStudent(students);
		System.out.println("请输入要删除的学生编号");
		int sid = input.nextInt();
		int index = getStudentIndex(students, sid);
		if(index==-1){
			System.out.println("该学生不存在");
		}else{
			students.remove(index);
			System.out.println("删除成功");
		}
	}
	
	/**
	 * 指派老师带班
	 * @param teachers 老师信息
	 * @param classInfos 班级信息
	 * @param input 扫描仪
	 */
	public void updateTeacherClassInfos(ArrayList<Teacher> teachers,ArrayList<ClassInfo> classInfos,Scanner input){
		selectTeacher(teachers);
		System.out.println("请选择要带班的老师编号");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);
		selectClassInfo(classInfos);
		System.out.println("请输入该老师要带的班级编号");
		int classId = input.nextInt();
		int cindex = getClassInfoIndex(classInfos, classId);
		//获取该老师已经带的班级集合
		ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
		boolean f = true;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getClassId()==classId){
				f = false;
				break;
			}
		}
		if (f) {
			//可以指定
			ClassInfo classInfo = classInfos.get(cindex);
			teachers.get(index).getClassInfos().add(classInfo);
			System.out.println("指派成功");
		}else{
			//输入的班级编号以及是该老师带
			System.out.println("该班级已经是该老师带班");
		}
	}
	
	/**
	 * 查看所有班级
	 * @param classInfos 班级信息
	 */
	public void selectClassInfo(ArrayList<ClassInfo> classInfos){
		System.out.println("课程编号\t课程名称");
		for (int i = 0; i < classInfos.size(); i++) {
			System.out.println(classInfos.get(i).getClassId()+"\t"+classInfos.get(i).getClassName());
		}
	}
	
	/**
	 * 指派学生班级信息
	 * @param students 学生信息
	 * @param classInfos 班级信息
	 * @param input 扫描仪
	 */
	public void updateStudentClassInfo(ArrayList<Student> students,ArrayList<ClassInfo> classInfos,Scanner input){
		selectStudent(students);
		System.out.println("请输入要指派的学生编号");
		int sid = input.nextInt();
		int index = getStudentIndex(students, sid);
		if(index==-1){
			System.out.println("该学生不存在");
		}else{
			selectClassInfo(classInfos);
			System.out.println("请选择要指派的班级编号");
			int cid = input.nextInt();
			int cindex = getClassInfoIndex(classInfos, cid);
			ClassInfo classInfo = classInfos.get(cindex);
			students.get(index).setClassInfo(classInfo);
			System.out.println("指派成功");
		}
	}
	
	/**
	 * 授课
	 * @param teachers 老师信息
	 * @param input 扫描仪
	 */
	public void teach(ArrayList<Teacher> teachers,Scanner input){
		selectTeacher(teachers);
		System.out.println("请输入要授课的老师编号");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);
		if(index==-1){
			System.out.println("该老师不存在");
		}else{
			ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
			System.out.println("该老师带的班级为：");
			System.out.println("班级编号\t班级名称");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getClassId()+"\t"+list.get(i).getClassName());
			}
			System.out.println("请选择要授课的班级");
			int cid = input.nextInt();
			int cindex = getClassInfoIndex(list, cid);
			ClassInfo classInfo = list.get(cindex);
			System.out.println(teachers.get(index).getName()+"老师在"+classInfo.getClassName()+"班授课");
		}
	}
	
	/**
	 * 下载所有老师系信息
	 * @param teachers 老师信息
	 */
	public void downloadTeacher(ArrayList<Teacher> teachers){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\teacher.txt");
			bw = new BufferedWriter(fw);
			String s = "";
			s+="教师编号\t教师姓名\t所带班级\r\n";
			for (int i = 0; i < teachers.size(); i++) {
				s+=teachers.get(i).getTid()+"\t"+teachers.get(i).getName()+"\t";
				if(teachers.get(i).getClassInfos().size()>0){
					for (int j = 0; j < teachers.get(i).getClassInfos().size(); j++) {
						s+=teachers.get(i).getClassInfos().get(j).getClassName();
					}
				}else{
					s+="该教师没有带班";
				}
				s+="\r\n";
			}
			System.out.println("下载成功，下载到了桌面");
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 下载学生信息
	 * @param students 学生信息
	 */
	public void downStudent(ArrayList<Student> students){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\student.txt");
			bw = new BufferedWriter(fw);
			String s = "";
			s+=s.format("%-12.10s%-12.10s%-12.10s\n", "学生编号","学生姓名","所属班级");
			for (int i = 0; i < students.size(); i++) {
				s+=s.format("%-12.10s\t%-12.10s\t%-12.10s\t\n", students.get(i).getSid(),students.get(i).getName(),students.get(i).getClassInfo().getClassName());
			}
			System.out.println("下载成功，下载到了桌面");
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
