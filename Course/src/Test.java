import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		int i,j;
		int [][] arr = {
				{1,2,3,4,5},
				{11,12,13,14,15},
				{21,22,23,24,25},
				{31,32,33,34,35},
				{41,42,43,44,45},
				
		};
		for (i = 0; i<5; i++){
			for (j = 0; j <5; j++)
				System.out.print(arr[i][j]+",");
		System.out.println("");
		}
		System.out.println("");
		for (i = 3; i<5-1;i++){
			arr[i] = arr[i+1];
		}
		for (i = 0; i<4; i++){
			for (j = 0; j <5; j++)
				System.out.print(arr[i][j]+",");
		System.out.println();
		}
		Date date=new Date();
		  DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		  String time = format.format(date);
		  System.out.println(time);
		
		
	}
}
