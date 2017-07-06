import java.util.Date;
import java.util.Scanner;

public class DVDDepot {
	static int DVDMAX; 						//���DVD���� �ֿ�DVD����
	private static int DVDsCount = 0; 		//��ǰDVD���� ��ǰDVD����
	static DVD[] DVDarray;					//DVD�������� �ֿ�ȫ��DVD����
	static int Index = 0;					//ƥ��ID�±�
	
	/**
	 * ��ʼ������ģʽDVD���������е�Ԫ��
	 * @param DVDarray 	DVD���� ������
	 * @param StartID 	��ʼ��ID���
	 * @param Amount 	��Ҫ��ʼ����Ԫ������
	 */
		 void initnormaldvds(int StartID, int Amount){

			for (int i = 0; i < Amount; i++){
				DVDarray[DVDsCount] = new DVD();
				//���÷����ж�ID�Ƿ��ظ�
				while(MatchID(StartID)){
					StartID++;
				}//while end
				DVDarray[DVDsCount].initnormal(StartID);
				StartID++;
				DVDsCount++;
				if (DVDsCount >= (DVDMAX))
					break;
			}//for end
		}//initnormaldvds end
	
	/**	
	 * ��ʼ�����ģʽDVD���������е�Ԫ��
	 * @param StartID 	��ʼ��ID���
	 * @param Amount 	��Ҫ��ʼ����Ԫ������
	 */
		 void initrandomdvds(int StartID, int Amount){
			for (int i = 0; i < Amount; i++){
				DVDarray[DVDsCount] = new DVD();
				//���÷����ж�ID�Ƿ��ظ�
				while(MatchID(StartID)){
					StartID++;
				}//while end
					DVDarray[DVDsCount].initrandom(StartID);
					StartID++;
				DVDsCount++;
				if (DVDsCount >= (DVDMAX))
					break;
			}//for end
		}//initrandomdvds end	
	
	/**
	 * �˶������ID�����Ƿ�����DVD����������Ԫ�ص�ID��ͬ
	 * @param dvdid     Ҫ�˶Ե�ID���
	 * @return ��ͬtrue û����ͬfalse
	 */
		 static boolean MatchID(int dvdid){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].ID == dvdid){
					result = true;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchID end
	
	/**
	 * �˶������Name�����Ƿ�����DVD����������Ԫ�ص�Name��ͬ
	 * @param dvdid     Ҫ�˶Ե�Name����
	 * @return ��ͬtrue û����ͬfalse
	 */
		 static boolean MatchName(String dvdname){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Name.equals(dvdname)){
					Index = i;
					result = true;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchName end
	
	/**
	 * �˶������Category�����Ƿ�����DVD����������Ԫ�ص�Name��ͬ
	 * @param dvdcategory 	Ҫ�˶Ե�Category���
	 * @return ��ͬtrue û����ͬfalse
	 */
		 static boolean MatchCategory(String dvdcategory){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Category.equals(dvdcategory)){
					result = true;
					Index = i;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchCategory end
		
	/**
	 * �˶������Nation�����Ƿ�����DVD����������Ԫ�ص�Name��ͬ
	 * @param dvdnation 	Ҫ�˶Ե�Nation����
	 * @return ��ͬtrue û����ͬfalse
	 */
		 static boolean MatchNation(String dvdnation){
			boolean result = false;
			for(int i = 0; i < DVDsCount; i++){
				if(DVDarray[i].Nation.equals(dvdnation)){
					result = true;
					Index = i;
					return result;
				}//if end
			}//for end
			return result;
		}//MatchNation end
		
	/**
	 * ��ӡ�ֿ����
	 */
		 void ShowTitle(){
			DVD.ShowTitle();
		}//ShowTitle end
		
	/**
	 * ��ӡ�ֿ�������DVD��Ϣ
	 */
		 void ShowData(){
			for (int i = 0; i < DVDsCount; i++){
				DVDarray[i].ShowData();
			}//for end
			System.out.println();
		}//ShowData end
	
	/**
	 * ��ӡ�ֿ⵱ǰ״̬;
	 */
		 void ShowDepotStatus(){
			 System.out.println("�ֿ⵱ǰ״̬"+DVDsCount+"/"+DVDMAX+"\tʹ���ʣ�"+((double)DVDsCount/DVDMAX*100.00)+"%");
		 }//ShowDepotStatus end
	
	/**
	 * ��ӡ�ֿ�������Ϣ ���� ���� ״̬
	 */
		 void ShowDepotALL(){
			 ShowTitle();
			 ShowData();
			 ShowDepotStatus();	 
		 }
		 

/**
 * ����DVD��Ϣ��DVD���ݿ�
 */
	 static void AddDVD(){
		//DVD���ݿ��Ѵ�����
		if (DVDsCount >= DVDMAX){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("��ǰ�ֿ�DVD�����Ѵﵽ����,�޷���������ɾ����");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			return;
		}//if end
		//DVD���ݿ�δ������
		System.out.println("������Ҫ���ӵ�DVD������Ϣ");
		//¼��id
		System.out.print("������DVD�ı��(����)");
		Scanner input = new Scanner(System.in);
		int addid = input.nextInt();
		
		//�ж��Ƿ����DVD���ݿ���
			//��Ŵ���
			if(MatchID(addid)){		
				System.out.println("���Ϊ��"+addid+"����DVD�Ѵ���");
				//��ӡ������ID��ص�DVD��Ϣ
				System.out.println("#################################################################################");
				DVD.ShowTitle();
				DVDarray[Index].ShowData();
				System.out.println();
				System.out.println("#################################################################################");
				System.out.println();
				input.close();
				return;
			}//if end
			
			//��Ų�����,����������ĩβ
				DVDarray[DVDsCount].ID = addid;				//���±��Ϊ����Ҫ�������ֵ
				System.out.println("������DVD������(�ַ���)");	//¼������
				String addname = input.next();
				DVDarray[DVDsCount].Name = addname;						//����NameΪ����ֵ
				System.out.println("������DVD�����(�ַ���)");	//¼�����
				String addcategory = input.next();						
				DVDarray[DVDsCount].Category = addcategory;				//�������
				System.out.println("������DVD�Ĺ���(�ַ���)");	//¼�����
				String addnation = input.next();						
				DVDarray[DVDsCount].Nation = addnation;					//���¹���
				System.out.println("������DVD�ļ۸�(����)");	//¼��۸�
				int addprice = input.nextInt();
				DVDarray[DVDsCount].Price = addprice;					//���¼۸�
				DVDarray[DVDsCount].Status = false;						//��ʼ�����״̬
				DVDarray[DVDsCount].Cdate = new Date();					//��ʼ������ʱ��
				DVDarray[DVDsCount].Odate = DVDarray[DVDsCount].Cdate;	//��ʼ������ʱ��
				DVDarray[DVDsCount].Idate = DVDarray[DVDsCount].Cdate;	//��ʼ������ʱ��
				DVDarray[DVDsCount].Times = 0;//��ʼ���������
			//DVD������1
				DVDsCount++;
				input.close();
			
	};
	 
}//Class DVDTest end

