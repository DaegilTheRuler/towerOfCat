package cho9;


public class ManagerTest {

	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.setNum(1);
		mng.name = "ȫ�浿";
		mng.address = "���� ������ ���ﵿ";
		mng.email = "hong@gmail.com";
		mng.setSalary(3000);
		mng.setRrn("123456-1234567");
		System.out.println("=======================================================");
		mng.print();
		System.out.println("=======================================================");
		
		
	} 

}
