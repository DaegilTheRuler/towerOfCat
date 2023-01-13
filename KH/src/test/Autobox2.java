package test;

public class Autobox2 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3=50;
		
		Integer i1=new Integer(30);
		num1=i1;
		Integer i2=new Integer(40);
		num2=i2;
		Integer i3;
		i3=num3;
		
		
		System.out.println("기본자료형 :"+num1 +"객체자료형 :"+i1);
		System.out.println("기본자료형 :"+num2 +"객체자료형 :"+i2);
		System.out.println("기본자료형 :"+num3 +"객체자료형 :"+i3);

	}

}
