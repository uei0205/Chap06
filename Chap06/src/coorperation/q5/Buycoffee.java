package coorperation.q5;

public class Buycoffee {

	public static void main(String[] args) {

		Men kimMen = new Men("�� �� ",1000,"�Ƹ޸�ī��");
		Star staraa = new Star("���ٹ�");
		kimMen.takestar(staraa);
		staraa.printStarInfo();

		Men LiMen = new Men("�� �� ",9000,"��");
		Bin starte = new Bin("��ٹ�");
		LiMen.takebin(starte);
		starte.printBinInfo();
		
	}

}
