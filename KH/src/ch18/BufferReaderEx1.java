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
		
		//buffered계열(Reader계열(steam)))형태로 감싸듯 구성됨
		
		System.out.print("문자열 한 줄을 입력하세요 : ");
		String line;
		try {
			line = br.readLine();
			System.out.println("입력한 문자열 :"+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//문자열 한 줄 입력받기
		System.out.println("프로그램종료");
	}

}
