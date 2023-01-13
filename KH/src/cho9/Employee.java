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
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		System.out.println("주민번호 : "+rrn);
		System.out.println("연봉 : "+salary);
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
