package coorperation;

public class Bus {
	int busNumber; //���� ��ȣ
	int money; //����
	int passengerCount; //�°� ��
	
	//���� ��ȣ�� �Ű� ������ ���� ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	} 

	//������ �°�(�л�)�� �¿�� �޼���
	public void take(int money) {
		this.money += 1000; //�л��� �� ����� �������� ����
		this.passengerCount++; //�°� �� ����
		
	}

	
	public void printBusInfo() {
		System.out.println(busNumber+"�� ������ �°���"+passengerCount +"���̰�, ������"+ money+"���Դϴ�.");
	}
}
