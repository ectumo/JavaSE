/**
 * @Description:DVD���޷�������
 * 				δ���κ�������֤
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��17�� ����4:40:27
 */
import java.util.*;

public class DVDRent {
		//DVD�ֿ��������
		final static int MAX = 100;
		//DVD�ֿ⵱ǰ����
		static int dvdcount = 0;
		//DVD���
		static int [] dvdid = new int [MAX];
		//DVD����
		static String[] dvdname = new String[MAX];
		//����״̬
		static boolean[] rentstatus = new boolean[MAX];
		//��������
		static int[] rentdate = new int[MAX];
		//�������
		static int[] renttimes = new int[MAX];
		
		
	public static void main(String[] args) {
		int choice=0; //�˵�ѡ��
		/**
		 * �˵�ѡ��
		 */
		Scanner input = new Scanner (System.in);
		/**
		 * ����˵�ѡ��ֻҪ��ѡ���˳�һֱѭ��
		 */
		while (choice != 6){
			dvdmenu();
			System.out.println("����ݲ˵�����ѡ��(1-6)");
			choice = input.nextInt();
			//��������˳� ����ӡ�������ллʹ�ã��ټ���
			switch (choice){
			case 1:		//����
				System.out.println("����DVD");
				break;
			case 2:		//�鿴
				System.out.println("�鿴DVD");
				break;
			case 3:		//ɾ��
				System.out.println("ɾ��DVD");
				break;
			case 4:		//���
				System.out.println("���DVD");
				break;
			case 5:		//�黹
				System.out.println("�黹DVD");
				break;
			case 6:		//�˳�
				System.out.println("�˳�ϵͳ");
				break;	
			}
		}

	}


//��ʾ�˵�
static void dvdmenu(){
	System.out.println("DVD���˵�");
	System.out.println("**************");
	System.out.println("* 1.����DVD  **");
	System.out.println("* 2.�鿴DVD  **");
	System.out.println("* 3.ɾ��DVD  **");
	System.out.println("* 4.���DVD  **");
	System.out.println("* 5.�黹DVD  **");
	System.out.println("* 6.�˳�ϵͳ       **");
	System.out.println("**************");
	
};
//�鿴
static void showdvd (){
	if (dvdcount == 0){
		System.out.println("��ǰ�ֿ�DVD����Ϊ0,��������");
		return;
	}
	for (int i = 0; i < dvdcount; i++){
		System.out.print("���"+dvdid[i]+"\t");
		System.out.print("����"+dvdname[i]+"\t");
		System.out.print("״̬"+rentstatus[i]+"\t");
		System.out.print("��������"+rentdate[i]+"\t");
		System.out.print("�������"+renttimes[i]+"\n");
	}
	return;	
};
static void adddvd (){
	
};
static void deldvd(){
	if (dvdcount == 0){
		System.out.println("��ǰ�ֿ�DVD����Ϊ0,��������");
		return;
	}
	System.out.println("��ѡ��Ҫ������DVD���");
	
};
static void returndvd(){
	
};
static void exit(){
	
	System.out.println("��лʹ��,�����˳�");	
};

}