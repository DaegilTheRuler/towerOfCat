package test;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10 ������ ������ �Է��ϼ��� :");
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
				i++;
			}
		}else {
			System.out.println("1�� 10 ���� ���ڰ� �ƴմϴ�.");
		}
	}
}
