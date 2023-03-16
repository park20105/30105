package test_0316;

public class TransportExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("디젤", 5);
		Car c2 = new Car("가스", 110);
		
		c1.refuel();
		c2.refuel();
		c1.speedDown();
		c2.speedUp();
		
		Airplane a1 = new Airplane("보잉 747", 10000, 1000);
		Airplane a2 = new Airplane("에어버스 380", 20000, 5000);
		Airplane a3 = new Airplane("보잉 707", 10000, 5000);
		
		a1.refuel();
		a2.refuel();
		a3.refuel();
		System.out.println(a1.airplanName+"의 비행시간은 "+a1.fighTime()+"시간 입니다");
		System.out.println(a2.airplanName+"의 비행시간은 "+a2.fighTime()+"시간 입니다");
		a1.speedUp();
		a2.speedUp();
		
	}
		
}

abstract class Transport{
	
	abstract void refuel();
	abstract void speedUp();
	abstract void speedDown();
}

class Car extends Transport{
	String oilType="";
	double speed=0;
	
	public Car(String oilType,double speed) {
		this.oilType = oilType;
		this.speed = speed;
	}
	
	public void refuel(){
		if(oilType.equals("디젤")) {
			
			System.out.println("디젤을 주유합니다");
			
		} else if(oilType.equals("전기")) {
			
			System.out.println("전기를 충전합니다");
			
		} else if(oilType.equals("가스")) {
			
			System.out.println("가스를 주유합니다");
			
		} else if(oilType.equals("태양열")) {
			
			System.out.println("태양열을 충전합니다");
			
		} else {
			System.out.println("휘발유를 주유합니다");
		}
	}
	
	public void speedUp(){
		speed +=10;
		if(speed>110) {
			System.out.println("속력위한 범칙금 10만원 부과합니다.");
			speed=10;
		}
	}
	
	public void speedDown(){
		speed-=10;
		if(speed<=0){
			System.out.println("차가 멈췄습니다.");
			speed=10;
		}
	}
}

class Airplane extends Transport{
	String airplanName="";
	double distance = 0;
	double speed = 0;
	static int totalJeFuel = 1500;
	double jetFuel = 0;
	
	public Airplane(String airplanName, double distance, double speed) {
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;
	}
	
	public void refuel() {
		jetFuel = distance/20;
		if(jetFuel<=totalJeFuel) {
			System.out.println("항공유 "+jetFuel+"L 를 주유합니다.");
			totalJeFuel -= jetFuel;
		} else {
			System.out.println("항공유가 부족하여 주유할 수 없습니다.");
		}
	}
	
	public void speedUp() {
		speed+=1000;
		if(speed>5500) {
			System.out.println("비행속도는 5500km 를 넘을 수 없습니다.");
			speed=5500;
		}
	}
	
	public void speedDown(){
		speed-=1000;
		if(speed>=0) {
			System.out.println("비행기가 멈췄습니다.");
			speed = 10;
		}
		
	}
	
	public double fighTime() {
		return distance/speed;
	}
}



