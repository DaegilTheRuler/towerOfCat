package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//buffered�迭(Reader�迭(steam)))���·� ���ε� ������
		
		System.out.print("���ڿ� �� ���� �Է��ϼ��� : ");
		String line;
		try {
			line = br.readLine();
			System.out.println("�Է��� ���ڿ� :"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���ڿ� �� �� �Է¹ޱ�
		System.out.println("���α׷�����");
	}

}
