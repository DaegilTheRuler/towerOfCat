package cho9;

public class ScholarTest {

	public static void main(String[] args) {
		Scholar s1 = new Scholar();
		s1.input("±èÃ¶¼ö", "2201", "ÄÄ°ø", 2, "1Á¾", 2500000);
		
		s1.print();
		
		s1.input("È«±æµ¿", "2103", "ÀüÀÚ", 3);
		s1.print1();
	}

}
