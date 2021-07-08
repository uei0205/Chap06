package coorperation.q5;

public class Buycoffee {

	public static void main(String[] args) {

		Men kimMen = new Men("±è ¾¾ ",1000,"¾Æ¸Þ¸®Ä«³ë");
		Star staraa = new Star("º°´Ù¹æ");
		kimMen.takestar(staraa);
		staraa.printStarInfo();

		Men LiMen = new Men("ÀÌ ¾¾ ",9000,"¶ó¶¼");
		Bin starte = new Bin("Äá´Ù¹æ");
		LiMen.takebin(starte);
		starte.printBinInfo();
		
	}

}
