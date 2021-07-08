package thisexam;

public class Person {
	String name;
	int age;
	
	//디폴트 생성자
	public Person() {
		//인스턴스 생성시 초기화할 작업을 포함
//		name = "무명"; //내부의 인스턴스의 멤버 변수가 생성이 되기 이전일 가능성이 있으므로 (오류)
//		age = 1;
		//생성자 내부에 또 다른 생성자를 호출하여 멤버 변수를 초기화한다. 
		this("무명", 1); // 반드시 첫 번째 줄에 사용해야 오류를 면한다. 
	}
	
	//매개변수 생성자 : 초기화랑 멤버 변수를 매개변수로 전달하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age; //이걸 넣었을 때 해당하는 사람이 생겨남
	}
	
	// 자신을 반환하는 메서드
	public Person returnSelf() {
		return this;
	}

	
}
