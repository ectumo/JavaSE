package com.ectumotech.upd.uil;

public class MenuOption {
	int id;			//选项编号
	String option;	//选项内容
	
	MenuOption(){
		
	}
	
	public MenuOption(int id,String option){
		this.id = id;
		this.option = option;
	}
	/**
	 * 在终端输出option选项编号和内容;
	 */
	void showOption() {
		System.out.format("%-20.10s\n",id+"."+option);
	}
}
