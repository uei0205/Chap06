package thisexam;

public class ThisTest {

	public static void main(String[] args) {
		BirthDAy day1 = new BirthDAy();
		System.out.println(day1); //참조 자료형이기 때문, thisexam.BirthDAy@24d46ca6
		day1.printThis();
		day1.setYear(2000);
		
		BirthDAy day2 = new BirthDAy();
		System.out.println(day2); //thisexam.BirthDAy@59f99ea
		day2.printThis();
		day2.setYear(1999);
		
		System.out.println(day1.year);
		System.out.println(day2.year);
	}

}
