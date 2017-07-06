package com.ectumotech.upd.modell;

import java.util.Scanner;

import com.ectumotech.upd.uil.UIshow;

public class ClassRoom{
	private String ID;
	
	public ClassRoom() {

	}
		
	public ClassRoom(String iD) {
		super();
		ID = iD;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void createbyManually() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		ID = input.next();
	}
	public void showInfo() {
		System.out.format("%-12.12s\n",getID());
	}
}
