package ch07;

public class PersonUse2 {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setHeight(180);
		p1.setAddress("서울 강남구 역삼동");
		p1.setEmail("hong@naver.com");
	
		
		System.out.println("이름 : "+p1.getName());
		System.out.println("나이 : "+p1.getAge());
		System.out.println("이메일 : "+p1.getEmail());
		System.out.println("주소 : "+p1.getAddress());
		
		Person p2 = new Person();
		p2.setName("사임당");
		p2.setAge(25);
		p2.setEmail("saimdang@gmail.com");
		p2.setAddress("서울 강남구 개포동");
		
		System.out.println();
		System.out.println("이름 : "+p2.getName());
		System.out.println("나이 : "+p2.getAge());
		System.out.println("이메일 : "+p2.getEmail());
		System.out.println("주소 : "+p2.getAddress());
	}

}
