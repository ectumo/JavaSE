import java.util.Arrays;

/**
 * 
 */

/**
 * @Description 
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��17�� ����10:38:07
 */


public class ArrOper{
	void print (int ArrName[],int ArrLen){
		for (int i = 0; i < ArrLen; i++){
			Arrays.sort();
			
		}
	}
	
	
	
	void asc (int ArrName[], int ArrLen){	//��������
		int TmpSwitch;
		for (int i = 0; i < ArrLen - 1;i++){
			for(int j = 0; j < ArrLen - i;j++){
				if(ArrName[j+1] > ArrName[j]){
					TmpSwitch = ArrName[j];
					ArrName[j+1] = ArrName[j];
					ArrName[j] = TmpSwitch;	
				}
			}
		}
	}
	
}

