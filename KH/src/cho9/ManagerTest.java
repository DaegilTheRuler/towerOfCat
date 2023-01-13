package cho9;


public class ManagerTest {

	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.setNum(1);
		mng.name = "홍길동";
		mng.address = "서울 강남구 역삼동";
		mng.email = "hong@gmail.com";
		mng.setSalary(3000);
		mng.setRrn("123456-1234567");
		System.out.println("=======================================================");
		mng.print();
		System.out.println("=======================================================");
		
		
	} 

}
