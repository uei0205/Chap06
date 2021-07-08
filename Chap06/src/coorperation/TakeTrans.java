package coorperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student tomasStudent = new Student("Tomas",5000);
		Bus bus1004 = new Bus(1004); //1004번 버스가 생성
		tomasStudent.takeBus(bus1004); //1004번 버스를 토마스 학생이 탄다.
		tomasStudent.printStudentInfo();
		bus1004.printBusInfo();
		
		Subway greenline = new Subway("2");
		Student jameStudent = new Student("james", 10000);
		jameStudent.takeSubway(greenline);	//2호선 지하철을 제임스 학생이 탄다. 	
		jameStudent.printStudentInfo();
		greenline.printSubwayInfo();
		
		taxi redcar =new taxi("7450");
		Student EdwardStudent = new Student("Edward",20000);
		EdwardStudent.takeTaxi(redcar);
		EdwardStudent.printStudentInfo();
		redcar.printTaxiInfo();
	}

}
