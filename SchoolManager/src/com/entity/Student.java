package com.entity;

public class Student {
	private int sid;
	private String name;
	private ClassInfo classInfo;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ClassInfo getClassInfo() {
		return classInfo;
	}
	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}
	public Student(int sid, String name, ClassInfo classInfo) {
		super();
		this.sid = sid;
		this.name = name;
		this.classInfo = classInfo;
	}
	public Student() {
		super();
	}
	
}
