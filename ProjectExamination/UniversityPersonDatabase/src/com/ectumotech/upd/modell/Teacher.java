package com.ectumotech.upd.modell;

import java.util.ArrayList;
import java.util.Scanner;

import com.ectumotech.upd.uil.UIshow;

public class Teacher{
	private int id;
	private String name;
	private ArrayList<ClassRoom> classrooms;
	private boolean status;
	public Teacher(){
		classrooms = null;
	}
	
	public Teacher(int id, String name, boolean status,ClassRoom ...classroom) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.classrooms = new ArrayList<ClassRoom>();
		for(ClassRoom i : classroom)
			classrooms.add(i);
	}
	public Teacher(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.classrooms = new ArrayList<ClassRoom>();

	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ClassRoom> getClassroom() {
		return classrooms;
	}

	public void setClassroom(ArrayList<ClassRoom> classroom) {
		this.classrooms = classroom;
	}

	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void createbyManually() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		id = input.nextInt();
		UI.showInputTName();
		name = input.next();
		status = true;
		classrooms = new ArrayList<ClassRoom>();
	}
	public void showInfo(boolean id,boolean name,boolean status,boolean roomlist,boolean newline) {
		if(id)
			showID();
		if(name);
			showName();
		if(status)
			showStatus();
		if(roomlist)
			showRoom();	
		if(newline)
			System.out.println();
	}
	public void showAllInfo(boolean newline) {
		showID();
		showName();
		showStatus();
		showRoom();
		if(newline)
			System.out.println();
	}
	public void showAllInfo() {
		showID();
		showName();
		showStatus();
		showRoom();
		System.out.println();
	}
	
	public void showID() {
		System.out.format("%-5d\t",getId());
	}
	public void showName() {
		System.out.format("%-10.8s\t",getName());
	}
	public void showStatus() {
		if(classrooms != null)
			System.out.format("%-10.5s\t",getStatus()==true ? "在职" : "离职");	
	}
	public void showRoom() {
		System.out.format("%-12.12s\t","授课班级:");
		if(classrooms == null)
			System.out.format("%-6.6s","未分配");
		else{
			for(ClassRoom i : getClassroom()) {
				System.out.format("%-12.12s\t", i.getID());
			}	
		}
	}
}
