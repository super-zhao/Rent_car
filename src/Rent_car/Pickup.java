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
		System.out.println(name+"\t\t"+pricePerDay+"大洋/天"+"\t\t"+"载人"+people+"人"+"\t\t"+"载货"+goods+"吨");
	}
}
