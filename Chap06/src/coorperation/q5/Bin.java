package coorperation.q5;

public class Bin {
	String cafeName; //ī�� �̸�
	int money; //����
	
	//ī�� �̸��� �Ű� ������ ���� ������
	public Bin(String cafeName) {
		this.cafeName = cafeName;
	} 
	
	//�󶼸� �Ĵ� �޼���
	public void take(int money) {
		this.money += 4500; //Ŀ�� ����ŭ ���� ����
		
	}
	
	public void printBinInfo() {
		System.out.println( cafeName+"�� ������ "+ money+"���Դϴ�.");
	}
	

}
