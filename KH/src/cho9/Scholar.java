package cho9;

public class Scholar extends Student {//���л��� �л��̴�
	private String category;
	private int money;
	
	public void input(String name, String num, String major, int year,
	String category, int money){
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	public void print() {
		System.out.println("�̸�\t�й�\t����\t�г�\t����\t���бݱݾ�");
		System.out.println(super.getName()+"\t"+super.getNum()+"\t"+super.getMajor()+"\t"+super.getYear()+"\t"+category+"\t"+money);
	}
	public void print1() {
		System.out.println("�̸�\t�й�\t����\t�г�");
		System.out.println(super.getName()+"\t"+super.getNum()+"\t"+super.getMajor()+"\t"+super.getYear());
	}
}
