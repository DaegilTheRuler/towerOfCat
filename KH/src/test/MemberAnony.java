package test;

public class MemberAnony {

	public static void main(String[] args) {
		Member m = new Member() {
			int num=2;
			String name="김길동";
			String email="kim@gmail.com";
			
			@Override
			public void num() {
				System.out.println("고객번호 : "+num);
				
			}
			
			@Override
			public void name() {
				System.out.println("이름 : "+name);
				
			}
			
			@Override
			public void email() {
				System.out.println("이메일 : "+email);
				
			}
		};
		System.out.println("========================");
		m.num();
		m.name();
		m.email();
		System.out.println("========================");
		
		}

	}


