package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT = 3000;
	public UDPEchoClient(String ip, int port) {
		try {
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.print("���� ������ ������ �޽��� : ");
			file = new BufferedReader(new InputStreamReader(System.in));
			str = file.readLine();
			byte buffer[] = str.getBytes();//��Ʈ���� ����Ʈ�迭�� ��ȯ
			//UDP����� ����Ʈ�迭�� �ۼ���
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, SERVERPORT);
			ds.send(dp);
			buffer = new byte[512];
			//�������� ���� �޽����� �����ϱ� ���� ����Ʈ �迭 ó��
			dp = new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);//�������� ���� �޼��� ����
			ds.close();//���� ����
			System.out.println("Server IP : "+dp.getAddress()+", Server Port :"+dp.getPort());
			System.out.println("�������� ���� �޽��� :"+ new String(dp.getData()).trim());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UDPEchoClient("localhost", 2000);
		//Ŭ���̾�Ʈ �� IP��ȣ, Ŭ���̾�Ʈ ��Ʈ��ȣ�� ���� ��Ʈ��ȣ�� �޶����.
		
	}

}
