package Rent_car;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//�����������飬д�복����Ϣ
		allCar[] canRent = {
				new Passenger(4, "�µ�A4", 500),
				new Passenger(4,"���Դ�6", 400),
				new Trunk(20, "ǰ�ĺ��", 1000),
				new Trunk(10, "С����", 500),
				new Pickup(2, "����F150", 800, 4)
		};
		//��ӭ����
		System.out.println("��~��ӭ���������⳵ϵͳ~");
		//ȷ���������Ƿ�Ҫ�⳵
		System.out.print("���Ƿ�Ҫ�⳵�أ�1�ǣ�0����");
		Scanner input = new Scanner(System.in);
		int isrent = input.nextInt();
		if(isrent==0){
			System.out.println("��ӭ�´������Ҽҵĳ�Ŷ���۸��Ż�~");
			return;
		}
		//����ɹ�ѡ��ĳ���
		System.out.println("\t\t\t"+"�ɹ���ѡ����������ͼ��۸����£�");
		System.out.println("���"+"\t\t"+"��������"+"\t\t"+"���"+"\t\t\t\t"+"����"+"\t\t");
		System.out.println();
		for(int i=1;i<=canRent.length;i++){
			System.out.print(i+"."+"\t\t");	
			canRent[i-1].carInFo();
		}
		//�ù˿�������Ҫ��ĳ���
		System.out.println("����Ҫ�⼸�������أ�");
		int rentNum = input.nextInt();
		//�ù˿�������Ҫ��ĳ������
		int rentNo[] = new int [rentNum];
		double totlePrice = 0;
		int totlePeople = 0;
		double totleGoods = 0;
		for(int i=0;i<rentNum;i++){
			System.out.println("��ô��������ĵ�"+(i+1)+"�����������ʲô�أ�");
			int n = input.nextInt();
			rentNo[i] = n-1;
			totleGoods += canRent[n-1].goods;
			totlePeople += canRent[n-1].people;
			totlePrice += canRent[n-1].pricePerDay;
		}
		//�ù˿������⳵����
		System.out.println("����Ҫ�⼸�죿");
		int rentDay = input.nextInt();
		//�˵�
		System.out.println("\t"+"�����˵���");
		System.out.println();
		System.out.println("�����˵������У�");
		for(int i=0;i<rentNum;i++){
			if(canRent[rentNo[i]].people!=0)
			System.out.print(canRent[rentNo[i]].name);
		}
		System.out.println();
		System.out.println("�����أ�"+totlePeople+"��");
		System.out.println();
		System.out.println("���ػ��������У�");
		for(int i=0;i<rentNum;i++){
			if(canRent[rentNo[i]].goods!=0)
			System.out.print(canRent[rentNo[i]].name);
		}
		System.out.println();
		System.out.println("�����أ�"+totleGoods+"�ֻ�");
		System.out.println();
		System.out.println("�����⳵����Ҫ��"+totlePrice*rentDay+"����");
	}

}
