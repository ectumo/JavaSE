package com.ectumotech.upd;

import com.ectumotech.upd.uil.*;
import com.ectumotech.upd.modell.*;

import com.ectumotech.upd.controll.*;

public class TestUPD {
	public static void main(String[] args) {
	/**
	 * ά���������
	 */
	Maintainace maintainace = new Maintainace();
		/**
		 * �½����ݿ�
		 */
		Datum database = new Datum();
			database.initData();		//��ʼ�����ݿ�����
		/**
		 * �½�UI�˵�
		 */
		UIshow UI = new UIshow();
			UI.initMenu();  			//��ʼ��UI�˵�
	maintainace.setDatum(database);		//װ��������Ϣ
	maintainace.setuIshow(UI);			//װ�ؽ���
	maintainace.choiceMain();			//����ά��ϵͳ����ѡ��	
	
	}
}
