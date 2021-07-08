package coorperation;

public class taxi {
	String carNumber; 
	int money; // 수입
	int passengerCount; // 승객 수

	//호선을 매개 변수로 갖는 생성자
	public taxi(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void take(int money) {
		this.money += 10000;
		this.passengerCount++;
	}
	
	public void printTaxiInfo() {
		System.out.println("택시"+carNumber+"번의 승객은"+passengerCount+"명 이고, 수입 금액은 " + money+"원입니다.");
	}


}
