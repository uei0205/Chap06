package coorperation.q5;


public class Star {
	String cafeName; //ī�� �̸�
	int money; //����
	
	//ī�� �̸��� �Ű� ������ ���� ������
	public Star(String cafeName) {
		this.cafeName = cafeName;
	} 
	
	//�Ƹ޸�ī�븦 �Ĵ� �޼���
	public void take(int money) {
		this.money += 4000; //Ŀ�� ����ŭ ���� ����
		
	}
	
	public void printStarInfo() {
		System.out.println(cafeName+"�� ������ "+ money+"���Դϴ�.");
	}
	
	

}
