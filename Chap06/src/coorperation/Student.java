package coorperation;

public class Student {
	public String studentName; // 학생명
	public int age; // 나이
	public int money; // 가진 돈
	
	//이름과 가진 돈을 매개변수로 하는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//학생이 버스를 타는 메서드
	public void takeBus(Bus bus) {
		this.money -=1000;
		bus.take(1000); //1000원을 지불하고 버스는 타는 메서드를 호출
	}

	//학생이 지하철를 타는 메서드
	public void takeSubway(Subway subway) {
		this.money -=1500;
		subway.take(1500);
	}
	
	//학생이 택시를 타는 메서드
	public void takeTaxi(taxi taxi) {
		this.money -=10000;
		taxi.take(10000);
	}
	
	
	public void printStudentInfo() { //잔액을 출력하는 값
		System.out.println(studentName + "학생의 남은 돈은 "+money+"원입니다.");
	}

}
