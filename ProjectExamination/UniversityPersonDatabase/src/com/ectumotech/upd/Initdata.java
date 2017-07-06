package com.ectumotech.upd;

import java.util.ArrayList;
import com.ectumotech.upd.modell.ClassRoom;
import com.ectumotech.upd.modell.Student;
import com.ectumotech.upd.modell.Teacher;
import com.ectumotech.upd.uil.Menu;
import com.ectumotech.upd.uil.MenuOption;

public class Initdata {

	private static ArrayList<Student> students;
	private static ArrayList<Teacher> teachers;
	private static ArrayList<ClassRoom> classRooms;
//	private static ArrayList<Course> courses;
	

	/**
	 * 根据输入的字符串 初始化对应的数据
	 * @param args menu	初始化菜单
	 * @param args data 初始化数据
	 */
	public Initdata(String ...args) {
		for (String choice : args) {
			switch(choice) {
			case "menu":
				initMenu();
				break;
			case "data":
				initData();
				break;
			default:
				
			}
		}
	}
	
	
	

		
		public ArrayList<Student> getStudents() {
			return students;
		}
		
		public void setStudents(ArrayList<Student> students) {
			Initdata.students = students;
		}
		
		public  ArrayList<Teacher> getTeachers() {
			return teachers;
		}
		
		public void setTeachers(ArrayList<Teacher> teachers) {
			Initdata.teachers = teachers;
		}
		
		public  ArrayList<ClassRoom> getClassRooms() {
			return classRooms;
		}
		
		public void setClassRooms(ArrayList<ClassRoom> classRooms) {
			Initdata.classRooms = classRooms;
		}
		
		public Initdata() {
		}
		
		
		

}
