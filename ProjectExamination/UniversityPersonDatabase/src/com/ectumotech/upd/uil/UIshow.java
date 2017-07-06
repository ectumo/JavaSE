package com.ectumotech.upd.uil;

public class UIshow implements UI {

	private static Menu main;
	private static Menu subView;
	private static Menu subModify;
	private static Menu subSearch;
	private static Menu subOptionIndex;
	private static Menu subFunction;
	private static Menu subDownload;
	
	public Menu getMain() {
		return main;
	}
	public Menu getSubView() {
		return subView;
	}
	public Menu getSubModify() {
		return subModify;
	}
	public Menu getSubSearch() {
		return subSearch;
	}
	public Menu getSubOptionIndex() {
		return subOptionIndex;
	}
	public Menu getSubFunction() {
		return subFunction;
	}
	public Menu getSubDownload() {
		return subDownload;
	}
	public void showWelcome() {
		System.out.println("��ӭʹ��JAVA��ѵѧԱ��Ϣ��ѯϵͳ");
	}
	public void showUniversityInfo() {

	}

	public void showLogin() {

	}

	public void showLoginSuccess() {

	}
	public void shwoLoginFailure() {

	}

	public void showOperSuccess() {
		System.out.println("�����ɹ�");
	}
	public void showOperFailure() {
		System.out.println("����ʧ��");
	}
	public void showExit() {
		System.out.println("��лʹ�ã�2017ECTUMO-TECH");

	}

	public void showMenu(Menu menu) {
		menu.show();
	}

	public void showStuTitle() {
		System.out.format("%-5s\t%-10.10s\t%-20.20s\t%-8s\n", "ѧ��", "ѧ������", "      ���ڰ༶", "״̬");
	}

	public void showTeaTitle() {
		System.out.format("%-5s\t%-10.5s\t%-10.5s\n", "ְ�����", "��ʦ����", "״̬");
	}

	public void showClassroomTitle() {
		System.out.format("%-12.12s\n", "�༶����");
	}

	public void showInputSID() {
		System.out.println("������ѧ��ѧ��");
	}
	public void showInputTID() {
		System.out.println("�������ʦ����");
	}
	public void showInputSName() {
		System.out.println("������ѧ������");
	}
	public void showInputTName() {
		System.out.println("�������ʦ����");
	}
	public void showInputCID() {
		System.out.println("������༶���");
	}
	
	
	public void showExistNoticeStuID(int ID) {
		System.out.println("�����ѧ�����["+ID+"]�Ѿ����ڣ�");
	}
	public void showExistNoticeTeaID(int ID) {
		System.out.println("����Ľ�ʦ���["+ID+"]�Ѿ����ڣ�");
	}
	public void showExistNoticeCID(String ID) {
		System.out.println("����İ༶���["+ID+"]�Ѿ����ڣ�");
	}
	
	public void showMatchedID(String ID,int count) {
		System.out.println("�ҵ����Ϊ["+ID+"]����Ϣ��"+count+"����¼");
	}
	public void showMatchedID(int ID,int count) {
		System.out.println("�ҵ����Ϊ["+ID+"]����Ϣ��"+count+"����¼");
	}
	public void showUnMatchedID(String ID) {
		System.out.println("û���ұ��["+ID+"]����Ϣ,��˶Ժ��ڲ���");
	}
	public void showUnMatchedID(int ID) {
		System.out.println("û���ҵ����["+ID+"]����Ϣ,��˶Ժ��ڲ���");
	}
	public void showMatchedName(String name,int count) {
		System.out.println("�ҵ�����Ϊ["+name+"]����Ϣ��"+count+"����¼");
	}
	public void showUnMatchedName(String name) {
		System.out.println("û���ҵ�����Ϊ["+name+"]����Ϣ,��˶Ժ��ڲ���");
	}
	public void showMatchedCID(String classRoomID,int count) {
		System.out.println("�ҵ��༶���Ϊ["+classRoomID+"]����Ϣ��"+count+"����¼");
	}
	public void showUnMatchedCID(String classRoomID) {
		System.out.println("û���ҵ��༶���Ϊ["+classRoomID+"]����Ϣ,��˶Ժ��ڲ���");
	}

