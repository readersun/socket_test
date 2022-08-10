package socket_classinfo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import socket220805.Member;
import socket220805.MemberDAO;

public class Server {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket server=new ServerSocket(11112);
			System.out.println("서버 접속대기중...... ");
			Socket client=server.accept();
			System.out.println("클라이언트 접속 ");

			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);

			ClassInfo ci= (ClassInfo) ois.readObject();
			String id = ci.getId();
			String name = ci.getName();
			int kor=ci.getKor();
			int eng=ci.getEng();
			int math=ci.getMath();
			System.out.println("id : " + id + "\nname : " + name+"\n국어 : " +kor+"\n영어 : " +eng+"\n수학 : " +math);
			
			MemberDAO.getInstance().insert(ci);
			ois.close();
			is.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
