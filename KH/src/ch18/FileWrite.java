package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		//���α׷� ==> ����. ��� ��Ʈ���� �ʿ�
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("�Է��ϼ��� : ");
			while(true) {
				int ch = System.in.read();//1����Ʈ
				if(ch == 13)
					break;
				os.write(ch);//���Ͽ� 1����Ʈ ����
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
