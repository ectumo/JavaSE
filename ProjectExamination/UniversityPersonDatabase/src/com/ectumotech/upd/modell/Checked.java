package com.ectumotech.upd.modell;

import java.util.Scanner;

public class Checked implements CheckInput{

	public int choice(int choice, int opmin, int opmax) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public int choice(int choice, int... ops) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	/**
	 * У������Ϊintֱ����ȷ
	 */
	public int checkInt() {
		int inum = 0;
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag){
			try {
				inum = input.nextInt();
				flag = false;
				return inum;
			}catch (Exception String) {
				System.out.println("����Ƿ��ַ����������룡");
				input = new Scanner(System.in);
			}
		}
		return inum;
	}
	/**
	 * У������Ϊintֱ������times����
	 */
	public int checkInt(int times) {
		Scanner input1 = new Scanner(System.in);
		int inum = 0;
		int counts = 0;
		while (inum < 1){
			try {
				inum = input1.nextInt();
				return inum;	
			} catch (Exception e) {
				counts++;
				System.out.println("����Ƿ��ַ�����������");
				System.out.println("input error counts:"+counts+"/"+times);
				if (counts >= times){
					System.out.println("��������������ϵͳ�˳�");
					return -1;
				}	
				input1 = new Scanner(System.in);
			}
		}
		return inum;
	}

	@Override
	public double checkDbl() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public double checkDbl(int times) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public String checkString() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String checkString(int times) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean checkChoice(int choice, int minop, int maxop) {
		if (choice < minop){
			return false;
		}else if(choice > maxop){
			return false;
		}
		return true;
	}

	@Override
	public int checkChoice(int choice, int... ops) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public String checkChoice(String choice, String... ops) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
