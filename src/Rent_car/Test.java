package Rent_car;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//建立父类数组，写入车辆信息
		allCar[] canRent = {
				new Passenger(4, "奥迪A4", 500),
				new Passenger(4,"马自达6", 400),
				new Trunk(20, "前四后八", 1000),
				new Trunk(10, "小四轮", 500),
				new Pickup(2, "福特F150", 800, 4)
		};
		//欢迎界面
		System.out.println("亲~欢迎来到哒哒租车系统~");
		//确认来访者是否要租车
		System.out.print("您是否要租车呢？1是，0不是");
		Scanner input = new Scanner(System.in);
		int isrent = input.nextInt();
		if(isrent==0){
			System.out.println("欢迎下次来租我家的车哦，价格优惠~");
			return;
		}
		//输出可供选择的车辆
		System.out.println("\t\t\t"+"可供您选择的汽车类型及价格如下：");
		System.out.println("序号"+"\t\t"+"汽车名称"+"\t\t"+"租金"+"\t\t\t\t"+"容量"+"\t\t");
		System.out.println();
		for(int i=1;i<=canRent.length;i++){
			System.out.print(i+"."+"\t\t");	
			canRent[i-1].carInFo();
		}
		//让顾客输入需要租的车辆
		System.out.println("您需要租几辆汽车呢？");
		int rentNum = input.nextInt();
		//让顾客输入需要租的车的序号
		int rentNo[] = new int [rentNum];
		double totlePrice = 0;
		int totlePeople = 0;
		double totleGoods = 0;
		for(int i=0;i<rentNum;i++){
			System.out.println("那么，您想租的第"+(i+1)+"辆车的序号是什么呢？");
			int n = input.nextInt();
			rentNo[i] = n-1;
			totleGoods += canRent[n-1].goods;
			totlePeople += canRent[n-1].people;
			totlePrice += canRent[n-1].pricePerDay;
		}
		//让顾客输入租车天数
		System.out.println("您想要租几天？");
		int rentDay = input.nextInt();
		//账单
		System.out.println("\t"+"您的账单：");
		System.out.println();
		System.out.println("可载人的汽车有：");
		for(int i=0;i<rentNum;i++){
			if(canRent[rentNo[i]].people!=0)
			System.out.print(canRent[rentNo[i]].name);
		}
		System.out.println();
		System.out.println("共可载："+totlePeople+"人");
		System.out.println();
		System.out.println("可载货的汽车有：");
		for(int i=0;i<rentNum;i++){
			if(canRent[rentNo[i]].goods!=0)
			System.out.print(canRent[rentNo[i]].name);
		}
		System.out.println();
		System.out.println("共可载："+totleGoods+"吨货");
		System.out.println();
		System.out.println("本次租车共需要："+totlePrice*rentDay+"大洋");
	}

}
