package com.ectumotech.upd.controll;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.ectumotech.upd.modell.Checked;
import com.ectumotech.upd.modell.ClassRoom;
import com.ectumotech.upd.modell.Datum;
import com.ectumotech.upd.modell.FileOperForDatum;
import com.ectumotech.upd.modell.Student;
import com.ectumotech.upd.modell.Teacher;
import com.ectumotech.upd.uil.UIshow;



public class Maintainace {
	Datum database;
	UIshow UI;
	
	public Datum getDatum() {
		return database;
	}
	public Maintainace() {
		super();
	}
	public void setDatum(Datum datum) {
		this.database = datum;
	}
	public UIshow getuIshow() {
		return UI;
	}
	public void setuIshow(UIshow uIshow) {
		this.UI = uIshow;
	}
	
	/**
	 * ����ѧ�� 
	 */
	public void addStuData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		boolean status = true;
		if (database.CheckedSID(id)!=-1) {	//ID���Ʋ����ظ�
			UI.showOperFailure(); 
			UI.showExistNoticeStuID(id);	 
		}else {
			UI.showInputSName();
			String name = input.next();
			ClassRoom room = new ClassRoom();
			Student student = new Student(id,name,true);
			database.addStu(student);
		}	
	}
	/**
	 * ������ʦ
	 */
	public void addTeaData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		boolean status = true;
		if (database.CheckedTID(id)!=-1) {	//ID���Ʋ����ظ�
			UI.showOperFailure(); 
			UI.showExistNoticeTeaID(id);	 
		}else {
			UI.showInputTName();
			String name = input.next();
			Teacher teacher = new Teacher(id,name,true);
			database.addTea(teacher);
		}
	}	
	/**
	 * ���Ӱ༶
	 */
	public void addClassRoomData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String ID = input.next();
		boolean status = true;
		if (database.CheckedCID(ID)!=-1) {	//ID���Ʋ����ظ�
			UI.showOperFailure(); 
			UI.showExistNoticeCID(ID);	 
		}else {
			ClassRoom room = new ClassRoom(ID);
			database.addClassRoom(room);
		}
	}
	
	/**
	 * ����ѧ����ѧ�����
	 */
	public void searchStuByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
	
		ArrayList<Student> tempID;
		tempID = database.searchSId(id);
		if (tempID == null) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedID(id, tempID.size());
			database.showStudent(tempID);
		}
	}
	/**
	 * ����ѧ����ѧ������
	 */	
	public void searchStuByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSName();
		String name = input.next();
		ArrayList<Student> tempName;
		tempName = database.searchSName(name);
		if (tempName == null) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedName(name, tempName.size());
			database.showStudent(tempName);
		}
	}
	/**
	 *����ѧ�����༶��� 	
	 */
	public void searchStuByCroom() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String room = input.next();
		ArrayList<Student> tempRoom;
		tempRoom = database.searchSClassRoom(room);
		if (tempRoom == null) {
			UI.showOperFailure();
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedCID(room, tempRoom.size());
			database.showStudent(tempRoom);
		}
	}
	/**
	 * ���ҽ�ʦ����ʦ���
	 */	
	public void searchTeaByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		ArrayList<Teacher> tempTID;
		tempTID = database.searchTId(id);
		if (tempTID == null) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showMatchedID(id, tempTID.size());
			database.showTeacher(tempTID);
		}
	}
	/**
	 * ���ҽ�ʦ����ʦ����
	 */	
	public void searchTeaByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTName();
		String name = input.next();
		ArrayList<Teacher> tempTName;
		tempTName = database.searchTName(name);
		if (tempTName == null) {
			UI.showUnMatchedName(name);
		}
		else {
			UI.showMatchedName(name, tempTName.size());
			database.showTeacher(tempTName);
		}
	}
	/**
	 * ��ѯ�༶ �����
	 */
	public void searchClassRoomByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String room = input.next();
		ArrayList<Student> tempSRoom;
		ArrayList<Teacher> tempTRoom;
		//��ӡ�Ͱ༶�йص�ѧ����Ϣ
		tempSRoom = database.searchSClassRoom(room);
		if (tempSRoom == null) {
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showMatchedCID(room, tempSRoom.size());
			//database.showStudent(tempSRoom);//��ӡȫ����Ϣ
		}
		//��ӡ�Ͱ༶�йص���ʦ��Ϣ
		tempTRoom = database.searchTClassRoom(room);
		if (tempSRoom == null) {
			UI.showUnMatchedCID(room);
		}
		else {
			UI.showMatchedCID(room, tempTRoom.size());
			//database.showTeacher(tempTRoom);//��ӡȫ����Ϣ
			//
		}
	}

	
	
	/**
	 * ɾ��ѧ�� ��ѧ����� �˹�¼��
	 */
	public void delStuByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSID();
		int id = input.nextInt();
		int count = database.delSID(id);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledID(id, count);	
		}
	}
	/**
	 * ɾ��ѧ�� ��ѧ������ �˹�¼��
	 */
	public void delStuByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputSName();
		String name = input.next();
		int count = database.delSName(name);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledName(name, count);
		}
	}
	
	/**
	 * ɾ����ʦ ����ʦ��� �˹�¼��
	 */
	public void delTeaDataByID() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTID();
		int id = input.nextInt();
		int count = database.delTID(id);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedID(id);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledID(id, count);	
		}
	}
	/**
	 * ɾ����ʦ ����ʦ���� �˹�¼��
	 */
	public void delTeaDataByName() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputTName();
		String name = input.next();
		int count = database.delTName(name);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedName(name);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledName(name, count);
		}
	}
	
	/**
	 * ɾ���༶ ���༶�༶��� �˹�¼��
	 */
	public void delClassRoomData() {
		Scanner input = new Scanner(System.in);
		UIshow UI = new UIshow();
		UI.showInputCID();
		String ID = input.next();
		int count = database.delCID(ID);
		if (count == 0) {
			UI.showOperFailure();
			UI.showUnMatchedCID(ID);
		}
		else {
			UI.showOperSuccess();
			UI.showDeledCID(ID, count);
		}
		
	}

	
	
	/**
	 * ѧ������༶ ��ѧ����� ����ѧ����źͽ��� �˹�¼��
	 */
	public void arrangeStuByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexS = database.CheckedSID(id);
		if (indexS == -1)
				UI.showUnMatchedID(id);
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
				
			else {
				database.getStudents().get(indexS).setRoom(database.getClassRooms().get(indexC));
				UI.showOperSuccess();
			}
		}
	}	
	/**
	 * ѧ������༶ ��ѧ������ ���� ѧ�����ֺͽ��� �˹�¼��
	 */
	public void arrangeStuByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexS = database.CheckedSName(name);
		if (indexS == -1)
				UI.showUnMatchedName(name);
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				database.getStudents().get(indexS).setRoom(database.getClassRooms().get(indexC));
				UI.showOperSuccess();
			}
		}
	}
	
	/**
	 * ���ӽ�ʦ�ڿΰ༶ ����ʦ���  ���� ��ʦ��źͽ��� �˹�¼��
	 */
	public void arrangeAddTeaByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexT = database.CheckedTID(id);
		if (indexT == -1) {
				UI.showUnMatchedID(id);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				boolean result = true;
				for (int i = 0; i < database.getTeachers().get(indexT).getClassroom().size();i++) {
					if(database.getTeachers().get(indexT).getClassroom().get(i).getID().equals(ID)) {
						UI.showOperFailure();
						System.out.println("Ҫ���ŵİ༶�Ѵ��ڸý�ʦ�İ��ű���");
						result = false;
						break;
					}
				}
				if(result) {
				ClassRoom temproom = database.getClassRooms().get(indexC);
				database.getTeachers().get(indexT).getClassroom().add(temproom);
				UI.showOperSuccess();
				}	
			}
		}
	}
	/**
	 * ���ӽ�ʦ�ڿΰ༶ ����ʦ����  ���� ��ʦ���ֺͽ��� �˹�¼��
	 */
	public void arrangeAddTeaByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexT = database.CheckedTName(name);
		if (indexT == -1) {
				UI.showUnMatchedName(name);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			String ID = input.next();
			int indexC = database.CheckedCID(ID);
			if(indexC == -1) {
				UI.showUnMatchedCID(ID);
				UI.showOperFailure();
			}
			else {
				boolean result = true;
				for (int i = 0; i < database.getTeachers().get(indexT).getClassroom().size();i++) {
					if(database.getTeachers().get(indexT).getClassroom().get(i).getID().equals(ID)) {
						UI.showOperFailure();
						System.out.println("Ҫ���ŵİ༶�Ѵ��ڸý�ʦ�İ��ű���");
						result = false;
						break;
					}
				}
				if(result) {
				ClassRoom temproom = database.getClassRooms().get(indexC);
				database.getTeachers().get(indexT).getClassroom().add(temproom);
				UI.showOperSuccess();
				}	
			}
		}
	}
	
	/**
	 * ɾ����ʦ�ڿΰ༶ ����ʦ���  ���� ��ʦ��źͽ��� �˹�¼��
	 */
	public void arrangeDelTeaByID() {
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int indexT = database.CheckedTID(id);
		if (indexT == -1) {
				UI.showUnMatchedID(id);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			int count = 0;
			String ID = input.next();
			for (int i = 0; i < database.getTeachers().size(); i++) {
				for (int j = 0; j < database.getTeachers().get(i).getClassroom().size();j++) {
					if(database.getTeachers().get(i).getClassroom().get(j).getID().equals(ID)) {
						database.getTeachers().get(i).getClassroom().remove(j);
						count++;
					}
				}
			}
			if(count == 0){
				UI.showOperFailure();
				UI.showUnMatchedCID(ID);
			}
			else {
				UI.showMatchedCID(ID, count);
				UI.showOperSuccess();
			}
		}
	}
	/**
	 * ɾ����ʦ�ڿΰ༶ ����ʦ����  ���� ��ʦ���ֺͽ��� �˹�¼��
	 */
	public void arrangeDelTeaByName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		int indexT = database.CheckedTName(name);
		if (indexT == -1) {
				UI.showUnMatchedName(name);
				UI.showOperFailure();
		}
		else {
			UI.showInputCID();
			int count = 0;
			String ID = input.next();
			for (int i = 0; i < database.getTeachers().size(); i++) {
				for (int j = 0; j < database.getTeachers().get(i).getClassroom().size();j++) {
					if(database.getTeachers().get(i).getClassroom().get(j).getID().equals(ID)) {
						database.getTeachers().get(i).getClassroom().remove(j);
						count++;
					}
				}
			}
			if(count == 0){
				UI.showOperFailure();
				UI.showUnMatchedCID(ID);
			}
			else {
				UI.showMatchedCID(ID, count);
				UI.showOperSuccess();
			}
		}
	}

	
	/**
	 * ���˵�ѡ����ת����
	 */
	public void choiceMain() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getMain());	//��ʾ���˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//�˳����ݿ�
				UI.showExit();
				choice = false;
				break;
			case 1:					//�鿴���ݿ���Ϣ
				choiceSubview();
				break;
			case 2:					//��ѯ���ݿ���Ϣ
				choiceSubSearch();
				break;
			case 3:					//�޸����ݿ���Ϣ
				choiceSubModify();
				break;
			case 4:					//�������ݿ���Ϣ
				anyKeytoContinue();
				break;
			case 5:					//������ݿ���Ϣ
				anyKeytoContinue();
				break;
			case 6:					//�������ݿ���Ϣ
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-6");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * �鿴�Ӳ˵�ѡ����ת����
	 */
	public void choiceSubview() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) {
			UI.showMenu(UI.getSubView());	//��ʾ�鿴�Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:							//������һ��
				choice = false;
				break;
			case 1:							//�鿴���н�ʦ
				 database.showTeacher();;
				 anyKeytoContinue();
				break;
			case 2:							//�鿴����ѧ��
				database.showStudent();
				anyKeytoContinue();
				break;
			case 3:							//�鿴���а༶
				database.showClassRoom();
				anyKeytoContinue();
				break;
			default:		
				System.out.println("���뷶Χ��������������0-3");
				anyKeytoContinue();
			
			}
		}
	}
	/**
	 * �޸��Ӳ˵�ѡ����ת����
	 */
	public void choiceSubModify() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubModify());	//��ʾ�޸��Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//������һ��
				choice = false;
				break;
			case 1:					//������ʦ
				addTeaData();
				anyKeytoContinue();
				break;
			case 2:					//���˽�ʦ
				choiceSubOptionIndexdelTea();
				break;
			case 3:					//Ϊ��ʦ���ӻ�����ڿΰ༶
				choiceSubFunction();
				break;
			case 4:					//����ѧ��
				addStuData();	
				anyKeytoContinue();
				break;
			case 5:					//Ȱ��ѧ��
				choiceSubOptionIndexdelStu();
				break;
			case 6:					//Ϊѧ������༶
				choiceSubOptionIndexArrangeStu();
				break;
			case 7:					//�����༶
				addClassRoomData();
				anyKeytoContinue();
				break;
			case 8:					//��ɢ�༶
				delClassRoomData();
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-8");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * ��ѯ�Ӳ˵�ѡ����ת����
	 */
	public void choiceSubSearch() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubSearch());	//��ʾ��ѯ�Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:
				choice = false;
				break;
			case 1:					//��ѧ����Ų�ѯѧ��
				searchStuByID();
				anyKeytoContinue();
				break;
			case 2:
				searchStuByName();	//��ѧ��������ѯѧ��
				anyKeytoContinue();
				break;
			case 3:
				searchStuByCroom(); //���༶��ѯѧ��
				anyKeytoContinue();
				break;
			case 4:
				searchTeaByID();	//����ʦ���
				anyKeytoContinue();
				break;
			case 5:
				searchTeaByName();	//����ʦ����
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-5");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * ɾ��ѧ�� �����Ӳ˵�ѡ����ת���� 
	 */
	public void choiceSubOptionIndexdelStu() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				UI.showExit();
				choice = false;
				break;
			case 1:					//�����
				delStuByID();
				anyKeytoContinue();
				break;
			case 2:					//������
				delStuByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * Ϊѧ������༶ �����Ӳ˵�ѡ����ת���� ���Ű༶
	 */
	public void choiceSubOptionIndexArrangeStu() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//�����
				UI.showInputSID();
				arrangeStuByID();
				anyKeytoContinue();
				break;
			case 2:					//������
				UI.showInputSName();
				arrangeStuByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * ɾ����ʦ �����Ӳ˵�ѡ����ת����
	 */
	public void choiceSubOptionIndexdelTea() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//�����
				delTeaDataByID();
				anyKeytoContinue();
				break;
			case 2:					//������
				delTeaDataByName();
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * Ϊ��ʦ���Ű༶���� �����Ӳ˵�ѡ����ת����
	 */
	public void choiceSubOptionIndexArrangeTeaAdd() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//�����
				UI.showInputTID();
				arrangeAddTeaByID();
				anyKeytoContinue();
				break;
			case 2:					//������
				UI.showInputTName();
				arrangeAddTeaByName();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * Ϊ��ʦ���Ű༶ɾ�� �����Ӳ˵�ѡ����ת����
	 */
	public void choiceSubOptionIndexArrangeTeaDel() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubOptionIndex());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//�����
				UI.showInputTID();
				arrangeDelTeaByID();
				anyKeytoContinue();
				break;
			case 2:					//������
				UI.showInputTName();
				arrangeDelTeaByName();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	/**
	 * ���ӻ������ʦ�����Ӳ˵�
	 */
	public void choiceSubFunction() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubFunction());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//�����ڿΰ༶
				choiceSubOptionIndexArrangeTeaAdd();
				anyKeytoContinue();
				break;
			case 2:					//�����ڿΰ༶
				choiceSubOptionIndexArrangeTeaDel();
				anyKeytoContinue();
				break;
			default:
				System.out.println("���뷶Χ��������������0-2");
				anyKeytoContinue();
			}
		}
	}
	
	/**
	 * ����ѧ����Ϣ
	 */
	public void downloadStuAllInfo() {
		boolean result = false;
		File tempfile = new File("D:/ѧ����Ϣ.txt");
		FileOperForDatum datumFOper  = new FileOperForDatum(database,tempfile);
		result = datumFOper.downloadInfoStu();
		if(result)
			UI.showOperSuccess();
		else
			UI.showOperFailure();
	}
	
	/**
	 * ������Ϣ�Ӳ˵�
	 */
	public void choiceSubDownload() {
		Checked check = new Checked();
		boolean choice = true;
		while(choice) { 
			UI.showMenu(UI.getSubDownload());	//��ʾ����ѡ���Ӳ˵�
			System.out.println("����ݲ˵�����ѡ��");
			switch(check.checkInt()) {
			case 0:					//����
				choice = false;
				break;
			case 1:					//������ʦ��Ϣ
				//
				anyKeytoContinue();
				break;
			case 2:					//����ѧ����Ϣ
				//
				anyKeytoContinue();
				break;
			case 3:					//���ذ༶��Ϣ
				//
				anyKeytoContinue();
				break;	
			default:
				System.out.println("���뷶Χ��������������0-3");
				anyKeytoContinue();
			}
		}
	}
	
	public void readDBFromFile() {
		
	}

	public void saveDBToFile() {
		
	}
	
	public void anyKeytoContinue() {
		System.out.println("��Y���󰴻س�������");
		Scanner input = new Scanner(System.in);
		String str = input.next();
	}
}
