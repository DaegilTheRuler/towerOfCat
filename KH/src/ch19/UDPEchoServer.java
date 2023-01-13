package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			while (true) {
				//udp����� �����͸� ����Ʈ �迭�� ������. 
				//String�� �ٷ� ���� �� ����
				// ����Ʈ �迭�� �ִ�ũ��� 65508
				byte buffer[] = new byte[512];
				//udp����� ����� �����͸� '��Ŷ'(������ ����)���� ����
				//������.
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("Ready");
				//Ŭ���̾�Ʈ�� ���� �޽����� �����ϱ����� �ڵ�
				//������ ���� ���ŵ� Ŭ���̾�Ʈ�� �޼����� �����ͱ׷���Ŷ�� ����
				
				ds.receive(dp);
				//Ŭ���̾�Ʈ�� �޼���(����Ʈ�迭)�� ��Ʈ������ ��ȯ
				String str = new String(dp.getData());
				System.out.println("Ŭ���̾�Ʈ���� ���� �޼��� :"+str);
				
				InetAddress ia = dp.getAddress();
				port = dp.getPort();
				System.out.println("client ip :"+ ia+", client port :"+ port);
				
				//Ŭ���̾�Ʈ���� ������ ��Ŷ��ü ����
				//(����Ʈ �迭, ����Ʈ�迭ũ��, ip�ּ�, ��Ʈ ��ȣ)
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				ds.send(dp);//Ŭ���̾�Ʈ���� �ڷ� ����
				ds.close();// ���� ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public static void main(String[] args) {
		new UDPEchoServer(3000);//������ ��Ʈ��ȣ ����
	}

}