	public void showDeledID(String ID,int count) {
		System.out.println("ɾ���˱��Ϊ["+ID+"]����Ϣ��"+count+"����¼");
	}
	public void showDeledID(int ID,int count) {
		System.out.println("ɾ���˱��Ϊ["+ID+"]����Ϣ��"+count+"����¼");
	}
	public void showDeledName(String name,int count) {
		System.out.println("ɾ��������Ϊ["+name+"]����Ϣ��"+count+"����¼");
	}
	public void showDeledCID(String classRoomID,int count) {
		System.out.println("ɾ���˰༶���Ϊ["+classRoomID+"]����Ϣ��"+count+"����¼");
	}

	
	
	
	
	public void initMenu() {
		MenuOption opback = new MenuOption(0, "������һ��");
		MenuOption opexit = new MenuOption(0, "�˳����ݿ�");
		MenuOption opm1 = new MenuOption(1, "�鿴���ݿ���Ϣ");
		MenuOption opm2 = new MenuOption(2, "��ѯ���ݿ���Ϣ");
		MenuOption opm3 = new MenuOption(3, "�޸����ݿ���Ϣ");
		MenuOption opm4 = new MenuOption(4, "�������ݿ���Ϣ");
		MenuOption opm5 = new MenuOption(5, "������ݿ���Ϣ");
		MenuOption opm6 = new MenuOption(6, "�������ݿ���Ϣ");
		/**
		 * ���˵�
		 */
		main = new Menu(opm1, opm2, opm3, opm4, opm5, opm6, opexit);
		/**
		 * �鿴�Ӳ˵�
		 */
		MenuOption opsv1 = new MenuOption(1, "�鿴���н�ʦ");
		MenuOption opsv2 = new MenuOption(2, "�鿴����ѧ��");
		MenuOption opsv3 = new MenuOption(3, "�鿴���а༶");
		subView = new Menu(opsv1, opsv2, opsv3, opback);
		
		/**
		 * �޸��Ӳ˵�
		 */
		MenuOption opsm1 = new MenuOption(1, "������ʦ");
		MenuOption opsm2 = new MenuOption(2, "���˽�ʦ");
		MenuOption opsm3 = new MenuOption(3, "Ϊ��ʦָ���ڿΰ༶");
		MenuOption opsm4 = new MenuOption(4, "����ѧ��");
		MenuOption opsm5 = new MenuOption(5, "Ȱ��ѧ��");
		MenuOption opsm6 = new MenuOption(6, "Ϊѧ������༶");
		MenuOption opsm7 = new MenuOption(7, "�����༶");
		MenuOption opsm8 = new MenuOption(8, "��ɢ�༶");
		subModify = new Menu(opsm1, opsm2, opsm3, opsm4, opsm5, 
			opsm6, opsm7, opsm8, opback);
		/**
		 * ��ѯ�Ӳ˵�
		 */
		MenuOption opss1 = new MenuOption(1, "��ѯѧ�������");
		MenuOption opss2 = new MenuOption(2, "��ѯѧ��������");
		MenuOption opss3 = new MenuOption(3, "��ѯѧ�����༶");
		MenuOption opss4 = new MenuOption(4, "��ѯ��ʦ�����");
		MenuOption opss5 = new MenuOption(5, "��ѯ��ʦ������");
	  //MenuOption opss6 = new MenuOption(6, "��ѯ�༶�����");
		subSearch = new Menu(opss1, opss2, opss3, opss4, opss5, opback);
		
		/**
		 * �޸���Ŀ�Ӳ˵�
		 */
		MenuOption opsoi1 = new MenuOption(1, "�����");
		MenuOption opsoi2 = new MenuOption(2, "������");
		subOptionIndex = new Menu(opsoi1,opsoi2, opback);
		
		/**
		 * ָ�ɰ༶�����Ӳ˵�
		 */
		MenuOption opsf1 = new MenuOption(1, "�����ڿΰ༶");
		MenuOption opsf2 = new MenuOption(2, "�����ڿΰ༶");
		subFunction = new Menu(opsf1,opsf2, opback);
		
		/**
		 * �����Ӳ˵�
		 */
		MenuOption opsd1 = new MenuOption(1, "�������н�ʦ");
		MenuOption opsd2 = new MenuOption(2, "��������ѧ��");
		MenuOption opsd3 = new MenuOption(3, "�������а༶");
		subDownload = new Menu(opsd1, opsd2, opsd3, opback);
		
	}

}
