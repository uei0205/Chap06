package coorperation;

public class Student {
	public String studentName; // �л���
	public int age; // ����
	public int money; // ���� ��
	
	//�̸��� ���� ���� �Ű������� �ϴ� ������
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//�л��� ������ Ÿ�� �޼���
	public void takeBus(Bus bus) {
		this.money -=1000;
		bus.take(1000); //1000���� �����ϰ� ������ Ÿ�� �޼��带 ȣ��
	}

	//�л��� ����ö�� Ÿ�� �޼���
	public void takeSubway(Subway subway) {
		this.money -=1500;
		subway.take(1500);
	}
	
	//�л��� �ýø� Ÿ�� �޼���
	public void takeTaxi(taxi taxi) {
		this.money -=10000;
		taxi.take(10000);
	}
	
	
	public void printStudentInfo() { //�ܾ��� ����ϴ� ��
		System.out.println(studentName + "�л��� ���� ���� "+money+"���Դϴ�.");
	}

}
