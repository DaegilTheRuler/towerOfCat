package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//�� �ٷ� ��� ���γ��� �� ����.
		System.out.println("���ڿ� �� ���� �Է��ϼ��� :");
		
		try {
			String str = reader.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}
