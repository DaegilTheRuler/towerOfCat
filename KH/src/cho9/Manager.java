package cho9;

public class Manager extends Employee{
	protected double bonus;
	public void print() {
		super.print();
		bonus = (super.getSalary()*0.3);
		System.out.println("º¸³Ê½º : "+bonus);
	}


}
