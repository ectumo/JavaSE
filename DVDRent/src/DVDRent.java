/**
 * @Description:DVD���޷�������
 * 				δ���κ�������֤
 * @author ����
 * @Version 1.0
 * @Copyright: ECT.Tech.Com 2015-2017
 * @PublishDate: 2017��6��17�� ����4:40:27
 */
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class DVDRent {
		/**
		 * ȫ�ֱ���
		 */
		//DVD�ֿ��������
		final static int DVDMAX = 10; 	//��������(��) ������������
		final static int DATAS = 5; 	//�������(��) �����������
		final static int ID = 0;		//DVD����ֶ� �±�
		final static int NAME = 1;		//DVD�����ֶ� �±�
		final static int STATUS = 2;	//DVD���״̬�ֶ� �±�
		final static int DATE = 3;		//DVD���ʱ���ֶ� �±�
		final static int TIMES = 4;		//DVD�������ֶ� �±�
		
		
		//DVD�ֿ⵱ǰ����
		static int dvdcount = 0;
		static int[][] dvds = new int [DVDMAX][DATAS];		//���ڴ��DVD����Ϣ
		static String[] dvdnames = new String[DVDMAX];			//���ڴ��DVD�����ַ��� ����Ԥ��40		
		static Date[] rentdate = new Date[DVDMAX];			//���ڴ����������
		static String[] title = new String[] {"���","DVD����","״̬","�������","�������"}; 	//����
		static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		//�����������ݸ�ʽ��
		static Scanner input = new Scanner (System.in);
		static int addid;		//����DVDʱ��ʱID
		static String addnames;	//����DVDʱ��ʱ����
		
		
		/**
		 * �������
		 */
		public static void main(String[] args){
			/**
			 * ����˵�ѡ��
			 */
			int choice=0; //�˵�ѡ��
			InitDVD();	//���÷�����ʼ��DVD�ֿ�����;
			System.out.println("��ӭʹ��DVD����ϵͳ���������ʾ�������ѡ��\n");
			while (choice != 6){	//ֻҪ��ѡ���˳�(����6)һֱѭ��
				DVDMenu();
				System.out.println("����ݲ˵�����ѡ��(1-6)");
				choice = input.nextInt();
				//��������˳� ����ӡ�������ллʹ�ã��ټ���
				switch (choice){
				case 1:		//����
					//System.out.println("����DVD");
					AddDVD();
					break;
				case 2:		//�鿴
					//System.out.println("�鿴DVD");
					ShowDVD();
					break;
				case 3:		//ɾ��
					//System.out.println("ɾ��DVD");
					DelDVD();
					break;
				case 4:		//���
					//System.out.println("���DVD");
					RentDVD();
					break;
				case 5:		//�黹
					//System.out.println("�黹DVD");
					ReturnDVD();
					break;
				case 6:		//�˳�
					//System.out.println("�˳�ϵͳ");
					exit();
					break;	
				default:
					System.out.println("����ѡ���������������");
					break;
				}
			}
		}


/**
 * ��ӡ�˵�
 */
	static void DVDMenu(){
		System.out.println();
		System.out.println("  DVD���˵�");
		System.out.println("****************");
		System.out.println("* 1.����DVD   **");
		System.out.println("* 2.�鿴DVD   **");
		System.out.println("* 3.ɾ��DVD   **");
		System.out.println("* 4.���DVD   **");
		System.out.println("* 5.�黹DVD   **");
		System.out.println("* 6.�˳�ϵͳ  **");
		System.out.println("****************");	
	};

/**
 * ��ʼ��DVD�ֿ�
 */
	static void InitDVD(){
		int [] data1 = {1,0,0,0,4};
		int [] data2 = {2,1,0,1,5};
		int [] data3 = {3,2,0,2,6};
		int [] data4 = {4,3,1,3,7};
		int [] data5 = {5,4,1,4,8};
		int [] data6 = {6,5,1,5,9};
		int [] data7 = {7,6,1,6,10};
		dvds[0] = data1;
		dvds[1] = data2;
		dvds[2] = data3;
		dvds[3] = data4;
		dvds[4] = data5;
		dvds[5] = data6;
		dvds[6] = data7;
		dvdnames[0] = "���ػ�Ӱ";
		dvdnames[1] = "���羪��";
		dvdnames[2] = "ս����Ϸ";
		dvdnames[3] = "��ų�����";
		dvdnames[4] = "��������";
		dvdnames[5] = "��ȴ���";
		dvdnames[6] = "��ʮ����";
		try {
			rentdate[0] = dateFormat.parse("2017-06-11 11:11:11");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[1] = dateFormat.parse("2017-06-12 12:12:12");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[2] = dateFormat.parse("2017-06-13 13:13:13");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[3] = dateFormat.parse("2017-06-14 14:14:14");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[4] = dateFormat.parse("2017-06-15 15:15:15");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[5] = dateFormat.parse("2017-06-16 16:16:16");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			rentdate[6] = dateFormat.parse("2017-06-17 17:17:17");
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		dvdcount = 7;
	};

/**
 * ��ʽ�����⼰����
 */
	//��ʽ������
	static void FormatTitle(){
		for (int i = 0; i < DATAS; i++){	//���÷�����ӡ����
			if(i==ID)
				System.out.format("%-5s\t",title[i]);	
			else if(i==NAME)
				System.out.format("%-14s\t",title[i]);	
			else if(i==STATUS)
				System.out.format("%-8s\t",title[i]);	
			else if(i==DATE)
				System.out.format("%-19s\t",title[i]);
			else 
				System.out.format("%-6s\t",title[i]);				
		}
		System.out.println();	
	};

	//��ʽ������
	static void FormatData(int i){
		for (int j = 0; j < DATAS; j++ ){
			if(j == ID)
				System.out.format("%-5d\t",dvds[i][j]);	//��ӡint�������� �������
			else if(j == NAME)
				System.out.format("%-14s\t",dvdnames[dvds[i][j]]);	//��ӡString���� DVD����
			else if (j== STATUS){
				if (dvds[i][j] == 0)
					System.out.format("%-8s\t","�ڿ���");
				else
					System.out.format("%-8s\t","�ѽ��");
			}
			else if(j == DATE)	
				if(dvds[i][2] != 0)
					try{
						System.out.format("[%19s]\t ",dateFormat.format(rentdate[dvds[i][j]]));	//��ӡ������������ �������
						}
					catch(Exception e){
					}
				else
					System.out.format("[%19s]\t ","yyyy-MM-dd HH:mm:ss");
			else
				System.out.format("  %-6d\t",dvds[i][j]);	//��ӡint�������� �������
		}
	};
	
/**
 * �鿴DVD���ݿ��е�ȫ����Ϣ
 */
	static void ShowDVD(){
		/**
		 * �жϿ����Ƿ����DVD
		 */
		if (dvdcount == 0){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("��ǰ�ֿ�DVD����Ϊ0,��������!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;	
		}
		/**
		 * ����DVD ��ӡDVD��Ϣ
		 */
		System.out.println("#################################################################################");
			FormatTitle();	//���÷�����ӡ��ʽ����ı���
	
		for (int i = 0; i < dvdcount; i++){ 
			FormatData(i);	//���÷�����ӡ��ʽ�����ÿһ������
		System.out.println();	
		}
		System.out.println("#################################################################################");
		System.out.println("�ֿ⵱ǰ״̬"+dvdcount+"/"+DVDMAX+"\tʹ���ʣ�"+((double)dvdcount/DVDMAX*100.00)+"%");
		return;	
	};

/**
 * ����DVD��Ϣ��DVD���ݿ�
 */
	static void AddDVD(){
		//DVD���ݿ��Ѵ�����
		if (dvdcount >= DVDMAX){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("��ǰ�ֿ�DVD�����Ѵﵽ����,�޷���������ɾ����");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		//DVD���ݿ�δ������
		System.out.println("������Ҫ���ӵ�DVD������Ϣ");
		//¼��id
		System.out.print("������DVD�ı��(����)");
		addid = input.nextInt();
		//�ж��Ƿ����DVD���ݿ���
		for (int i = 0; i < dvdcount; i++){
		//��Ŵ���
			if(dvds[i][ID] == addid){
				System.out.println("���Ϊ��"+addid+"����DVD�Ѵ���");
				//��ӡ������ID��ص�DVD��Ϣ
				System.out.println("#################################################################################");
				FormatTitle();
				FormatData(i);
				System.out.println();
				System.out.println("#################################################################################");
				System.out.println();
				return;
			}
		}
		//��Ų�����
			//¼����
				dvds[dvdcount][ID] = addid;	//����������ĩβ
			//¼������
				System.out.println("������DVD������(�ַ���)");
				addnames = input.next();
				dvdnames[dvdcount] = addnames;		//name���ӽ�name����
			dvds[dvdcount][NAME] = dvdcount;		//��dvds�����д����Ӧ��index���
			//��ʼ�����״̬
				dvds[dvdcount][STATUS] = 0;
			//��ʼ��������� 
				rentdate[dvdcount] = new Date();
				//System.out.println(rentdate[dvdcount+1]);
				dvds[dvdcount][DATE] = dvdcount;
			//��ʼ���������	
				dvds[dvdcount][TIMES] = 0;
			//DVD������1
				dvdcount++;
	};
		
/**
 * ��DVD���ݿ���ɾ������Ҫ���DVD��Ϣ
 */
	static void DelDVD(){
		//DVD���ݿ�Ϊ��
		if (dvdcount == 0){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("��ǰ�ֿ�DVD����Ϊ0,��������!");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		//DVD���ݿ�������
		System.out.println("��ѡ��Ҫ������DVD���");{
			int id = input.nextInt();
			int i,j;
			int index =-1; //���ڴ����ʱ�����õĶ�ά����DVDS���±ꡣ
		
			for (i = 0; i < dvdcount; i++){
				if (id == dvds[i][ID]){
					index = i;
					break;
				}
			}
			if (index != -1 ){
				if (dvds[index][STATUS] == 1){
					System.out.println("���Ϊ["+id+"]��DVD�ѽ��,��˶Ժ��ٲ�����");
					//��ӡ������ID��ص�DVD��Ϣ
					System.out.println("#################################################################################");
					FormatTitle();
					FormatData(index);
					System.out.println();
					System.out.println("#################################################################################");
					System.out.println();
				}
				else{	
					System.out.println("�ҵ���ɾ���˱��Ϊ��"+id+"����DVD");
					//��ӡ������ID��ص�DVD��Ϣ
					System.out.println("#################################################################################");
					FormatTitle();
					FormatData(index);
					System.out.println();
					System.out.println("#################################################################################");
					System.out.println();
					//����ӦID�±��DVD��Ϣ��Ϊ��DVD��һ��DVD����Ϣ ����DVD����ȥ1
					for(j = index; j < dvdcount-1;j++){
						//System.out.format("%s,%s\n",dvds[j],dvds[j+1]); //���Դ���
						dvdnames[j] = dvdnames[(j+1)];
						rentdate[j] = rentdate[(j+1)];
						dvds[j] = dvds[(j+1)];
						dvds[j][NAME] = j;
						dvds[j][DATE] = j;
						//System.out.format("%s,%s\n",dvds[j],dvds[j+1]); //���Դ���
					}
					dvdcount--;	//��ǰDVD����1
					System.out.println("ɾ�����DVD��Ϣ������");
					ShowDVD();
				}
			}			
			else
				System.out.println("δ�ҵ����Ϊ["+id+"]��DVD,��˶Ժ��ٲ�����");
		}	
	};

/**
 * ���DVD	
 */
	static void RentDVD(){
		int count = dvdcount;
		int rentid;
		int rentindex = -1;
		for (int i = 0; i < dvdcount; i++){
			if(dvds[i][STATUS] == 1)
				count--;
		}
		if (count < 1){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("����DVD���ѽ��,��ȴ��黹������DVD��");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		System.out.println("��ǰ�������Ϊ("+count+")������Ҫ����DVD���:");
			rentid = input.nextInt();
		for (int i = 0; i < dvdcount; i++){
			if (rentid == dvds[i][ID]){	//�ҵ�id
				rentindex = i;			//�ҵ����¼�±�
				break;
			}
		}
		if(rentindex == -1){	//û�ҵ�
			System.out.println("�����DVD���:��"+rentid+"��δ��ѯ��,��˶Ժ��ټ���������");
			return;
		}
		if (dvds[rentindex][STATUS] == 0){			//�ҵ��˿����	
		dvds[rentindex][STATUS] = 1;				//����״̬Ϊ�ѽ��
			dvds[rentindex][TIMES]++;				//��������1	
			rentdate[rentindex] = new Date();		//�������ʱ��
			return;
		}
		System.out.println("���Ϊ����"+rentid+"����DVD�Ѿ����,�޷���裡");
		//��ӡ������ID��ص�DVD��Ϣ
		System.out.println("#################################################################################");
		FormatTitle();
		FormatData(rentindex);
		System.out.println();
		System.out.println("#################################################################################");
		System.out.println();
	};
	
/**
 * �黹DVD	
 */
	static void ReturnDVD(){
		int count = dvdcount;
		int returnid;
		int rentindex = -1;
		for (int i = 0; i < dvdcount; i++){
			if(dvds[i][STATUS] == 0)
				count--;
		}
		if (count < 1){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("����DVD�ڿ���,�޷��黹��˶Ժ��ٲ�����");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}
		System.out.println("��ǰ�ɹ黹��Ϊ("+count+")������Ҫ�黹��DVD���:");
		returnid = input.nextInt();
		for (int i = 0; i < dvdcount; i++){
			if (returnid == dvds[i][ID]){	//�ҵ�id
				rentindex = i;				//�ҵ����¼�±�
				break;
			}
		}
		if(rentindex == -1){	//û�ҵ�
			System.out.println("�����DVD���:��"+returnid+"��δ��ѯ��,��˶Ժ��ټ���������");
			return;
		}
		if (dvds[rentindex][STATUS] == 1){			//�ҵ��˿ɹ黹
			dvds[rentindex][STATUS] = 0;			//����״̬Ϊ�ڿ���
			return;
		}
		System.out.println("���Ϊ����"+returnid+"����DVD���ڿ���,�޷��黹��");
		//��ӡ������ID��ص�DVD��Ϣ
		System.out.println("#################################################################################");
		FormatTitle();
		FormatData(rentindex);
		System.out.println();
		System.out.println("#################################################################################");
		System.out.println();
	};

/**
 * �˳�DVDϵͳ	
 */
	static void exit(){	
		System.out.println("��лʹ��,�����˳�");	
	};

}//class��β
	


