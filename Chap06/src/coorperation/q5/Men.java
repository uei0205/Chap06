package coorperation.q5;


public class Men {
	public String Name; // 사람 이름
	public int money; // 가진 돈
	public String coffeeName; //메뉴 이름
	
	//이름, 가진 돈, 메뉴 이름을 매개변수로 하는 생성자
	public Men(String Name, int money, String coffeeName) {
		this.Name = Name;
		this.money = money;
		this.coffeeName = coffeeName;
	}
	
	//김씨가 아메리카노를 사는 메서드
	public void takestar(Star star) {
		if(money<4000) {
			System.out.println(Name+"님이 "+money+"원으로 돈이 부족하여 "+coffeeName+"을 마실 수가 없어요!");
		}else {
		star.take(4000); //4000원을 지불하고 아메리타노를 사는 메서드를 호출
		System.out.println(Name+"님이 "+ money+"원으로 "+coffeeName + "을 구입했습니다.");

	    }
	}
	
	//이씨가 라테를 사는 메서드
	public void takebin(Bin bin) {
		if(money<4000) {
			System.out.println(Name+"님이 "+money+"원으로 돈이 부족하여 "+coffeeName+"을 마실 수가 없어요!");
		}else {
		bin.take(4500); //4000원을 지불하고 아메리타노를 사는 메서드를 호출
		System.out.println(Name+"님이 "+ money+"원으로 "+coffeeName + "을 구입했습니다.");

	    }
	}

}
