package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//���ε� ������
		//osw�� �ѱ����� ����ó��
		try {
			osw.write(44032);//��
			osw.write("���ٶ�");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
