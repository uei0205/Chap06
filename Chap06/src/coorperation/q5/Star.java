package coorperation.q5;


public class Star {
	String cafeName; //카페 이름
	int money; //수입
	
	//카페 이름을 매개 변수로 갖는 생성자
	public Star(String cafeName) {
		this.cafeName = cafeName;
	} 
	
	//아메리카노를 파는 메서드
	public void take(int money) {
		this.money += 4000; //커피 값만큼 수입 증가
		
	}
	
	public void printStarInfo() {
		System.out.println(cafeName+"의 수입은 "+ money+"원입니다.");
	}
	
	

}
