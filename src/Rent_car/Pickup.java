package Rent_car;

public class Pickup extends allCar {
	public Pickup(double agoods,String aname, double apricePerDay,int apeople) {
		goods = agoods;
		name = aname;
		pricePerDay = apricePerDay;
		people = apeople;
	}
	@Override
	public void carInFo() {
		System.out.println(name+"\t\t"+pricePerDay+"����/��"+"\t\t"+"����"+people+"��"+"\t\t"+"�ػ�"+goods+"��");
	}
}
