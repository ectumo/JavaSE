package com.ectumotech.upd.uil;

public class MenuOption {
	int id;			//ѡ����
	String option;	//ѡ������
	
	MenuOption(){
		
	}
	
	public MenuOption(int id,String option){
		this.id = id;
		this.option = option;
	}
	/**
	 * ���ն����optionѡ���ź�����;
	 */
	void showOption() {
		System.out.format("%-20.10s\n",id+"."+option);
	}
}
