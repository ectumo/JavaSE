package com.entity;

import java.util.ArrayList;

public class Teacher {
	private int tid;
	private String name;
	//教师所带班级信息
	private ArrayList<ClassInfo> classInfos;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ClassInfo> getClassInfos() {
		return classInfos;
	}
	public void setClassInfos(ArrayList<ClassInfo> classInfos) {
		this.classInfos = classInfos;
	}
	public Teacher(int tid, String name, ArrayList<ClassInfo> classInfos) {
		super();
		this.tid = tid;
		this.name = name;
		this.classInfos = classInfos;
	}
	public Teacher() {
		super();
	}
	
}
