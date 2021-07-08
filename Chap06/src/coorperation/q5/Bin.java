package coorperation.q5;

public class Bin {
	String cafeName; //카페 이름
	int money; //수입
	
	//카페 이름을 매개 변수로 갖는 생성자
	public Bin(String cafeName) {
		this.cafeName = cafeName;
	} 
	
	//라떼를 파는 메서드
	public void take(int money) {
		this.money += 4500; //커피 값만큼 수입 증가
		
	}
	
	public void printBinInfo() {
		System.out.println( cafeName+"의 수입은 "+ money+"원입니다.");
	}
	

}
