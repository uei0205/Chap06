package coorperation;

public class taxi {
	String carNumber; 
	int money; // ����
	int passengerCount; // �°� ��

	//ȣ���� �Ű� ������ ���� ������
	public taxi(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void take(int money) {
		this.money += 10000;
		this.passengerCount++;
	}
	
	public void printTaxiInfo() {
		System.out.println("�ý�"+carNumber+"���� �°���"+passengerCount+"�� �̰�, ���� �ݾ��� " + money+"���Դϴ�.");
	}


}
