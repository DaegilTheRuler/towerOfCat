package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio britz = new Radio("브리츠");
		britz.setOnOff();
		britz.setChannel(89.1);
		britz.setVolume(11);
		britz.printInfo();
		
		Radio iriver = new Radio();
		iriver.setName("아이리버");
		iriver.setOnOff();
		iriver.setChannel(95.1);
		iriver.setVolume(9);
		iriver.printInfo();
	}

}
