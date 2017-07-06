package com.ectumotech.upd.modell;

public interface CheckInput {
	int choice(int choice,int opmin,int opmax);
	int choice(int choice,int ...ops);
	/**
	 * Check Scanner Input Type According to The Request
	 * 校验从System.in 传入的数据类型符合要求
	 * @return 
	 */
	int checkInt();
	int checkInt(int times);
	double checkDbl();
	double checkDbl(int times);
	String checkString();
	String checkString(int times);
	
	/**
	 * Check Choice Equals the Options Request
	 * 检验输入的选项符合菜单内可选选项
	 * @param choice
	 * @param minop
	 * @param maxop
	 * @return
	 */
	boolean checkChoice(int choice,int minop,int maxop);
	int checkChoice(int choice,int ...ops);
	String checkChoice(String choice,String...ops);
}
