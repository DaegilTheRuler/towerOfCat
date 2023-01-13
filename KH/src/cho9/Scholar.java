package cho9;

public class Scholar extends Student {//장학생은 학생이다
	private String category;
	private int money;
	
	public void input(String name, String num, String major, int year,
	String category, int money){
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금금액");
		System.out.println(super.getName()+"\t"+super.getNum()+"\t"+super.getMajor()+"\t"+super.getYear()+"\t"+category+"\t"+money);
	}
	public void print1() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(super.getName()+"\t"+super.getNum()+"\t"+super.getMajor()+"\t"+super.getYear());
	}
}
