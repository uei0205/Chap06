package coorperation;

public class Subway {
	String lineNumber; // ȣ��
	int money; // ����
	int passengerCount; // �°� ��

	//ȣ���� �Ű� ������ ���� ������
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += 1500;
		this.passengerCount++;
	}
	
	public void printSubwayInfo() {
		System.out.println("����ö"+lineNumber+"ȣ���� �°���"+passengerCount+"�� �̰�, ���� �ݾ��� " + money+"���Դϴ�.");
	}

}
