package Rent_car;

public class Passenger extends allCar {
	public Passenger(int apeople, String aname, double apricePerDay) {
		people = apeople;
		name = aname;
		pricePerDay = apricePerDay;
	}
	@Override
	public void carInFo() {
		System.out.println(name+"\t\t"+pricePerDay+"����/��"+"\t\t"+"����"+people+"��");
	}


}
