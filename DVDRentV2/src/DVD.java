import java.util.Date;
import java.text.SimpleDateFormat;

public class DVD {
	int ID;				//���
	String Name;		//����
	String Category;	//���
	String Nation;		//����
	boolean Status;		//����״̬
	int Price;			//���
	Date Cdate;			//����ʱ��
	Date Odate;			//����ʱ��
	Date Idate;			//���ʱ��	
	int Times;			//�������
	/**
	 * ������ʼ��,���ݱ������������
	 * @param dvdid DVD�������ݵ�ID
	 */
	
	void initnormal(int dvdid){
		ID = dvdid;
		Name = "δ����";
		Category = "δ����";
		Nation = "δȷ��";
		Status = true;
		Price = 0;
		Cdate = new Date();
		Odate = Cdate;
		Idate = Cdate;
		Times = 0;
	}
	
	/**
	 * �����ʼ��,���ݱ���������������
	 * @param dvdid DVD�������ݵ�ID
	 */
	void initrandom(int dvdid){	
		String [] str1 = {
				"���͵۹�ȫ","Ǳͧ�籩","��Ұ����","ָ����ȫ","ħ������","���ν��ȫ",
				"��������ȫ","��������ȫ","������ȫ","������","����ʱ��","����ЧӦ",
				"�ٶ��뼤��ȫ","���е�ȫ","����ɱ��","��������ȫ","007ϵ��ȫ","������ƫ��",
				"Xս��ȫ","�����ȫ","������ȫ","����������ȫ","�̸�","Ф��˵ľ���","�����յ�����",
				"���񿭶�","�̸�����","����������","����ʿ","�����սȫ","��������","��Ծ����Ժ",
				"�氮��ʿ","�Ի�����","��","�ᱦ���","�ǳ����ɷ�","������Ƭ","��Ĭ�ĸ���",
				"���ȴ�����","�����֮ӥ","��������","�¸ҵ���","�Ƕ�ʿ","�������ռ�",
				"����ϵ��ȫ","���鿥ϵ��ȫ","�������ܶ�Ա","����ܶ�Աϵ��ȫ","����̽���Ͼ糡��ȫ",
				"�º���ϵ��ȫ","����ʷ���ȫ","�Ǽʴ�Խ","���οռ�","������ϵ��","����ͣת֮��","̩̹���"};
		String [] str2 = {
				"����","����","�ƻ�","ս��","�ֲ�","���","��¼Ƭ","����","ð��","���",
				"����","����","����","ϲ��","����","����","�˶�","ս��","��ʷ","����"};
		String [] str3 = {
				"��½","���","̨��","����","�ձ�","����","����","Ӣ��","�¹�","�����",
				"���ô�","ӡ��","����˹","̩��","����"};
		final int MAXPRICE = 10; 
		int index1,index2,index3,num1;
		index1 = (int) (Math.random()*str1.length);
		index2 = (int) (Math.random()*str2.length);
		index3 = (int) (Math.random()*str3.length);
		num1 = ((int) (Math.random()*MAXPRICE))*100;
		ID = dvdid;
		Name = str1[index1];
		Category = str2[index2];
		Nation = str3[index3];
		Status = true;
		Price = num1;
		Cdate = new Date();
		Odate = Cdate;
		Idate = Cdate;
		Times = 0;
	}
	
	/**
	 * ����
	 */
	void Out(){ 
		Status = false;
		Odate = new Date();
		Times++;
	}
	
	/**
	 * ���
	 */
	void In(){	
		Status = true;
		Idate = new Date();	
	}
	
	/**
	 * ��ӡ����
	 */
	static void ShowTitle(){	
		final String[] title = new String[] {
				"���","����","���","����","״̬","���",
				"��������","�������","�黹����","�������"}; 	//����
		System.out.format("%-5s\t",title[0]);		//���
		System.out.format("%-20s\t",title[1]);		//����
		System.out.format("%-10s\t",title[2]);		//���
		System.out.format("%-8s\t",title[3]);		//����
		System.out.format("%-8s\t",title[4]);		//״̬
		System.out.format("%-10s\t",title[5]);		//���
		System.out.format("%-14s\t",title[6]);		//����ʱ��
		System.out.format("%-14s\t",title[7]);		//���ʱ��
		System.out.format("%-14s\t",title[8]);		//�黹ʱ��
		System.out.format("%-6s\n",title[9]);		//�������
	}
	
	/**
	 * ��ӡDVD����
	 */
	void ShowData(){	
		final SimpleDateFormat DateFormat = 
				new SimpleDateFormat("yyyy-MM-dd"); //�����������ݸ�ʽ�� ("yyyy-MM-dd HH:mm:ss")
			System.out.format("%-5d\t",ID);			//��ӡ���
			System.out.format("%-20.10s\t",Name);	//��ӡ����
			System.out.format("%-10s\t",Category);	//��ӡ���
			System.out.format("%-8s\t",Nation);		//��ӡ����
		
		if (Status){
			System.out.format("%-8s\t","�ڿ���");						//��ӡ״̬ ����
			if(Price==0)
				System.out.format("%-6.4s\t","���");				//��ӡ��� ���Ϊ0
			else
				System.out.format("��%-3.2f\t",(Price/100.00));		//��ӡ���
			System.out.format("[%10s]\t",DateFormat.format(Cdate));	//��ӡ����ʱ��
			System.out.format("[%10s]\t","yyyy-MM-dd");				//��ӡ���Ϊ ��ʽ���ַ�
			System.out.format("[%10s]\t",DateFormat.format(Idate));	//��ӡ�黹ʱ��
		}	
		else{
			System.out.format("%-8s\t","�ѽ��");						//��ӡ״̬ ���
			if(Price==0)
				System.out.format("%-6.4s\t","���");				//��ӡ��� ���Ϊ0
			else
				System.out.format("��%-3.2f\t",(Price/100.00));		//��ӡ���
			System.out.format("[%10s]\t",DateFormat.format(Cdate));	//��ӡ����ʱ��
			System.out.format("[%10s]\t",DateFormat.format(Odate));	//��ӡ���ʱ��
			System.out.format("[%10s]\t","yyyy-MM-dd");				//��ӡ�黹Ϊ ��ʽ���ַ�
		}
		System.out.format("%-6d\n",Times);
	}
}
	
