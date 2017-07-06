package com.ectumotech.upd.modell;


import java.util.ArrayList;
import java.util.Scanner;
import com.ectumotech.upd.uil.UIshow;


public class Datum{
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<ClassRoom> classRooms;
	
	public Datum() {
		students = null;
		teachers = null;
		classRooms = null;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public ArrayList<ClassRoom> getClassRooms() {
		return classRooms;
	}
	public void setClassRooms(ArrayList<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}
	
	/**
	 * 增加学生人工录入
	 * @param stu
	 */
	public void addStu() {
		Student stu = new Student();
		stu.createbyManually();
		students.add(stu);
	}
	/**
	 * 增加学生根据传递值
	 * @param stu
	 */
	public void addStu(Student stu) {
		students.add(stu);
	}
	
	/**
	 * 增加老师人工录入
	 * @param tea
	 */
	public void addTea() {
		Teacher tea = new Teacher();
		tea.createbyManually();
		teachers.add(tea);
	}
	/**
	 * 增加老师根据传递值
	 * @param tea
	 */
	public void addTea(Teacher tea) {
		teachers.add(tea);
	}
	
	/**
	 * 增加班级人工录入
	 * @param room
	 */
	public void addClassRoom() {
		ClassRoom room = new ClassRoom();
		room.createbyManually();
		classRooms.add(room);
	}
	/**
	 * 增加班级根据传递值
	 * @param room
	 */
	public void addClassRoom(ClassRoom room) {
		classRooms.add(room);
	}
	
	
	/**
	 * 删除学生按ID人工录入
	 * @param stu
	 */
	public int delSId() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		int count = 0;
		for(int i = 0; i < students.size();i++) {
			if(students.get(i).getId() == id) {
				students.remove(i);
				count++;
			}
		}
		return count;
	}
	/**
	 * 删除学生按ID根据传递值
	 * @param stu
	 */
	public int delSID(int id) {
		int count = 0;
		for(int i = 0; i < students.size();i++) {
			if(students.get(i).getId() == id) {
				students.remove(i);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 删除学生按名字人工录入
	 * @param stu
	 */
	public int delSName(){
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int count = 0;
		for(int i = 0; i < students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				count++;
			}
		}
		return count;
	}
	/**
	 * 删除学生按名字根据传递值
	 * @param stu
	 */
	public int delSName(String name){
		int count = 0;
		for(Student i : students) {
			if(i.getName().equals(name)) {
				students.remove(i);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 删除老师按ID人工录入
	 * @param tea
	 */
	public int delTID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int count = 0;
		for(int i = 0; i < teachers.size();i++) {
			if(teachers.get(i).getId() == id) {
				teachers.remove(i);
				count++;
			}
		}
		return count;
	}
	/**
	 * 删除老师按ID根据传递值
	 * @param tea
	 */
	public int delTID(int id) {
		int count = 0;
		for(int i = 0; i < teachers.size();i++) {
			if(teachers.get(i).getId() == id) {
				teachers.remove(i);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 删除教师按名字人工录入
	 * @parm room
	 */
	public int delTName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int count = 0;
		for(int i = 0; i < teachers.size();i++) {
			if(teachers.get(i).getName().equals(name)) {
				teachers.remove(i);
				count++;
			}
		}
		return count;
	}
	/**
	 * 删除教师按名字根据传递值
	 * @parm room
	 */
	public int delTName(String name) {
		int count = 0;
		for(int i = 0; i < teachers.size();i++) {
			if(teachers.get(i).getName().equals(name)) {
				teachers.remove(i);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 删除教室按名字人工录入
	 * @param room
	 */
	public int delCID() {
		Scanner input = new Scanner(System.in);
		String ClassRoomID = input.next();
		int count = 0;
		for(int i = 0; i < classRooms.size();i++) {
			if(classRooms.get(i).getID().equals(ClassRoomID)) {
				classRooms.remove(i);
				count++;
			}
		}
		return count;
	}
	/**
	 * 删除教室按名字根据传递值
	 * @param room
	 */
	public int delCID(String ClassRoomID) {
		int count = 0;
		for(int i = 0; i < classRooms.size();i++) {
			if(classRooms.get(i).getID().equals(ClassRoomID)) {
				classRooms.remove(i);
				count++;
			}
		}
		return count;
	}
	
	
	public int CheckedSID(int id) {
		int index = -1;
		int count = 0;
		for (Student i : students) {
			if (i.getId() == id) {
				index = count;
			}
			count++;
		}		
		return index;
	}
	public int CheckedSName(String name) {
		int index = -1;
		int count = 0;
		for (Student i : students) {
			if (i.getName().equals(name)) {
				index = count;
			}
			count++;
		}
		return index;
	}
	public int CheckedTID(int id) {
		int index = -1;
		int count = 0;
		for (Teacher i : teachers) {
			if (i.getId() == id) {
				index = count;
			}
			count++;
		}
		return index;
	}
	public int CheckedTName(String name) {
		int index = -1;
		int count = 0;
		for (Teacher i : teachers) {
			if (i.getName().equals(name)) {
				index = count;
			}
			count++;
		}
		return index;
	}
	public int CheckedCID(String ID) {
		int index = -1;
		int count = 0;
		for (ClassRoom i : classRooms) {
			if (i.getID().equals(ID)) {
				index = count;
			}
			count++;
		}
		return index;
	}
	
	
	

	/**
	 * 给学生分配班级按编号 根据传递值
	 * @param id
	 * @param classroom
	 * @return
	 */
	public int arrangeStu(int id,ClassRoom classroom) {
		int count = 0;
		for (Student i : students) {
			if(i.getId() == id) {
				count++;
				i.setRoom(classroom);
			}
		}
		return count;
	}
	/**
	 * 给学生分配班级按名字 根据传递值
	 * @param name
	 * @param classroom
	 * @return
	 */
	public int arrangeStu(String name,ClassRoom classroom) {
		int count = 0;
		for (Student i : students) {
			if(i.getName().equals(name)) {
				count++;
				i.setRoom(classroom);
			}
		}
		return count;
	}
	/**
	 * 指定老师授课班级 按编号 根据传递值
	 * @param id
	 * @param classroom
	 * @return
	 */
	public int arrangeAddTea(int id,ClassRoom classroom){
		
		int count = 0;
		for (Teacher i : teachers) {
			if(i.getId()  == id) {
				count++;
				i.getClassroom().add(classroom);
			}
		}
		return count;
	}
	/**
	 * 指定老师授课班级 按名字 根据传递值
	 * @param name
	 * @param classroom
	 */
	public int arrangeDelTea(String name,ClassRoom classroom) {
		int count = 0;
		for (Teacher i : teachers) {
			if(i.getName().equals(classroom)) {
				count++;
				i.getClassroom().add(classroom);
			}
		}
		return count;
	}
	
	/**
	 * 查找学生按ID查找 人工录入
	 * @param datum
	 * @param id
	 * @return
	 */
	public ArrayList<Student> searchSId() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		ArrayList<Student> tempStu = new ArrayList<Student>();
		for (Student stu : students) {
			if(stu.getId()==id) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			return null;
		}
		return tempStu;
	}	
	/**
	 * 查找学生按ID查找 根据传递值
	 * @param datum
	 * @param id
	 * @return
	 */
	public ArrayList<Student> searchSId(int id) {
		ArrayList<Student> tempStu = new ArrayList<Student>();
		UIshow UI = new UIshow();
		for (Student stu : students) {
			if(stu.getId()==id) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			return null;
		}
		return tempStu;
	}
	
	/**
	 * 查找学生按名字 人工录入
	 * @param name
	 * @return
	 */
	public ArrayList<Student> searchSName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSName();
		String name = input.next();
		ArrayList<Student> tempStu = new ArrayList<Student>();
		for (Student stu : students) {
			if(stu.getName().equals(name)) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			tempStu = null;
		}
		return tempStu;
	}
	/**
	 * 查找学生按名字
	 * @param name
	 * @return
	 */
	public ArrayList<Student> searchSName(String name) {
		ArrayList<Student> tempStu = new ArrayList<Student>();
		UIshow UI = new UIshow();
		for (Student stu : students) {
			if(stu.getName().equals(name)) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			tempStu = null;
		}
		return tempStu;
	}
	
	/**
	 * 查找学生按班级编号 人工录入
	 * @param classroomID
	 * @return
	 */
	public ArrayList<Student> searchSClassRoom() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String classroomID = input.next();
		ArrayList<Student> tempStu = new ArrayList<Student>();
		for (Student stu : students) {
			if(stu.getRoom().getID().equals(classroomID)) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			tempStu = null;
		}
		return tempStu;
			
	}
	/**
	 * 查找学生按班级编号 根据传递值
	 * @param classroomID
	 * @return
	 */
	public ArrayList<Student> searchSClassRoom(String classroomID) {
		ArrayList<Student> tempStu = new ArrayList<Student>();
		for (Student stu : students) {
			if(stu.getRoom().getID().equals(classroomID)) {
				tempStu.add(stu);
			}
		}
		if (tempStu.size()==0) {
			tempStu = null;
		}
		return tempStu;
			
	}
	
	/**
	 * 查找老师按班级编号 根据传递值
	 * @param classroomID
	 * @return
	 */
	public ArrayList<Teacher> searchTClassRoom(String classroomID){
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		for(Teacher tea : teachers) {
			for (int i = 0 ; i < tea.getClassroom().size();i++) {
				if(tea.getClassroom().get(i).getID().equals(classroomID)) {
					tempTea.add(tea);
				}
			}
		}
		if(tempTea.size() == 0) {
			tempTea = null;
		}
		return tempTea;
	}
	
	
	/**
	 * 查找老师按ID 根据人工录入
	 * @param Tid
	 * @return
	 */
	public ArrayList<Teacher> searchTId() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int Tid = input.nextInt();
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		for (Teacher Tea : teachers) {
			if(Tea.getId()==Tid) {
				tempTea.add(Tea);
			}
		}
		if (tempTea.size() == 0) {
			tempTea = null;
		}
		return tempTea;
	}
	/**
	 * 查找老师按ID 根据传递值
	 * @param Tid
	 * @return
	 */
	public ArrayList<Teacher> searchTId(int Tid) {
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		UIshow UI = new UIshow();
		for (Teacher Tea : teachers) {
			if(Tea.getId()==Tid) {
				tempTea.add(Tea);
			}
		}
		if (tempTea.size() == 0) {	
			tempTea = null;
		}
		return tempTea;
	}
	
	/**
	 * 查找老师按名字 根据人工录入
	 * @param name
	 * @return
	 */
	public ArrayList<Teacher> searchTName(){
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTName();
		String name = input.next();
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		for (Teacher Tea : teachers) {
			if(Tea.getName().equals(name)) {
				tempTea.add(Tea);
			}
		}
		if (tempTea.size() == 0) {
			tempTea = null;
		}
		return tempTea;
	}
	/**
	 * 查找老师按名字 根据传递值
	 * @param name
	 * @return
	 */
	public ArrayList<Teacher> searchTName(String name) {
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		UIshow UI = new UIshow();
		for (Teacher Tea : teachers) {
			if(Tea.getName().equals(name)) {
				tempTea.add(Tea);
			}
		}
		if (tempTea.size() == 0) {
			tempTea = null;
		}
		return tempTea;
	}
	

	/**
	 * 显示学生信息
	 * @param
	 */
	public void showStudent() {
		UIshow UI = new UIshow();
		UI.showStuTitle();
		for(Student i : students) {
			i.showAllInfo();
		}
	}
	/**
	 * 显示学生信息
	 * @param students
	 */
	public void showStudent(ArrayList<Student> students) {
		UIshow UI = new UIshow();
		UI.showStuTitle();
		for(Student i : students) {
			i.showAllInfo();
		}
	}
	/**
	 * 显示老师信息
	 */
	public void showTeacher() {
		UIshow UI = new UIshow();
		UI.showTeaTitle();
		for(Teacher i : teachers) {
			i.showAllInfo();
		}
	}
	/**
	 * 显示老师信息
	 * @param teachers
	 */
	public void showTeacher(ArrayList<Teacher> teachers) {
		UIshow UI = new UIshow();
		UI.showTeaTitle();
		for(Teacher i : teachers) {
			i.showAllInfo();
		}
	}
	/**
	 * 显示班级信息	
	 * @param
	 */
	public void showClassRoom() {
		UIshow UI = new UIshow();
		UI.showClassroomTitle();
		for(ClassRoom i : classRooms) {
			i.showInfo();
		}
	}
	/**
	 * 显示班级信息	
	 * @param 
	 */
	public void showClassRoom(ArrayList<ClassRoom> classRooms) {
		UIshow UI = new UIshow();
		UI.showClassroomTitle();
		for(ClassRoom i : classRooms) {
			i.showInfo();
		}
	}	
	
	/**
	 * 初始化数据
	 */
	public void initData() {
		/**
		 * 教室数据
		 */
		classRooms = new ArrayList<ClassRoom>();
		classRooms.add(new ClassRoom("JAVA培训基础班"));
		classRooms.add(new ClassRoom("JAVA培训高级班"));
		classRooms.add(new ClassRoom("JAVA培训极限班"));
		classRooms.add(new ClassRoom("JAVA培训终极班"));
		
		/**
		 * 学生数据
		 */
		students = new ArrayList<Student>();
		students.add(new Student(1,"朱林", true,classRooms.get(3)));
		students.add(new Student(2,"冯永政", true,classRooms.get(3)));
		students.add(new Student(3,"袁文彬", true,classRooms.get(3)));
		students.add(new Student(4,"刘金祥", true,classRooms.get(3)));
		students.add(new Student(5,"韩亚男", true,classRooms.get(2)));
		students.add(new Student(6,"张克周", true,classRooms.get(2)));
		students.add(new Student(7,"余康康", true,classRooms.get(2)));
		students.add(new Student(8,"陈城 ", true,classRooms.get(2)));
		students.add(new Student(9,"陈超", true,classRooms.get(1)));
		students.add(new Student(10,"程炜 ", true,classRooms.get(1)));
		students.add(new Student(11,"林永青 ", true,classRooms.get(1)));
		students.add(new Student(12,"郭创创 ", true,classRooms.get(0)));
		students.add(new Student(13,"高俊辉 ", true,classRooms.get(0)));
		students.add(new Student(14,"杨勇 ", true,classRooms.get(0)));
		

		/**
		 * 老师数据
		 */
		teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher(1,"陈齐", true,classRooms.get(0),classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(2,"马云", true,classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(3,"马化腾", true,classRooms.get(2),classRooms.get(3)));
		teachers.add(new Teacher(4,"李彦宏", true,classRooms.get(3)));
		teachers.add(new Teacher(5,"丁磊", true,classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(6,"张朝阳", true,classRooms.get(0),classRooms.get(1),classRooms.get(2),classRooms.get(3)));


		/**
//		 * 课程数据
//		 */
//		Course c1 = new Course("JavaSE");
//		Course c2 = new Course("JavaEE");
//		Course c3 = new Course("Oracle");
//		Course c4 = new Course("HTML");
//		Course c5 = new Course("CSS");
//		Course c6 = new Course("JavaScript");
//		Course c7 = new Course("JQuery");
	}
} 
