package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStramEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//printstream객체를 부모타입인 output스트림으로 받아 처리
		//1바이트 처리 스트림임. 한글x
		try {
			os.write(97);//키코드값 a
			os.write(98);
			os.write(99);
			os.flush();//출력 메소드
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
