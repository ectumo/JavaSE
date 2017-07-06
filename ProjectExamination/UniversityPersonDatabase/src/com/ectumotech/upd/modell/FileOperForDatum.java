package com.ectumotech.upd.modell;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOperForDatum {
	private Datum database;
	private File savedfile;
	
	
	public FileOperForDatum() {
		super();
		database = null;
		savedfile = null;
	}
	public FileOperForDatum(Datum database,File pathAndFileName) {
		this.database = database;
		this.savedfile = pathAndFileName;
	}
	
	
	
	public boolean[] downloadInfo(boolean teacher,boolean student,boolean classroom) {
		boolean [] result = {false,false,false};
		if(teacher)
			result[0] = downloadInfoTea();
		if(student)
			result[1] = downloadInfoStu();
		if(classroom)
			result[2] = downloadInfoClassroom();
		return result;
	}
	public boolean downloadInfoStu() {
		boolean result = false;
		if(savedfile.exists()) {
			FileWriter tempInfo = null;
			BufferedWriter buffWriter = null;
			try {
				tempInfo = new FileWriter(savedfile);
				buffWriter = new BufferedWriter(tempInfo);
				String tempStr = "";
				tempStr += String.format("%-10.8s%-10.8s%-8.6s%-12.10s\n","学号","学生姓名","状态","所在班级");
				for (int i = 0; i< database.getStudents().size();i++) {
					tempStr += String.format("%-10.8s%-10.8s%-12.10s%-8.6s\n",
							database.getStudents().get(i).getId(),
							database.getStudents().get(i).getName(),
							database.getStudents().get(i).getStatus(),
							database.getStudents().get(i).getRoom());
				}
				buffWriter.write(tempStr);
				result = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					buffWriter.flush();
					buffWriter.close();
					tempInfo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return result;
	}
	public boolean downloadInfoTea() {
		boolean result = false;
		return result;
	}
	public boolean downloadInfoClassroom() {
		boolean result = false;
		FileWriter tempInfo = null;
		BufferedWriter buffWriter = null;
		try {
			tempInfo = new FileWriter(savedfile);
			buffWriter = new BufferedWriter(tempInfo);
			String tempStr = "";
			tempStr += String.format("%-12.10s","班级编号");
			for (int i = 0; i < database.getClassRooms().size();i++) {
				tempStr+=String.format("%-12.10s",database.getClassRooms().get(i).getID() );
			}
			buffWriter.write(tempStr);
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				buffWriter.flush();
				buffWriter.close();
				tempInfo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}	
}
