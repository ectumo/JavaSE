import java.util.Arrays;

/**
 * 
 */

/**
 * @Description 
 * @author 朱林
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017年6月17日 上午10:38:07
 */


public class ArrOper{
	void print (int ArrName[],int ArrLen){
		for (int i = 0; i < ArrLen; i++){
			Arrays.sort();
			
		}
	}
	
	
	
	void asc (int ArrName[], int ArrLen){	//升序排列
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

