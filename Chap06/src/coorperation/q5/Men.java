package coorperation.q5;


public class Men {
	public String Name; // ��� �̸�
	public int money; // ���� ��
	public String coffeeName; //�޴� �̸�
	
	//�̸�, ���� ��, �޴� �̸��� �Ű������� �ϴ� ������
	public Men(String Name, int money, String coffeeName) {
		this.Name = Name;
		this.money = money;
		this.coffeeName = coffeeName;
	}
	
	//�达�� �Ƹ޸�ī�븦 ��� �޼���
	public void takestar(Star star) {
		if(money<4000) {
			System.out.println(Name+"���� "+money+"������ ���� �����Ͽ� "+coffeeName+"�� ���� ���� �����!");
		}else {
		star.take(4000); //4000���� �����ϰ� �Ƹ޸�Ÿ�븦 ��� �޼��带 ȣ��
		System.out.println(Name+"���� "+ money+"������ "+coffeeName + "�� �����߽��ϴ�.");

	    }
	}
	
	//�̾��� ���׸� ��� �޼���
	public void takebin(Bin bin) {
		if(money<4000) {
			System.out.println(Name+"���� "+money+"������ ���� �����Ͽ� "+coffeeName+"�� ���� ���� �����!");
		}else {
		bin.take(4500); //4000���� �����ϰ� �Ƹ޸�Ÿ�븦 ��� �޼��带 ȣ��
		System.out.println(Name+"���� "+ money+"������ "+coffeeName + "�� �����߽��ϴ�.");

	    }
	}

}
