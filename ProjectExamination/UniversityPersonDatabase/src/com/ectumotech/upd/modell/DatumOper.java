package com.ectumotech.upd.modell;

import java.util.ArrayList;
import java.util.Scanner;

import com.ectumotech.upd.uil.UIshow;

public class DatumOper {
	
	public ArrayList<Student> searchSId(Datum datum,int Sid) {
		int count = 0;
		ArrayList<Student> tempStu = new ArrayList<Student>();
		UIshow UI = new UIshow();
		for (Student stu : datum.getStudents()) {
			if(stu.getId()==Sid) {
				count++;
				tempStu.add(stu);
			}
		}
		if (count == 0) {
			UI.showUnMatchedID(Sid);
			return null;
		}
		else
			UI.showMatchedID(Sid, count);
		for(Student i: tempStu)
			i.showInfo();
		
		return tempStu;
	}
	public ArrayList<Student> searchSName(Datum datum,String name) {
		int count = 0;
		ArrayList<Student> tempStu = new ArrayList<Student>();
		UIshow UI = new UIshow();
		for (Student stu : datum.getStudents()) {
			if(stu.getName()==name) {
				count++;
				tempStu.add(stu);
			}
		}
		if (count == 0) {
			UI.showUnMatchedName(name);
			return null;
		}
		else
			UI.showMatchedName(name, count);
		for(Student i: tempStu)
			i.showInfo();
		
		return tempStu;
	}
	public ArrayList<Student> searchSClassRoom(Datum datum,String classroomID) {
		int count = 0;
		ArrayList<Student> tempStu = new ArrayList<Student>();
		UIshow UI = new UIshow();
		for (Student stu : datum.getStudents()) {
			if(stu.getRoom().getID()==classroomID) {
				count++;
				tempStu.add(stu);
			}
		}
		if (count == 0) {
			UI.showUnMatchedCID(classroomID);
			return null;
		}
		else
			UI.showMatchedCID(classroomID, count);
		for(Student i: tempStu)
			i.showInfo();
		
		return tempStu;
			
	}
	public ArrayList<Teacher> searchTId(Datum datum,int Tid) {
		int count = 0;
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		UIshow UI = new UIshow();
		for (Teacher Tea : datum.getTeachers()) {
			if(Tea.getId()==Tid) {
				count++;
				tempTea.add(Tea);
			}
		}
		if (count == 0) {
			UI.showUnMatchedID(Tid);
			return null;
		}
		else
			UI.showMatchedID(Tid, count);
		for(Teacher i: tempTea)
			i.showInfo();
		
		return tempTea;
	}
	public ArrayList<Teacher> searchTName(Datum datum,String name) {
		int count = 0;
		ArrayList<Teacher> tempTea = new ArrayList<Teacher>();
		UIshow UI = new UIshow();
		for (Teacher Tea : datum.getTeachers()) {
			if(Tea.getName()==name) {
				count++;
				tempTea.add(Tea);
			}
		}
		if (count == 0) {
			UI.showUnMatchedName(name);
			return null;
		}
		else
			UI.showMatchedName(name, count);
		for(Teacher i: tempTea)
			i.showInfo();
		
		return tempTea;
	}
	
	
}
 