package coorperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas",5000);
		Bus bus1004 = new Bus(1004); //1004�� ������ ����
		tomasStudent.takeBus(bus1004); //1004�� ������ �丶�� �л��� ź��.
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenline = new Subway("2");
		Student jameStudent = new Student("james", 10000);
		jameStudent.takeSubway(greenline);	//2ȣ�� ����ö�� ���ӽ� �л��� ź��. 	
		jameStudent.printStudentInfo();
		greenline.printSubwayInfo();
		
		taxi redcar =new taxi("7450");
		Student EdwardStudent = new Student("Edward",20000);
		EdwardStudent.takeTaxi(redcar);
		EdwardStudent.printStudentInfo();
		redcar.printTaxiInfo();
	}

}
