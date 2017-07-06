package com.ectumotech.upd.modell;

import java.util.Scanner;

import com.ectumotech.upd.uil.UIshow;

public class Student{
	private int id;
	private String name;
	private ClassRoom room;
	private boolean status;
	
	public Student(){
		
	}
	public Student(int id, String name, boolean status, ClassRoom room) {
		super();
		this.setId(id);
		this.name = name;
		this.status = status;
		this.room = room;
	}
	public Student(int id, String name, boolean status) {
		super();
		this.setId(id);
		this.name = name;
		this.status = status;
		this.room = new ClassRoom();
	}
	public int getId() {
		return this.id;
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
	public ClassRoom getRoom() {
		return room;
	}
	public void setRoom(ClassRoom room) {
		this.room = room;
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
		UI.showInputSID();
		id = input.nextInt();
		UI.showInputSName();
		name = input.next();
		room = new ClassRoom();
		status = true;
	}
	public void showInfo(boolean id,boolean name,boolean status,boolean classroom,boolean newline) {
		if(id)
			showID();
		if(name);
			showName();
		if(status)
			showStatus();
		if(classroom)
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
	public void showAllInfo(boolean newline) {
			showID();
			showName();
			showStatus();
			showRoom();	
			if(newline)
			System.out.println();
	}
	public void showID() {
		System.out.format("%-5d\t",getId());
	}
	public void showName() {
		System.out.format("%-10s\t",getName());
	}
	public void showStatus() {
		if(room == null)
			System.out.format("%-12.12s\n",getStatus()==true ? "‘⁄∂¡" : "ÕÀ—ß");
	}
	public void showRoom() {
		if(room == null)
			System.out.format("%-6.6s","Œ¥∑÷≈‰");
		else{
			System.out.format("%-5s\t",getRoom().getID());
			}		
	}


}
