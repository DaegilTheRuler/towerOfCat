package cho9;

public class Employee {
	private int num;
	public String name;
	String address;
	String email;
	protected int salary;
	private String rrn;
	
	public Employee() {
		
	}
	public Employee(int num, String name, String address, String email, int salary, String rrn) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	public void print() {
		System.out.println("��� : "+num);
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("�̸��� : "+email);
		System.out.println("�ֹι�ȣ : "+rrn);
		System.out.println("���� : "+salary);
	}

	public int getNum() {
		return num;
	}

	public int getSalary() {
		return salary;
	}

	public String getRrn() {
		return rrn;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
	

}
