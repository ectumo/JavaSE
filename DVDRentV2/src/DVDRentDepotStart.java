import java.util.Scanner;
public class DVDRentDepotStart {
	static Scanner input1 = new Scanner(System.in);
	public static void main(String[] args) {
		/**
		 * ����DVD����ϵͳ
		 */
		System.out.println("��ӭʹ��DVD����ϵͳ@_@");
		/**
		 * ��ʼ���ֿ�����
		 */
		initDepot();	//���÷�����ʼ������
		/**
		 * ����DVD����ϵͳ�����˵�
		 */
		OperMenu();		//���÷�����������˵�
			
	}//main end

	
	/**
	 * ��ʼ���ֿ�����
	 */
	static void initDepot(){
		DVDDepot Depot = new DVDDepot();
		System.out.print("1.������DVD�ֿ�Ĵ�С:");
		int DepotMAX = input1.nextInt();
		DVDDepot.DVDMAX = DepotMAX;
		DVDDepot.DVDarray = new DVD [DVDDepot.DVDMAX];
		System.out.print("2.�������ʼ��DVD��ʼID���:");
		int StartID = input1.nextInt();
		System.out.print("3.������DVD�ֿ��ʼ����DVD����:");
		int Amount = input1.nextInt();
		System.out.println("DVD�ֿ��ʼ�������Ϣ����:");
		Depot.initrandomdvds(StartID, Amount); 		//���÷�����ʼ��DVD�ֿ�����;
		Depot.ShowDepotALL();						//���÷�����ʾDVD�ֿ�����;	
	}
	
	/**
	 * ��ӡ�����˵�
	 */
		 static void ShowOperMenu(){
			System.out.println();
			System.out.println("  DVD���˵�");
			System.out.println("****************");
			System.out.println("* 1.��ʼ��DVD��");
			System.out.println("* 2.�鿴����DVD");
			System.out.println("* 3.ɾ������DVD");
			System.out.println("* 4.�������DVD");
			System.out.println("* 5.�黹DVD������");
			System.out.println("* 7.����ģʽ");
			System.out.println("* 0.�˳�ϵͳ ");
			System.out.println("****************");
			System.out.println("����ݲ˵�����ѡ��(1-6)");
		}//ShowOperMenu end	
	
	/**
	 * ���ݲ˵������ֿ������
	 */
		static void OperMenu(){
			int choice = 1;
			
			
			System.out.println("�������ʾ�������ѡ��\n");
			while (choice != 0){	//ֻҪ��ѡ���˳�(����0)һֱѭ��
				ShowOperMenu();
				choice = input1.nextInt(); //�˵�ѡ��
				//��������˳� ����ӡ�������ллʹ�ã��ټ���
				switch (choice){
				case 0:		//�˳�
					System.out.println("�˳�ϵͳ");
					break;
				case 1:
					System.out.println("���³�ʼ������");
					initDepot();
					break;
				case 2:		//����
					System.out.println("����DVD");
					DVDDepot.AddDVD();
					break;
				case 3:		//�鿴
					System.out.println("�鿴DVD");
					//ShowDVD();
					break;
				case 4:		//ɾ��
					System.out.println("ɾ��DVD");
					//DelDVD();
					break;
				case 5:		//���
					System.out.println("���DVD");
					//RentDVD();
					break;
				case 6:		//�黹
					System.out.println("�黹DVD");
					//ReturnDVD();
					break;
				case 7:		//�˳�
					System.out.println("�˳�ϵͳ");
					//exit();
					break;	
				default:
					System.out.println("����ѡ���������������");
					break;
				}//switch end				
			}//while end			
		}//OperMenu end
	
	
}//DVDRentDepotStart end
