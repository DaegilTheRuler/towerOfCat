package test;

public class MemberAnony {

	public static void main(String[] args) {
		Member m = new Member() {
			int num=2;
			String name="��浿";
			String email="kim@gmail.com";
			
			@Override
			public void num() {
				System.out.println("����ȣ : "+num);
				
			}
			
			@Override
			public void name() {
				System.out.println("�̸� : "+name);
				
			}
			
			@Override
			public void email() {
				System.out.println("�̸��� : "+email);
				
			}
		};
		System.out.println("========================");
		m.num();
		m.name();
		m.email();
		System.out.println("========================");
		
		}

	}


