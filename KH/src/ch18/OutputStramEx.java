package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStramEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//printstream��ü�� �θ�Ÿ���� output��Ʈ������ �޾� ó��
		//1����Ʈ ó�� ��Ʈ����. �ѱ�x
		try {
			os.write(97);//Ű�ڵ尪 a
			os.write(98);
			os.write(99);
			os.flush();//��� �޼ҵ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
