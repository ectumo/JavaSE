package com.ectumotech.upd.modell;

public interface CheckInput {
	int choice(int choice,int opmin,int opmax);
	int choice(int choice,int ...ops);
	/**
	 * Check Scanner Input Type According to The Request
	 * У���System.in ������������ͷ���Ҫ��
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
	 * ���������ѡ����ϲ˵��ڿ�ѡѡ��
	 * @param choice
	 * @param minop
	 * @param maxop
	 * @return
	 */
	boolean checkChoice(int choice,int minop,int maxop);
	int checkChoice(int choice,int ...ops);
	String checkChoice(String choice,String...ops);
}
