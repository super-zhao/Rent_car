package Rent_car;

public class Trunk extends allCar {
	public Trunk(double agoods,String aname, double apricePerDay) {
		goods = agoods;
		name = aname;
		pricePerDay = apricePerDay;
	}
	@Override
	public void carInFo() {
		System.out.println(name+"\t\t"+pricePerDay+"¥Û—Û/ÃÏ"+"\t\t"+"‘ÿªı"+goods+"∂÷");
	}

}
