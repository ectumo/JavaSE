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
	 * ����ѧ���˹�¼��
	 * @param stu
	 */
	public void addStu() {
		Student stu = new Student();
		stu.createbyManually();
		students.add(stu);
	}
	/**
	 * ����ѧ�����ݴ���ֵ
	 * @param stu
	 */
	public void addStu(Student stu) {
		students.add(stu);
	}
	
	/**
	 * ������ʦ�˹�¼��
	 * @param tea
	 */
	public void addTea() {
		Teacher tea = new Teacher();
		tea.createbyManually();
		teachers.add(tea);
	}
	/**
	 * ������ʦ���ݴ���ֵ
	 * @param tea
	 */
	public void addTea(Teacher tea) {
		teachers.add(tea);
	}
	
	/**
	 * ���Ӱ༶�˹�¼��
	 * @param room
	 */
	public void addClassRoom() {
		ClassRoom room = new ClassRoom();
		room.createbyManually();
		classRooms.add(room);
	}
	/**
	 * ���Ӱ༶���ݴ���ֵ
	 * @param room
	 */
	public void addClassRoom(ClassRoom room) {
		classRooms.add(room);
	}
	
	
	/**
	 * ɾ��ѧ����ID�˹�¼��
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
	 * ɾ��ѧ����ID���ݴ���ֵ
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
	 * ɾ��ѧ���������˹�¼��
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
	 * ɾ��ѧ�������ָ��ݴ���ֵ
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
	 * ɾ����ʦ��ID�˹�¼��
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
	 * ɾ����ʦ��ID���ݴ���ֵ
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
	 * ɾ����ʦ�������˹�¼��
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
	 * ɾ����ʦ�����ָ��ݴ���ֵ
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
	 * ɾ�����Ұ������˹�¼��
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
	 * ɾ�����Ұ����ָ��ݴ���ֵ
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
	 * ��ѧ������༶����� ���ݴ���ֵ
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
	 * ��ѧ������༶������ ���ݴ���ֵ
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
	 * ָ����ʦ�ڿΰ༶ ����� ���ݴ���ֵ
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
	 * ָ����ʦ�ڿΰ༶ ������ ���ݴ���ֵ
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
	 * ����ѧ����ID���� �˹�¼��
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
	 * ����ѧ����ID���� ���ݴ���ֵ
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
	 * ����ѧ�������� �˹�¼��
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
	 * ����ѧ��������
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
	 * ����ѧ�����༶��� �˹�¼��
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
	 * ����ѧ�����༶��� ���ݴ���ֵ
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
	 * ������ʦ���༶��� ���ݴ���ֵ
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
	 * ������ʦ��ID �����˹�¼��
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
	 * ������ʦ��ID ���ݴ���ֵ
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
	 * ������ʦ������ �����˹�¼��
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
	 * ������ʦ������ ���ݴ���ֵ
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
	 * ��ʾѧ����Ϣ
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
	 * ��ʾѧ����Ϣ
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
	 * ��ʾ��ʦ��Ϣ
	 */
	public void showTeacher() {
		UIshow UI = new UIshow();
		UI.showTeaTitle();
		for(Teacher i : teachers) {
			i.showAllInfo();
		}
	}
	/**
	 * ��ʾ��ʦ��Ϣ
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
	 * ��ʾ�༶��Ϣ	
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
	 * ��ʾ�༶��Ϣ	
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
	 * ��ʼ������
	 */
	public void initData() {
		/**
		 * ��������
		 */
		classRooms = new ArrayList<ClassRoom>();
		classRooms.add(new ClassRoom("JAVA��ѵ������"));
		classRooms.add(new ClassRoom("JAVA��ѵ�߼���"));
		classRooms.add(new ClassRoom("JAVA��ѵ���ް�"));
		classRooms.add(new ClassRoom("JAVA��ѵ�ռ���"));
		
		/**
		 * ѧ������
		 */
		students = new ArrayList<Student>();
		students.add(new Student(1,"����", true,classRooms.get(3)));
		students.add(new Student(2,"������", true,classRooms.get(3)));
		students.add(new Student(3,"Ԭ�ı�", true,classRooms.get(3)));
		students.add(new Student(4,"������", true,classRooms.get(3)));
		students.add(new Student(5,"������", true,classRooms.get(2)));
		students.add(new Student(6,"�ſ���", true,classRooms.get(2)));
		students.add(new Student(7,"�࿵��", true,classRooms.get(2)));
		students.add(new Student(8,"�³� ", true,classRooms.get(2)));
		students.add(new Student(9,"�³�", true,classRooms.get(1)));
		students.add(new Student(10,"��� ", true,classRooms.get(1)));
		students.add(new Student(11,"������ ", true,classRooms.get(1)));
		students.add(new Student(12,"������ ", true,classRooms.get(0)));
		students.add(new Student(13,"�߿��� ", true,classRooms.get(0)));
		students.add(new Student(14,"���� ", true,classRooms.get(0)));
		

		/**
		 * ��ʦ����
		 */
		teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher(1,"����", true,classRooms.get(0),classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(2,"����", true,classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(3,"����", true,classRooms.get(2),classRooms.get(3)));
		teachers.add(new Teacher(4,"�����", true,classRooms.get(3)));
		teachers.add(new Teacher(5,"����", true,classRooms.get(1),classRooms.get(2)));
		teachers.add(new Teacher(6,"�ų���", true,classRooms.get(0),classRooms.get(1),classRooms.get(2),classRooms.get(3)));


		/**
//		 * �γ�����
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
