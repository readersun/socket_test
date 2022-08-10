package socket_classinfo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import socket220805.Member;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.69", 11112);
		System.out.println("클라이언트 ");
	
		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os); // objectOutputStream : 객체를 전달하는 것

		ClassInfo ci= new ClassInfo("시험","김선호입니당.", 100, 100, 100);
		
		oos.writeObject(ci);
		oos.flush();
		oos.close();
		os.close();
		socket.close();
	}
}