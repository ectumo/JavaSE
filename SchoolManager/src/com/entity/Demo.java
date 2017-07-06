package com.entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<ClassInfo> classInfos = new ArrayList<ClassInfo>();
		Scanner input = new Scanner(System.in);
		//����demo���󣬵��ó�ʼ������
		Demo demo = new Demo();
		demo.init(teachers, students, classInfos);
		boolean flag = true;//ѭ���ı�ʶ 
		do {
			flag = demo.choose(input,teachers, students, classInfos,flag);
		} while (flag);
		
	}
	
	/**
	 * �˵�����
	 */
	public void menu(){
		System.out.println("*************��ӭ����У԰��Ϣ����ϵͳ*************");
		System.out.println("1.�鿴������ʦ");
		System.out.println("2.�鿴����ѧ��");
		System.out.println("3.������ʦ");
		System.out.println("4.����ѧ��");
		System.out.println("5.ɾ����ʦ");
		System.out.println("6.ɾ��ѧ��");
		System.out.println("7.ָ����ʦ����");
		System.out.println("8.ָ��ѧ���༶");
		System.out.println("9.�ڿ�");
		System.out.println("10.����������ʦ��Ϣ");
		System.out.println("11.��������ѧ����Ϣ");
		System.out.println("12.�˳�ϵͳ");
		System.out.println("*******************************************");
		System.out.println("��ѡ��");
	}
	
	/**
	 * ��ʼ����Ϣ
	 * @param teachers ��ʦ��Ϣ
	 * @param students ѧ����Ϣ
	 * @param classInfos �༶��Ϣ
	 */
	public void init(ArrayList<Teacher> teachers,ArrayList<Student> students,ArrayList<ClassInfo> classInfos){
		//�༶��Ϣ
		classInfos.add(new ClassInfo(1001, "java"));
		classInfos.add(new ClassInfo(1002, "html"));
		classInfos.add(new ClassInfo(1003, "oracle"));
		classInfos.add(new ClassInfo(1004, "JQuery"));
		classInfos.add(new ClassInfo(1005, "c#"));
		//ѧ����Ϣ
		students.add(new Student(1, "����", classInfos.get(0)));
		students.add(new Student(2, "����", classInfos.get(0)));
		students.add(new Student(3, "����", classInfos.get(1)));
		students.add(new Student(4, "����", classInfos.get(1)));
		students.add(new Student(5, "����", classInfos.get(2)));
		students.add(new Student(6, "���", classInfos.get(2)));
		students.add(new Student(7, "����", classInfos.get(3)));
		students.add(new Student(8, "Сǿ", classInfos.get(3)));
		//��ʦ��Ϣ
		teachers.add(new Teacher(1, "����",new ArrayList<ClassInfo>()));
		teachers.add(new Teacher(2, "����",new ArrayList<ClassInfo>()));
		teachers.add(new Teacher(3, "����",new ArrayList<ClassInfo>()));
		teachers.get(0).getClassInfos().add(classInfos.get(0));
		teachers.get(0).getClassInfos().add(classInfos.get(1));
		teachers.get(1).getClassInfos().add(classInfos.get(2));
		teachers.get(1).getClassInfos().add(classInfos.get(3));
	}
	
	/**
	 * ����0����
	 * @param input ɨ����
	 */
	public void byZero(Scanner input){
		System.out.println("����0����");
		input.next();
	}
	
	/**
	 * ѡ�񷽷�
	 * @param input ɨ����
	 * @param teachers ��ʦ��Ϣ
	 * @param students ѧ����Ϣ
	 * @param classInfos �༶��Ϣ
	 * @param flag ѭ���ı�ʶ
	 * @return ����ѭ���ı�ʶ������ѭ��
	 */
	public boolean choose(Scanner input,ArrayList<Teacher> teachers,ArrayList<Student> students,ArrayList<ClassInfo> classInfos,boolean flag){
		menu();
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			//1.�鿴������ʦ
			selectTeacher(teachers);
			byZero(input);
			break;
		case 2:
			//2.�鿴����ѧ��
			selectStudent(students);
			byZero(input);
			break;
		case 3:
			//3.������ʦ
			addTeacher(teachers, input);
			byZero(input);
			break;
		case 4:
			addStudent(students, input);
			byZero(input);
			//4.����ѧ��
			break;
		case 5:
			//5.ɾ����ʦ
			deleteTeacher(teachers, input);
			byZero(input);
			break;
		case 6:
			//6.ɾ��ѧ��
			deleteStudent(students, input);
			byZero(input);
			break;
		case 7:
			//7.ָ����ʦ����
			updateTeacherClassInfos(teachers, classInfos, input);
			byZero(input);
			break;
		case 8:
			//8.ָ��ѧ���༶
			updateStudentClassInfo(students, classInfos, input);
			byZero(input);
			break;
		case 9:
			//9.�ڿ�
			teach(teachers, input);
			byZero(input);
			break;
		case 10:
			//10.����������ʦ��Ϣ
			downloadTeacher(teachers);
			byZero(input);
			break;
		case 11:
			//11.��������ѧ����Ϣ
			downStudent(students);
			byZero(input);
			break;
		case 12:
			//12.�˳�ϵͳ
			System.out.println("ллʹ�ã���������");
			flag = false;
			break;
		default:
			System.out.println("��������˳�ϵͳ");
			flag = false;
			break;
		}
		return flag;
	}
	
	/**
	 * �鿴������ʦ
	 * @param teachers ��ʦ��Ϣ
	 */
	public void selectTeacher(ArrayList<Teacher> teachers){
		System.out.println("��ʦ���\t��ʦ����\t�����༶");
		for (int i = 0; i < teachers.size(); i++) {
			System.out.print(teachers.get(i).getTid()+"\t"+teachers.get(i).getName()+"\t");
			if(teachers.get(i).getClassInfos().size()>0){
				for (int j = 0; j < teachers.get(i).getClassInfos().size(); j++) {
					System.out.print(teachers.get(i).getClassInfos().get(j).getClassName()+" ");
				}
			}else{
				System.out.print("�ý�ʦû�д���");
			}
			System.out.println();
		}
	}
	
	/**
	 * �鿴����ѧ��
	 * @param students ѧ����Ϣ
	 */
	public void selectStudent(ArrayList<Student> students){
		System.out.println("ѧ�����\tѧ������\t�����༶");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getSid()+"\t"+students.get(i).getName()+"\t"+students.get(i).getClassInfo().getClassName());
		}
	}
	
	/**
	 * �����ʦ
	 * @param teachers ��ʦ��Ϣ
	 * @param input ɨ����
	 */
	public void addTeacher(ArrayList<Teacher> teachers,Scanner input){
		System.out.println("��������ʦ������");
		String name = input.next();
		Teacher t = new Teacher(teachers.size()+1, name, new ArrayList<ClassInfo>());
		teachers.add(t);
		System.out.println("��ӳɹ�!");
	}
	
	/**
	 * ���ѧ��
	 * @param students ѧ����Ϣ
	 * @param input ɨ����
	 */
	public void addStudent(ArrayList<Student> students,Scanner input){
		System.out.println("������ѧ��������");
		String name = input.next();
		Student s = new Student(students.size()+1, name, new ClassInfo());
		students.add(s);
		System.out.println("��ӳɹ�!");
	}
	
	/**
	 * ɾ����ʦ--ɾ����ʦʱ����Ҫ�жϸ���ʦ�Ƿ��Ѵ��Σ����û�д��Σ���ֱ��ɾ����������Σ�����Ҫ
	 * ָ���µ���ʦ����
	 * @param teachers ��ʦ��Ϣ
	 * @param input ɨ����
	 */
	public void deleteTeacher(ArrayList<Teacher> teachers,Scanner input){
		selectTeacher(teachers);
		System.out.println("������Ҫɾ������ʦ���");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);//���ڻ�ȡָ����ʦ���±�
		if(index==-1){
			System.out.println("û�и���ʦ����ȷ�Ϻ�ɾ��");
		}else{
			if(teachers.get(index).getClassInfos().size()>0){
				System.out.println("�������µĴ�����ʦ���");
				int newTid = input.nextInt();
				int newIndex = getTeacherIndex(teachers, newTid);
				ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
				ArrayList<ClassInfo> list2 = teachers.get(newIndex).getClassInfos();
				for (int i = 0; i < list.size(); i++) {
					list2.add(list.get(i));
				}
				teachers.get(newIndex).setClassInfos(list2);
				teachers.remove(index);
				System.out.println("ɾ���ɹ�");
			}else{
				teachers.remove(index);
				System.out.println("ɾ���ɹ�");
			}
		}
	}
	
	/**
	 * �����������ʦid��ȡ���±�
	 * @param teachers ��ʦ��Ϣ
	 * @param tid �������ʦid
	 * @return �����±�
	 */
	public int getTeacherIndex(ArrayList<Teacher> teachers,int tid){
		int index = -1;
		for (int i = 0; i < teachers.size(); i++) {
			if(teachers.get(i).getTid()==tid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * ���������ѧ��id��ȡ���±�
	 * @param students ѧ����Ϣ
	 * @param sid �����ѧ�����
	 * @return �����±�
	 */
	public int getStudentIndex(ArrayList<Student> students,int sid){
		int index = -1;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getSid()==sid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * ���������ѧ��id��ȡ���±�
	 * @param students ѧ����Ϣ
	 * @param sid �����ѧ�����
	 * @return �����±�
	 */
	public int getClassInfoIndex(ArrayList<ClassInfo> classInfos,int cid){
		int index = -1;
		for (int i = 0; i < classInfos.size(); i++) {
			if(classInfos.get(i).getClassId()==cid){
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * ɾ��ѧ��
	 * @param students ѧ����Ϣ
	 * @param input ɨ����
	 */
	public void deleteStudent(ArrayList<Student> students,Scanner input){
		selectStudent(students);
		System.out.println("������Ҫɾ����ѧ�����");
		int sid = input.nextInt();
		int index = getStudentIndex(students, sid);
		if(index==-1){
			System.out.println("��ѧ��������");
		}else{
			students.remove(index);
			System.out.println("ɾ���ɹ�");
		}
	}
	
	/**
	 * ָ����ʦ����
	 * @param teachers ��ʦ��Ϣ
	 * @param classInfos �༶��Ϣ
	 * @param input ɨ����
	 */
	public void updateTeacherClassInfos(ArrayList<Teacher> teachers,ArrayList<ClassInfo> classInfos,Scanner input){
		selectTeacher(teachers);
		System.out.println("��ѡ��Ҫ�������ʦ���");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);
		selectClassInfo(classInfos);
		System.out.println("���������ʦҪ���İ༶���");
		int classId = input.nextInt();
		int cindex = getClassInfoIndex(classInfos, classId);
		//��ȡ����ʦ�Ѿ����İ༶����
		ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
		boolean f = true;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getClassId()==classId){
				f = false;
				break;
			}
		}
		if (f) {
			//����ָ��
			ClassInfo classInfo = classInfos.get(cindex);
			teachers.get(index).getClassInfos().add(classInfo);
			System.out.println("ָ�ɳɹ�");
		}else{
			//����İ༶����Լ��Ǹ���ʦ��
			System.out.println("�ð༶�Ѿ��Ǹ���ʦ����");
		}
	}
	
	/**
	 * �鿴���а༶
	 * @param classInfos �༶��Ϣ
	 */
	public void selectClassInfo(ArrayList<ClassInfo> classInfos){
		System.out.println("�γ̱��\t�γ�����");
		for (int i = 0; i < classInfos.size(); i++) {
			System.out.println(classInfos.get(i).getClassId()+"\t"+classInfos.get(i).getClassName());
		}
	}
	
	/**
	 * ָ��ѧ���༶��Ϣ
	 * @param students ѧ����Ϣ
	 * @param classInfos �༶��Ϣ
	 * @param input ɨ����
	 */
	public void updateStudentClassInfo(ArrayList<Student> students,ArrayList<ClassInfo> classInfos,Scanner input){
		selectStudent(students);
		System.out.println("������Ҫָ�ɵ�ѧ�����");
		int sid = input.nextInt();
		int index = getStudentIndex(students, sid);
		if(index==-1){
			System.out.println("��ѧ��������");
		}else{
			selectClassInfo(classInfos);
			System.out.println("��ѡ��Ҫָ�ɵİ༶���");
			int cid = input.nextInt();
			int cindex = getClassInfoIndex(classInfos, cid);
			ClassInfo classInfo = classInfos.get(cindex);
			students.get(index).setClassInfo(classInfo);
			System.out.println("ָ�ɳɹ�");
		}
	}
	
	/**
	 * �ڿ�
	 * @param teachers ��ʦ��Ϣ
	 * @param input ɨ����
	 */
	public void teach(ArrayList<Teacher> teachers,Scanner input){
		selectTeacher(teachers);
		System.out.println("������Ҫ�ڿε���ʦ���");
		int tid = input.nextInt();
		int index = getTeacherIndex(teachers, tid);
		if(index==-1){
			System.out.println("����ʦ������");
		}else{
			ArrayList<ClassInfo> list = teachers.get(index).getClassInfos();
			System.out.println("����ʦ���İ༶Ϊ��");
			System.out.println("�༶���\t�༶����");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getClassId()+"\t"+list.get(i).getClassName());
			}
			System.out.println("��ѡ��Ҫ�ڿεİ༶");
			int cid = input.nextInt();
			int cindex = getClassInfoIndex(list, cid);
			ClassInfo classInfo = list.get(cindex);
			System.out.println(teachers.get(index).getName()+"��ʦ��"+classInfo.getClassName()+"���ڿ�");
		}
	}
	
	/**
	 * ����������ʦϵ��Ϣ
	 * @param teachers ��ʦ��Ϣ
	 */
	public void downloadTeacher(ArrayList<Teacher> teachers){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\teacher.txt");
			bw = new BufferedWriter(fw);
			String s = "";
			s+="��ʦ���\t��ʦ����\t�����༶\r\n";
			for (int i = 0; i < teachers.size(); i++) {
				s+=teachers.get(i).getTid()+"\t"+teachers.get(i).getName()+"\t";
				if(teachers.get(i).getClassInfos().size()>0){
					for (int j = 0; j < teachers.get(i).getClassInfos().size(); j++) {
						s+=teachers.get(i).getClassInfos().get(j).getClassName();
					}
				}else{
					s+="�ý�ʦû�д���";
				}
				s+="\r\n";
			}
			System.out.println("���سɹ������ص�������");
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * ����ѧ����Ϣ
	 * @param students ѧ����Ϣ
	 */
	public void downStudent(ArrayList<Student> students){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\student.txt");
			bw = new BufferedWriter(fw);
			String s = "";
			s+=s.format("%-12.10s%-12.10s%-12.10s\n", "ѧ�����","ѧ������","�����༶");
			for (int i = 0; i < students.size(); i++) {
				s+=s.format("%-12.10s\t%-12.10s\t%-12.10s\t\n", students.get(i).getSid(),students.get(i).getName(),students.get(i).getClassInfo().getClassName());
			}
			System.out.println("���سɹ������ص�������");
			bw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
