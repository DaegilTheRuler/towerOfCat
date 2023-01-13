package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		//복사본
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file1 = "C:\\test\\aa.text";
		String file2 = "C:\\test\\ab.text";
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str = reader.readLine();
				if(str == null) break;
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사 완료");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
